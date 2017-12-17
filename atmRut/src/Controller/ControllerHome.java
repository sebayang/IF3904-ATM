/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author umann
 */
import Model.Aplikasi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.Nasabah;
import View.Home;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControllerHome implements ActionListener {

    private Aplikasi model;
    private Home view;
    private Nasabah nasabah;

    public ControllerHome(Aplikasi model, Nasabah pe) {
        this.model = model;
        view = new Home();
        view.setVisible(true);
        view.addListener(this);
        nasabah = pe;


    }

    public ControllerHome() {
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnLogout())) {
            new ControllerLogin(model);
            view.dispose();
        } else if (source.equals(view.getBtnPengecekan())) {
            view.dispose();
        }
    }
}
