Funcion resultado <-sumar(x,p)
	resultados<-x+p;
FinFuncion
Algoritmo PR
	Definir Dato,Cantidad,Conteo Como Entero;
	Definir Bandera Como Logico;
	Definir Promedio Como Real
	Dato<-0;
	Cantidad<-0;
	conteo<-0;
	Bandera<-Falso;
	Mostrar  "¿Desea ingresar un dato?";
	leer Bandera;
	Mientras Bandera == Verdadero Hacer
		mostrar "ingrese un dato para calcular";
		Leer dato;
		conteo<-conteo+datos;
		Cantidad<-cantidad+1
		Mostrar "¿Desea ingresar un dato?"
		Leer Bandera;
	FinMientras
	promedio<-conteo/cantidad;
	Mostrar Promedio;
	Mostrar sumar(20,5)
FinAlgoritmo
