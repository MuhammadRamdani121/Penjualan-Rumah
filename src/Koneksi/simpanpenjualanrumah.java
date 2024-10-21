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
public class simpanpenjualanrumah {
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    private String sql;
    public String nama_pemesan;
    public String area;
    public String tipe_rumah;
    public String luas_tanah;
    public String harga;
    public String lama_cicilan;
    public String cicilan_per_bulan;


    
    public void simpanpenjualanrumah ( )throws SQLException{
        conn = koneksi.getKoneksi();
        sql ="INSERT INTO tbl_tampildata(nama_pemesan,area,tipe_rumah,luas_tanah,harga,lama_cicilan,cicilan_per_bulan)VALUE(?,?,?,?,?,?,?)";
        pst =conn.prepareStatement(sql);
        pst.setString(1, nama_pemesan);
        pst.setString(2, area);
        pst.setString(3, tipe_rumah);
        pst.setString(4, luas_tanah);
        pst.setString(5, harga);
        pst.setString(6, lama_cicilan);
        pst.setString(7, cicilan_per_bulan);

        
        pst.execute();
        pst.close();
    }
    
}
