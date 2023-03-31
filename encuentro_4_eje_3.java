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
public class encuentro_4_eje_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Crea una aplicación que a través de una función nos convierta una
        cantidad de euros introducida por teclado a otra moneda, estas pueden 
        ser a dólares, yenes o libras. La función tendrá como parámetros, la 
        cantidad de euros y la moneda a convertir que será una cadena, este no 
        devolverá ningún valor y mostrará un mensaje indicando el cambio 
        (void).
        El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de EUROS a cambiar");
        int euros = leer.nextInt();
        
        cambio(euros);
    }
    public static void cambio(int euros){
        Scanner read = new Scanner(System.in);
        float libras = (float) (euros * 0.86);
        System.out.println("El cambio de euros a libras es igual a: " + libras);
        float dolares = (float) (euros * 1.28);
        System.out.println("El cambio de euros a dolares es igual a: " + dolares);
        float yenes = (float) (euros * 129.852);
        System.out.println("El cambio de euros a yenes es igual a: " + yenes);
    }
}
