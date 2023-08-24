/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionbanco;

/**
 *
 * @author usuario
 */
public class CuentaException extends Exception {
    public CuentaException () {
        super ("Error. Saldo insuficiente.");
    }
}
