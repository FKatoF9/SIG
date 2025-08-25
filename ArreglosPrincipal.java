import java.util.Random;
import java.util.Scanner;

public class ArreglosPrincipal{
    public static void main (String args[]){
        Random aleatorio = new Random();
        Scanner ingreso = new Scanner (System.in);
        int min;
        int max;
        int suma=0;
        int promedio=0;
        double vecino=0;
        int x;
        int y[] = new int[5];
        int z[][] = new int [3][3];
     for (int i=0; i<z.length; i++){
            for (int j=0;j<z[i].length; j++){
                z[i][j]=aleatorio.nextInt(50);
            }
        }
        for (int i=0; i<z.length; i++){
            for (int j=0;j<z[i].length; j++){
                System.out.print(z[i][j]+" ");
            }
            System.out.println(" ");
        }
        for (double i=0; i<z)

     //   for (int i=0; i<z.length; i++){
    //        for (int j=0;j<z[i].length; j++){
    //            z[i][j]=aleatorio.nextInt(50);
    //        }
    //    }
    //    for (int i=0; i<z.length; i++){
    //        for (int j=0;j<z[i].length; j++){
    //            System.out.print(z[i][j]+" ");
    //        }
    //        System.out.println(" ");
    //    }
        
    //    for (int i=0; i<5; i++){
    //        y[i]=aleatorio.nextInt(100);
    //    }
    //    min=y[0];
    //    max=y[0];
        
     //   for (int i=0;i<5; i++){
     //       if (y[i]<min){
       //         min=y[i];
       //     }
       //     if (y[i]>max){
       //         max=y[i];
      //      }
      //      System.out.print(y[i]+" ");
      //      promedio = promedio + y[i];
      //  }
       // System.out.println("El valor minimo del arreglo es:"+min);
       // System.out.println("El valor maximo del arreglo es:"+max);
       // System.out.println("El valor promedio del arreglo es:"+promedio/5);
    }

}