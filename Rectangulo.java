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
public class Rectangulo {
    private int base;
    private int altura;
    private int superficie;
    private int perimetro;

    public Rectangulo(int base, int altura, int superficie, int perimetro) {
        this.base = base;
        this.altura = altura;
        this.superficie = superficie;
        this.perimetro = perimetro;
    }

    public Rectangulo() {
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }
    
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo");
        this.base = leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        this.altura = leer.nextInt();
    }
    
    public int superficie(){
        
        return base * altura;
    }
    
    public int perimetro(){
        
        return (base + altura) * 2;
    }
    
    public void asteriscos(){
        
        for (int i = 0; i < altura; i++) {
        for (int j = 0; j < base; j++) {
            if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
       
        
    }
    
}
