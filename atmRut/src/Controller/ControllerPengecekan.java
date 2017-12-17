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
import View.Pengecekan;

public class ControllerPengecekan implements ActionListener {

    private Aplikasi model;
    private Pengecekan view;
    private Nasabah nasabah;

    public ControllerPengecekan(Aplikasi model, Nasabah pe) {
        this.model = model;
        view = new Pengecekan();
        view.setVisible(true);
        view.addListener(this);

        nasabah = pe;
        view.getLabelNama().setText(pe.getNama());
        view.getLabelNorek().setText(Integer.toString(pe.getNorek()));
        view.getLabelSaldo().setText(Integer.toString(pe.getSaldo()));

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnYa())) {
            new ControllerHome(model, nasabah);
            view.dispose();
        }else if(source.equals(view.getBtnTidak())){
            new ControllerLogin(model);
            view.dispose();
        }
    }

}
