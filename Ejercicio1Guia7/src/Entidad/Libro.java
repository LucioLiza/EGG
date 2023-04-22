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
    public class Libro {
    private Integer isbn;
    private String titulo;
    private String autor;
    private Integer numPaginas;
    
    // Constructor con todos los atributos pasados por parámetro
    public Libro(Integer isbn, String titulo, String autor, Integer numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    
    // Constructor vacío
    public Libro() {
        
    }
    
    // Método para cargar un libro pidiendo los datos al usuario
    public void cargarLibro() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el número ISBN del libro:");
        isbn = leer.nextInt();
        
        System.out.println("Ingrese el título del libro:");
        titulo = leer.next();
        
        System.out.println("Ingrese el nombre del autor del libro:");
        autor = leer.next();
        
        System.out.println("Ingrese el número de páginas del libro:");
        numPaginas = leer.nextInt();
    }
    
    // Método para mostrar los datos del libro
    public void mostrarLibro() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numPaginas);
    }
}
