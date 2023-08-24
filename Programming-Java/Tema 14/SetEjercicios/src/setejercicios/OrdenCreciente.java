/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package setejercicios;

import java.util.Comparator;

/**
 *
 * @author usuario
 */
public class OrdenCreciente implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return (Integer) o1-(Integer) o2;
    }
}
