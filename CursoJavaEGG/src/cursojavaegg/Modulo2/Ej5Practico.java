package cursojavaegg.Modulo2;

import java.util.Scanner;

public class Ej5Practico {
    public static void main(String[] args) {
        /*Escribir un programa que lea un número entero por teclado y 
        muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
        Nota: investigar la función Math.sqrt().
       */
        int numero;
        System.out.println("Ingrese un numero : ");
        Scanner line = new Scanner(System.in);
        numero = line.nextInt();
        System.out.println("El doble es : " + (numero * 2 ) );
        System.out.println("El trilple es : " + (numero * 3 ) );
        System.out.println("La raiz cuadrada es : " + (Math.sqrt(numero) ) );
    }
}
