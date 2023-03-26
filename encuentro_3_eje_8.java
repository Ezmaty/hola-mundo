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
public class encuentro_3_eje_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
        Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar 
        lo siguiente:
        * * * *
        *     *
        *     *
        * * * *
        */
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el tamaño del cuadrado");
        n = leer.nextInt();
        
        if (n > 0){
            for (int i=0; i<n; i++){
                System.out.print("*");
            }
            System.out.println();
            
            for (int i=0; i<n-2; i++){
                System.out.print("*");
                for (int j=0; j<n-2; j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            
            for (int i=0; i<n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
