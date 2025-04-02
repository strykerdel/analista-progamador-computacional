
///definicion de clase para identificar Proceso

Proceso carrito_online
	
	///definicion de variables locales para mensaje
	definir nombre como cadena;
	
	///Definir variables de accion
	Definir  accion como cadena;
	
		///define atras para volver al menu inicial
		Definir  atras como cadena;
		
		///define categorias para escoger
		Definir  categorias como cadena;
			
				///definir tipos de subcategorias
				definir electronica como cadena;
				definir limpieza como cadena;
				definir alimentos como cadena;
				definir todas como cadena;
			
		///definir accion para editar carrito
		definir  editar_carrito como cadena;
		
		///definir accion para finalizar y pagar
		definir  finalizar como cadena;
	
	///asignacion de variables de accion
	electronica	=	["electronica"];
	limpieza	=	["limpieza"];
	alimentos	=	["alimentos"];
	todas		=	["todas"];
	///solicitud de nombre
	Escribir "bienvenido, ¿cual es tu nombre?";
	
	
	///lee la entrada del nombre del usuario
	leer nombre;
	
	///escribe el mensaje de bienvenida usando el nombre del usuario
	Escribir "hola"," ",nombre," ",",bienvenido a la tienda",;
	
	///solicita al usuario escoger una accion 
	escribir "escribe la accion para continuar";
	Escribir "categorias, editar carrito, atras, finalizar ";
	
	///leer la entrada del usuario
	leer accion;
	
		///controlar el flujo del programa con blucle if
		si accion = "categorias" entonces
	
		///escribe las categorias
		escribir	[electronica];
		escribir	[limpieza];
		escribir	[alimentos];
		escribir	[todas];
		escribir	" ";
			
			///definir lista de items y precio segun categoria
			
					///electronica>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
					///item										precio
					Definir lcd Como Caracter; 			definir precio_lcd Como entero;
					Definir cargador_120W Como Caracter;	definir precio_cargador_120W Como entero;
					Definir impresora Como Caracter;		Definir precio_impresora Como entero;
				
					///asignar nombre y precio a items de electronica
					lcd 			= 	"lcd";				precio_lcd = 132990;
					cargador_120W 	= 	"cargador_120W";	precio_cargador_120W = 15990;
					impresora		=	"impresora";		precio_impresora = 250000;
	
					///limpieza>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
					///item										precio
					Definir cloro Como Caracter; 			definir precio_cloro Como entero;
					Definir cif Como Caracter;				definir precio_cif Como entero;
					Definir detergente Como Caracter;		Definir precio_detergente Como entero;
					
					///asignar nombre y precio a items de electronica
					cloro 			= 	"cloro";				precio_cloro = 5990;
					cif 			= 	"cif";					precio_cif = 2550;
					detergente		=	"detergente";			precio_detergente = 10800;
					
					///alimentos>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
					///item										precio
					Definir leche Como Caracter; 			definir precio_leche Como entero;
					Definir chocolate Como Caracter;		definir precio_chocolate Como entero;
					Definir azucar Como Caracter;			Definir precio_azucar Como entero;
					
					///asignar nombre y precio a items de electronica
					leche 			= 	"lcd";				precio_leche = 1550;
					chocolate 		= 	"cargador_120W";	precio_chocolate = 3800;
					azucar			=	"impresora";		precio_azucar = 1100;
					///>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
					
		///fin del ciclo
		fin si
	
	///escribe al usuario solicitando la categoria para ver los items
	escribir "perfecto, ahora"," ",[nombre]," ","escoge la categoria o escribe (todas) para ver todo..."  ;
	leer accion;
	escribir "has seleccionado"," ",accion;
	
	si accion = electronica 
	Entonces 
	escribir	[lcd]," ",[precio_lcd],"$";
	Escribir	[cargador_120W]," ",[precio_cargador_120W],"$";
	Escribir	[impresora]," ",[precio_impresora],"$";
	FinSi
	///
	si accion = electronica 
		Entonces 
		escribir	[lcd]," ",[precio_lcd],"$";
		Escribir	[cargador_120W]," ",[precio_cargador_120W],"$";
		Escribir	[impresora]," ",[precio_impresora],"$";
	FinSi
	
	
	
Fin algoritmo
