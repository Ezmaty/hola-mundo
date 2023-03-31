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
public class encuentro_3_ejeextra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
        diferente a cada una. A continuación, realizar las instrucciones 
        necesarias para que: B tome el valor de C, C tome el valor de A, A tome 
        el valor de D y D tome el valor de B. Mostrar los valores iniciales y los 
        valores finales de cada variable. Utilizar sólo una variable auxiliar.
        */
        Scanner leer = new Scanner(System.in);
        int A;
        int B;
        int C;
        int D;
        int aux;
        System.out.println("Introduzca el valor de A");
        A = leer.nextInt();
        System.out.println("Introduzca el valor de B");
        B = leer.nextInt();
        System.out.println("Introduzca el valor de C");
        C = leer.nextInt();
        System.out.println("Introduzca el valor de D");
        D = leer.nextInt();
        
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        
        System.out.println("El valor de C pasa a ser: " + B);
        System.out.println("El valor de A pasa a ser: " + C);
        System.out.println("El valor de D pasa a ser: " + A);
        System.out.println("El valor de B pasa a ser: " + D);
        
    }
    
}
