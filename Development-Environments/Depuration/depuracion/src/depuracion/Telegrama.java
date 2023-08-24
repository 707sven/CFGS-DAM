/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 /* MODIFICA EL PACKAGE SEGUN DONDE HAS CREADO LA CLASE*/
package depuracion;

/**
 *
 * @author Usuario
 */
public class Telegrama {
    private final double COSTO_ORDINARIO = 25.0;  
    private final double COSTO_URGENTE = 40.0;  
    private final double COSTO_ADICIONAL_ORDINARIO = 2.5;   
    private final double COSTO_ADICIONAL_URGENTE = 4.0;   
    private String tipoTelegrama;  
    private int numPalabras;  
    private double costo;  
 /**

 * Constructor de la clase. Inicializa los atributos de la clase al   
 * valor de sus parametros  
 * @param tipoTelegrama Tipo de telegrama: "Ordinario" o "Urgente"   
 * @param numPalabras Numero de palabras del telegrama   */  
 public Telegrama(String tipoTelegrama, int numPalabras) {   
    this.tipoTelegrama = tipoTelegrama;  
    this.numPalabras = numPalabras;  
 }  
 /**  
 * Esta funcion regresa el numero de palabras del telegrama.   
 * @return Numero de palabras del telegrama  
 */  
 public int getNumPalabras() {  
    return numPalabras;  
 }  
 /**  
 * Esta funcion establece el numero de palabras del telegrama.   
 * @param numPalabras Numero de palabras del telegrama   */  
 public void setNumPalabras(int numPalabras) {  
    this.numPalabras = numPalabras;  
 }  
 /**  
 * Esta funcion regresa el tipo del telegrama  
 * @return Tipo de telegrama: "Ordinario" o "Urgente"   */  
 public String getTipoTelegrama() {  
    return tipoTelegrama;  
 }  
 /**  
 * Esta funcion establece el tipo del telegrama  
 * @param tipoTelegrama Tipo de telegrama: "Ordinario" o "Urgente"   */  
 public void setTipoTelegrama(String tipoTelegrama) {   
     this.tipoTelegrama = tipoTelegrama;  
 }  
 /**  
 * Esta funcion regresa el costo del telegrama  
 * @return Costo del telegrama  
 */  
 public double getCosto() {  
 return costo;  
 }  
 /**  
 * Esta funcion calcula el costo de un telegrama en funcion de su   * tipo y numero de palabras  
 */  
 public void calculaCosto() {  
 // Si el telegrama es ordinario  
 if (tipoTelegrama.charAt(0) != 'O' && tipoTelegrama.charAt(0) != 'o') 
     if (tipoTelegrama.charAt(0) == 'U' ||  
            tipoTelegrama.charAt(0) == 'u') {
     // Si el telegrama tiene hasta 10 palabras
     if (numPalabras <= 10) {  
         costo = COSTO_URGENTE;
     }
     // Si el numero depalabras excede a 10 palabras
     else {
         costo = COSTO_URGENTE +
                 COSTO_ADICIONAL_URGENTE * (numPalabras - 10);
     }
 }
 // Si el telegrama no es ordinario ni urgente
 else {
     costo = 0;
 }  
 // Si el telegrama es urgente  
 else {
     // Si el telegrama tiene hasta 10 palabras
     if (numPalabras <= 10) {
         costo = COSTO_ORDINARIO;
     }
     // Si el numero depalabras excede a 10 palabras
     else {
         costo = COSTO_ORDINARIO +
                 COSTO_ADICIONAL_ORDINARIO * (numPalabras - 10);  }
        }  
 }  
 /**  
 * Esta funciòn regresa una cadena con el tipo de telegrama, su   * numero de palabras y su costo.  
 * @return Cadena con el tipo de telegrama, su numero de palabras y   * su costo.  
 */  
    @Override
 public String toString() {  
    return tipoTelegrama + ", " + numPalabras + ", " + costo;   }  
} 


