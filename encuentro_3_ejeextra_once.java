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
public class encuentro_3_ejeextra_once {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Escribir un programa que lea un número entero y devuelva el número de
        dígitos que componen ese número. Por ejemplo, si introducimos el número
        12345, el programa deberá devolver 5. Calcular la cantidad de dígitos
        matemáticamente utilizando el operador de división. Nota: recordar que las
        variables de tipo entero truncan los números o resultados.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();
        
        int contador = 0;
        while (numero != 0){
            numero = numero / 10;
            contador = contador + 1;
        }
        
        System.out.println("El numero tiene: " + contador + " de digitos");
    }
    
}