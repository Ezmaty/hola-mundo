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
public class encuentro_3_ejeextra_diez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realice un programa para que el usuario adivine el resultado de una
        multiplicación entre dos números generados aleatoriamente entre 0 y 10. El
        programa debe indicar al usuario si su respuesta es o no correcta. En caso
        que la respuesta sea incorrecta se debe permitir al usuario ingresar su
        respuesta nuevamente. Para realizar este ejercicio investigue como utilizar
        la función Math.random() de Java.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num_1 = (int) (Math.random()*10+1);
        System.out.println("Ingrese el segundo numero");
        int num_2 = (int) (Math.random()*10+1);
        int resultado = num_1 * num_2;
        int respuesta;
        
        do {
            System.out.println("Cual es el resultado de multiplicar: " + num_1 + " y " + num_2);
            respuesta = leer.nextInt();
            if (respuesta == resultado){
                System.out.println("Acertaste");
            } else {
                System.out.println("Fallaste");
            }
        }while (respuesta != resultado);
        
    }
    
}
