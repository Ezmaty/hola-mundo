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
public class encuentro_3_ejeextra_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Simular la división usando solamente restas. Dados dos números enteros
        mayores que uno, realizar un algoritmo que calcule el cociente y el residuo
        usando sólo restas. Método: Restar el dividendo del divisor hasta obtener
        un resultado menor que el divisor, este resultado es el residuo, y el número
        de restas realizadas es el cociente.
        
        Por ejemplo: 50 / 13:
        
        50 – 13 = 37     una resta realizada
        37 – 13 = 24     dos restas realizadas
        24 – 13 = 11     tres restas realizadas
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el dividendo");
        int dividendo = leer.nextInt();
        System.out.println("Ingrese el divisor");
        int divisor = leer.nextInt();
        
        int cociente = 0;
        
        while (dividendo >= divisor){
            dividendo = divisor - 1;
            cociente = cociente - 1;
        }
        
        int residuo = dividendo;
        
        System.out.println("El cociente es: " + cociente);
        System.out.println("El residuo es: " + residuo);
        
    }
    
}
