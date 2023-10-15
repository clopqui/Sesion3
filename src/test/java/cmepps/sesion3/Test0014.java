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
public class Test0014 {
    
    static Cuenta cta12345;
    static Cuenta cta67890;
    
    public Test0014() {
    }
    
    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
        cta12345 = new Cuenta(50);
        cta67890 = new Cuenta(0);
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
        
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
        
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void testReintegroCuenta12345() {
        cta12345.retirar(200.0);
        assertEquals(-150.0, cta12345.getSaldo());
    }

    @Test
    public void testReintegroCuenta67890() {
        cta67890.retirar(350.0);
        assertEquals(-350.0, cta67890.getSaldo());
    }

    @Test
    public void testIngresoCuenta12345() {
        cta12345.ingresar(100.0);
        assertEquals(150.0, cta12345.getSaldo());
    }

    @Test
    public void testReintegroCuenta67890_2() {
        cta67890.retirar(200.0);
        assertEquals(-200.0, cta67890.getSaldo(), 0.01);
    }

    @Test
    public void testReintegroCuenta67890_3() {
        cta67890.retirar(150.0);
        assertEquals(-150.0, cta67890.getSaldo(), 0.01);
    }

    @Test
    public void testReintegroCuentaCuenta12345_2() {
        cta12345.retirar(200.0);
        assertEquals(-50.0, cta12345.getSaldo(), 0.01);
    }

    @Test
    public void testIngresoCuenta67890_3() {
        cta67890.ingresar(50.0);
        assertEquals(50.0, cta67890.getSaldo(), 0.01);
    }
    
    @Test
    public void testReintegroCuenta67890_4() {
        cta67890.retirar(100.0);
        assertEquals(150.0, cta67890.getSaldo(), 0.01);
    }
    
}
