
package cursojavaegg.Modulo2;

import java.util.Scanner;


public class Ej3Practico {
    public static void main(String[] args) {
        /*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
        Nota: investigar la función toUpperCase() y toLowerCase() en Java. 
        */
        String frase;
        System.out.println("Ingrese una frase  : ");
        Scanner line = new Scanner(System.in);
        frase = line.nextLine();
        
        System.out.println(frase.toLowerCase());
        
        System.out.println(frase.toUpperCase());
    }
}
