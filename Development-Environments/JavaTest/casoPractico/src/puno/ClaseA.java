/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package puno;

/**
 *
 * @author usuario
 */
public class ClaseA implements NewInterface {

    private int atributo1;
    private String atributo2;
    private float atributo3;

    /* 1. Rename. Cambiar el nombre de un método, clase o paquete */
    @Override
    public int metodo12(int par0) {
        int a = 0;
        int b = 10;
        return a + b;
    }

    @Override
    public int metodo2() {
        int a = 110;
        int b = 10;
        return a - b;
    }

    /* 2. Sustitución de bloques
Se sustituye un bloque de código por un método. Seleccionar las dos
últimas líneas de método3. Opción Refactor - Introduce - method
     */
    @Override
    public void metodo3() {
        prueba1();
    }

    private void prueba1() {
        int valor = metodo2();
        nuevo();
    }

    private void nuevo() {
        System.out.println("Estamos en metodo 3");
        System.out.println("Esto es una prueba");
    }

    /* 3. Campos encapsulados
Nos va a permitir hacer privados los atributos de una clase.
Además nos da la opción de crear getter/setter.
Refactor - Encapsulate Fields
     */
 /* 4. Movimiento de clases.
Mover una clase (u otro elemento) a otro paquete.
Refactor - Move (seleccionar clase y paquete)
     */
 /* 5. Extracción de la interfaz.
Podemos crear una Interfaz desde una clase
Interfaz: clase con métodos vacíos para que desde diferentes clases
se puedan implementar dichos métodos. Ejemplo: metodo suma - Cada
clase lo puede implementar de una forma distinta.
En Netbeans sobre una clase Refactor - Extract Interface
     */
 /* 6. Cambio de parámetros
Es posible modificar el número de parámetros de un método
y cambiar incluso su forma de acceso. Cambiar parametros de
metodo5(int num1) a metodo5(int num1, int num2)
En Netbeans Refactor - Change Method Parameters. Añadir parametros.
     */
    public int metodo5(int num1, int num2) {
        return num1 * num1;
    }
    /* 7. Mover a otro nivel
Con este patrón podemos mover una clase a otro nivel de la jerarquía
para que pueda incluso ser pública. Cambiar el acceso de una clase.
Una clase suele ser pública. No hay opción para este patrón.
     */
 /* 8. Borrar. Sobre el elemento Safely Delete.
     */

    /**
     * @return the atributo1
     */
    public int getAtributo1() {
        return atributo1;
    }

    /**
     * @param atributo1 the atributo1 to set
     */
    public void setAtributo1(int atributo1) {
        this.atributo1 = atributo1;
    }

    /**
     * @return the atributo2
     */
    public String getAtributo2() {
        return atributo2;
    }

    /**
     * @param atributo2 the atributo2 to set
     */
    public void setAtributo2(String atributo2) {
        this.atributo2 = atributo2;
    }

    /**
     * @return the atributo3
     */
    public float getAtributo3() {
        return atributo3;
    }

    /**
     * @param atributo3 the atributo3 to set
     */
    public void setAtributo3(float atributo3) {
        this.atributo3 = atributo3;
    }
}
