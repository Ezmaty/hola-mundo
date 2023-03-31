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
public class encuentro_3_ejeextra_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Escriba un programa que lea números enteros. Si el número es múltiplo
        de cinco debe detener la lectura y mostrar la cantidad de números 
        leídos, la cantidad de números pares y la cantidad de números impares. 
        Al igual que en el ejercicio anterior los números negativos no deben 
        sumarse. Nota: recordar el uso de la sentencia break.
        */
        Scanner leer = new Scanner(System.in);
        int num;
        int cant_de_num = 0;
        int cant_de_pares = 0;
        int cant_de_impares = 0;
        
        while (true){
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            if (num % 5 == 0){
                break;
            }
            if (num < 0){
                continue;
            }
            cant_de_num = cant_de_num + 1;
            if (num % 2 == 0){
                cant_de_pares = cant_de_pares + 1;
            } else {
                cant_de_impares = cant_de_impares + 1;
            }
        }
        
        System.out.println("La cantidad de numeros leidos son: " + cant_de_num);
        System.out.println("La cantidad de numeros pares es: " + cant_de_pares);
        System.out.println("La cantidad de numeros impares es: " + cant_de_impares);
    }
    
}
