/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; 

/**
 *
 * @author ASUS
 */
public class simpanuser {
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    private String sql;
    public String username;
    public String password;

    
    public void simpan ( )throws SQLException{
        conn = koneksi.getKoneksi();
        sql ="INSERT INTO tbl_user(username,password)VALUE(?,?)";
        pst =conn.prepareStatement(sql);
        pst.setString(1, username);
        pst.setString(2, password);

        
        pst.execute();
        pst.close();
    }
    
}
