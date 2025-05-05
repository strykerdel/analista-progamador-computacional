/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package test.teatromorooptimizado;
import java.util.*;

class Cliente {
    int idCliente;
    String nombre;
    int edad;
    boolean esEstudiante;

    public Cliente(int idCliente, String nombre, int edad, boolean esEstudiante) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.edad = edad;
        this.esEstudiante = esEstudiante;
    }
}

class Reserva {
    int idReserva;
    int idCliente;
    int idAsiento;
    double precioFinal;
    double descuentoAplicado;
    String ubicacion;

    public Reserva(int idReserva, int idCliente, int idAsiento, double precioFinal, double descuentoAplicado, String ubicacion) {
        this.idReserva = idReserva;
        this.idCliente = idCliente;
        this.idAsiento = idAsiento;
        this.precioFinal = precioFinal;
        this.descuentoAplicado = descuentoAplicado;
        this.ubicacion = ubicacion;
    }
}

public class TeatroMoroOptimizado {
    static final int CAPACIDAD = 100;
    static int[] ventasIDs = new int[CAPACIDAD];
    static int[] asientos = new int[CAPACIDAD];
    static Cliente[] clientes = new Cliente[CAPACIDAD];
    static List<String> promociones = new ArrayList<>();
    static List<Reserva> reservas = new ArrayList<>();

    static double precioVIP = 20000;
    static double precioPlatea = 15000;
    static double precioBalcon = 10000;
    static int idVentaActual = 1;
    static int idClienteActual = 1;
    static int idReservaActual = 1;
    static boolean[] asientoOcupado = new boolean[CAPACIDAD];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        promociones.add("Estudiante - 10%");
        promociones.add("Tercera Edad - 15%");

        boolean seguir = true;
        while (seguir) {
            System.out.println("\n--- Teatro Moro ---");
            System.out.println("1. Vender entrada");
            System.out.println("2. Ver reservas");
            System.out.println("3. Eliminar reserva");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    venderEntrada(sc);
                    break;
                case 2:
                    mostrarReservas();
                    break;
                case 3:
                    eliminarReserva(sc);
                    break;
                case 4:
                    seguir = false;
                    System.out.println("Gracias por usar el sistema.");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
        sc.close();
    }

    static void venderEntrada(Scanner sc) {
        System.out.print("Nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.print("¿Es estudiante? (sí/no): ");
        String estudianteInput = sc.nextLine().trim().toLowerCase();
        boolean esEstudiante = estudianteInput.equals("sí") || estudianteInput.equals("si") || estudianteInput.equals("s");

        Cliente cliente = new Cliente(idClienteActual, nombre, edad, esEstudiante);
        clientes[idClienteActual - 1] = cliente;

        System.out.println("Seleccione ubicación: 1) VIP 2) Platea 3) Balcón");
        int opcionUbicacion = sc.nextInt();
        sc.nextLine();

        String ubicacion = "";
        double precioBase = 0;

        switch (opcionUbicacion) {
            case 1:
                ubicacion = "VIP";
                precioBase = precioVIP;
                break;
            case 2:
                ubicacion = "Platea";
                precioBase = precioPlatea;
                break;
            case 3:
                ubicacion = "Balcón";
                precioBase = precioBalcon;
                break;
            default:
                System.out.println("Ubicación inválida.");
                return;
        }

        // Asignar primer asiento libre
        int asiento = -1;
        for (int i = 0; i < CAPACIDAD; i++) {
            if (!asientoOcupado[i]) {
                asiento = i;
                asientoOcupado[i] = true;
                break;
            }
        }

        if (asiento == -1) {
            System.out.println("No hay asientos disponibles.");
            return;
        }

        // Calcular descuento
        double descuento = 0;
        if (esEstudiante) {
            descuento = 0.10;
        } else if (edad >= 60) {
            descuento = 0.15;
        }

        double descuentoAplicado = precioBase * descuento;
        double precioFinal = precioBase - descuentoAplicado;

        // Guardar reserva
        Reserva reserva = new Reserva(idReservaActual, idClienteActual, asiento, precioFinal, descuentoAplicado, ubicacion);
        reservas.add(reserva);

        // Actualizar registros
        ventasIDs[idReservaActual - 1] = idVentaActual;
        asientos[idReservaActual - 1] = asiento;

        // Mostrar boleta
        System.out.println("\n--- BOLETA ---");
        System.out.println("Teatro Moro");
        System.out.println("Cliente: " + nombre);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Precio base: $" + precioBase);
        System.out.println("Descuento aplicado: $" + descuentoAplicado);
        System.out.println("Total a pagar: $" + precioFinal);
        System.out.println("¡Gracias por su compra!\n");

        // Incrementar IDs
        idVentaActual++;
        idClienteActual++;
        idReservaActual++;
    }

    static void mostrarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas registradas.");
            return;
        }
        System.out.println("\n--- RESERVAS ---");
        for (Reserva r : reservas) {
            Cliente c = clientes[r.idCliente - 1];
            System.out.printf("ID Reserva: %d | Cliente: %s | Asiento: %d | Ubicación: %s | Total: $%.2f | Descuento: $%.2f\n",
                    r.idReserva, c.nombre, r.idAsiento, r.ubicacion, r.precioFinal, r.descuentoAplicado);
        }
    }

    static void eliminarReserva(Scanner sc) {
        System.out.print("Ingrese ID de reserva a eliminar: ");
        int id = sc.nextInt();
        sc.nextLine();

        boolean encontrado = false;
        Iterator<Reserva> it = reservas.iterator();
        while (it.hasNext()) {
            Reserva r = it.next();
            if (r.idReserva == id) {
                asientoOcupado[r.idAsiento] = false;
                it.remove();
                System.out.println("Reserva eliminada.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Reserva no encontrada.");
        }
    }
}
