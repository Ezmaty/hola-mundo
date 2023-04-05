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
public class encuentro_5_eje_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 
        1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son 
        idénticas. Crear un programa que permita introducir un cuadrado por 
        teclado y determine si este cuadrado es mágico o no. El programa 
        deberá comprobar que los números introducidos son correctos, es decir, 
        están entre el 1 y el 9.

        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce los valores del cubo magico");
        int matriz[][] = new int [3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                matriz[i][j] = leer.nextInt();
            }
        }
        
        boolean [] numeros_validos = new boolean[10];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                int valor = matriz[i][j];
                if (valor < 1 || valor > 9 || numeros_validos[valor]){
                    System.out.println("Valores invalidos de la matriz");
                    return;
                }
                numeros_validos[valor] = true;
            }
        }
        
        // columna y diagonal
        int suma_diagonal_1 = matriz[0][0] + matriz[1][1] + matriz[2][2];
        int suma_diagonal_2 = matriz[0][2] + matriz[1][1] + matriz[2][0];
        int [] sumas_filas = new int[3];
        int [] sumas_columnas = new int[3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                sumas_filas[i] = matriz[i][j] + 1;
                sumas_columnas[j] = matriz[i][j] + 1;
            }
        }
        
        // verificar si las sumas son iguales
        boolean es_magico = true;
        int suma_magica = suma_diagonal_1; //tomamos la primera diagonal como suma magica
        if (suma_diagonal_2 != suma_magica){
            es_magico = false;
        }
        for (int i = 0; i < 3; i++){
            if (sumas_filas[i] != suma_magica || sumas_columnas[i] != suma_magica){
                
            }
        }
         if (es_magico){
            System.out.println("El cuadrado es magico");
        }else {
            System.out.println("El cuadrado no es magico");
    }
    
   
}   
    
}
