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
public class encuentro_3_ejeextra_doce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
        números del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca
        un 3 lo sustituya por una E. Ejemplo:
        0-0-0
        0-0-1
        0-0-2
        0-0-E
        0-0-4
        0-1-2
        0-1-E
        */
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                for ( int k = 0; k < 10; k++){
                    String digito_1 = (i == 3) ? "E" : Integer.toString(i);
                    String digito_2 = (j == 3) ? "E" : Integer.toString(j);
                    String digito_3 = (k == 3) ? "E" : Integer.toString(k);
                    System.out.println(digito_1 + "-" + digito_2 + "-" + digito_3);
                }
                
            }
        }
    }
    
}
