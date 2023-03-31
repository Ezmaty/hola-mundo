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
public class encuentro_3_ejeextra_catorce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Se dispone de un conjunto de N familias, cada una de las cuales tiene
        una M cantidad de hijos. Escriba un programa que pida la cantidad de
        familias y para cada familia la cantidad de hijos para averiguar la media de
        edad de los hijos de todas las familias.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias");
        int numero_de_familias = leer.nextInt();
        
        int cantidad_total_de_hijos = 0;
        int suma_de_edades = 0;
        
        for (int i = 1; i <= numero_de_familias; i++){
            System.out.print("Ingrese la cantidad de hijos por familias: " + i + ": ");
            int numero_de_hijos = leer.nextInt();
            
            for (int j = 1; j <= numero_de_hijos; j++){
                System.out.print("Ingrese la edad del hijo: " + j + ": ");
                int edad_de_hijo = leer.nextInt();
                suma_de_edades = edad_de_hijo + 1;
                cantidad_total_de_hijos = cantidad_total_de_hijos + 1;
            }
        }
        
        float media_de_edad = (float) suma_de_edades / cantidad_total_de_hijos;
        System.out.println("La media de edad de todos los hijos es: " + media_de_edad);
    }
    
}
