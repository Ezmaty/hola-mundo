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
public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void cargar_datos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        this.nombre = leer.nextLine();
        System.out.println("Ingrese su edad");
        this.edad = leer.nextInt();
        System.out.println("Ingrese su salario");
        this.salario = leer.nextDouble();
    }
    
    public void calcular_aumento(){
        if (this.edad > 30) {
            this.salario = this.salario * 1.10;
        } else {
            this.salario = this.salario * 1.05;
        }
    }
    
    public void mostrar_salario() {
        System.out.println("El salario final es: " + this.salario);
    }
}
