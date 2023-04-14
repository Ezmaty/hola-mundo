/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author cosas
 */
public class Encuentro_7_ejeextra_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
        Luego, crea un método "retirar_dinero" que permita retirar una cantidad 
        de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea 
        negativo después de realizar una transacción de retiro.

        */
        Cuenta retiro = new Cuenta();
        retiro.cargarCuenta();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del titular de la cuenta");
        retiro.titular = leer.nextLine();
       retiro.retirar();
       retiro.mostrarsaldo();
    }
    
}
