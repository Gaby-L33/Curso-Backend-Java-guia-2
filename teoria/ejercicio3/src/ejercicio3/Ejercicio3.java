/*
 Escriba un programa que valide si una nota está entre 0 y 10, 
 sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int nota;
       
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese una nota entre 1 y 10");
       nota = leer.nextInt();
       
       while (nota<0 || nota>10){
           System.out.println("Ingrese una nota valida");
           nota = leer.nextInt();
       }
    }
    
}
