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
public class mencari {
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    private String sql;
    public String key;
    

    
    public void simpan ( )throws SQLException{
        conn = koneksi.getKoneksi();
        sql =("SELECT * FROM penjualan_tiket WHERE id_member LIKE '%"+key+"%' ");  
        pst =conn.prepareStatement(sql);
        pst.setString(1, key);
        

        
        pst.execute();
        pst.close();
    }
    
}
