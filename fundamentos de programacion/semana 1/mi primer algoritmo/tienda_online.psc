Proceso tienda_online
    ///////////////////////////////////////
    ///definicion de variables para items
    ///////////////////////////////////////
    Definir nombre Como Cadena;
    
    Definir item_1 Como Cadena; item_1 = "usb-c";
    Definir precio_1 Como Entero; precio_1 = 1000;   
	
    Definir item_2 Como Cadena; item_2 = "cargador de 120W";
    Definir precio_2 Como Entero; precio_2 = 6490; 
	
    Definir item_3 Como Cadena; item_3 = "pantalla de 32 pulgadas";
    Definir precio_3 Como Entero; precio_3 = 5990;    
	
    ///////////////////////////////////////
    ///variables de seleccion
    ///////////////////////////////////////
    Definir seleccion Como Cadena;
    Definir cantidad Como Entero;
    Definir atras Como Cadena;
	
    Escribir "¿cómo te llamas?"; 
    Leer nombre;
	
    Escribir "hola ", nombre;
	
    Repetir
        Escribir "estos son los items:";
        Escribir " ";
        Escribir "Añadir al carrito escribiendo una parte del nombre del item";
        Escribir " 1: usb-c   1000$";
        Escribir " 2: cargador de 120W   6490$";
        Escribir " 3: pantalla de 32 pulgadas   5990$";
		
        Escribir "¿quieres volver al menu?, escribe atras"; 
        Leer atras;
        
        Si atras = "atras" Entonces
            Escribir "Volviendo al menú...";
		
        FinSi
		
        Escribir "Selecciona el item que deseas comprar (puedes escribir una parte del nombre):";
        Leer seleccion;
		
        // Verificación de coincidencia parcial
        Si Subcadena(seleccion, item_1) Entonces
            Escribir "Seleccionaste: ", item_1;
            Escribir "Indica la cantidad:";
            Leer cantidad;
            Escribir "Añadiste al carrito: ", item_1, " Llevas: ", cantidad, " Precio: ", precio_1, "$";
            Escribir "Total: ", (cantidad * precio_1), "$";
        Sino
            Si Subcadena(seleccion, item_2) Entonces 
                Escribir "Seleccionaste: ", item_2;
                Escribir "Indica la cantidad:";
                Leer cantidad;
                Escribir "Añadiste al carrito: ", item_2, " Llevas: ", cantidad, " Precio: ", precio_2, "$";
                Escribir "Total: ", (cantidad * precio_2), "$";
            Sino
                Si Subcadena(seleccion, item_3) Entonces 
                    Escribir "Seleccionaste: ", item_3;
                    Escribir "Indica la cantidad:";
                    Leer cantidad;
                    Escribir "Añadiste al carrito: ", item_3, " Llevas: ", cantidad, " Precio: ", precio_3, "$";
                    Escribir "Total: ", (cantidad * precio_3), "$";
                Sino
                    Escribir "Error: selección no válida. Intenta de nuevo.";
                FinSi
            FinSi
        FinSi
		
    Hasta Que atras = "atras";
    
FinProceso
