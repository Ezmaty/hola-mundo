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
public class encuentro_5_eje_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realice un programa que compruebe si una matriz dada es antisimétrica.
        Se dice que una matriz A es antisimétrica cuando ésta es igual a su 
        propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si 
        A = -AT. La matriz traspuesta de una matriz A se denota por AT y se 
        obtiene cambiando sus filas por columnas (o viceversa).

        */
        Scanner leer =  new Scanner(System.in);
        System.out.println("Ingrese la dimension de la matriz");
        int n = leer.nextInt();
        while (n <= 1){
            System.out.println("¡ERROR! Ingrese una dimension positiva");
            n = leer.nextInt();
        }
        
        int [][] M = new int [n][n];
        cargar_matriz(M);
        comprobar_matriz(M);
        mostrar_matriz(M);
    }
    
    public static void cargar_matriz(int [][] M){
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < M.length; i++){
            for (int j = 0; j < M.length; j++){
                System.out.println("Ingrese un valor para la posicion [" + i + "] [" + j + "]");
                M[i][j] = read.nextInt();
            }
        }
    }
    
    public static void comprobar_matriz(int[][] M){
        boolean log = false;
        for (int i = 0; i < M.length; i++){
            for (int j = 0; j < M.length; j++){
                if (M[i][j] != -M[j][i]){
                    log = true;
                }
            }
        }
        if (log){
            System.out.println("La matriz no es antisimetrica");
        } else {
            System.out.println("La matriz es antisimetrica");
        }
        
    }
    
    public static void mostrar_matriz(int[][] M){
        System.out.println("Matriz cargada");
        for (int i = 0; i < M.length; i++){
            for (int j = 0; j < M.length; j++){
                System.out.print("[" + M[i][j] + "]");
            }
            
            System.out.println("");
        }
        
        System.out.println("Transpuesta de la matriz");
        for (int i = 0; i < M.length; i++){
            for (int j = 0; j < M.length; j++){
                System.out.print("[" + M[j][i] + "]");
            }
            System.out.println("");
        }
    }
    
}
