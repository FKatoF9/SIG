import java.util.Scanner;
public class FibonacciEjercicio {

public static int fibo(int n) {
    if (n == 1 || n == 2) {
        return 1; // Caso base
    } else {
        return fibo(n - 1) + fibo(n - 2);    }
}

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese su numero calcular Fibonacci: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Ingrese su numero a calcular en Fibonacci");
        } else {
            System.out.println("Fibo(" + n + ") = " + fibo(n));
        }

        scanner.close();
    }
}