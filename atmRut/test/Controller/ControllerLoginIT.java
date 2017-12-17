/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import java.awt.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import View.Login;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author umann
 */
public class ControllerLoginIT {

    private Login view;
    private Aplikasi model;

    public ControllerLoginIT() {
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
     * Test of actionPerformed method, of class ControllerLogin.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ControllerLogin instance = new ControllerLogin();
        ActionEvent ae = null;
    }


}
