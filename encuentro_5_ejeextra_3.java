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
public class encuentro_5_ejeextra_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Crear una función rellene un vector con números aleatorios, pasándole 
        un arreglo por parámetro. Después haremos otra función o 
        procedimiento que imprima el vector.

        */
        Scanner leer = new Scanner(System.in);
        int [] vector = new int[20];
         llena_vector(vector);
        imprime_vector(vector);
    }
    public static int[] llena_vector(int[] vector){
        Random random = new Random();
        System.out.println("Llenando el vector");
        for (int i = 0; i < vector.length; i++){
            vector[i] = new Random().nextInt(20);
        }
        return vector;
    }
    public static void imprime_vector(int[] vector){
        System.out.println("Imprimiendo vector");
        for (int i = 0; i < vector.length; i++){
            System.out.print("[" + vector[i] + "]");
        }
    }
    
}
