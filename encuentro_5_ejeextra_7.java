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
public class encuentro_5_ejeextra_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realizar un programa que complete un vector con los N primeros 
        números de la sucesión de Fibonacci. Recordar que la sucesión de 
        Fibonacci es la sucesión de los siguientes números:
        1, 1, 2, 3, 5, 8, 13, 21, 34, ...
        Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
        La sucesión del número 2 se calcula sumando (1+1)
        Análogamente, la sucesión del número 3 es (1+2),
        Y la del 5 es (2+3),
        Y así sucesivamente…
        La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
        Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
        Fibonaccin = 1 para todo n<=1
        Por lo tanto, si queremos calcular el término “n” debemos escribir una 
        función que reciba como parámetro el valor de “n” y que calcule la serie 
        hasta llegar a ese valor.

        */
        Scanner leer = new Scanner(System.in);
        int num, fibo_1, fibo_2;
        
        do{
            System.out.print("Introduzca un numero mayor a 1");
            num = leer.nextInt();
        }while(num <= 1);
        
        System.out.println("Los " + num + " primeros terminos de la serie de Fibonacci son: ");
        
        fibo_1 = 1;
        fibo_2 = 1;
        
        System.out.print(fibo_1+ " ");
        for (int i = 2; i <= num; i++){
            System.out.print(fibo_2 + " ");
            fibo_2 = fibo_1 + fibo_2;
            fibo_1 = fibo_2 - fibo_1;
        }
        
        System.out.println("");
    }
    
}
