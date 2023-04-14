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
public class Cuenta {
    private int saldo;
    public String titular;
    private int cantidad;
    

    public Cuenta(int saldo, String titular, int cantidad) {
        this.saldo = saldo;
        this.titular = titular;
        this.cantidad = cantidad;
        
    }

    public Cuenta() {
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }
    
    public void cargarCuenta(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su saldo");
        this.saldo = leer.nextInt();
       
    }
    
    public void retirar(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad a retirar");
        this.cantidad = leer.nextInt();
        if ((this.saldo - this.cantidad) < 0){
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo = this.saldo - this.cantidad;
            System.out.println("Procesando retiro");
        }
    }
    
    public void mostrarsaldo(){
        System.out.println("el saldo es: " + this.saldo);
    }
    
}
