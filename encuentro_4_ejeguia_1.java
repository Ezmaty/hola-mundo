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
public class encuentro_4_ejeguia_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Escribir un programa que procese una secuencia de caracteres ingresada por 
        teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
        la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
        la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
        mantienen sin cambios.
        
        Realice un subprograma que reciba una secuencia de caracteres y retorne la 
        codificación correspondiente. Utilice la estructura “según” para la 
        transformación. 
        
        Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
        La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.


        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        System.out.println("La frase ingresada es: " + frase);
        
        String retorno = reemplazo(frase);
        
        System.out.println("La frase reemplazada es: " + retorno);
    }
    
    public static String reemplazo(String frase){
        String frase_2;
        frase_2 = frase.replace("a", "@").replace("e", "#").replace("i", "$").replace("o", "%").replace("u", "*");
        return frase_2;
        
    }
    
}
