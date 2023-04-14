/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Empleado;
import java.util.Scanner;

/**
 *
 * @author cosas
 */
public class Encuentro_7_ejeextra_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y 
        "salario". Luego, crea un método "calcular_aumento" que calcule el 
        aumento salarial de un empleado en función de su edad y salario actual. 
        El aumento salarial debe ser del 10% si el empleado tiene más de 30 
        años o del 5% si tiene menos de 30 años.

        */
        Scanner leer = new Scanner(System.in);
        Empleado matias = new Empleado();
        matias.cargar_datos();
        matias.calcular_aumento();
        matias.mostrar_salario();
        
        Empleado franco = new Empleado();
        franco.setNombre(leer.nextLine());
        franco.setEdad(leer.nextInt());
        franco.setSalario(500000);
        
        System.out.println("El nombre del segundo empleado es: " + franco.getNombre() + " , su salario es: " + franco.getSalario());
        franco.calcular_aumento();
        franco.mostrar_salario();
    }
    
}
