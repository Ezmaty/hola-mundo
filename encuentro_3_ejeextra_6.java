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
public class encuentro_3_ejeextra_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Leer la altura de N personas y determinar el promedio de estaturas que 
        se encuentran por debajo de 1.60 mts. y el promedio de estaturas en 
        general.
        */
        Scanner leer = new Scanner(System.in);
        float estatura;
        float promedio_estatura_gente;
        float promedio_estatura_establecida;
        float suma_estatura_gente = 0;
        float suma_estatura_establecida = 0;
        int contador_estatura_gente = 0;
        int contador_estatura_establecida = 0;
        
        
       do {
             System.out.println("Indique la altura de las personas");
        estatura = leer.nextFloat();
          
        if (estatura < 1.60) {
               suma_estatura_establecida = estatura + 1;
               contador_estatura_establecida = contador_estatura_establecida + 1;
           } else {
               
            suma_estatura_gente = estatura + 1;
            contador_estatura_gente = contador_estatura_gente + 1;
               
           }
           
       }while (estatura != 0);
        
        promedio_estatura_gente = suma_estatura_gente / contador_estatura_gente;
        promedio_estatura_establecida = suma_estatura_establecida / contador_estatura_establecida;
        
        System.out.println("El promedio de estaturas general es igual a: " + promedio_estatura_gente + " m y consta de: " + contador_estatura_gente + " de individuos");
        System.out.println("El promedio de estaturas inferior a 1,60 es: " + promedio_estatura_establecida + " m y consta de: " + contador_estatura_establecida + " de individuos");
    }
    
}
