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
public class encuentro_3_eje_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realizar un programa que simule el funcionamiento de un dispositivo 
        RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las 
        cadenas deben llegar con un formato fijo: tienen que ser de un máximo 
        de 5 caracteres de largo, el primer carácter tiene que ser X y el último 
        tiene que ser una O.

        Las secuencias leídas que respeten el formato se consideran correctas,
        la secuencia especial “&&&&&” marca el final de los envíos (llamémosla 
        FDE), y toda secuencia distinta de FDE, que no respete el formato se 
        considera incorrecta.
        
        Al finalizar el proceso, se imprime un informe indicando la cantidad de 
        lecturas correctas e incorrectas recibidas. Para resolver el ejercicio 
        deberá investigar cómo se utilizan las siguientes funciones de Java
        Substring(), Length(), equals().

        */
        Scanner leer = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;
        int contador = 0;
        String palabra = "";
        
        do {
            contador = contador + 1;
            System.out.println("Ingrese una palabra");
            palabra = leer.nextLine();
            
            boolean logico = palabra.length() <= 5 && palabra.startsWith("X") && palabra.endsWith("O");
            
            if (logico){
                correctas = correctas + 1;
            }else{
                incorrectas = incorrectas + 1;
            }
        }while (!"&&&&&".equals(palabra));
        
        System.out.println("El numero de correctas es: " + correctas);
        System.out.println("El numero de incorrectas es: " + incorrectas);
        
    }
    
}
