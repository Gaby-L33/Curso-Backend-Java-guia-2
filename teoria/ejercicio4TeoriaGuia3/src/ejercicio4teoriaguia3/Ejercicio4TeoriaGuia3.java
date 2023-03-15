/*
Escriba un programa que lea 20 números. 
Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
El programa deberá calcular y mostrar el resultado de la suma de los números leídos, 
pero si el número es negativo no debe sumarse. 
Nota: recordar el uso de la sentencia break.
 */
package ejercicio4teoriaguia3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio4TeoriaGuia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma, num, i;
        suma = 0;
        i = 0;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un maximo de 20 numeros");

        do {
            num = leer.nextInt();
                      
            i = i + 1;

            if (num >= 0 ) {
                suma = suma + num;
            }
            
              if (i>20){
                break;
            }
          
        } while (num != 0);
        
        if (i<=20 || num==0){
            System.out.println("Se capturó el numero cero");
            System.out.println("El resultado de la suma de los numeros ingresados es " + suma);
        } else {
            System.out.println("Ingreso mas de 20 numeros");
        }
    }

}
