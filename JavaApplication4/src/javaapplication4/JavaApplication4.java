/*
 * Escribir un programa que pida dos números enteros por teclado y calcule la 
suma de los dos. El programa deberá después mostrar el resultado de la suma

 */
package javaapplication4;

/**
 *
 * @author kwliz
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        int numero2;
        
        
        System.out.println("Ingrese un numero : ");
        Scanner line = new Scanner(System.in);
        numero = line.nextInt();
        
        System.out.println("Ingrese otro numero : ");
        Scanner line2 = new Scanner(System.in);
        numero2 = line2.nextInt();
        
        int suma = numero + numero2;
        
        System.out.println("Resultado : " + suma);
    }
    
}
