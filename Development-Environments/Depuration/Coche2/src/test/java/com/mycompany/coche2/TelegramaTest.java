/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.coche2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author usuario
 */
public class TelegramaTest {
    
    public TelegramaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getNumPalabras method, of class Telegrama.
     */
    @Test
    public void testGetNumPalabras() {
        System.out.println("getNumPalabras");
        Telegrama instance = null;
        int expResult = 0;
        int result = instance.getNumPalabras();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumPalabras method, of class Telegrama.
     */
    @Test
    public void testSetNumPalabras() {
        System.out.println("setNumPalabras");
        int numPalabras = 0;
        Telegrama instance = null;
        instance.setNumPalabras(numPalabras);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoTelegrama method, of class Telegrama.
     */
    @Test
    public void testGetTipoTelegrama() {
        System.out.println("getTipoTelegrama");
        Telegrama instance = null;
        String expResult = "";
        String result = instance.getTipoTelegrama();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoTelegrama method, of class Telegrama.
     */
    @Test
    public void testSetTipoTelegrama() {
        System.out.println("setTipoTelegrama");
        String tipoTelegrama = "";
        Telegrama instance = null;
        instance.setTipoTelegrama(tipoTelegrama);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCosto method, of class Telegrama.
     */
    @Test
    public void testGetCosto() {
        System.out.println("getCosto");
        Telegrama instance = null;
        double expResult = 0.0;
        double result = instance.getCosto();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculaCosto method, of class Telegrama.
     */
    @Test
    public void testCalculaCosto() {
        System.out.println("calculaCosto");
        Telegrama instance = null;
        instance.calculaCosto();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Telegrama.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Telegrama instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
