/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar_privatemusik;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Ronaldo
 */
public class LoginPengajar extends javax.swing.JFrame {
    int mousePX;
    int mousePY;
    /**
     * Creates new form LoginPengajar
     */
    public LoginPengajar() {
        initComponents();
        setLocationRelativeTo(null);

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
        loginpengajar = new javax.swing.JButton();
        passwordpengajar = new javax.swing.JPasswordField();
        usernamepengajar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        tutup.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tutup.setForeground(new java.awt.Color(255, 255, 255));
        tutup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonExit.png"))); // NOI18N
        tutup.setText("X");
        tutup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tutup.setPreferredSize(new java.awt.Dimension(20, 20));
        tutup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tutupMouseClicked(evt);
            }
        });
        getContentPane().add(tutup);
        tutup.setBounds(570, 0, 20, 30);

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
        mize.setBounds(550, 0, 20, 30);

        loginpengajar.setBackground(new java.awt.Color(249, 105, 14));
        loginpengajar.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 24)); // NOI18N
        loginpengajar.setForeground(new java.awt.Color(255, 255, 255));
        loginpengajar.setText("Sign in");
        loginpengajar.setBorder(null);
        loginpengajar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginpengajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginpengajarActionPerformed(evt);
            }
        });
        getContentPane().add(loginpengajar);
        loginpengajar.setBounds(170, 260, 260, 50);

        passwordpengajar.setBackground(new java.awt.Color(52, 73, 94));
        passwordpengajar.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 18)); // NOI18N
        passwordpengajar.setForeground(new java.awt.Color(255, 255, 255));
        passwordpengajar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordpengajar.setBorder(null);
        passwordpengajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordpengajarActionPerformed(evt);
            }
        });
        getContentPane().add(passwordpengajar);
        passwordpengajar.setBounds(170, 200, 260, 50);

        usernamepengajar.setBackground(new java.awt.Color(52, 73, 94));
        usernamepengajar.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 24)); // NOI18N
        usernamepengajar.setForeground(new java.awt.Color(255, 255, 255));
        usernamepengajar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernamepengajar.setBorder(null);
        usernamepengajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamepengajarActionPerformed(evt);
            }
        });
        getContentPane().add(usernamepengajar);
        usernamepengajar.setBounds(170, 130, 260, 50);

        jLabel8.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonReset.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(330, 320, 100, 30);

        jLabel7.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonBack.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(170, 320, 100, 30);

        jLabel6.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("password");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(270, 180, 60, 14);

        jLabel5.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("username");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(270, 110, 60, 14);

        jLabel4.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(34, 167, 240));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Login Pengajar");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 60, 320, 45);

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel2MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 600, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackgroundLogin.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernamepengajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamepengajarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernamepengajarActionPerformed

    private void loginpengajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginpengajarActionPerformed
        loginpengajar();
    }//GEN-LAST:event_loginpengajarActionPerformed

    private void passwordpengajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordpengajarActionPerformed
        // TODO add your handling code here:
        loginpengajar();
    }//GEN-LAST:event_passwordpengajarActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        usernamepengajar.setText("");
        passwordpengajar.setText("");
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        dispose();
        new Beranda().setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void tutupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tutupMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_tutupMouseClicked

    private void mizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mizeMouseClicked
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_mizeMouseClicked

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
        mousePX = evt.getX();
        mousePY = evt.getY();
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
        // TODO add your handling code here:
        int koordinatX = evt.getXOnScreen();
        int koordinatY = evt.getYOnScreen();

        this.setLocation(koordinatX-mousePX, koordinatY-mousePY);
    }//GEN-LAST:event_jLabel2MouseDragged

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
            java.util.logging.Logger.getLogger(LoginPengajar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPengajar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPengajar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPengajar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPengajar().setVisible(true);
            }
        });
    }
    
    private void loginpengajar(){
        if(usernamepengajar.getText().equals("")||passwordpengajar.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Username & Password harus diisi!");
        }else{
            try{
            MysqlDataSource submit = new MysqlDataSource();
            submit.setServerName("localhost");
            submit.setUser("root");
            submit.setPassword("");
            submit.setPortNumber(3306);
            submit.setDatabaseName("private_musik");
            
            Connection koneksi = submit.getConnection();
            
            ResultSet rs = koneksi.prepareStatement("select Id_Pengajar,Username, Password from pengajar where Username='"+usernamepengajar.getText()
                    +"' and Password='"+passwordpengajar.getText()+"'").executeQuery();
                if(rs.next()){
                    UserSession.setUserLogin(rs.getString(1));
                    dispose();
                    new FormPengajar().setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(null, "Username dan Password Salah","Pesan Peringatan!",JOptionPane.WARNING_MESSAGE);
                    usernamepengajar.setText("");
                    passwordpengajar.setText("");
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton loginpengajar;
    private javax.swing.JLabel mize;
    private javax.swing.JPasswordField passwordpengajar;
    private javax.swing.JLabel tutup;
    private javax.swing.JTextField usernamepengajar;
    // End of variables declaration//GEN-END:variables
}
