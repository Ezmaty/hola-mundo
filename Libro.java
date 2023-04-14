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
public class Libro {
    
    private int ISBN;
    private String titulo;
    private String autor;
    private int paginas;

    public Libro(int ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
     public Libro() {
        this.ISBN = 0;
        this.titulo = " ";
        this.autor = " ";
        this.paginas = 0;
     }
    
    public void cargarLibro()  {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el numero de ISBN");
        this.ISBN = leer.nextInt();
        leer.nextLine();
        System.out.print("Ingrese el titulo del libro");
        this.titulo = leer.nextLine();
        System.out.print("Ingrese el autor del libro");
        this.autor = leer.nextLine();
        System.out.print("Ingrese el numero de paginas del libro");
        this.paginas = leer.nextInt();
    }
    
    public void informarLibro()  {
        System.out.println("El numero de ISBN es: " + this.ISBN);
        System.out.println("El titulo del libro es: " + this.titulo);
        System.out.println("El autor del libro es: " + this.autor);
        System.out.println("El numero de paginas es: " + this.paginas);
    }
            

}





