/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector
de tamaño N, con los valores ingresados por el usuario.

 */
package Modulo5;

import java.util.Scanner;

/**
 *
 * @author kwliz
 */
public class EJ1Extra {
    public static void main(String[] args) 
    {
       Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese tamaño del vector");
        int n= leer.nextInt();
        int[] vector = new int[n];
        
        int suma =0;
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingres los Numeros");
            vector[i] = leer.nextInt();
            
            suma = vector[i]+suma;
        }
        System.out.println("la suma total es:"+ suma);
    }
}
