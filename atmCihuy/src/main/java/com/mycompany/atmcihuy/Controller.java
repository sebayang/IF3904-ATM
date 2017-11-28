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

import java.util.Scanner;

public class Controller {

    private Nasabah dDasabah[] = new Nasabah[2];
    private ATM dAtm[] = new ATM[2];
    private int id;

    public Controller() {
        this.dDasabah[1] = new Nasabah("rio", 123, 123);
        this.dAtm[1] = new ATM("1");
        this.dDasabah[1].setSaldo(10000000);
        this.dDasabah[0] = new Nasabah("sebayang", 111, 222);
        this.dAtm[0] = new ATM("2");
        this.dDasabah[0].setSaldo(10000000);
    }

    public void menuUtama() {
        Scanner scr = new Scanner(System.in);
        System.out.println("MASUKAN PILIHAN MENU");
        System.out.println("1 . Penarikan Tunai");
        System.out.println("2 . Transfer");
        System.out.println("3 . Cek Saldo");
        System.out.println("4 . Logout");
        System.out.print("Masukan Pilihan : ");
        int pil = scr.nextInt();
        if (pil == 1) {
            this.penarikan();
        } else if (pil == 2) {
            this.transfer();
        } else if (pil == 3) {
            this.cekSaldo();
        } else {
            this.logout();
        }
    }

    public void login() {
        int nok, pin;
        Scanner scr = new Scanner(System.in);
        Scanner scr2 = new Scanner(System.in);
        System.out.print("Masukan nok (asumsi nasabah memasukan kartu)    : ");
        nok = scr.nextInt();
        System.out.print("Masukan PIN   : ");
        pin = scr2.nextInt();
        for (int i = 0; i <= 1; i++) {
            if (this.dDasabah[i].noKartu == nok && this.dDasabah[i].pin == pin) {
                this.id = i;
                this.menuUtama();
            }
        }
        System.out.println("Data tidak di temukan");
        this.login();
    }

    public void penarikan() {
        System.out.print("Masukan Jumlah  : ");
        Scanner scr = new Scanner(System.in);
        int jumlah = scr.nextInt();
        if (this.dDasabah[this.id].getSaldo() - jumlah >= 50000 && jumlah % 50000 == 0) {
            this.dDasabah[this.id].saldo = this.dDasabah[this.id].getSaldo() - jumlah;
            this.menuUtama();
        } else {
            System.out.println("Saldo anda tidak cukup");
            System.out.println("Kembali ke menu utama   ? (y/n) : ");
            Scanner scr2 = new Scanner(System.in);
            String pil = scr2.next();
            switch (pil) {
                case "y":
                    this.menuUtama();
                    break;
                case "n":
                    this.logout();
                    break;
            }
        }
    }

    public void transfer() {
        Scanner scr = new Scanner(System.in);
        Scanner scr2 = new Scanner(System.in);
        Scanner scr3 = new Scanner(System.in);
        System.out.print("Masukan no rekening tujuan  : ");
        int nor = scr.nextInt();
        System.out.print("Masukan Jumlah : ");
        int jumlah = scr2.nextInt();
        if (this.dDasabah[this.id].getSaldo() - jumlah >= 50000) {
            System.out.println("Anda akan melakukan transaksi dengan  :");
            System.out.println("Nomor rekening  : " + nor);
            System.out.println("Dengan Jumlah   : " + jumlah);
            System.out.println("Benar (y/n) : ");
            String pil = scr3.nextLine();
            switch (pil) {
                case "y":
                    this.dDasabah[this.id].saldo = this.dDasabah[this.id].getSaldo() - jumlah;
                    this.dDasabah[nor].saldo = this.dDasabah[nor].getSaldo() + jumlah;
                    break;
                case "n":
                    this.menuUtama();
                    break;

            }
        } else {
            System.out.println("Maaf saldo anda tidak mencukupi");
            Scanner scr4 = new Scanner(System.in);
            System.out.println("Kembali ke menu utama   ? (y/n): ");
            String pil2 = scr4.nextLine();
            switch (pil2) {
                case "y":
                    this.menuUtama();
                    break;
                case "n":
                    this.logout();
                    break;
            }
        }
    }

    private void logout() {
        this.id = -1;
        this.login();
    }

    private void cekSaldo() {
        System.out.println("Nama Nasabah    : " + this.dDasabah[this.id].nama);
        System.out.println("Nomor rekening  : " + this.id);
        System.out.println("Jumlah Saldo    : " + this.dDasabah[this.id].saldo);
        Scanner scr = new Scanner(System.in);
        System.out.println("Kembali ke menu utama   ? (y/n): ");
        String pil2 = scr.next();
        switch (pil2) {
            case "y":
                this.menuUtama();
                break;
            case "n":
                this.logout();
                break;
        }
    }

}
