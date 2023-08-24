/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentacorriente;
import nuevobanco.Banco;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ClaseCuentaCorriente {
    //Atributos
    private banco banco;
    private int saldo;
    private String nombre;
    private String  dniTitular;
    private int LimiteDescubierto;
    
        //Operaciones con una CC 
        //Crear una cuenta, se necesita el nombre y el dni del titular, saldo inicial 0, Limite de descubierto -50
        //Sacar dinero. Solo se puede sacar el dinero hasta el limite de descubierto. Debe indicar si ha sido posible la operacion
        //Ingresar dinero (se incrementa el saldo)
        //Mostrar la información disponible de la CC
    
    //Constructores
    public ClaseCuentaCorriente(String nombre, String dniTitular) {
        this.saldo = 0;
        this.nombre = nombre;
        this.dniTitular = dniTitular;
        this.LimiteDescubierto = 50;
    } 
        public ClaseCuentaCorriente(String nombre, String dniTitular, int saldo) {
        this.saldo = saldo;
        this.nombre = nombre;
        this.dniTitular = dniTitular;
        this.LimiteDescubierto = 50;
    } 
    
    public ClaseCuentaCorriente() {
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDniTitular() {
        return dniTitular;
    }

    public void setDniTitular(String dniTitular) {
        this.dniTitular = dniTitular;
    }

    public int getLimiteDescubierto() {
        return LimiteDescubierto;
    }

    public void setLimiteDescubierto(int LimiteDescubierto) {
        this.LimiteDescubierto = LimiteDescubierto;
    }

    //Metodos

    @Override
    public String toString() {
        return "saldo=" + saldo + ", nombre=" + nombre + ", dniTitular=" + dniTitular + ", LimiteDescubierto=" + LimiteDescubierto;
    }
        
    public void info() {
        System.out.println("Información acutal de la cuenta de " + this.nombre);
        System.out.println("Nombre del titular de la cuenta: " + this.nombre);
        System.out.println("DNI del titular de la cuenta: " + this.dniTitular);
        System.out.println("Saldo acutla de la cuenta: " + this.saldo);
    }
    
    public void i () {
        Scanner leer = new Scanner(System.in);
        System.out.print("¿Cuánta cantidad desea ingresar? ");
        int ingreso = leer.nextInt();
        
        this.saldo = this.saldo + ingreso;
        System.out.println("Su saldo actual es de " + this.saldo + " €");
    }
    
    public void s () {
         Scanner leer = new Scanner(System.in);
         System.out.print("¿Cuánto dinero desea retirar? ");
         int sacar = leer.nextInt();
        
        if ((this.saldo + this.LimiteDescubierto) < sacar) {
            System.out.println("No se puede realizar la operación.");
        } else {
            this.saldo = this.saldo - sacar;
            System.out.println("Su saldo acutal es de " + this.saldo + " €");
        }
    }
 
}
