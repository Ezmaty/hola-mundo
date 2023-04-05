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
public class encuentro_5_ejeextra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realizar un algoritmo que calcule la suma de todos los elementos de un 
        vector de tamaño N, con los valores ingresados por el usuario.
        */
        Scanner leer = new Scanner(System.in);
        int [] vector = new int[] {1, 2, 3, 4, 5};
        int suma = 0;
        
        for (int i = 0; i < vector.length; i++){
            suma = suma + vector[i];
        }
        
        System.out.println("La suma total es: " + suma);
    }
    
}
