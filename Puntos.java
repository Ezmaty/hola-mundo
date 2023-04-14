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
public class Puntos {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x;
    private int y;
    private double distancia;

    public Puntos(int x1, int y1, int x2, int y2, int x, int y, double distancia) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x = x;
        this.y = y;
        this.distancia = distancia;
    }

    public Puntos() {
    }
    
    public void coordenadas(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca los valores de los dos primeros puntos de coordenadas");
        this.x1 = leer.nextInt();
        this.y1 = leer.nextInt();
        System.out.println("Introduzca los valores de los dos segundos puntos de coordenadas");
        this.x2 = leer.nextInt();
        this.y2 = leer.nextInt();
        System.out.println("");
        System.out.println("Las coordenadas seleccionadas son: " + x1 + "" + y1 + "" + x2 + "" + y2);
        System.out.println("");
        x = x2 - x1;
        y = y2 - y1;
        System.out.println("");
        System.out.println("Las coordenadas son: " + x + "" + y);
        System.out.println("");
        distancia = Math.sqrt(x*x + y*y);
        System.out.println("La distancia entre ambos puntos es: " + distancia);
    }
    
}
