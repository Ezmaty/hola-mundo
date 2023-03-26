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
public class encuentro_3_eje_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Escriba un programa que pida una frase o palabra y valide si la primera 
        letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de 
        imprimir un mensaje por pantalla que diga “CORRECTO”, en caso 
        contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función 
        Substring y equals() de Java.

        */
        Scanner leer = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una palabra que comience con A");
        palabra = leer.nextLine();
        if (palabra.startsWith("A")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
            
        }
    }
    
}
