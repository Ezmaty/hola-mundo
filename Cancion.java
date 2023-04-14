/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author cosas
 */
public class Cancion {
    private String titulo;
    private String autor;

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Cancion() {
        this.autor = " ";
        this.titulo = " ";
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public void cancion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el titulo de la cancion");
        this.titulo = leer.nextLine();
        System.out.println("Ingrese el autor de la cancion");
        this.autor = leer.nextLine();
      
    }
    
    public void mostrarCancion(){
        
        System.out.println("El titulo de la cancion es: " + titulo);
        System.out.println("El autor de la cancion es: " + autor);
    }
    
    
    
}
