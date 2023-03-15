
import java.util.Scanner;

/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
Si la primera letra es una ‘A’, se deberá  de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá  imprimir “INCORRECTO”. 
Nota: investigar la función Substring y equals() de Java.
 */
/**
 *
 * @author Usuario
 */
public class ejercicio4PracticoGuia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase o palabra que empieze con la letra a ");
        String palabra = leer.next();

        if (palabra.substring(0,1).equalsIgnoreCase("a")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }

}
