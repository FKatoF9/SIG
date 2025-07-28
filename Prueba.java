import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        // Declarar variables
        int a, b, resultado, x;

        // Crear el objeto Scanner para leer datos del teclado
        Scanner sc = new Scanner(System.in);

        // Imprimir mensaje inicial
        System.out.println("Hola, mi nombre es Rosell; soy un guia explorador de la tribu 54");

        // Leer valores
        System.out.print("Ingrese el valor de a: ");
        a = sc.nextInt();
        System.out.print("Ingrese el valor de b: ");
        b = sc.nextInt();

        // Sumar y mostrar resultado
        resultado = a + b;
        System.out.println("El resultado es: " + resultado);

        // Evaluar condición resultado > 20
        if (resultado > 20) {
            System.out.println("El resultado es mayor a 20");
        } else {
            System.out.println("El resultado es menor o igual a 20");

            if (resultado > 10 && resultado <= 18) {
                System.out.println("El resultado es mayor que 10 y menor o igual que 18");
            } else {
                System.out.println("El resultado es menor que 10");
            }
        }

        // Bucle mientras
        x = 0;
        while (x < 10) {
            System.out.println(x);
            x = x + 1;
        }

        // Cerrar el Scanner
        sc.close();
    }
}
