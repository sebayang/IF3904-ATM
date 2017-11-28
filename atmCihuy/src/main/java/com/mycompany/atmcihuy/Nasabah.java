/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atmcihuy;


/**
 *
 * @author User
 */
public class Nasabah {
    String nama;
    int noKartu;
    int pin;
    int saldo;

    public Nasabah(String nama, int noKartu, int pin) {
        this.nama = nama;
        this.noKartu = noKartu;
        this.pin = pin;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNoKartu() {
        return noKartu;
    }

    public void setNoKartu(int noKartu) {
        this.noKartu = noKartu;
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
}
