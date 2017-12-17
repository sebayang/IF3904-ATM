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
import View.Transfer;
import javax.swing.JOptionPane;

public class ControllerTransfer implements ActionListener {

    private Aplikasi model;
    private Transfer view;
    private Nasabah nasabah;

    public ControllerTransfer(Aplikasi model, Nasabah pe) {
        this.model = model;
        view = new Transfer();
        view.setVisible(true);
        view.addListener(this);

        nasabah = pe;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnKembali())) {
            new ControllerHome(model, nasabah);
            view.dispose();
        }else if(source.equals(view.getBtnLanjutkan())){
            if (nasabah.getSaldo() - Integer.parseInt(view.getSaldo()) > 50000) {
                int norek = Integer.parseInt(view.getNorekTujuan());
                int saldo = nasabah.getSaldo() - Integer.parseInt(view.getSaldo());
                int saldo2 = 
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
