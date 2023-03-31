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
public class encuentro_3_ejeextra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
        ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su 
        equivalente: 1 día, 2 horas.

        */
        Scanner leer = new Scanner(System.in);
        int minutos;
        int horas;
        int dias; 
        System.out.println("Ingrese los minutos transcurridos");
        minutos = leer.nextInt();
        
        horas = minutos / 60;
        dias = horas / 24;
        horas = horas - (dias * 24);
        
        System.out.println("el tiempo trnascurrido es de: " + dias + " Dias y " + horas + " Horas");
    }
    
}
