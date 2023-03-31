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
public class encuentro_4_ejeguia_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Crea un procedimiento EsMultiplo que reciba los dos números pasados por el 
        usuario, validando que el primer número múltiplo del segundo e imprima si el 
        primer número es múltiplo del segundo, sino informe que no lo son.

        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num_1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num_2 = leer.nextInt();
        
        multiplo(num_1, num_2);
    }
    
    public static void multiplo(int num_1, int num_2){
        System.out.println("Los numeros imgresados son: " + num_1 + " y " + num_2);
        
        if (num_1 % num_2 == 0){
            System.out.println("Los numeros son multiplos");
        } else {
            System.out.println("Los numeros no son multiplos");
        }
       
        
    }
    
}
