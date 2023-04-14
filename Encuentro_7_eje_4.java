/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Rectangulo;

/**
 *
 * @author cosas
 */
public class Encuentro_7_eje_4 {
    public static void main(String[] args){
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
        
        Rectangulo rectangulos = new Rectangulo();
        
        rectangulos.setAltura(0);
        rectangulos.setBase(0);
        
        rectangulos.crearRectangulo();
        rectangulos.superficie();
        System.out.println("superficie: " + rectangulos.superficie());
        rectangulos.perimetro();
        System.out.println("perimetro: " + rectangulos.perimetro());
        rectangulos.asteriscos();
    }
    
}
