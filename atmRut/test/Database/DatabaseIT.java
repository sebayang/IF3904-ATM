/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Model.Nasabah;
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
public class DatabaseIT {
    
    public DatabaseIT() {
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
     * Test of connect method, of class Database.
     */
    @Test
    public void testConnect() {
        System.out.println("connect");
        Database instance = new Database();
        instance.connect();
    }

    /**
     * Test of getNasabah method, of class Database.
     */
    @Test
    public void testGetNasabah() {
        System.out.println("getNasabah");
        int norek = 1301154111;
        int pin = 1207;
        Database instance = new Database();
        Nasabah expResult = null;
        Nasabah result = instance.getNasabah(norek, pin);
        assertEquals(expResult, result);
    }

    /**
     * Test of getByNorek method, of class Database.
     */
    @Test
    public void testGetByNorek() {
        System.out.println("getByNorek");
        int norek = 1301154111;
        Database instance = new Database();
        Nasabah expResult = null;
        Nasabah result = instance.getByNorek(norek);
        assertEquals(expResult, result);
    }

    /**
     * Test of updateSaldo method, of class Database.
     */
    //@Test
    public void testUpdateSaldo() {
        System.out.println("updateSaldo");
        int norek = 1301154116;
        int saldo = 50000000;
        Database instance = new Database();
        instance.updateSaldo(norek, saldo);
    }
    
}
