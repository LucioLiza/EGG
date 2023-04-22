package Modulo5;

import java.util.Scanner;

public class Teorico16 {
     public static void main(String[] args)  {
        
        Scanner nombre = new Scanner(System.in);
        String[] equipo = new String[4];
        for (int i = 0;  i < equipo.length; i++) {
            equipo[i] = nombre.nextLine();
        }
        for (String equipo1 : equipo) {
            System.out.println(equipo1);
        }        
        
    }
    
}
