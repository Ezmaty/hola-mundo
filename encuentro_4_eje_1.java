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
public class encuentro_4_eje_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Crea una aplicación que le pida dos números al usuario y este pueda
        elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener 
        una función para cada operación matemática y deben devolver sus
        resultados para imprimirlos en el main. 
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num_1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num_2 = leer.nextInt();
        int opcion;
        
        do {
            System.out.println("Elija una operacion");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. multiplicacion");
            System.out.println("4. Division");
            opcion = leer.nextInt();
            
            if (opcion == 1){
                int retorno = sumar(num_1,num_2);
                System.out.println("El resultado de la suma es: " + retorno);
                System.out.println("");
            }
            
            if (opcion == 2){
                int resta = restar(num_1,num_2);
                System.out.println("El resultado de la resta es: " + resta);
                System.out.println("");
            }
            
            if (opcion == 3){
                int producto = multiplicar(num_1,num_2);
                System.out.println("El resultado del producto es: " + producto);
                System.out.println("");
            }
            
            if (opcion == 4){
                int division = dividir(num_1,num_2);
                System.out.println("El resultado de la division es: " + division);
                System.out.println("");
            }
        } while (opcion != 4);
    }
    public static int sumar(int num_1, int num_2){
        int suma;
        suma = num_1 + num_2;
        return suma;
        
    }
    public static int restar(int num_1, int num_2){
        int resta;
        resta = num_1 - num_2;
        return resta;
        
    }
    public static int multiplicar(int num_1, int num_2){
        int producto;
        producto = num_1 * num_2;
        return producto;
        
    }
    public static int dividir(int num_1, int num_2){
        int division;
        division = num_1 / num_2;
        return division;
        
    }
    
}

