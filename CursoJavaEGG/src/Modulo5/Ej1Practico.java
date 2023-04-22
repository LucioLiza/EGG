/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo5;

/**
 *
 * @author kwliz
 */
public class Ej1Practico {
    public static void main(String[] args) 
     {
        int[]vector = new int [100];
        for(int i = 0; i <100; i++)
         {
            vector [i]= i;
         }
        for(int i = 100; i > 0; i --)
         {
            System.out.print("  "  + i  +" , " );
         }
        System.out.println("");
    
     }
    }        
}
