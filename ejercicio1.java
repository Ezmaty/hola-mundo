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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escribir un programa que pida dos números enteros por teclado y calcule 
        la suma de los dos. El programa deberá después mostrar el resultado de
        la suma
        */
        
        Scanner reader = new Scanner(System.in);
        int numero1;
        int numero2;
        
        System.out.println("ingrese el primer numero");
        numero1 = reader.nextInt();
        System.out.println("ingrese otro numero");
        numero2 = reader.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("La suma es " + numero1 + " + " + numero2 + " = " + resultado);
       
    }
    
}
