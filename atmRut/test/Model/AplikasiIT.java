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
public class AplikasiIT {
    
    public AplikasiIT() {
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
     * Test of LoginNasabah method, of class Aplikasi.
     */
    @Test
    public void testLoginNasabah() {
        System.out.println("LoginNasabah");
        int norek = 1301154116;
        int pin = 12;
        Aplikasi test = new Aplikasi();
        test.LoginNasabah(norek, pin);
        Nasabah expResult = null;
        Nasabah result = test.LoginNasabah(norek, pin);
        assertEquals(expResult, result);
    }

    /**
     * Test of updateSaldo method, of class Aplikasi.
     */
    @Test
    public void testUpdateSaldo() {
        System.out.println("updateSaldo");
        int norek = 1301154116;
        int saldo = 1207;
        Aplikasi instance = new Aplikasi();
        instance.updateSaldo(norek, saldo);
    }

    /**
     * Test of getNasabahByNorek method, of class Aplikasi.
     */
    @Test
    public void testGetNasabahByNorek() {
        System.out.println("getNasabahByNorek");
        int norek = 1301154111;
        Aplikasi instance = new Aplikasi();
        Nasabah expResult = instance.getData().getByNorek(norek);
        Nasabah result = instance.getNasabahByNorek(norek);
        assertEquals(expResult, result);
    }
    
}
