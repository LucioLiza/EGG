
package Modulo5;

import java.util.Scanner;


public class teorico15 {
     public static void main(String[] args)  {
         /*Ejercicio 13
           Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros 
           de equipo y define su tipo de dato de tal manera que te permita alojar sus 
           nombres más adelante.
         */
         int Tam;
         System.out.println("ingrese  la cantidad de compañeros");
         Scanner Tam = new Scanner(System.in);
         TAM = Tam.nextInt();
         String [] Equipo = new Equipo [Tam];
         int vector[] = new int[5]; // Le ponemos la dimension al vector
   	
    	// Puedo asignar valores de esta manera
    	vector[0] = 3;
   	 
    	// Asigno valores mediante el for
    	for (int i = 0; i < Tam; i++) {
    	 
        	vector[i] = i + 3;
       	 
    	}
   	 
    	// Muestro el vector
    	for (int i = 0; i < Tamaño; i++) {
        	System.out.println("[" + vector[i] + "]");
    	}
         
     }
    
}
