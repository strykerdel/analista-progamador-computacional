Proceso venta_de_entradas
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//definicion de variables de precios segun tipo de cliente
Definir ENTRADA_VIP 			como entero;
Definir ENTRADA_planta_baja 	como entero;
Definir ENTRADA_planta_alta 	como entero;
Definir ENTRADA_palcos 			Como entero;

//estudiantes
Definir ENTRADA_VIP_E 			como entero;
Definir ENTRADA_planta_baja_E 	como entero;
Definir ENTRADA_planta_alta_E 	como entero;
Definir ENTRADA_palcos_E 		Como entero;
//variable para guardar el tipo de entrada
definir 	NOMBRE  Como Caracter;
Definir 	ELECCION Como ENTERO;
Definir		SUBELECCION Como Entero;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//asignacion de precios publico general;
ENTRADA_VIP 			= 30000;
ENTRADA_planta_baja 	= 15000;
ENTRADA_planta_alta		= 18000;
ENTRADA_palcos			= 13000;

//asignacion de precios estudiantes;
ENTRADA_VIP_E			= 20000;
ENTRADA_planta_baja_E	= 9000;
ENTRADA_planta_alta_E	= 10000;
ENTRADA_palcos_E		= 6500;
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////funcion y logica de programa
//mensaje de solicitud de nombre
Escribir "	Hola estimado, para continuar escribe tu nombre";
leer NOMBRE;
//mensaje de bienvenida
Escribir	"hola"," ",NOMBRE," ",", es un placer poder ofrecerte nuestros servicios";
Escribir	"¿eres estudiante?, por favor indica si eres estudiante con:";
Escribir	"1. si soy estudiante";
Escribir	"2. no soy estudiante";
Leer		ELECCION;

//estructuras de control para dirigir las elecciones principales
si ELECCION = 1 Entonces 
	Escribir "esta es la lista de los precios para estudiantes:";
	Escribir	,"1-",	" ",	"VIP"			," ",		"$",ENTRADA_VIP_E;
	Escribir	,"2-",	" ",	"planta baja"	," ",		"$",ENTRADA_planta_baja_E;
	Escribir	,"3-",	" ",	"planta alta"	," ",		"$",ENTRADA_planta_alta_E;
	Escribir	,"4-",	" ",	"palcos"		," ",		"$",ENTRADA_palcos_E;
	Escribir	"Selecciona una opcion presionando 1,2,3 o 4....";
	leer SUBELECCION;
	
	//sub elecciones para estudiante
		si SUBELECCION = 1
			Entonces
			Escribir	"*************detalles de la compra*************";
			Escribir	"tipo de entrada: VIP";
			Escribir	"valor:"," ","$",ENTRADA_VIP_E;
			Escribir	"cliente: estudiante";
			FinSi
			
		si SUBELECCION = 2
			Entonces
			
			Escribir	"*************detalles de la compra*************";
			Escribir	"tipo de entrada: PLANTA BAJA";
			Escribir	"valor:"," ","$",ENTRADA_planta_baja_E;
			Escribir	"cliente: estudiante";
			
		FinSi
	
		si SUBELECCION = 3
			Entonces
			
			Escribir	"*************detalles de la compra*************";
			Escribir	"tipo de entrada: PLANTA ALTA";
			Escribir	"valor:"," ","$",ENTRADA_planta_alta_E;
			Escribir	"cliente: estudiante";
			
		FinSi
		
		si SUBELECCION = 4
			Entonces
			
			Escribir	"*************detalles de la compra*************";
			Escribir	"tipo de entrada: PALCOS";
			Escribir	"valor:"," ","$",ENTRADA_palcos_E;
			Escribir	"cliente: estudiante";
			
		FinSi
FinSi
	
si ELECCION = 2 Entonces 
	Escribir "esta es la lista de los precios para publico:";
	Escribir	,"1-",	" ",	"VIP"			," ",		"$",ENTRADA_VIP;
	Escribir	,"2-",	" ",	"planta baja"	," ",		"$",ENTRADA_planta_baja;
	Escribir	,"3-",	" ",	"planta alta"	," ",		"$",ENTRADA_planta_alta;
	Escribir	,"4-",	" ",	"palcos"		," ",		"$",ENTRADA_palcos;
	Escribir	"Selecciona una opcion presionando 1,2,3 o 4....";
	leer SUBELECCION;
	
	//////////sub elecciones para publico general
	si SUBELECCION = 1
		Entonces
		
		Escribir	"*************detalles de la compra*************";
		Escribir	"tipo de entrada: VIP";
		Escribir	"valor:"," ","$",ENTRADA_VIP;
		Escribir	"cliente: publico general";
		
	FinSi
	
	si SUBELECCION = 2
		Entonces
		
		Escribir	"*************detalles de la compra*************";
		Escribir	"tipo de entrada: PLANTA BAJA";
		Escribir	"valor:"," ","$",ENTRADA_planta_baja;
		Escribir	"cliente: publico general";
		
	FinSi
	
	si SUBELECCION = 3
		Entonces
		
		Escribir	"*************detalles de la compra*************";
		Escribir	"tipo de entrada: PLANTA ALTA";
		Escribir	"valor:"," ","$",ENTRADA_planta_alta;
		Escribir	"cliente: publico general";
		
	FinSi
	
	si SUBELECCION = 4
		Entonces
		
		Escribir	"*************detalles de la compra*************";
		Escribir	"tipo de entrada: PALCOS";
		Escribir	"valor:"," ","$",ENTRADA_palcos;
		Escribir	"cliente: publico general";
		
	FinSi
	
FinSi

	
	
	
FinProceso
