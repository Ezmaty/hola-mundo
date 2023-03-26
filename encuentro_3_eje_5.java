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
public class encuentro_3_eje_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Escriba un programa en el cual se ingrese un valor límite positivo, y a
        continuación solicite números al usuario hasta que la suma de los 
        números introducidos supere el límite inicial.

        */
        Scanner leer = new Scanner(System.in);
        int numero;
        int limite;
        int suma = 0;
        int contador = 0;
        System.out.println("Establezca un numero limite");
        limite = leer.nextInt();
        while (suma <= limite){
            contador++;
            System.out.println("Ingrese numeros");
            numero = leer.nextInt();
            suma += numero;
        }
        
        System.out.println("Se a alcanzado el numero limite: " + limite);
        System.out.println("La suma de los numeros es: " + suma);
    }
    
}
