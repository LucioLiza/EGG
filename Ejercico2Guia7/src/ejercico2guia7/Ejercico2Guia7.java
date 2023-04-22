/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el 
radio de tipo real. A continuación, se deben crear los siguientes métodos:
1) Método constructor que inicialice el radio pasado como parámetro.
2) Métodos get y set para el atributo radio de la clase Circunferencia.
3) Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
4) Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
5) Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package ejercico2guia7;

import Entidad.Circunferencia;

/**
 *
 * @author kwliz
 */
public class Ejercico2Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos objeto
        Circunferencia C1 = new Circunferencia(32,6);
        //ingresamos el valor del radio
        C1.crearCircunferencia();
        
        // imprimimos el area y el perìmetro de la circunf.
        System.out.println("El àrea de la circunferencia es: " + C1.area());
        System.out.println(" ");
        System.out.println("El perìmetro de la circunferencia es: " + C1.perimetro());
    }
    
}
