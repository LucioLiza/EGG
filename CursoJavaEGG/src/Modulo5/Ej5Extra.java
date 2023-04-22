/*
 Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios
 y muestre la suma de sus elementos.
 */
package Modulo5;

import java.util.Random;

/**
 *
 * @author kwliz
 */
public class Ej5Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N = 5; // número de filas
        int M = 4; // número de columnas
        int[][] matriz = new int[N][M]; // matriz de tamaño NxM
        Random rand = new Random(); // objeto Random para generar valores aleatorios
        
        // Llenar la matriz con valores aleatorios entre 0 y 9
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = rand.nextInt(10);
            }
        }
        
        // Mostrar la matriz
        System.out.println("Matriz generada:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        // Calcular la suma de los elementos de la matriz
        int suma = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                suma += matriz[i][j];
            }
        }
        
        // Mostrar la suma de los elementos de la matriz
        System.out.println("La suma de los elementos de la matriz es: " + suma);
    }
}

