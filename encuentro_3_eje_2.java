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
public class encuentro_3_eje_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Crear un programa que pida una frase y si esa frase es igual a “eureka” el 
        programa pondrá un mensaje de Correcto, sino mostrará un mensaje de 
        Incorrecto. Nota: investigar la función equals() en Java.
        */
        Scanner leer = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una palabra");
        palabra = leer.nextLine();
        if (palabra.equals("eureka")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
    
}
