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
    public static void main(String[] args) {
        System.out.println("yoi gan");
    }
    
    public static String addUser(String user){
        if (user.equals("badu"))
            return "user sukses dimasukan";
        else
            return "duplicate";
                
    }
}
