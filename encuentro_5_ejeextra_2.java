/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.pkg2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author cosas
 */
public class encuentro_5_ejeextra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Escriba un programa que averigüe si dos vectores de N enteros son 
        iguales (la comparación deberá detenerse en cuanto se detecte alguna 
        diferencia entre los elementos).

        */
        Scanner leer = new Scanner(System.in);
        int [] vector_1 = new int[] {1,2,3,4,5};
        int [] vector_2 = new int[] {1,2,3,4,5};
        // Los valores de los vectores ingresados por teclado ya que 
        // con numeros aleatorios no coincidirian nunca
        // El que coincidan o no depende del usuario
        // Cambiando solo un numero los vectores no coinciden
        for (int i = 0; i < vector_1.length; i++ ){
            for (int j = 0; j < vector_2.length; j++){
                if (Arrays.equals(vector_1, vector_2)){
                    System.out.println("Los vectores coinciden");
                }else{
                    System.out.println("Los vectores no coinciden");
                }
            }
        }
    }
    
}
