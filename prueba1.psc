funcion hola <- sumar(x,p)
	hola <- x+p;
	hola=hola/2;
FinFuncion 
Funcion resultado<-multiplicar (x,p)
	si p>1 Entonces;
		resultado=x+multiplicar(x,p-1);
	FinSi
	si p=1 Entonces;
		resultado=x;
	FinSi
FinFuncion
Funcion conteo<-factorial(x)
	si x>1 Entonces
		conteo=multiplicar(x,factorial(x-1));
	FinSi
	si x=1 Entonces
		conteo=1;
	FinSi
FinFuncion
Algoritmo prueba
	Mostrar multiplicar(6,2);
FinAlgoritmo
