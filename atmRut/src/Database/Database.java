/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author umann
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Model.Nasabah;
import Model.Aplikasi;

public class Database {

    private String server = "jdbc:mysql://localhost:3306/atm?zeroDateTimeBehavior=convertToNull";
    private String dbUser = "root";
    private String dbPwd = "";
    Statement statement;
    Connection connection;

    public Database() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        connect();
    }

    public void connect() {
        try {
            connection = DriverManager.getConnection(server, dbUser, dbPwd);
            statement = connection.createStatement();
            System.out.println("Connect");
        } catch (SQLException e) {
            System.out.println("Tidak ");
        }
    }

    public Nasabah getNasabah(int norek, int pin) {
        Nasabah p = null;
        try {

            String query = "SELECT * FROM NASABAH where norek = '"
                    + norek + "' " + "AND pin = '" + pin + "'";
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                p = new Nasabah();
                p.setNorek(rs.getInt(1));
                p.setPin(rs.getInt(2));
                p.setNama(rs.getString(3));
                p.setSaldo(rs.getInt(4));

            }

            return p;
        } catch (SQLException ex) {

            System.out.println("Login gagal " + ex);
            return null;

        }
    }

    public void updateSaldo(int norek,int saldo) {
        try {
            String query = "UPDATE NASABAH SET saldo = '" + saldo +  "' where norek = '" + norek + "'";
            statement.execute(query);
        } catch (SQLException ex) {
            System.out.println("update data gagal" + ex);
        }
    }
}
