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
public class encuentro_5_eje_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realizar un algoritmo que llene un vector de tamaño N con valores 
        aleatorios y le pida al usuario un número a buscar en el vector. El
        programa mostrará dónde se encuentra el numero y si se encuentra 
        repetido

        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a rellenar");
        int numeros = leer.nextInt();
        int Vector[] = new int[numeros];
        for (int i = 0; i < Vector.length; i++){
            Vector[i] = (int) (Math.random()*9+1);
        }
        
        System.out.println("Ingrese el numero que desee buscar en el vector");
        int num_1 = leer.nextInt();
        int contador = 0;
        
        for (int i = 0; i < Vector.length; i++){
            System.out.println("Buscando...");
            
            if (num_1 == Vector[i]){
                System.out.println("Casilla" + i + ": has acertado al numero");
            } else {
                System.out.println("Casilla" + i + ": no se hallaron coincidencias");
            }
        }
    }
    
}
