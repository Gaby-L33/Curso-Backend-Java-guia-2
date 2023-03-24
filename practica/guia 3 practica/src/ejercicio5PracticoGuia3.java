
import java.util.Scanner;

/*
    Escriba un programa en el cual se ingrese un valor límite positivo, 
    y a continuación solicite numeros al usuario hasta que la suma de los numeros introducidos supere el limite inicial.
 */

/**
 *
 * @author Usuario
 */
public class ejercicio5PracticoGuia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, suma;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el numero limite");
        int limite = leer.nextInt();
        
        while (limite < 0) {
                System.out.println("Ingrese un numero limite valido");
                limite = leer.nextInt();
        }
        
        suma=0;
                
        do {
            
            System.out.println("Ingrese un numero positivo para sumar");
            num = leer.nextInt();
            
            while (num < 0) {
                System.out.println("Ingrese un numero positivo valido");
                num = leer.nextInt();
            }
            
            suma = num + suma;
            
        } while (suma<=limite);
        
        System.out.println("Ha superado el limite la suma");
    }
    
}
