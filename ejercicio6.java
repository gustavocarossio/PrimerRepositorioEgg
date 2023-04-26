/*
Implementar un programa que le pida dos números enteros al usuario y determine
si ambos o alguno de ellos es mayor a 25.

 */
package encuentro456;
import java.util.*;
/**
 *
 * @author drgan
 */
public class ejerc6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     
      
       Scanner leer = new Scanner(System.in);
        int num1, num2, numeropredeterminado;
        numeropredeterminado = 25;
        System.out.println("Ingrese el primer número");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = leer.nextInt();

        if (num1 > numeropredeterminado && num2 > numeropredeterminado) {
            System.out.println("Los dos números son mayores");
        } else if (num1 > numeropredeterminado) {
            System.out.println("El primer número es mayor");
        } else if (num2 > numeropredeterminado) {
            System.out.println("El segundo número es mayor");
        } else {
            System.out.println("Ninguno de los números es mayor!");
        }
    }
}

 
 
 
 
       