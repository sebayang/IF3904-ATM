/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Database.Database;

/**
 *
 * @author umann
 */
import java.util.*;
import Database.Database;
import Controller.ControllerLogin;

public class Aplikasi {

    private Database data;

    public Aplikasi() {
        this.data = new Database();
        data.connect();
    }
    
    public Nasabah LoginNasabah(int norek, int pin) {
        Nasabah p = data.getNasabah(norek, pin);
        if (p != null) {

            return p;
        } else {

            return null;
        }
    }
    
    public void updateSaldo(int norek,int saldo){
        data.updateSaldo(norek, saldo);
    }
    
    public Nasabah getNasabahByNorek(int norek){
        Nasabah p = data.getByNorek(norek);
        if (p != null){
            return p;
        }else{
            return null;
        }
    }
    
    public static void main(String[] args) {
        Aplikasi a = new Aplikasi();
        new ControllerLogin(a);
    }
}
