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
package Entidad;

import java.util.Scanner;

public class Rectangulo {

private double base;
private double altura;


public Rectangulo() {
}

public Rectangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
}

public void crearRectangulo(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese la base del rectangulo:");
    this.base = sc.nextDouble();
    System.out.println("Ingrese la altura del rectangulo:");
    this.altura = sc.nextDouble();
}

public double superficie(){
return base*altura;
}

public double perimetro(){
return (base+altura)*2; 
}

public void dibujo(){
    for (int i = 0; i < altura; i++) {
        for (int j = 0; j < base; j++) {
            System.out.print("*"+" ");
        }
        System.out.println("");
    }
}

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}