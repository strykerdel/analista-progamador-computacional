
Proceso calculo_de_valores
	
	// Definición de variables
	Definir precio_regular, precio_preferencial Como Entero; //definicion de precios de asientos
	Definir c_personas, c_asientos, total Como Entero;		  //deficion de cantidades de personas y asientos
	
	// Asignación de precios
	precio_regular = 2500;
	precio_preferencial = 5000;
	
	// Mensaje para el usuario y pregunta por cantidad de personas
	Escribir "Hola, bienvenido. Por favor, indica cuántas personas son";
	Leer c_personas;
	
	// Usuario selecciona tipo de asiento
	Escribir "Por favor, selecciona un tipo de asiento (1 para preferencial, 2 para regular)";
	Leer c_asientos;
	
	// Calcular el total en función del tipo de asiento seleccionado
	Si c_asientos = 1 Entonces
		Escribir "Has seleccionado un asiento preferencial.";
		total = c_personas * precio_preferencial;
	SiNo
		Escribir "Has seleccionado un asiento regular.";
		total = c_personas * precio_regular;
	FinSi
	
	// Mostrar el total a pagar
	Escribir "Gracias por tu compra, el total a pagar es: ", total;
FinProceso
