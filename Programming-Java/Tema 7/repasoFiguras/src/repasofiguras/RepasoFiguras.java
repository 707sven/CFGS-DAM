/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasofiguras;

import java.util.Scanner;
import java.math.MathContext;

/**
 *
 * @author usuario
 */
public class RepasoFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer  = new Scanner (System.in);
        // Calcular el area de varias figuras
        
        //Figura 1 (circulo + cuadrado)
        double alturaCuadrado = 4;
        double diametroCirculo = 4;
        double radioCirculo = diametroCirculo/2;
        
        double area1 = areaCuadrado(alturaCuadrado) + areaCirculo(radioCirculo);
        System.out.println("El área de la figura 1 (ciruclo + cuadrado) es: " + area1);
        
        //Figura2 (cuadrado + triangulo)
        double alturaCuadrado2 = 6;
        double alturaTriangulo = 4;
        
        double area2 = areaCuadrado(alturaCuadrado2) + areaTriangulo(alturaCuadrado2, alturaTriangulo);
        System.out.println("El area de la figura 2 (cuadrado + triangulo) es: " + area2);
        
        //Figura3 (Octogono)
        double ladoOctogono = 4;
        double apotema = 10;
                
        double area3 = areaOctogono(ladoOctogono, apotema);
        System.out.println("El area de la figura 3 (octogono) es: " + area3);
        
        //Figura4 (1 cuadrado menos un cuarto y 2 triangulos (1 cuadrado pequeño))
        double ladoCuadrado3 = 6;
        double alturaTriangulo21 = 1;
        double ladoCuadradoP = 4;
        double baseTriangulo1 = 2;
        double alturaTriangulo22 = 2;
        double baseTriangulo2 =  2;
        
        double areaCuadradoG = areaCuadrado(ladoCuadrado3) - areaCuadrado(ladoCuadradoP);
        double areaTriangulos = (areaRectangulo(baseTriangulo1, alturaTriangulo21)/2) + (areaRectangulo(baseTriangulo2,alturaTriangulo22)/2);
        double area4 = areaCuadradoG + areaTriangulos;
        System.out.println("El area de la figura 4 es: " + area4);
        
    }
    public static double areaCirculo (double radio) {
        double areaCirculo =  Math.PI * (radio * radio);
        return areaCirculo;
    }
    
    public static double areaCuadrado (double lado) {
        double areaCuadrado = lado * lado;
        return areaCuadrado;
    }
    
    public static double areaTriangulo (double base, double altura) {
        double areaTriangulo = (base * altura)/2;
        return areaTriangulo;
    }
    
    public static double areaOctogono (double lado, double apotema) {
        double perimetro = lado * 8;
        double areaHexagono = (perimetro * apotema) /2;
        return areaHexagono;
    }
    
    public static double areaRectangulo (double base, double altura) {
        double areaRectangulo = base * altura;
        return areaRectangulo;
    }
}
