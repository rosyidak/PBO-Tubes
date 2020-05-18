/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar_privatemusik;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Ronaldo
 */
public class UpdateDataPengajarAdmin extends javax.swing.JFrame {
    DefaultTableModel tabelmodel;
    int mousePX;
    int mousePY;
    Beranda del = new Beranda();
    /**
     * Creates new form HapusTabelPengajar
     */
    public UpdateDataPengajarAdmin() {
        initComponents();
        setLocationRelativeTo(null);
        
        String[] judulpengajar={"Id_Pengajar","Nama Pengajar","Jenis Kelamin","Alamat","Id Alat Musik","Username","Password"};
        tabelmodel = new DefaultTableModel(null, judulpengajar);
        tabelpengajaradmin.setModel(tabelmodel);

        tampil();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtpasspengajar = new javax.swing.JTextField();
        txtuserpengajar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        backlogin = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtkelaminpengajar = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtalatmusikpengajar = new javax.swing.JComboBox();
        txtnamapengajar = new javax.swing.JTextField();
        txtidpengajar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelpengajaradmin = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtalamatpengajar = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        mize = new javax.swing.JLabel();
        tutup1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jLabel11.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(30, 55, 153));
        jLabel11.setText("Password");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(190, 320, 110, 20);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonCari.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12);
        jLabel12.setBounds(600, 60, 100, 30);

        txtpasspengajar.setBackground(new java.awt.Color(204, 204, 204));
        txtpasspengajar.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 18)); // NOI18N
        txtpasspengajar.setForeground(new java.awt.Color(255, 255, 255));
        txtpasspengajar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpasspengajar.setBorder(null);
        txtpasspengajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasspengajarActionPerformed(evt);
            }
        });
        getContentPane().add(txtpasspengajar);
        txtpasspengajar.setBounds(360, 320, 220, 30);

        txtuserpengajar.setBackground(new java.awt.Color(204, 204, 204));
        txtuserpengajar.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 18)); // NOI18N
        txtuserpengajar.setForeground(new java.awt.Color(255, 255, 255));
        txtuserpengajar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtuserpengajar.setBorder(null);
        txtuserpengajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserpengajarActionPerformed(evt);
            }
        });
        getContentPane().add(txtuserpengajar);
        txtuserpengajar.setBounds(360, 280, 220, 30);

        jLabel10.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(30, 55, 153));
        jLabel10.setText("Username");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(190, 280, 110, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonUpdate.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(560, 560, 100, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonHapus.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(670, 560, 100, 30);

        backlogin.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 14)); // NOI18N
        backlogin.setForeground(new java.awt.Color(255, 255, 255));
        backlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonBack.png"))); // NOI18N
        backlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backloginMouseClicked(evt);
            }
        });
        getContentPane().add(backlogin);
        backlogin.setBounds(40, 560, 100, 30);

        jLabel6.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(30, 55, 153));
        jLabel6.setText("Jenis Kelamin");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(190, 200, 130, 23);

        txtkelaminpengajar.setBackground(new java.awt.Color(204, 204, 204));
        txtkelaminpengajar.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 11)); // NOI18N
        txtkelaminpengajar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Laki-Laki", "Perempuan" }));
        txtkelaminpengajar.setBorder(null);
        txtkelaminpengajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkelaminpengajarActionPerformed(evt);
            }
        });
        getContentPane().add(txtkelaminpengajar);
        txtkelaminpengajar.setBounds(360, 200, 89, 30);

        jLabel7.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(30, 55, 153));
        jLabel7.setText("Alamat");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(190, 140, 80, 23);

        jLabel2.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 55, 153));
        jLabel2.setText("Jenis Alat Musik");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 240, 160, 23);

        txtalatmusikpengajar.setBackground(new java.awt.Color(204, 204, 204));
        txtalatmusikpengajar.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 11)); // NOI18N
        txtalatmusikpengajar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0. Gitar", "1. Piano", "2. Bass", "3. Drum", "4. Saxophone", "5. Biola" }));
        txtalatmusikpengajar.setBorder(null);
        txtalatmusikpengajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalatmusikpengajarActionPerformed(evt);
            }
        });
        getContentPane().add(txtalatmusikpengajar);
        txtalatmusikpengajar.setBounds(360, 240, 90, 30);

        txtnamapengajar.setBackground(new java.awt.Color(204, 204, 204));
        txtnamapengajar.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 18)); // NOI18N
        txtnamapengajar.setForeground(new java.awt.Color(255, 255, 255));
        txtnamapengajar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnamapengajar.setBorder(null);
        txtnamapengajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamapengajarActionPerformed(evt);
            }
        });
        txtnamapengajar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnamapengajarKeyTyped(evt);
            }
        });
        getContentPane().add(txtnamapengajar);
        txtnamapengajar.setBounds(360, 100, 220, 30);

        txtidpengajar.setBackground(new java.awt.Color(204, 204, 204));
        txtidpengajar.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 18)); // NOI18N
        txtidpengajar.setForeground(new java.awt.Color(255, 255, 255));
        txtidpengajar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtidpengajar.setBorder(null);
        txtidpengajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidpengajarActionPerformed(evt);
            }
        });
        getContentPane().add(txtidpengajar);
        txtidpengajar.setBounds(360, 60, 220, 30);

        jLabel4.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(30, 55, 153));
        jLabel4.setText("Id Pengajar");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(190, 60, 130, 20);

        tabelpengajaradmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelpengajaradmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelpengajaradminMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelpengajaradmin);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(40, 370, 730, 180);

        txtalamatpengajar.setBackground(new java.awt.Color(204, 204, 204));
        txtalamatpengajar.setColumns(20);
        txtalamatpengajar.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtalamatpengajar.setForeground(new java.awt.Color(255, 255, 255));
        txtalamatpengajar.setRows(5);
        txtalamatpengajar.setBorder(null);
        jScrollPane1.setViewportView(txtalamatpengajar);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(360, 140, 300, 50);

        jLabel3.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(30, 55, 153));
        jLabel3.setText("Nama");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 100, 60, 20);

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
        mize.setBounds(750, 0, 20, 30);

        tutup1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tutup1.setForeground(new java.awt.Color(255, 255, 255));
        tutup1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonExit.png"))); // NOI18N
        tutup1.setText("X");
        tutup1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tutup1.setPreferredSize(new java.awt.Dimension(20, 20));
        tutup1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tutup1tutupMouseClicked(evt);
            }
        });
        getContentPane().add(tutup1);
        tutup1.setBounds(770, 0, 20, 30);

        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel5MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 800, 40);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackgroundUpdate.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtalatmusikpengajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalatmusikpengajarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalatmusikpengajarActionPerformed

    private void txtidpengajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidpengajarActionPerformed
        // TODO add your handling code here:
        cari();
    }//GEN-LAST:event_txtidpengajarActionPerformed

    private void txtnamapengajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamapengajarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamapengajarActionPerformed

    private void txtkelaminpengajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkelaminpengajarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkelaminpengajarActionPerformed

    private void backloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backloginMouseClicked
        // TODO add your handling code here:
        dispose();
        new FormAdmin().setVisible(true);
    }//GEN-LAST:event_backloginMouseClicked

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        // TODO add your handling code here:
        mousePX = evt.getX();
        mousePY = evt.getY();
    }//GEN-LAST:event_jLabel5MousePressed

    private void jLabel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseDragged
        // TODO add your handling code here:
        int koordinatX = evt.getXOnScreen();
        int koordinatY = evt.getYOnScreen();

        this.setLocation(koordinatX-mousePX, koordinatY-mousePY);
    }//GEN-LAST:event_jLabel5MouseDragged

    private void mizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mizeMouseClicked
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_mizeMouseClicked

    private void tutup1tutupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tutup1tutupMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_tutup1tutupMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        String nama=txtnamapengajar.getText();
        String alamat=txtalamatpengajar.getText();
        String user=txtuserpengajar.getText();
        String pass=txtpasspengajar.getText();
        if(nama.equals("")||alamat.equals("")||user.equals("")||pass.equals("")){
            JOptionPane.showMessageDialog(null, "Data tidak boleh kosong!");
        }else{
            try{
                MysqlDataSource submit = new MysqlDataSource();
                submit.setServerName("localhost");
                submit.setUser("root");
                submit.setPassword("");
                submit.setPortNumber(3306);
                submit.setDatabaseName("private_musik");

                Connection koneksi=submit.getConnection();

                koneksi.prepareStatement(
                    "update pengajar set Nama_Pengajar = '"+txtnamapengajar.getText()+
                    "', Alamat = '"+txtalamatpengajar.getText()+                        
                    "', Jenis_Kelamin = '"+txtkelaminpengajar.getSelectedItem()+
                    "', Id_Alat_Musik='"+txtalatmusikpengajar.getSelectedIndex()+
                    "', Username = '"+txtuserpengajar.getText()+                        
                    "', Password = '"+txtpasspengajar.getText()+                        
                    "' where Id_Pengajar='"+txtidpengajar.getText()+"' ").execute();

                tampil();
                JOptionPane.showMessageDialog(null, "Data berhasil diperbaharui!");
                txtnamapengajar.setText("");
                txtalamatpengajar.setText("");
                txtkelaminpengajar.setSelectedItem("Laki-Laki");
                txtalatmusikpengajar.setSelectedIndex(0);
                txtidpengajar.setText("");
                txtuserpengajar.setText("");
                txtpasspengajar.setText("");
            }catch(Exception e){
                System.out.println(e);

            }   
        }        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
       int jawab = JOptionPane.showConfirmDialog(null, "Apakah anda Ingin Menghapus?");
        
        switch(jawab){
            case JOptionPane.YES_OPTION:
                if(tabelpengajaradmin.getSelectedColumnCount()!=-1){
                    try{
                        MysqlDataSource submit = new MysqlDataSource();
                        submit.setServerName("localhost");
                        submit.setUser("root");
                        submit.setPassword("");
                        submit.setPortNumber(3306);
                        submit.setDatabaseName("private_musik");

                        Connection koneksi=submit.getConnection();

                        koneksi.prepareStatement(
                        "DELETE FROM pengajar WHERE Id_Pengajar='"+txtidpengajar.getText()+"' ").executeUpdate();
                        del.daftarpengajar.remove(txtidpengajar.getText());
                        tampil();
                        txtidpengajar.setText("");
                        txtnamapengajar.setText("");
                        txtkelaminpengajar.setSelectedItem("Laki-Laki");
                        txtalamatpengajar.setText("");
                        txtuserpengajar.setText("");
                        txtpasspengajar.setText("");
                        txtalatmusikpengajar.setSelectedIndex(0);
                    }catch(Exception e){
                        System.out.println(e);
                    }
                }
                break;
            case JOptionPane.NO_OPTION:
                break;
            case JOptionPane.CANCEL_OPTION:
                break;
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void tabelpengajaradminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelpengajaradminMouseClicked
        // TODO add your handling code here:
        int baris = tabelpengajaradmin.getSelectedRow();
        String idpengajar = (String)tabelmodel.getValueAt(baris, 0);
        String nama = (String)tabelmodel.getValueAt(baris, 1);
        String jeniskelamin = (String)tabelmodel.getValueAt(baris, 2);
        String alamat = (String)tabelmodel.getValueAt(baris, 3);
        String idmusik = (String)tabelmodel.getValueAt(baris, 4);
        String username = (String)tabelmodel.getValueAt(baris, 5);
        String password = (String)tabelmodel.getValueAt(baris, 6);
        int idalat = Integer.parseInt(idmusik);
        
        txtidpengajar.setText(idpengajar);
        txtnamapengajar.setText(nama);
        txtkelaminpengajar.setSelectedItem(jeniskelamin);
        txtalamatpengajar.setText(alamat);
        txtuserpengajar.setText(username);
        txtpasspengajar.setText(password);
        txtalatmusikpengajar.setSelectedIndex(idalat);
    }//GEN-LAST:event_tabelpengajaradminMouseClicked

    private void txtuserpengajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserpengajarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserpengajarActionPerformed

    private void txtpasspengajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasspengajarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasspengajarActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        cari();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void txtnamapengajarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnamapengajarKeyTyped
        // TODO add your handling code here:
        if(Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtnamapengajarKeyTyped

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
            java.util.logging.Logger.getLogger(UpdateDataPengajarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDataPengajarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDataPengajarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDataPengajarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDataPengajarAdmin().setVisible(true);
            }
        });
    }

    public void tampil() {
        int baris = tabelmodel.getRowCount();
        for(int i=1;i<=baris;i++){
            tabelmodel.removeRow(0);
        }
        
        try{
            MysqlDataSource submit = new MysqlDataSource();
            submit.setServerName("localhost");
            submit.setUser("root");
            submit.setPassword("");
            submit.setPortNumber(3306);
            submit.setDatabaseName("private_musik");
            
            Connection koneksi=submit.getConnection();
            
            ResultSet rs = koneksi.prepareStatement("select Id_Pengajar,"+
                    "Nama_Pengajar,Jenis_Kelamin,Alamat,Id_Alat_Musik,Username,Password from pengajar").executeQuery();
                while(rs.next()){
                    tabelmodel.addRow(new  String[]{
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7)}
                    );
                }            
        }catch(Exception e){
            System.out.println(e);
            
        }
    }
    
    public void cari(){
        try{
            MysqlDataSource submit = new MysqlDataSource();
            submit.setServerName("localhost");
            submit.setUser("root");
            submit.setPassword("");
            submit.setPortNumber(3306);
            submit.setDatabaseName("private_musik");
            
            Connection koneksi=submit.getConnection();
            
            ResultSet rs = koneksi.prepareStatement("select Nama_Pengajar,"+
                    "Jenis_Kelamin,Alamat,Id_Alat_Musik,Username,Password from pengajar "+
                    "where Id_Pengajar='"+txtidpengajar.getText()+"'").executeQuery();
            if(rs.next()){             
                txtnamapengajar.setText(rs.getString(1));
                txtkelaminpengajar.setSelectedItem(rs.getString(2));
                txtalamatpengajar.setText(rs.getString(3));
                txtalatmusikpengajar.setSelectedIndex(rs.getInt(4));
                txtuserpengajar.setText(rs.getString(5));
                txtpasspengajar.setText(rs.getString(6));
            }else{
                JOptionPane.showMessageDialog(null, "Data Pengajar tidak ditemukan!");      
                txtidpengajar.setText("");
                txtnamapengajar.setText("");
                txtkelaminpengajar.setSelectedItem("Laki-laki");
                txtalamatpengajar.setText("");
                txtalatmusikpengajar.setSelectedIndex(0);
                txtuserpengajar.setText("");
                txtpasspengajar.setText("");
            }
        }catch(Exception e){
            System.out.println(e);
            
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel mize;
    private javax.swing.JTable tabelpengajaradmin;
    private javax.swing.JLabel tutup1;
    private javax.swing.JTextArea txtalamatpengajar;
    private javax.swing.JComboBox txtalatmusikpengajar;
    private javax.swing.JTextField txtidpengajar;
    private javax.swing.JComboBox txtkelaminpengajar;
    private javax.swing.JTextField txtnamapengajar;
    private javax.swing.JTextField txtpasspengajar;
    private javax.swing.JTextField txtuserpengajar;
    // End of variables declaration//GEN-END:variables
}