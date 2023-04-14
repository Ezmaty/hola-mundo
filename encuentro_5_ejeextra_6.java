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
public class encuentro_5_ejeextra_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 
        caracteres y, a medida que el usuario las va ingresando, construya una 
        “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las 
        palabras se ubicarán todas en orden horizontal en una fila que será 
        seleccionada de manera aleatoria. Una vez concluida la ubicación de las 
        palabras, rellene los espacios no utilizados con un número aleatorio del 
        0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
        Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las 
        siguientes funciones de Java substring(), Length() y Math.random().

        */
        Scanner leer = new Scanner(System.in);
        String [][] Sopa_de_Letras = new String[20][20];
        String [] relleno = {"0","1","2","3","4","5","6","7","8","9"}; 
        String [] palabra_1 = {"b","u","c","l","e"};
        String [] palabra_2 = {"w","h","i","l","e"};
        String [] palabra_3 = {"j","a","v","a"};
        String [] palabra_4 = {"f","o","r"};
        String [] palabra_5 = {"p","r","i","n","t"};
        
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                Sopa_de_Letras[i][j] = relleno[(int) (Math.random()*10)] ;
                
            }
        }
        for(int i = 0; i < 5; i++){
            
            Sopa_de_Letras[9][i] = palabra_1[ i ];
            Sopa_de_Letras[15][i] = palabra_2[ i ];
            Sopa_de_Letras[4][i] = palabra_5[ i ];
            
        }
        for(int i = 0; i < 4; i++){
            Sopa_de_Letras[2][i] = palabra_3[ i ];
        }
        for(int i = 0; i < 3; i++){
            Sopa_de_Letras[6][i] = palabra_4[ i ];
        }
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                System.out.print(Sopa_de_Letras[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
