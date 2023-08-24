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
public class CuentaTest {
    
    public CuentaTest() {
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
     * Test of deposita method, of class Cuenta.
     */
    @Test
    public void testDeposita() {
        System.out.println("deposita");
        int q = 0;
        Cuenta instance = new Cuenta (100, "prueba");
        int expResult = 100;
        int result = instance.deposita(q);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of retira method, of class Cuenta.
     */
    @Test
    public void testRetira() {
        System.out.println("retira");
        int q = 0;
        String cc = "";
        Cuenta instance = null;
        int expResult = 0;
        int result = instance.retira(q, cc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dimeSaldo method, of class Cuenta.
     */
    @Test
    public void testDimeSaldo() {
        System.out.println("dimeSaldo");
        Cuenta instance = null;
        int expResult = 0;
        int result = instance.dimeSaldo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dimeContra method, of class Cuenta.
     */
    @Test
    public void testDimeContra() {
        System.out.println("dimeContra");
        Cuenta instance = null;
        String expResult = "";
        String result = instance.dimeContra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
