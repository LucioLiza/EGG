/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1guia7;

import Entidad.Libro;

/**
 *
 * @author kwliz
 */
public class Ejercicio1Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
        // Creamos un objeto libro con los detalles proporcionados
       Libro L1 = new Libro();

    // Pedimos al usuario que ingrese los detalles del libro
        L1.cargarLibro();

    // Mostramos los detalles del libro ingresado
    L1.mostrarLibro();

    }
    
}
