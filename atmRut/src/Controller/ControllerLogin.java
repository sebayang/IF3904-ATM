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
import View.Login;
import javax.swing.JOptionPane;

public class ControllerLogin implements ActionListener {

    private Aplikasi model;
    private Login view;

    public ControllerLogin(Aplikasi model) {
        this.model = model;
        view = new Login();
        view.setVisible(true);
        view.addListener(this);
    }

    public ControllerLogin() {
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnLanjutkan())) {
            if (view.getNorek().equals("") || view.getPin().equals("")) {
                JOptionPane.showMessageDialog(null, "Semua data harus terisi");
            } else {
                int norek = Integer.parseInt(view.getNorek());
                int pin = Integer.parseInt(view.getPin());
                if (model.LoginNasabah(norek, pin) != null) {
                    Nasabah p = model.LoginNasabah(norek, pin);
                    JOptionPane.showMessageDialog(view, "Anda Berhasil Login");
                    new ControllerHome(model, p);
                    view.dispose();
                } else {
                    JOptionPane.showMessageDialog(view, "Username/password salah");

                }
                view.refresh();
            }
        }
    }

}
