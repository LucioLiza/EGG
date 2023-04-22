/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaegg.Modulo2;

import java.util.Scanner;

/**
 *
 * @author kwliz
 */
public class EJ1Practico {
      public static void main(String[] args) {
    /*Escribir un programa que pida dos números enteros por teclado y calcule 
    la suma de los dos. El programa deberá después mostrar el resultado de la suma*/
        int numero1;
        int numero2;
        System.out.println("Ingrese un numero 1 : ");
        Scanner line = new Scanner(System.in);
        numero1 = line.nextInt();
        
        System.out.println("Ingrese otro numero 2 : ");
        Scanner line2 = new Scanner(System.in);
        numero2 = line2.nextInt();
        
        int suma = numero1 + numero2;
        
        System.out.println("La suma de los dos numeros es : " + suma);
    }
    
}
