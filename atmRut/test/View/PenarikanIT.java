/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
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
public class PenarikanIT {
    
    public PenarikanIT() {
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
     * Test of getBtnKembal method, of class Penarikan.
     */
    @Test
    public void testGetBtnKembal() {
        System.out.println("getBtnKembal");
        Penarikan instance = new Penarikan();
        JButton expResult = null;
        JButton result = instance.getBtnKembal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBtnLanjutkan method, of class Penarikan.
     */
    @Test
    public void testGetBtnLanjutkan() {
        System.out.println("getBtnLanjutkan");
        Penarikan instance = new Penarikan();
        JButton expResult = null;
        JButton result = instance.getBtnLanjutkan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of refresh method, of class Penarikan.
     */
    @Test
    public void testRefresh() {
        System.out.println("refresh");
        Penarikan instance = new Penarikan();
        instance.refresh();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNominal method, of class Penarikan.
     */
    @Test
    public void testGetNominal() {
        System.out.println("getNominal");
        Penarikan instance = new Penarikan();
        String expResult = "";
        String result = instance.getNominal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addListener method, of class Penarikan.
     */
    @Test
    public void testAddListener() {
        System.out.println("addListener");
        ActionListener e = null;
        Penarikan instance = new Penarikan();
        instance.addListener(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
