/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.pkg2;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cosas
 */
public class encuentro_5_ejeextra_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realizar un programa que llene una matriz de tamaño NxM con valores 
        aleatorios y muestre la suma de sus elementos.

        */
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        int [] vector = new int[10];
        int suma = 0;       
        for (int i = 0; i < vector.length; i++){
            vector[i] = new Random().nextInt(10);
            System.out.print("[" + vector[i] + "]");
            suma = suma + vector[i];
            System.out.println("La suma de los vectores es: " + suma);
        }
    }
    
}
