/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author kwliz
 */
public class Circunferencia {
    private double radio;
    
    //1) Método constructor que inicialice el radio pasado como parámetro.
    public Circunferencia (double radio){
        this.radio = radio;
    }

    //Circunferencia() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    
    //2) Métodos get y set para el atributo radio de la clase Circunferencia.
    public double getRadio(){   //alt insert
    return radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    //3) Método para crearCircunferencia(): que le pide el radio 
    //   y lo guarda  en el atributo del objeto.
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el radio de la circunferencia: ");
        radio = leer.nextDouble();
    }

    //4) Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
    public double area(){
    return Math.PI*Math.pow(radio, 2);
    }

    // 5) Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
    public double perimetro(){
    return 2*Math.PI*radio;
           
}
