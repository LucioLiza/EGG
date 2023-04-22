
package Modulo3;

import java.util.Scanner;

public class EJ1Practico 
{
    public static void main(String[] args) 
    {
        //Crear un programa que dado un número determine si es par o impar.
        Scanner leer= new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero entero");
        num=leer.nextInt();
        if (num %2==0)
        {
            System.out.println("El numero es par ");
        } else {
            System.out.println("El numero es impar");
        }
    }
    
}
    

