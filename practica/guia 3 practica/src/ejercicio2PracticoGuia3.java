
import java.util.Scanner;

/*
 Crear un programa que pida una frase y si esa frase es igual a “eureka” 
 el programa pondrá un mensaje de Correcto, 
 sino mostrará un mensaje de Incorrecto. 
 Nota: investigar la función equals() en Java.
 */
/**
 *
 * @author Usuario
 */
public class ejercicio2PracticoGuia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabra;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase");
        palabra = leer.next();

        if (palabra.equals("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }

}
