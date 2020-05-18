/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar_privatemusik;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Ronaldo
 */
public class GantiPasswordSiswa extends javax.swing.JFrame {
    int mousePX;
    int mousePY;
    /**
     * Creates new form EditPasswordSiswa
     */
    public GantiPasswordSiswa() {
        initComponents();
        setLocationRelativeTo(null);
        
        try{
            MysqlDataSource submit = new MysqlDataSource();
            submit.setServerName("localhost");
            submit.setUser("root");
            submit.setPassword("");
            submit.setPortNumber(3306);
            submit.setDatabaseName("private_musik");
            
            Connection koneksi = submit.getConnection();
            
            ResultSet rs = koneksi.prepareStatement("select Username,Password from siswa where Id_Siswa='"+UserSession.getUserLogin()+"'").executeQuery();
            while(rs.next()){
                txtusersiswa.setText(rs.getString(1));
                txtpasssiswa.setText(rs.getString(2));
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tutup = new javax.swing.JLabel();
        mize = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtpasssiswa = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtusersiswa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(300, 200));
        getContentPane().setLayout(null);

        tutup.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tutup.setForeground(new java.awt.Color(255, 255, 255));
        tutup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonExit.png"))); // NOI18N
        tutup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tutup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tutupMouseClicked(evt);
            }
        });
        getContentPane().add(tutup);
        tutup.setBounds(270, 0, 20, 30);

        mize.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mize.setForeground(new java.awt.Color(255, 255, 255));
        mize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonMinimize.png"))); // NOI18N
        mize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mizeMouseClicked(evt);
            }
        });
        getContentPane().add(mize);
        mize.setBounds(250, 0, 20, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonSave.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 160, 100, 30);

        txtpasssiswa.setBackground(new java.awt.Color(52, 73, 94));
        txtpasssiswa.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 18)); // NOI18N
        txtpasssiswa.setForeground(new java.awt.Color(255, 255, 255));
        txtpasssiswa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpasssiswa.setBorder(null);
        txtpasssiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasssiswaActionPerformed(evt);
            }
        });
        getContentPane().add(txtpasssiswa);
        txtpasssiswa.setBounds(40, 120, 220, 30);

        jLabel8.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonBack.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 160, 100, 30);

        jLabel4.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(217, 30, 24));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 90, 220, 20);

        txtusersiswa.setBackground(new java.awt.Color(52, 73, 94));
        txtusersiswa.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 18)); // NOI18N
        txtusersiswa.setForeground(new java.awt.Color(255, 255, 255));
        txtusersiswa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtusersiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusersiswaActionPerformed(evt);
            }
        });
        getContentPane().add(txtusersiswa);
        txtusersiswa.setBounds(40, 60, 220, 30);

        jLabel7.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(217, 30, 24));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Username");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 30, 220, 20);

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 300, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackgroundGantiPassword.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 300, 200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusersiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusersiswaActionPerformed
        // TODO add your handling code here:
        txtusersiswa.setText("");
    }//GEN-LAST:event_txtusersiswaActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        dispose();
        new FormSiswa().setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void txtpasssiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasssiswaActionPerformed
        // TODO add your handling code here:
        String user=txtusersiswa.getText();
        String pass=txtpasssiswa.getText();
        if(user.equals("")||pass.equals("")){
            JOptionPane.showMessageDialog(null, "Username & Password tidak boleh kosong!");
        }else{
            gantipassword();
        }
    }//GEN-LAST:event_txtpasssiswaActionPerformed

    private void tutupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tutupMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_tutupMouseClicked

    private void mizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mizeMouseClicked
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_mizeMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        String user=txtusersiswa.getText();
        String pass=txtpasssiswa.getText();
        if(user.equals("")||pass.equals("")){
            JOptionPane.showMessageDialog(null, "Username & Password tidak boleh kosong!");
        }else{
            gantipassword();
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        // TODO add your handling code here:
        mousePX = evt.getX();
        mousePY = evt.getY();
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
        // TODO add your handling code here:
        int koordinatX = evt.getXOnScreen();
        int koordinatY = evt.getYOnScreen();

        this.setLocation(koordinatX-mousePX, koordinatY-mousePY);
    }//GEN-LAST:event_jLabel3MouseDragged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GantiPasswordSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GantiPasswordSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GantiPasswordSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GantiPasswordSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GantiPasswordSiswa().setVisible(true);
            }
        });
    }

    private void gantipassword(){
        try{
            MysqlDataSource submit = new MysqlDataSource();
            submit.setServerName("localhost");
            submit.setUser("root");
            submit.setPassword("");
            submit.setPortNumber(3306);
            submit.setDatabaseName("private_musik");

            Connection koneksi=submit.getConnection();

            koneksi.prepareStatement(
                "update siswa set Username = '"+txtusersiswa.getText()+
                "', Password = '"+txtpasssiswa.getText()+
                "'where Id_Siswa='"+UserSession.getUserLogin()+"' ").execute();

            txtusersiswa.setText("");
            txtpasssiswa.setText("");
            JOptionPane.showMessageDialog(null, "Username & Password telah tersimpan!");
            dispose();
            new LoginSiswa().setVisible(true);
        }catch(Exception e){
            System.out.println(e);

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel mize;
    private javax.swing.JLabel tutup;
    private javax.swing.JPasswordField txtpasssiswa;
    private javax.swing.JTextField txtusersiswa;
    // End of variables declaration//GEN-END:variables
}