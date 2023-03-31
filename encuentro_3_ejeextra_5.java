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
public class encuentro_3_ejeextra_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Una obra social tiene tres clases de socios:
        * Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de 
        descuento en todos los tipos de tratamientos.
        * Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de 
        descuento para los mismos tratamientos que los socios del tipo A.
        * Los socios que menos aportan, los de tipo ‘C’, no reciben 
        descuentos sobre dichos tratamientos.
        * Solicite una letra (carácter) que representa la clase de un socio, y
        luego un valor real que represente el costo del tratamiento (previo 
        al descuento) y determine el importe en efectivo a pagar por dicho 
        socio.
        */
        Scanner leer = new Scanner(System.in);
        String opcion;
        int monto;
        int descuento;
        int total;
        System.out.println("Ingrese el tipo de obra social");
        opcion = leer.nextLine();
        
        if (opcion.equals("A")){
            System.out.println("Especifique el monto a abonar del trabajador");
            monto = leer.nextInt();
            descuento = monto * 50 / 100;
            System.out.println("El desceunto otorgado equivale a: " + descuento);
            total = monto - descuento;
            System.out.println("El monto total a pagar es de: " + total);
        }
        
        if (opcion.equals("B")){
            System.out.println("Especifique el monto a abonar del trabajador");
            monto = leer.nextInt();
            descuento = monto * 35 / 100;
            System.out.println("El desceunto otorgado equivale a: " + descuento);
            total = monto - descuento;
            System.out.println("El monto total a pagar es de: " + total);
        }
        
        if (opcion.equals("C")){
            System.out.println("Especifique el monto a abonar del trabajador");
            monto = leer.nextInt();
            System.out.println("El monto total a pagar es de: " + monto);
        }
    }
    
}
