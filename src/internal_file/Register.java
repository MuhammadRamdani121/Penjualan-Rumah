/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package internal_file;
import Koneksi.koneksi;
        
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Register extends javax.swing.JInternalFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();
        lihatpassword = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        txtulangipassword = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(0, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Registrasi");

        jLabel2.setText("username");

        jLabel3.setText("password");

        jButton1.setText("BUAT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("CLEAR");

        lihatpassword.setText("Lihat Password");
        lihatpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatpasswordActionPerformed(evt);
            }
        });

        jLabel4.setText("Ulangi Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtulangipassword, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtusername, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(txtpassword))
                                .addGap(26, 26, 26)
                                .addComponent(lihatpassword)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lihatpassword)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtulangipassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(0, 105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lihatpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatpasswordActionPerformed
if(lihatpassword.isSelected()){
    txtpassword.setEchoChar((char)0);
}else{
    txtpassword.setEchoChar('*');
    }         // TODO add your handling code here:
    }//GEN-LAST:event_lihatpasswordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String User = txtusername.getText();
String passwd=txtpassword.getText();
String passwd2= txtulangipassword.getText();
String Cekuser = null;
try {
Connection konek = koneksi.getKoneksi();
Statement s = konek.createStatement();
String sql = "SELECT * FROM tbl_user WHERE username = '"+User+"'";
ResultSet r= s.executeQuery (sql);
while (r.next()){
Cekuser =r.getString("username");
    }
} catch (SQLException e){
System.out.println("Terjadi error");
}
if (Cekuser != null){
String bag = "username yang anda masukkan sudah terdaftar";
JOptionPane.showMessageDialog(null,bag,"Kesalahan",
JOptionPane.INFORMATION_MESSAGE);
}
if (!passwd.equals(passwd2)){
String Pesan = "password yang anda ketikkan tidak cocok";
JOptionPane.showMessageDialog(null,Pesan,"Kesalahan",
JOptionPane.INFORMATION_MESSAGE);
} else {
try {
Connection konek = koneksi.getKoneksi();
String query = "INSERT INTO tbl_user (username,password) VALUES (?,?)";
PreparedStatement p = konek.prepareStatement(query);
p.setString(1,User);
p.setString(2, passwd);
p.executeUpdate();
p.close();
String mesage = "ANDA BERHASIL DAFTAR";
JOptionPane.showMessageDialog(null,mesage,"BERHASIL",
JOptionPane.INFORMATION_MESSAGE);
dispose();
Login login = new Login();
login .setVisible(true);

} catch (SQLException e){
}
}
      // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JCheckBox lihatpassword;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JPasswordField txtulangipassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
