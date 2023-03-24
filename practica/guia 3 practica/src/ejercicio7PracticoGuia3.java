
import java.util.Scanner;

/*
    Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
    este tipo de dispositivo lee cadenas enviadas por el usuario. 
    Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, 
    el primer carácter tiene que ser X y el último tiene que ser una O.
    Las secuencias leídas que respeten el formato se consideran correctas, 
    la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
    y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
    Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. 
    Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
/**
 *
 * @author Usuario
 */
public class ejercicio7PracticoGuia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String secuencias;
        int correctas, incorrectas, largo;

        correctas = 0;
        incorrectas = 0;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las secuencias");

        do {
            secuencias = leer.next();
            largo = secuencias.length();
           
            if (secuencias.substring(0,1).equalsIgnoreCase("x") && secuencias.substring(largo-1, largo).equalsIgnoreCase("O") && secuencias.length() < 6) {
                correctas = correctas + 1;
            } else if (secuencias.equals("&&&&&")) {
                correctas = correctas + 0;
            } else {
                incorrectas = incorrectas + 1;
            }
            
        } while (secuencias.equals("&&&&&") == false);

        System.out.println("La cantidad de secuencias correctas son: " + correctas);
        System.out.println("Y la cantidad de secuencias incorrectas son: " + incorrectas);
    }

}
