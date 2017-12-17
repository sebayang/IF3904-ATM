/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author umann
 */
public class NasabahIT {
    
    public NasabahIT() {
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
     * Test of getNorek method, of class Nasabah.
     */
    @Test
    public void testGetNorek() {
        System.out.println("getNorek");
        Nasabah instance = new Nasabah();
        int expResult = 0;
        int result = instance.getNorek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNorek method, of class Nasabah.
     */
    @Test
    public void testSetNorek() {
        System.out.println("setNorek");
        int norek = 0;
        Nasabah instance = new Nasabah();
        instance.setNorek(norek);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPin method, of class Nasabah.
     */
    @Test
    public void testGetPin() {
        System.out.println("getPin");
        Nasabah instance = new Nasabah();
        int expResult = 0;
        int result = instance.getPin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPin method, of class Nasabah.
     */
    @Test
    public void testSetPin() {
        System.out.println("setPin");
        int pin = 0;
        Nasabah instance = new Nasabah();
        instance.setPin(pin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSaldo method, of class Nasabah.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        Nasabah instance = new Nasabah();
        int expResult = 0;
        int result = instance.getSaldo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSaldo method, of class Nasabah.
     */
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        int saldo = 0;
        Nasabah instance = new Nasabah();
        instance.setSaldo(saldo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNama method, of class Nasabah.
     */
    @Test
    public void testGetNama() {
        System.out.println("getNama");
        Nasabah instance = new Nasabah();
        String expResult = "";
        String result = instance.getNama();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNama method, of class Nasabah.
     */
    @Test
    public void testSetNama() {
        System.out.println("setNama");
        String nama = "";
        Nasabah instance = new Nasabah();
        instance.setNama(nama);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
