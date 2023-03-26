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
public class encuentro_3_eje_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realizar un programa que pida dos números enteros positivos por
        teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir 
        una opción y el programa deberá mostrar el resultado por pantalla y 
        luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
        opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en 
        vez de salir del programa directamente, se debe mostrar el siguiente
        mensaje de confirmación: ¿Está seguro que desea salir del programa
        (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso 
        contrario se vuelve a mostrar el menú.

        */
        Scanner leer = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int opcion = 0;
        int resultado = 0;
        
        while (opcion != 5){
            System.out.println("Escoja la opcion deseada");
            
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = leer.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el primer numero");
                    numero1 = leer.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    numero2 = leer.nextInt();
                    
                    resultado = numero1 + numero2;
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 2:
                    System.out.println("Ingrese el primer numero");
                    numero1 = leer.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    numero2 = leer.nextInt();
                    
                    resultado = numero1 - numero2;
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 3:
                    System.out.println("Ingrese el primer numero");
                    numero1 = leer.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    numero2 = leer.nextInt();
                    
                    resultado = numero1 * numero2;
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 4:
                    System.out.println("Ingrese el primer numero");
                    numero1 = leer.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    numero2 = leer.nextInt();
                    
                    resultado = numero1 / numero2;
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 5:
                    System.out.println("Gracias por usar nuestra calculadora");
                    break;
            }
        }
    }
    
}
