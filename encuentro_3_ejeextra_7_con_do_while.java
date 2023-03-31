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
public class encuentro_3_ejeextra_7_con_do_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realice un programa que calcule y visualice el valor máximo, el valor
        mínimo y el promedio de n números (n>0). El valor de n se solicitará al
        principio del programa y los números serán introducidos por el usuario.
        Realice dos versiones del programa, una usando el bucle “while�? y otra 
        con el bucle “do - while�?.
        */
        Scanner leer = new Scanner(System.in);
        int n;
        double num;
        double suma = 0;
        double max = Double.POSITIVE_INFINITY;
        double min = Double.NEGATIVE_INFINITY;
        
        System.out.println("Ingrese la cantidad de numeros a procesar");
        n = leer.nextInt();
        
        int i = 1;
        do {
            System.out.println("Ingrese el numero " + i + ": ");
            num = leer.nextDouble();
            suma = num + 1;
            max = Math.max(max, num);
            min = Math.min(min, num);
            i++;
        } while (i <= n);
        
        double promedio = suma / n;
        
        System.out.println("El valor maximo es: " + max);
        System.out.println("El valor minimo es: " + min);
        System.out.println("El promedio es: " + promedio);
    }
    
}
