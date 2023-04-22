/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo5;

import java.util.Scanner;

/**
 *
 * @author kwliz
 */
public class Ej2Extra {
    public static void main(String[] args) 
    {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[] vector1 = new int[3];
        int[] vector2 = new int[3];
boolean bandera=true;
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("ingrese valores");
            vector1[i] = leer.nextInt();
        }
        for (int i = 0; i < vector2.length; i++) {
            System.out.println("ingrese valores");
            vector2[i] = leer.nextInt();

        }
        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] != vector2[i]) {
                bandera=false;
                break;
              
            }
        }
        if (bandera) {
             System.out.println("los vectores son iguales");
        }else{
            System.out.println("Los vectores son diferentes");}
       

    }
}
