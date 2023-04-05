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
public class encuentro_5_eje_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios 
        y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz 
        A se denota por B y se obtiene cambiando sus filas por columnas (o 
        viceversa).

        */
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        int[][] matriz_original = new int [4][4];
        int[][] matriz_transpuesta = new int [4][4];
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                matriz_original[i][j] = random.nextInt(10);
                System.out.print("[" + matriz_original[i][j] + "]");
            }
            System.out.println(" ");
        }
        
        System.out.println("La matriz transpuesta es");
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                matriz_transpuesta[i][j] = matriz_original[j][i];
                System.out.print("[" + matriz_transpuesta[i][j] + "]");
            }
            System.out.println(" ");
        }
    }
    
}
