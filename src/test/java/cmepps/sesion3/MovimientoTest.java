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
 * @author chris
 */
public class MovimientoTest {
    
    static Movimiento movitest;
    static Movimiento movitest2;
    enum Signo{D,H};
    
    public MovimientoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        movitest = new Movimiento(100.0,Movimiento.Signo.D);
        movitest2 = new Movimiento(100.0,Movimiento.Signo.H);
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
     * Test of getImporte method, of class Movimiento.
     */
    @Test
    public void testGetImporte() {
        System.out.println("getImporte");
        assertEquals(100.0, movitest.getImporte());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSigno method, of class Movimiento.
     */
    @Test
    public void testGetSigno() {
        System.out.println("getSigno");
        assertEquals(Movimiento.Signo.D, movitest.getSigno());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDetalle method, of class Movimiento.
     */
    @Test
    public void testGetDetalle() {
        System.out.println("getDetalle");
        assertEquals("Ingreso", movitest.getDetalle());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of getSigno method, of class Movimiento.
     */
    @Test
    public void testGetSignoH() {
        System.out.println("getSigno");
        assertEquals(Movimiento.Signo.H, movitest2.getSigno());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDetalle method, of class Movimiento.
     */
    @Test
    public void testGetDetalleH() {
        System.out.println("getDetalle");
        assertEquals("Reintegro", movitest2.getDetalle());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
