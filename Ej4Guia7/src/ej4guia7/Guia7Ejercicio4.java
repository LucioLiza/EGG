package Ej4Guia7;

import Entidad.Rectangulo;
import java.util.Scanner;

/*
Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por
último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
*/
public class Guia7Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //llamamos al onjeto con un constructur de parametros
        Rectangulo r1 = new Rectangulo(5,10);
        r1.dibujo();
        // Modificamos los datos con un método 
        r1.crearRectangulo();
        r1.dibujo();
        // Modificamos un atributo individualmente
        System.out.println("Introducir otra base");
        r1.setBase(sc.nextDouble());
        r1.dibujo();
        // nos muestra la superficie y perímetro del objeto ultimamente modificado                
        System.out.println("La superficie del rectángulo es: "+ r1.superficie()+" y el perímetro es: "+r1.perimetro());
    }
    
}
