Algoritmo exercises_1
	
	//	En una gasolinera se necesita crear una aplicación para distribución 
	//	del combustible. Definir el precio por galón de Diesel, Gasolina Regular y Súper. 
	//	El cliente ingresará el tipo de combustible y la cantidad (en dinero) que desea 
	//	para su vehículo, debe mostrar en pantalla el equivalente en galones  según su 
	//	elección y el combustible elegido. 
	
	//1 - Declarar variables con valor de el combustible
	//2 - pedir al cliente que ingrese el tipo de combustible
	//3 - pedir que ingrese la cantidad en $ de combustible a adquirir
	//4 - mostrar en pantalla el equivalente en galones
	//5 - mostrar combustible seleccionado
	
	
	Definir Diesel,Gasolina_Regular,Super Como Real
	Definir compraD,compraGR,compraS,galonesD,galonesGR,galonesS Como Real
	Definir eleccion Como Caracter
	
	Diesel <- 3.50
	Gasolina_Regular <- 3.75
	Super <- 4
	
	Escribir 'Precio de combustibles por galón'
	Escribir ''
	Escribir 'Diesel'+' '+'$3.25'
	Escribir ''
	Escribir 'Gasolina Regular'+' '+'$3.75'
	Escribir ''
	Escribir 'Super'+' '+'$4'
	Escribir ''
	
	
	Escribir 'Ingrese el tipo de combustible que desea comprar'
	Leer eleccion
	
	Segun eleccion  Hacer
		'Diesel':
			Escribir 'Ingrese cantidad a comprar:'
			Escribir ''
			Escribir 'NOTA: cantidad en dólar'
			Escribir ''
			Leer compraD
			Escribir ''
			galonesD <- compraD/Diesel
			Escribir 'El combustible seleccionado es: '+eleccion
			Escribir 'Los galones adquiridos son: ',galonesD,' ','g'
			
		'Gasolina':
			Escribir 'Ingrese cantidad a comprar:'
			Escribir ''
			Escribir 'NOTA: cantidad en dólar'
			Escribir ''
			Leer compraGR
			Escribir ''
			galonesGR <- compraGR/Gasolina_Regular
			Escribir 'El combustible seleccionado es: '+eleccion
			Escribir 'Los galones adquiridos son: ',galonesGR,' ','g'
			
		'Super':
			Escribir 'Ingrese cantidad a comprar:'
			Escribir ''
			Escribir 'NOTA: cantidad en dólar'
			Escribir ''
			Leer compraS
			Escribir ''
			galonesS <- compraS/Super
			Escribir 'El combustible seleccionado es: '+eleccion
			Escribir 'Los galones adquiridos son: ',galonesS,' ','g'
			
		De Otro Modo:
			Escribir '¡¡Verifique que el combustible elegido este escrito correctamente. Como se le a mostrado en pantalla!!'
	FinSegun
FinAlgoritmo

