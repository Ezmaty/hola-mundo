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
public class encuentro_3_ejeextra_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
        muestre su equivalente en romano.
        */
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero");
        numero = leer.nextInt();
        switch (numero){
            case 1:
                if (numero == 1){
                    System.out.println("Su equivalente en romano es (I)");
                    break;
                }
            case 2:
                if (numero == 2){
                    System.out.println("Su equivalente en romano es (II)");
                    break;
                }
            case 3:
                 if (numero == 3){
                    System.out.println("Su equivalente en romano es (III)");
                    break;
                }
            case 4:
                 if (numero == 4){
                    System.out.println("Su equivalente en romano es (IV)");
                    break;
                }
            case 5:
                 if (numero == 5){
                    System.out.println("Su equivalente en romano es (V)");
                    break;
                }
            case 6:
                 if (numero == 6){
                    System.out.println("Su equivalente en romano es (VI)");
                    break;
                }
            case 7:
                 if (numero == 7){
                    System.out.println("Su equivalente en romano es (VII)");
                    break;
                }
            case 8:
                 if (numero == 8){
                    System.out.println("Su equivalente en romano es (VIII)");
                    break;
                }
            case 9:
                 if (numero == 9){
                    System.out.println("Su equivalente en romano es (VIX)");
                    break;
                }
            case 10:
                 if (numero == 10){
                    System.out.println("Su equivalente en romano es (X)");
                    break;
                }
        }
    }
    
}
