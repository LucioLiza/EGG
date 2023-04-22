
package cursojavaegg.Modulo2;

import java.util.Scanner;

public class EJ4Practico {
    public static void main(String[] args) {
        /*Dada una cantidad de grados centígrados se debe mostrar su equivalente
        en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        */
        int cant_grados;
        int fahrent;
        
        System.out.println("Ingrese cantidad de grados  : ");
        Scanner line = new Scanner(System.in);
        cant_grados = line.nextInt();
        
        fahrent = 32 + (9 * cant_grados / 5);
        
        System.out.println("Equivalencia en Fahrenheit : " + fahrent);
    }
}
