/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.Nasabah;
import java.awt.event.ActionEvent;
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
public class ControllerPenarikanIT {

    public ControllerPenarikanIT() {
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
     * Test of actionPerformed method, of class ControllerPenarikan.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        Nasabah nasabah = new Nasabah();
        Aplikasi aplikasi = new Aplikasi();
        ControllerPenarikan instance = new ControllerPenarikan(aplikasi,nasabah);
    }

}
