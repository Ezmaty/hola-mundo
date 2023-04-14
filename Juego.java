/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author cosas
 */
public class Juego {
    public int num;
    public int intentos;
    

    public Juego(int num, int intentos) {
        this.num = num;
        this.intentos = intentos;
    }

    public Juego() {
    }
    
    public void cargarJuego(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de intentos");
        this.intentos = leer.nextInt();
        System.out.println("Ingrese el numero a adivinar");
        this.num = leer.nextInt();
    }
    
   
        
}
    

