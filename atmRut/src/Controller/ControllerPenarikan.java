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
import View.Penarikan;
import javax.swing.JOptionPane;

public class ControllerPenarikan implements ActionListener {

    private Aplikasi model;
    private Penarikan view;
    private Nasabah nasabah;

    public ControllerPenarikan(Aplikasi model, Nasabah pe) {
        this.model = model;
        view = new Penarikan();
        view.setVisible(true);
        view.addListener(this);

        nasabah = pe;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnKembal())) {
            new ControllerHome(model, nasabah);
            view.dispose();
        } else if (source.equals(view.getBtnLanjutkan())) {
            if (nasabah.getSaldo() - Integer.parseInt(view.getNominal()) > 50000 && Integer.parseInt(view.getNominal()) % 50000 == 0 ) {
                int saldo = nasabah.getSaldo() - Integer.parseInt(view.getNominal());
                model.updateSaldo(nasabah.getNorek(), saldo);
                JOptionPane.showMessageDialog(view, "Penarikan Berhasil");
                new ControllerLogin(model);
                view.dispose();
            }else{
                JOptionPane.showMessageDialog(view, "Penarikan Gagal");
                new ControllerHome(model,nasabah);
                view.dispose();
            }
        }
    }

}
