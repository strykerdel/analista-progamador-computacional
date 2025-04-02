import java.util.Scanner; //libreia para lectura y escritura

public class CalculoDeValores {

    public static void main(String[] args) {
        // Definición de variables
        int precioRegular = 2500;    // Precio de asiento regular
        int precioPreferencial = 5000;  // Precio de asiento preferencial
        int cPersonas, cAsientos, total;  // Cantidad de personas, tipo de asiento y total a pagar
        
        Scanner scanner = new Scanner(System.in);  // Crear un objeto Scanner para leer la entrada del usuario
        
        // Mensaje para el usuario y pregunta por la cantidad de personas
        System.out.println("Hola, bienvenido. Por favor, indica cuántas personas son");
        cPersonas = scanner.nextInt();
        
        // Usuario selecciona tipo de asiento
        System.out.println("Por favor, selecciona un tipo de asiento (1 para preferencial, 2 para regular)");
        cAsientos = scanner.nextInt();
        
        // Calcular el total en función del tipo de asiento seleccionado
        if (cAsientos == 1) {
            System.out.println("Has seleccionado un asiento preferencial.");
            total = cPersonas * precioPreferencial;
        } else {
            System.out.println("Has seleccionado un asiento regular.");
            total = cPersonas * precioRegular;
        }
        
        // Mostrar el total a pagar
        System.out.println("Gracias por tu compra, el total a pagar es: " + total);
        
        // Cerrar el scanner
        scanner.close();
    }
}
