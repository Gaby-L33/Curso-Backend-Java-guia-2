
import java.util.Scanner;

/*
    Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
 */
/**
 *
 * @author Usuario
 */
public class ejercicio8PracticoGuia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidad;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el largo de los lados del cuadrado");
        cantidad = leer.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("");
            for (int j = 0; j < cantidad; j++) {
               
                if (i == 0 || i == cantidad - 1) {
                    System.out.print("*");
                } else{
                    if (j == 0 || j == cantidad - 1){
                        System.out.print("*");
                    } else{
                        System.out.print(" ");
                    }
                }
            }
        }
        System.out.println("");
    }
}
