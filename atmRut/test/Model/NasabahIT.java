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
    Nasabah Test = new Nasabah(1301154116,1207,50000000,"Febrio Ibrahim s");
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
        int expResult = 1301154116;
        int result = Test.getNorek();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNorek method, of class Nasabah.
     */
    @Test
    public void testSetNorek() {
        System.out.println("setNorek");
        int norek = 1301154116;
        Test.setNorek(norek);

    }

    /**
     * Test of getPin method, of class Nasabah.
     */
    @Test
    public void testGetPin() {
        System.out.println("getPin");
        int expResult = 1207;
        int result = Test.getPin();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPin method, of class Nasabah.
     */
    @Test
    public void testSetPin() {
        System.out.println("setPin");
        int pin = 1207;
        Test.setPin(pin);

    }

    /**
     * Test of getSaldo method, of class Nasabah.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        int expResult = 50000000;
        int result = Test.getSaldo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSaldo method, of class Nasabah.
     */
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        int saldo = 50000000;
        Nasabah instance = new Nasabah();
        Test.setSaldo(saldo);
    }

    /**
     * Test of getNama method, of class Nasabah.
     */
    @Test
    public void testGetNama() {
        System.out.println("getNama");
        String expResult = "Febrio Ibrahim s";
        String result = Test.getNama();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNama method, of class Nasabah.
     */
    @Test
    public void testSetNama() {
        System.out.println("setNama");
        String nama = "Febrio Ibrahim S";
        Test.setNama(nama);
    }
    
}
