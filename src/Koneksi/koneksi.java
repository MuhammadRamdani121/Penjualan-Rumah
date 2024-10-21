/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class koneksi {
    private static Connection konek;
    public static Connection getKoneksi(){
        if(konek==null){
            try{
                String url;
                url="jdbc:mysql://localhost:3306/db_penjualanrumah";
                String user="root";
                String password="";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                konek =DriverManager.getConnection(url,user,password);
            }catch(SQLException t){
                JOptionPane.showMessageDialog(null,t);
            }
        }return konek;
        
    }static Object getConnection(){
    throw new UnsupportedOperationException("Not Yet Imploment");
}
    }
    

