/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionbanco;

/**
 *
 * @author usuario
 */
public class Cuenta {
    //Atributos
    protected String nombreTitular;
    protected int numCuenta;
    protected double saldo;
    
    //Constructores

    public Cuenta() {
    }

    public Cuenta(String nombreTitular, int numCuenta, double saldo) {
        this.nombreTitular = nombreTitular;
        this.numCuenta = numCuenta;
        if (this.saldo < 0) {
            String negativo = "-" + saldo;
        } else {
            this.saldo = saldo;
        }
    }
    
    //Metodos

    @Override
    public String toString() {
        return "Propietario de la cuenta: " + nombreTitular + "\nNumero de cuenta: " + numCuenta + "\nSaldo actual: " + saldo + " €";
    }
    
    public void movimiento(double ingreso) throws SaldoInsuficienteException {
        saldo = ingreso + saldo;
        
        try {
            if (saldo < 0) {
            throw new SaldoInsuficienteException();
            } else {
                System.out.println(toString());
            }
        } catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }
    }
    
}
