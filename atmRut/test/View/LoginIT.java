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
public class LoginIT {
    
    public LoginIT() {
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
     * Test of getBtnLanjutkan method, of class Login.
     */
    @Test
    public void testGetBtnLanjutkan() {
        System.out.println("getBtnLanjutkan");
        Login instance = new Login();
        JButton expResult = instance.getBtnLanjutkan();
        JButton result = instance.getBtnLanjutkan();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNorek method, of class Login.
     */
    @Test
    public void testGetNorek() {
        System.out.println("getNorek");
        Login instance = new Login();
        String expResult = instance.getNorek();
        String result = instance.getNorek();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPin method, of class Login.
     */
    @Test
    public void testGetPin() {
        System.out.println("getPin");
        Login instance = new Login();
        String expResult = instance.getPin();
        String result = instance.getPin();
        assertEquals(expResult, result);
    }

    /**
     * Test of refresh method, of class Login.
     */
    @Test
    public void testRefresh() {
        System.out.println("refresh");
        Login instance = new Login();
        instance.refresh();
    }

    /**
     * Test of addListener method, of class Login.
     */
    @Test
    public void testAddListener() {
        System.out.println("addListener");
        ActionListener e = null;
        Login instance = new Login();
        instance.addListener(e);

    }
    
}
