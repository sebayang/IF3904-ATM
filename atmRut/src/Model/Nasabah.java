/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author umann
 */
public class Nasabah {
    private int norek,pin,saldo;
    private String nama;
    
    public Nasabah (){   
    }

    public Nasabah(int norek, int pin, int saldo, String nama) {
        this.norek = norek;
        this.pin = pin;
        this.saldo = saldo;
        this.nama = nama;
    }

    public int getNorek() {
        return norek;
    }

    public void setNorek(int norek) {
        this.norek = norek;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
        
}
