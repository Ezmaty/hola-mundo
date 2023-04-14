/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author cosas
 */
public class Operacion {
    private double numero1;
    private double numero2;

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public double suma(double numero1, double numero2){
        
        double suma = numero1 + numero2;
        
        return suma;
    }
    
    public double resta(double numero1, double numero2){
        
        double resta = numero1 - numero2;
        
        return resta;
    }
    
    public double multiplicacion(double numero1 , double numero2){
        
        double multiplicacion;
        
        if (numero1 != 0 && numero2 != 0){
            multiplicacion = numero1 * numero2;
        }else{
            System.out.println("El resultado de multiplicar por 0 es 0");
            multiplicacion = 0;
        }
        
        return multiplicacion;
    }
    
    public double division(double numero1, double numero2){
        
        double division;
        
        if (numero1 != 0 && numero2 != 0){
            division = numero1 / numero2;
        }else{
            System.out.println("El resultado de dividir entre 0 es 0");
            division = 0;
        }
        
        return division;
    }
    
    
    
}
