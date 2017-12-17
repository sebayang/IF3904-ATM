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
public class TransferIT {
    
    public TransferIT() {
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
     * Test of getBtnLanjutkan method, of class Transfer.
     */
    @Test
    public void testGetBtnLanjutkan() {
        System.out.println("getBtnLanjutkan");
        Transfer instance = new Transfer();
        JButton expResult = instance.getBtnLanjutkan();
        JButton result = instance.getBtnLanjutkan();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNorekTujuan method, of class Transfer.
     */
    @Test
    public void testGetNorekTujuan() {
        System.out.println("getNorekTujuan");
        Transfer instance = new Transfer();
        String expResult = instance.getNorekTujuan();
        String result = instance.getNorekTujuan();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBtnKembali method, of class Transfer.
     */
    @Test
    public void testGetBtnKembali() {
        System.out.println("getBtnKembali");
        Transfer instance = new Transfer();
        JButton expResult = instance.getBtnKembali();
        JButton result = instance.getBtnKembali();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSaldo method, of class Transfer.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        Transfer instance = new Transfer();
        String expResult = instance.getSaldo();
        String result = instance.getSaldo();
        assertEquals(expResult, result);
    }

    /**
     * Test of refresh method, of class Transfer.
     */
    @Test
    public void testRefresh() {
        System.out.println("refresh");
        Transfer instance = new Transfer();
        instance.refresh();
    }

    /**
     * Test of addListener method, of class Transfer.
     */
    @Test
    public void testAddListener() {
        System.out.println("addListener");
        ActionListener e = null;
        Transfer instance = new Transfer();
        instance.addListener(e);
    }
    
}
