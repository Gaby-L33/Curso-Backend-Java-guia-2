
import java.util.Scanner;

/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
/**
 *
 * @author Usuario
 */
public class ejercicio6PracticoGuia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, opcion, suma, resta, multiplicacion;
        double division;
        String continuar;
        
        continuar = "n";
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        num1 = leer.nextInt();

        System.out.println("Ingrese otro numero");
        num2 = leer.nextInt();

        do {
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicación");
            System.out.println("4.Division");
            System.out.println("5.Salir");
            System.out.println("Elija una opción:");
            opcion = leer.nextInt();
             System.out.println("═══════════════════════════════════════════════════");

            switch (opcion) {
                case 1:
                    suma = num1 + num2;
                    System.out.println("La suma de los numeros ingresados es: " + suma);
                    System.out.println("═══════════════════════════════════════════════════");
                    break;

                case 2:
                    resta = num1 - num2;
                    System.out.println("La resta de los numeros ingresados es: " + resta);
                     System.out.println("═══════════════════════════════════════════════════");
                    break;

                case 3:
                    multiplicacion = num1 * num2;
                    System.out.println("La multiplicación de los numeros ingresados es: " + multiplicacion);
                     System.out.println("═══════════════════════════════════════════════════");
                    break;

                case 4:
                    division = num1 / num2;
                    System.out.println("La division de los numeros ingresados es: " + division);
                     System.out.println("═══════════════════════════════════════════════════");
                    break;

                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    continuar = leer.next();
                    break;
            }

        } while (continuar.equalsIgnoreCase("n"));
        
    
    }

}
