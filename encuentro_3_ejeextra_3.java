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
public class encuentro_3_ejeextra_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se 
        trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
        la función equals() de la clase String.

        */
        Scanner leer = new Scanner(System.in);
        String letra;
        System.out.println("Ingrese una letra");
        letra = leer.nextLine();
        
        if (letra.startsWith("A") || letra.startsWith("E") || letra.startsWith("I") || letra.startsWith("O") || letra.startsWith("U")){
            System.out.println("La letra ingresada es una vocal");
        }else{
            System.out.println("La letra ingresada no es una vocal");
        }
    }
    
}
