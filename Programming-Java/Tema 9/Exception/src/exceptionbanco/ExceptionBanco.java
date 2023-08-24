/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptionbanco;

/**
 *
 * @author usuario
 */
public class ExceptionBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Un main y 3 clases mas, vamos a crear una clase que se llame CuentaException
        //que deriva de Exception, luego 1 clase mas que int y double se llame SaldoInsuficienteException que herede de CuentaException
        //La cultima clase se llamara Cuenta, que tiene nombre de titular, saldo y numero de cuenta,
        //constructos vacio y otro con los parametros que tenga string, int, doubble. ese constructor va a lanzar una excepcion 
        //de saldo insuficiente si el saldo inicial es negativo
        //Y Cuenta va a tener un metodo que se llame movimiento que espera que suma al saldo que tengo el valor que acabo 
        //de meter, pero si la suma del saldo y el valor que meto sigue siendo negativo que ponga que el saldo es 
        //negativo(La clase)+ toString
        //En el main vamos a crear una cuenta con saldo positivo y negativo pero ademas vamos a crear un string con valores, 
        // en el main voy a tener un metodo que se llame procesarmovimiento
        //que lo que hace es procesa la cuenta y se lo mete a movimiento
        //al crear la cuenta lo meto en un try, usar todas las excepciones que podamos
        
        String nombre = "Antonio";
        Cuenta c;
        String [] valores = {"1000", "-2500", "100"};
        
        try {
            c = new Cuenta ("Antonio", 25,1000);
            System.out.println("Estados " + c.toString());
            procesarMovimiento(c, valores);
            System.out.println("Estado: " + c.toString());
        } catch (CuentaException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error: array incorrecto");
        } catch (NumberFormatException e) {
            System.out.println("error: formato numerico");
        } catch (Exception e) {
            
        }
        
        
    }
    public static void procesarMovimiento(Cuenta c, String [] move) throws SaldoInsuficienteException {
        for (int i = 0; i < move.length; i++) {
            c.movimiento(Double.parseDouble(move[i]));
        }
    }
    
}
