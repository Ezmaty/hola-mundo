/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.pkg2;

import java.util.Scanner;

/**
 *
 * @author cosas
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Escribir un programa que pida una frase y la muestre toda en mayúsculas 
        y después toda en minúsculas. 
        Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        */
        Scanner leer = new Scanner(System.in);
        String oracion;
        System.out.println("ingrese una oracion");
        oracion = leer.nextLine();
        
        oracion = oracion.toUpperCase();
        System.out.println("La oracion escrita en toUpperCase es: " + oracion);
        oracion = oracion.toLowerCase();
        System.out.println("La oracion escrita en toLowerCase es: " + oracion);
    }
    
}
