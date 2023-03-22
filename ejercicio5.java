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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Escribir un programa que lea un número entero por teclado y muestre
        por pantalla el doble, el triple y la raíz cuadrada de ese número. 
        Nota: investigar la función Math.sqrt().
        */
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("ingrese un numero");
        numero = leer.nextInt();
        int resultado1 = numero * 2;
        System.out.println("El numero mult. por 2 es igual a: " + resultado1);
        int resultado2 = numero * 3;
        System.out.println("El numero mult. por 3 es igual a: " + resultado2);
        int resultado3 = (int) Math.sqrt(numero);
        System.out.println("El resultado de la raiz cuadrada es igual a: " + resultado3);
    }
    
}
