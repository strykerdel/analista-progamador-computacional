import java.util.ArrayList;
import java.util.Scanner;

public class TeatroMoro {

    // Variables estáticas (estadísticas globales)
    static int totalEntradasVendidas = 0;
    static double ingresosTotales = 0;
    static int totalDescuentosAplicados = 0;

    // Variables de instancia (almacenamiento de entradas)
    static ArrayList<Entrada> listaEntradas = new ArrayList<>();
    static int entradasDisponibles = 100;

    // Scanner global
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Variables locales
        double precioBase = 10000;

        int opcion;

        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Venta de entradas");
            System.out.println("2. Promociones");
            System.out.println("3. Buscar entradas");
            System.out.println("4. Eliminar entrada");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            String input = scanner.nextLine();

            try {
                opcion = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Debe ingresar un número.");
                opcion = -1;
            }

            switch (opcion) {
                case 1 -> venderEntrada(precioBase);
                case 2 -> mostrarPromociones();
                case 3 -> buscarEntradas();
                case 4 -> eliminarEntrada();
                case 5 -> System.out.println("Gracias por usar el sistema.");
                default -> {
                    if (opcion != -1) {
                        System.out.println("Opción inválida. Intente nuevamente.");
                    }
                }
            }

        } while (opcion != 5);
    }

    public static void venderEntrada(double precioBase) {
        if (entradasDisponibles <= 0) {
            System.out.println("No hay entradas disponibles.");
            return;
        }

        // Pedir la cantidad de entradas
        System.out.print("¿Cuántas entradas desea comprar? ");
        int cantidadEntradas = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        // Verificar si la cantidad de entradas solicitadas excede las disponibles
        if (cantidadEntradas > entradasDisponibles) {
            System.out.println("No hay suficientes entradas disponibles.");
            return;
        }

        // Aplicar descuento del 5% si se compran más de una entrada
        boolean aplicarDescuentoAdicional = cantidadEntradas > 1;

        // Crear las entradas con configuraciones diferentes
        for (int i = 0; i < cantidadEntradas; i++) {
            System.out.print("\nIngrese ubicación para la entrada " + (i + 1) + " (VIP, Platea, General): ");
            String ubicacion = scanner.nextLine();

            System.out.println("Seleccione su tipo:");
            System.out.println("1. Estudiante");
            System.out.println("2. Tercera Edad");
            System.out.println("3. Ninguno");
            System.out.print("Ingrese opción: ");
            int tipoUsuario = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            String tipo = "General";
            int descuento = 0;

            switch (tipoUsuario) {
                case 1 -> {
                    descuento = 10;
                    tipo = "Estudiante";
                }
                case 2 -> {
                    descuento = 15;
                    tipo = "Tercera Edad";
                }
                case 3 -> tipo = "General";
                default -> System.out.println("Opción inválida. Se asumirá tipo 'General'.");
            }

            // Calcular el precio final con el descuento base
            double precioFinal = precioBase - (precioBase * descuento / 100);

            // Si aplica descuento adicional por comprar más de una entrada, aplicarlo
            if (aplicarDescuentoAdicional) {
                double descuentoAdicional = 5; // 5% de descuento adicional
                precioFinal = precioFinal - (precioFinal * descuentoAdicional / 100);
                System.out.println("¡Descuento adicional del 5% aplicado por comprar más de una entrada!");
            }

            // Crear la entrada con su configuración
            int numero = listaEntradas.size() + 1;
            Entrada nueva = new Entrada(numero, ubicacion, tipo, precioFinal);
            listaEntradas.add(nueva);

            entradasDisponibles--;
            totalEntradasVendidas++;
            ingresosTotales += precioFinal;
            totalDescuentosAplicados += descuento + (aplicarDescuentoAdicional ? 5 : 0); // Sumar descuentos aplicados

            System.out.println("\n¡Entrada " + (i + 1) + " vendida!");
            System.out.println(nueva);
        }
    }

    public static void mostrarPromociones() {
        System.out.println("\n=== PROMOCIONES DISPONIBLES ===");
        System.out.println("- 10% de descuento para estudiantes");
        System.out.println("- 15% de descuento para tercera edad");
        System.out.println("- 5% adicional por compra de 2 o más entradas");
    }

    public static void buscarEntradas() {
        System.out.println("\nBuscar por:");
        System.out.println("1. Número");
        System.out.println("2. Ubicación");
        System.out.println("3. Tipo");
        System.out.print("Seleccione: ");
        int criterio = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese valor de búsqueda: ");
        String valor = scanner.nextLine();

        boolean encontrado = false;
        for (Entrada e : listaEntradas) {
            if ((criterio == 1 && String.valueOf(e.numero).equals(valor)) ||
                (criterio == 2 && e.ubicacion.equalsIgnoreCase(valor)) ||
                (criterio == 3 && e.tipo.equalsIgnoreCase(valor))) {
                System.out.println(e);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron entradas.");
        }
    }

    public static void eliminarEntrada() {
        System.out.print("Ingrese el número de entrada a eliminar: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        boolean eliminado = false;
        for (int i = 0; i < listaEntradas.size(); i++) {
            if (listaEntradas.get(i).numero == numero) {
                ingresosTotales -= listaEntradas.get(i).precio;
                listaEntradas.remove(i);
                entradasDisponibles++;
                totalEntradasVendidas--;
                System.out.println("Entrada eliminada exitosamente.");
                eliminado = true;
                break;
            }
        }

        if (!eliminado) {
            System.out.println("Entrada no encontrada.");
        }
    }

    // Clase interna para representar una entrada
    static class Entrada {
        int numero;
        String ubicacion;
        String tipo;
        double precio;

        public Entrada(int numero, String ubicacion, String tipo, double precio) {
            this.numero = numero;
            this.ubicacion = ubicacion;
            this.tipo = tipo;
            this.precio = precio;
        }

        @Override
        public String toString() {
            return "Entrada N°" + numero + " | Ubicación: " + ubicacion + " | Tipo: " + tipo + " | Precio: $" + precio;
        }
    }
}
