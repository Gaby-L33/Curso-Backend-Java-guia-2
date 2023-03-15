/*
 Implementar un programa que le pida dos números enteros al usuario 
  y determine si ambos o alguno de ellos es mayor a 25.
 */
package ejercicio1.teoria.guia.pkg3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1TeoriaGuia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
      
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        num1 = leer.nextInt();

        System.out.println("Ingrese otro numero");
        num2 = leer.nextInt();

        if (num1 > 25) {
            System.out.println("El numero " + num1 + " es mayor que 25");
        } else if (num2 > 25) {
            System.out.println("El numero " + num2 + " es mayor que 25");
        } else {
            System.out.println("Ninguno de los numeros es mayor a 25");
        }

    }

}
