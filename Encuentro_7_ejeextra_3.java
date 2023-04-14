/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Juego;
import java.util.Scanner;



/**
 *
 * @author cosas
 */
public class Encuentro_7_ejeextra_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Crea una clase "Juego" que tenga un método "iniciar_juego" que permita 
        a dos jugadores jugar un juego de adivinanza de números. El primer 
        jugador elige un número y el segundo jugador intenta adivinarlo. El 
        segundo jugador tiene un número limitado de intentos y recibe una pista 
        de "más alto" o "más bajo" después de cada intento. El juego termina 
        cuando el segundo jugador adivina el número o se queda sin intentos. 
        Registra el número de intentos necesarios para adivinar el número y el 
        número de veces que cada jugador ha ganado.

        */
        
        Juego partida = new Juego();
        Scanner leer = new Scanner(System.in);
        String respuesta;
        int num;
        int contador;
        int ganadas = 0;
        do {
            partida.cargarJuego();
            contador = 0;
            for (int i = 0; i < partida.intentos; i++) {
                System.out.println("Ingrese un numero");
                num = leer.nextInt();
                contador++;
                if (num == partida.num) {
                    ganadas++;
                    System.out.println("Correcto " + contador + " intentos");
                    break;
                } else if (num < partida.num){
                    System.out.println("Es mas alto");
                } else {
                    System.out.println("Es mas bajo");
                }
            }
            System.out.println("Desea seguir jugando?");
            respuesta = leer.next();
        } while (respuesta.equals("si"));
        
           System.out.println("La cantidad de ganadas es: " + ganadas); 
    }
    
}
