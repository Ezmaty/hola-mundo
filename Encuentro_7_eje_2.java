/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Circunferencia;

/**
 *
 * @author cosas
 */
public class Encuentro_7_eje_2 {
    public static void main(String[] args){
        /*
        Declarar una clase llamada Circunferencia que tenga como atributo 
        privado el radio de tipo real. A continuación, se deben crear los 
        siguientes métodos:
        - Método constructor que inicialice el radio pasado como parámetro.
        - Métodos get y set para el atributo radio de la clase Circunferencia.
        - Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
        - Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
        - Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

        */
        
        Circunferencia circulo = new Circunferencia();
        System.out.print("Ingrese el valor del radio");
        circulo.crearCircunferencia();
        circulo.areaCircunferencia();
        circulo.perimetroCircunferencia();
        
    }
}
