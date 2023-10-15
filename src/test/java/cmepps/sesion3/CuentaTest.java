/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package cmepps.sesion3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author clopq
 */
public class CuentaTest {
    
    static Cuenta ctaPruebas;
    
    static Cuenta cta12345;
    static Cuenta cta67890;
    
    public CuentaTest() {
    }
    
    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
        ctaPruebas = new Cuenta(0);
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
        
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
        ctaPruebas.setSaldo(0);
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void testIngresar() {
        ctaPruebas.ingresar(3000);
        assertEquals(3000,ctaPruebas.getSaldo());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testRetirar() {
        ctaPruebas.retirar(3000);
        assertEquals(-3000,ctaPruebas.getSaldo());
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testRetirarSinDinero() {
        ctaPruebas.retirar(3000);
        assertEquals(-3000,ctaPruebas.getSaldo());
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
}
