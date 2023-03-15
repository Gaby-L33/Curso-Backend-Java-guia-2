/*
    Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
    e imprima el número ingresado seguido de tantos asteriscos como indique su valor.
 */
package ejercicio5teoriaguia3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio5TeoriaGuia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {

            System.out.println("Ingrese un numero entre 1 y 20");
            num = leer.nextInt();

            while (num > 20 || num < 1) {
                System.out.println("Ingrese un numero valido");
                num = leer.nextInt();
            }
            
              System.out.print(num + " " );

            for (int j = 0; j < num; j++) {

                System.out.print("*");
            }
            
            System.out.println("");
        }
    }
}
