/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depuracion;

public class Coche {
    public String modelo;
    public float precioBase;
    public static float impuesto;   //porcentaje entre 0 y 100

    public Coche(String modelo, float precioBase) {
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    public float precioFinal(float descuento) throws Exception {
        float precioConDescuento = this.precioBase;
        if (descuento < 0 || descuento > 100) 
            throw new RuntimeException("Descuento erroneo");
        if (precioBase >= 5000) {
            precioConDescuento = this.precioBase - (this.precioBase * descuento/100f);
        }
        return precioConDescuento + precioConDescuento * this.impuesto/100f;

    }

}