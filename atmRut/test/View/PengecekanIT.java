/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
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
public class PengecekanIT {
    
    public PengecekanIT() {
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
     * Test of getLabelNama method, of class Pengecekan.
     */
    @Test
    public void testGetLabelNama() {
        System.out.println("getLabelNama");
        Pengecekan instance = new Pengecekan();
        JLabel expResult = null;
        JLabel result = instance.getLabelNama();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabelNorek method, of class Pengecekan.
     */
    @Test
    public void testGetLabelNorek() {
        System.out.println("getLabelNorek");
        Pengecekan instance = new Pengecekan();
        JLabel expResult = null;
        JLabel result = instance.getLabelNorek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabelSaldo method, of class Pengecekan.
     */
    @Test
    public void testGetLabelSaldo() {
        System.out.println("getLabelSaldo");
        Pengecekan instance = new Pengecekan();
        JLabel expResult = null;
        JLabel result = instance.getLabelSaldo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBtnYa method, of class Pengecekan.
     */
    @Test
    public void testGetBtnYa() {
        System.out.println("getBtnYa");
        Pengecekan instance = new Pengecekan();
        JButton expResult = null;
        JButton result = instance.getBtnYa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBtnTidak method, of class Pengecekan.
     */
    @Test
    public void testGetBtnTidak() {
        System.out.println("getBtnTidak");
        Pengecekan instance = new Pengecekan();
        JButton expResult = null;
        JButton result = instance.getBtnTidak();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addListener method, of class Pengecekan.
     */
    @Test
    public void testAddListener() {
        System.out.println("addListener");
        ActionListener e = null;
        Pengecekan instance = new Pengecekan();
        instance.addListener(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
