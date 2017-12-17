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
public class HomeIT {
    
    public HomeIT() {
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
     * Test of getBtnLogout method, of class Home.
     */
    @Test
    public void testGetBtnLogout() {
        System.out.println("getBtnLogout");
        Home instance = new Home();
        JButton expResult = instance.getBtnLogout();
        JButton result = instance.getBtnLogout();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBtnPengecekan method, of class Home.
     */
    @Test
    public void testGetBtnPengecekan() {
        System.out.println("getBtnPengecekan");
        Home instance = new Home();
        JButton expResult = instance.getBtnPengecekan();
        JButton result = instance.getBtnPengecekan();
        assertEquals(expResult, result);

    }

    /**
     * Test of getBtnPenarikan method, of class Home.
     */
    @Test
    public void testGetBtnPenarikan() {
        System.out.println("getBtnPenarikan");
        Home instance = new Home();
        JButton expResult = instance.getBtnPenarikan();
        JButton result = instance.getBtnPenarikan();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBtnTransfer method, of class Home.
     */
    @Test
    public void testGetBtnTransfer() {
        System.out.println("getBtnTransfer");
        Home instance = new Home();
        JButton expResult = instance.getBtnTransfer();
        JButton result = instance.getBtnTransfer();
        assertEquals(expResult, result);
    }

    /**
     * Test of addListener method, of class Home.
     */
    @Test
    public void testAddListener() {
        System.out.println("addListener");
        ActionListener e = null;
        Home instance = new Home();
        instance.addListener(e);
    }
    
}
