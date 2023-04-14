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
public class Circunferencia {
    private int radio;
    private double area;
    private double perimetro;

    public Circunferencia(int radio, int area, int perimetro) {
        this.radio = radio;
        this.area = area;
        this.perimetro = perimetro;
    }
    
     public Circunferencia() {
        this.perimetro = 0;
        this.area = 0;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
     
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        radio = leer.nextInt();
     }
     
    public void areaCircunferencia(){
         area = Math.PI * Math.pow(radio, 2);
         System.out.println("El area es: " + area);
    }
    
    public void perimetroCircunferencia(){
        perimetro = 2 * Math.PI * radio;
        System.out.println("El perimetro es: " + perimetro);
    }
}