/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coche2;

/**
 *
 * @author usuario
 */
public class Cuenta {
       //Cuenta bancaria simple  

 private int saldo;  
 private String contra;  
 public Cuenta(int saldoini, String cc)  
 { //constructor  
    saldo = saldoini;  
    contra = cc;  
 }  
 public int deposita(int q)  
 { //receptor de dinero  
    saldo += q;  
    return saldo;  
 }  
 public int retira(int q, String cc)  
 { //retira si la contraseña coincide y hay fondos  
    if (contra.equals(cc))  
        if (saldo >= q) //saldo > cantidad a retirar
            return q; //Muestro la cantidad a retirar
        else return -1;  //Si saldo es menor que cantidad a retirar -1
        else return -2;  
 }  
 public int dimeSaldo()  
 { //verifica saldo  
     return saldo;  
 }  
 public String dimeContra()  
 { //verifica contraseña  
    return contra;  
 }  

}
