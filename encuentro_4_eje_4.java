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
public class encuentro_4_eje_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Crea una aplicación que nos pida un número por teclado y con una 
        función se lo pasamos por parámetro para que nos indique si es o no un 
        número primo, debe devolver true si es primo, sino false.
        Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
        Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 
        17 si es primo.
        */
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i <= 100; i++){
            System.out.println(i + " -> " + es_primo(i));
        }
    }
    public static boolean es_primo(int n){
        
        if (n <= 1){
            return false;
        } else if (n == 2){
            return true;
        } else {
            for (int i = 2; i < n; i++){
                if (n % i == 0){
                    return false;
                }
            }
        }
        return true;
        
        
        
            
        
    }
    
}
