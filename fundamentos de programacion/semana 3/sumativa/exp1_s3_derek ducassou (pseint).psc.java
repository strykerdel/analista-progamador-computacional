import java.util.Scanner;

public class VentaDeEntradas {

    public static void main(String[] args) {
        // Definición de precios
        int ENTRADA_VIP = 30000;
        int ENTRADA_planta_baja = 15000;
        int ENTRADA_planta_alta = 18000;
        int ENTRADA_palcos = 13000;

        int ENTRADA_VIP_E = 20000;
        int ENTRADA_planta_baja_E = 9000;
        int ENTRADA_planta_alta_E = 10000;
        int ENTRADA_palcos_E = 6500;

        // Variables de entrada
        String NOMBRE;
        int ELECCION;
        int SUBELECCION;

        // Scanner para leer entradas del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar nombre
        System.out.println("Hola estimado, para continuar escribe tu nombre:");
        NOMBRE = scanner.nextLine();

        // Mensaje de bienvenida
        System.out.println("Hola " + NOMBRE + ", es un placer poder ofrecerte nuestros servicios.");
        System.out.println("¿Eres estudiante? Por favor indica si eres estudiante con:");
        System.out.println("1. Sí soy estudiante");
        System.out.println("2. No soy estudiante");
        ELECCION = scanner.nextInt();

        // Estructura de control para dirigir las elecciones
        if (ELECCION == 1) {
            System.out.println("Esta es la lista de los precios para estudiantes:");
            System.out.println("1. VIP - $" + ENTRADA_VIP_E);
            System.out.println("2. Planta baja - $" + ENTRADA_planta_baja_E);
            System.out.println("3. Planta alta - $" + ENTRADA_planta_alta_E);
            System.out.println("4. Palcos - $" + ENTRADA_palcos_E);
            System.out.println("Selecciona una opción presionando 1, 2, 3 o 4:");
            SUBELECCION = scanner.nextInt();

            // Sub elecciones para estudiantes
            if (SUBELECCION == 1) {
                System.out.println("************* Detalles de la compra *************");
                System.out.println("Tipo de entrada: VIP");
                System.out.println("Valor: $" + ENTRADA_VIP_E);
                System.out.println("Cliente: Estudiante");
            } else if (SUBELECCION == 2) {
                System.out.println("************* Detalles de la compra *************");
                System.out.println("Tipo de entrada: Planta Baja");
                System.out.println("Valor: $" + ENTRADA_planta_baja_E);
                System.out.println("Cliente: Estudiante");
            } else if (SUBELECCION == 3) {
                System.out.println("************* Detalles de la compra *************");
                System.out.println("Tipo de entrada: Planta Alta");
                System.out.println("Valor: $" + ENTRADA_planta_alta_E);
                System.out.println("Cliente: Estudiante");
            } else if (SUBELECCION == 4) {
                System.out.println("************* Detalles de la compra *************");
                System.out.println("Tipo de entrada: Palcos");
                System.out.println("Valor: $" + ENTRADA_palcos_E);
                System.out.println("Cliente: Estudiante");
            }
        } else if (ELECCION == 2) {
            System.out.println("Esta es la lista de los precios para público general:");
            System.out.println("1. VIP - $" + ENTRADA_VIP);
            System.out.println("2. Planta baja - $" + ENTRADA_planta_baja);
            System.out.println("3. Planta alta - $" + ENTRADA_planta_alta);
            System.out.println("4. Palcos - $" + ENTRADA_palcos);
            System.out.println("Selecciona una opción presionando 1, 2, 3 o 4:");
            SUBELECCION = scanner.nextInt();

            // Sub elecciones para público general
            if (SUBELECCION == 1) {
                System.out.println("************* Detalles de la compra *************");
                System.out.println("Tipo de entrada: VIP");
                System.out.println("Valor: $" + ENTRADA_VIP);
                System.out.println("Cliente: Público general");
            } else if (SUBELECCION == 2) {
                System.out.println("************* Detalles de la compra *************");
                System.out.println("Tipo de entrada: Planta Baja");
                System.out.println("Valor: $" + ENTRADA_planta_baja);
                System.out.println("Cliente: Público general");
            } else if (SUBELECCION == 3) {
                System.out.println("************* Detalles de la compra *************");
                System.out.println("Tipo de entrada: Planta Alta");
                System.out.println("Valor: $" + ENTRADA_planta_alta);
                System.out.println("Cliente: Público general");
            } else if (SUBELECCION == 4) {
                System.out.println("************* Detalles de la compra *************");
                System.out.println("Tipo de entrada: Palcos");
                System.out.println("Valor: $" + ENTRADA_palcos);
                System.out.println("Cliente: Público general");
            }
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}
