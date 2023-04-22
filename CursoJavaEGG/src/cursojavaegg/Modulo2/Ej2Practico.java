
package cursojavaegg.Modulo2;

import java.util.Scanner;


public class Ej2Practico {
      public static void main(String[] args) {
      /*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
      */
        String nombre;
        System.out.println("Ingrese Su nombre  : ");
        Scanner line = new Scanner(System.in);
        nombre = line.next();
        System.out.println("Tu nombre es : " + nombre);

      }
}
