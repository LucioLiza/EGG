/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
Crear un programa que permita introducir un cuadrado por teclado y determine 
si este cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9.

 */
package Modulo5;

import java.util.Random;
import java.util.Scanner;

public class Ej6practico {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario que ingrese los elementos del cuadrado
        int[][] cuadrado = new int[3][3];
        System.out.println("Ingrese los números del cuadrado mágico:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int numero;
                do {
                    System.out.print("Fila " + (i + 1) + ", columna " + (j + 1) + ": ");
                    numero = sc.nextInt();
                } while (numero < 1 || numero > 9);
                cuadrado[i][j] = numero;
            }
        }

        // Calculamos la suma esperada de cada fila, columna y diagonal
        int sumaEsperada = 15;

        // Comprobamos si el cuadrado es mágico
        boolean esMagico = true;
        for (int i = 0; i < 3; i++) {
            int sumaFila = 0;
            int sumaColumna = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila += cuadrado[i][j];
                sumaColumna += cuadrado[j][i];
            }
            if (sumaFila != sumaEsperada || sumaColumna != sumaEsperada) {
                esMagico = false;
                break;
            }
        }
        int sumaDiagonal1 = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2];
        int sumaDiagonal2 = cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0];
        if (sumaDiagonal1 != sumaEsperada || sumaDiagonal2 != sumaEsperada) {
            esMagico = false;
        }

        // Mostramos el resultado
        if (esMagico) {
            System.out.println("El cuadrado es mágico.");
        } else {
            System.out.println("El cuadrado no es mágico.");
        }

        sc.close();
    }
}
