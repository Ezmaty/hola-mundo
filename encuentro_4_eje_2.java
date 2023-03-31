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
public class encuentro_4_eje_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
    String opcion;
    do{
        persona();
        System.out.println("Desea continuar (s/n)");
        opcion = leer.nextLine();}
    while (!"n".equals(opcion));
            
   }
      public static void persona(){
       Scanner leer = new Scanner(System.in);
        int edad;
        String nombre;
        System.out.println("Ingrese Nombre");
        nombre= leer.nextLine();
          System.out.println("ingrese edad");
        edad= leer.nextInt();
        System.out.print(nombre+" es: ");
        if (edad <= 18) {System.out.println("Es menor");        }
        else {
            System.out.println("Es mayor");
        }
        }
          
        
        
    }
    
    

