/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionalidades;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jruiz
 */
public class Acciones_BancariasTest {
    
    public Acciones_BancariasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of nuevo_cliente method, of class Acciones_Bancarias.
     */
    @Test
    public void testNuevo_cliente() {
        System.out.println("==========nuevo_cliente==========");
        String nombre = "prueba";
        String apellido = "prueba";
        String dpi = "5555";
        String noCuenta = "10";
        String saldo = "8";
        String contra = "aa";
        String correo = "juan@gmail.com";
        Acciones_Bancarias instance = new Acciones_Bancarias();
        boolean expResult = true;
        boolean result = instance.nuevo_cliente(nombre, apellido, dpi, noCuenta, saldo, correo, contra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of validar_registro method, of class Acciones_Bancarias.
     */
    @Test
    public void testValidar_registro() {
        System.out.println("==========validar_registro==========");
        String nombre = "prueba";
        String apellido = "prueba";
        String dpi = "5555";
        String noCuenta = "11";
        String saldo = "8";
        String correo = "juan@gmail.com";
        String contra = "aa";
        Acciones_Bancarias instance = new Acciones_Bancarias();
        boolean expResult = true;
        boolean result = instance.validar_registro(nombre, apellido, dpi, noCuenta, saldo, correo, contra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of guardar method, of class Acciones_Bancarias.
     */
    @Test
    public void testGuardar() {
        System.out.println("==========guardar==========");
        String nombre = "prueba";
        String apellido = "prueba";
        String dpi = "5555";
        String noCuenta = "12";
        String saldo = "8";
        String correo = "juan@gmail.com";
        String contra = "aa";
        Acciones_Bancarias instance = new Acciones_Bancarias();
        boolean expResult = true;
        boolean result = instance.guardar(nombre, apellido, dpi, noCuenta, saldo, correo, contra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class Acciones_Bancarias.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String nocuenta = "";
        String contra = "";
        Acciones_Bancarias instance = new Acciones_Bancarias();
        boolean expResult = false;
        boolean result = instance.login(nocuenta, contra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of transferirDinero method, of class Acciones_Bancarias.
     */
    @Test
    public void testTransferirDinero() {
        System.out.println("==========Transferir Dinero==========");
        String receptor = "11";
        Usuario pagador = new Usuario("Manuel", "Galván", "1234", "12", "9999999.99", "", "1234");
        Usuario us_receptor = new Usuario("Juan", "Ruiz", "1234", "11", "0", "", "1234");
        Usuarios.lista.add(pagador);
        Usuarios.lista.add(us_receptor);
        double monto = 100.0;
        boolean expResult = true;
        boolean result = Acciones_Bancarias.transferirDinero(receptor, pagador, monto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("La Cague.");
    }
    
    
}
