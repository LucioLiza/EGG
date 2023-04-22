/*
 Crear una función rellene un vector con números aleatorios, pasándole un 
arreglo por parámetro. Después haremos otra función o procedimiento que 
imprima el vector.

 */
package Modulo5;

/**
 *
 * @author kwliz
 */
public class Ej3Extra {
    public static void main(String[] args) 
    {
        int[] vector = new int[4];
        rellenarVector(vector);
        imprimirVector(vector);
  
    }
    //___________________________________________________________________
    public static void rellenarVector (int[] vector){ 
        for (int i = 0; i < vector.length; i++) {
           vector[i]=(int) (Math.random()*10); 
        }
    }
    //___________________________________________________________________
    public static void imprimirVector (int[] vector){ 
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i]+"]"); 
        }
    }
}

