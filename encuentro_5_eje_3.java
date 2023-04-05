/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.pkg2;

/**
 *
 * @author cosas
 */
public class encuentro_5_eje_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Recorrer un vector de N enteros contabilizando cuántos números son de 
        1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

        */
        int Vector[] = new int[5];
        int Vector_1[] = new int[5];
        for (int i = 0; i < Vector.length; i++){
            Vector[i] = (int) (Math.random()*100+1);
            Vector_1[i] = Vector[i];
            System.out.println(Vector[i]);
        }
        
        int contador = 0;
        
        for (int i = 0; i < Vector.length; i++){
            contador = 0;
            do {
                Vector[i] = Vector[i] / 10;
                contador = contador + 1;
            } while (Vector[i] != 0);
            
            System.out.println("El numero " + Vector_1[i] + " tiene un total de " + contador + " digitos");
        }
    }
    
}
