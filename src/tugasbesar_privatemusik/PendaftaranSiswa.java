/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar_privatemusik;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ronaldo
 */
public class PendaftaranSiswa extends javax.swing.JFrame {
    int mousePX;
    int mousePY;
    
    /**
     * Creates new form Pendaftaran
     */
    public PendaftaranSiswa() {
        initComponents();
        setLocationRelativeTo(null);
        
        autonumber();
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
        tutup3 = new javax.swing.JLabel();
        mize = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtpasssiswa = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        txtusersiswa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        resetpendsiswa = new javax.swing.JLabel();
        backpendsiswa = new javax.swing.JLabel();
        submitsiswa = new javax.swing.JButton();
        txtnamasiswa = new javax.swing.JTextField();
        txtidsiswa = new javax.swing.JTextField();
        txtkelaminsiswa = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtalamatsiswa = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonCek.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11);
        jLabel11.setBounds(590, 330, 100, 30);

        tutup3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tutup3.setForeground(new java.awt.Color(255, 255, 255));
        tutup3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonExit.png"))); // NOI18N
        tutup3.setText("X");
        tutup3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tutup3.setPreferredSize(new java.awt.Dimension(20, 20));
        tutup3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tutup3MouseClicked(evt);
            }
        });
        getContentPane().add(tutup3);
        tutup3.setBounds(770, 0, 20, 30);

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
        mize.setBounds(740, 0, 20, 30);

        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        jLabel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel9MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 800, 40);

        txtpasssiswa.setBackground(new java.awt.Color(52, 73, 94));
        txtpasssiswa.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 18)); // NOI18N
        txtpasssiswa.setForeground(new java.awt.Color(255, 255, 255));
        txtpasssiswa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpasssiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasssiswaActionPerformed(evt);
            }
        });
        getContentPane().add(txtpasssiswa);
        txtpasssiswa.setBounds(360, 370, 220, 30);

        jLabel8.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(190, 370, 130, 20);

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
        txtusersiswa.setBounds(360, 330, 220, 30);

        jLabel5.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 330, 120, 20);

        resetpendsiswa.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 14)); // NOI18N
        resetpendsiswa.setForeground(new java.awt.Color(255, 255, 255));
        resetpendsiswa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resetpendsiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonReset.png"))); // NOI18N
        resetpendsiswa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetpendsiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetpendsiswaMouseClicked(evt);
            }
        });
        getContentPane().add(resetpendsiswa);
        resetpendsiswa.setBounds(480, 480, 100, 30);

        backpendsiswa.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 14)); // NOI18N
        backpendsiswa.setForeground(new java.awt.Color(255, 255, 255));
        backpendsiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonBack.png"))); // NOI18N
        backpendsiswa.setText("back");
        backpendsiswa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backpendsiswa.setPreferredSize(new java.awt.Dimension(100, 30));
        backpendsiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backpendsiswaMouseClicked(evt);
            }
        });
        getContentPane().add(backpendsiswa);
        backpendsiswa.setBounds(350, 480, 100, 30);

        submitsiswa.setBackground(new java.awt.Color(249, 105, 14));
        submitsiswa.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 24)); // NOI18N
        submitsiswa.setForeground(new java.awt.Color(255, 255, 255));
        submitsiswa.setText("Submit");
        submitsiswa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitsiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitsiswaActionPerformed(evt);
            }
        });
        getContentPane().add(submitsiswa);
        submitsiswa.setBounds(360, 410, 220, 50);

        txtnamasiswa.setBackground(new java.awt.Color(52, 73, 94));
        txtnamasiswa.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 18)); // NOI18N
        txtnamasiswa.setForeground(new java.awt.Color(255, 255, 255));
        txtnamasiswa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnamasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamasiswaActionPerformed(evt);
            }
        });
        txtnamasiswa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnamasiswaKeyTyped(evt);
            }
        });
        getContentPane().add(txtnamasiswa);
        txtnamasiswa.setBounds(360, 180, 220, 30);

        txtidsiswa.setEditable(false);
        txtidsiswa.setBackground(new java.awt.Color(52, 73, 94));
        txtidsiswa.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 18)); // NOI18N
        txtidsiswa.setForeground(new java.awt.Color(255, 255, 255));
        txtidsiswa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtidsiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidsiswaActionPerformed(evt);
            }
        });
        getContentPane().add(txtidsiswa);
        txtidsiswa.setBounds(360, 140, 220, 30);

        txtkelaminsiswa.setBackground(new java.awt.Color(52, 73, 94));
        txtkelaminsiswa.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 11)); // NOI18N
        txtkelaminsiswa.setForeground(new java.awt.Color(255, 255, 255));
        txtkelaminsiswa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Laki-Laki", "Perempuan" }));
        txtkelaminsiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkelaminsiswaActionPerformed(evt);
            }
        });
        getContentPane().add(txtkelaminsiswa);
        txtkelaminsiswa.setBounds(360, 220, 91, 30);

        txtalamatsiswa.setBackground(new java.awt.Color(52, 73, 94));
        txtalamatsiswa.setColumns(20);
        txtalamatsiswa.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtalamatsiswa.setForeground(new java.awt.Color(255, 255, 255));
        txtalamatsiswa.setRows(5);
        jScrollPane1.setViewportView(txtalamatsiswa);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(360, 260, 300, 60);

        jLabel10.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(34, 167, 240));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Register Form");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(260, 50, 270, 45);

        jLabel3.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 180, 60, 20);

        jLabel4.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Id Siswa");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(190, 140, 130, 20);

        jLabel6.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Jenis Kelamin");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(190, 220, 130, 23);

        jLabel7.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Alamat");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(190, 260, 80, 23);

        jLabel1.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 11)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackgroundPendaftaran.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnamasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamasiswaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamasiswaActionPerformed

    private void txtkelaminsiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkelaminsiswaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkelaminsiswaActionPerformed

    private void txtidsiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidsiswaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidsiswaActionPerformed

    private void submitsiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitsiswaActionPerformed
        // TODO add your handling code here:
        String nama=txtnamasiswa.getText();
        String alamat=txtnamasiswa.getText();
        String user=txtusersiswa.getText();
        String pass=txtpasssiswa.getText();
        
        if(user.equals("")){
            JOptionPane.showMessageDialog(null, "Username kosong!");
        }else{
            try{
                MysqlDataSource submit = new MysqlDataSource();
                submit.setServerName("localhost");
                submit.setUser("root");
                submit.setPassword("");
                submit.setPortNumber(3306);
                submit.setDatabaseName("private_musik");

                Connection koneksi=submit.getConnection();

                ResultSet rs = koneksi.prepareStatement("select Username from siswa where"+
                        " Username='"+txtusersiswa.getText()+"'").executeQuery();                       
                    if(rs.next()){
                        JOptionPane.showMessageDialog(null, "Username sudah digunakan!");
                    }else{
                        if(nama.equals("")||alamat.equals("")||user.equals("")||pass.equals("")){
                            JOptionPane.showMessageDialog(null, "Data tidak boleh kosong!");
                        }else{
                            try {
                                // TODO add your handling code here:
                                Document document=new Document();
                                try {
                                    PdfWriter.getInstance(document,new FileOutputStream("Data_Pribadi_Siswa_"+txtnamasiswa.getText()+".pdf"));
                                } catch (FileNotFoundException ex) {
                                    Logger.getLogger(UpdateDataSiswaAdmin.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                document.open();
                                Font font1=new Font(FontFamily.TIMES_ROMAN,20);
                                Paragraph pm = new Paragraph("PRIVATE MUSIC",font1);
                                pm.setAlignment(Element.ALIGN_CENTER);
                                document.add(pm);
                                Paragraph h = new Paragraph("HORRY",font1);
                                h.setAlignment(Element.ALIGN_CENTER);
                                document.add(h);
                                Font font2=new Font(FontFamily.TIMES_ROMAN,8);              
                                Paragraph jln = new Paragraph("Jl. Terusan Ryacudu, Desa WayHuwi Kecamatan Jati Agung\nKabupaten Lampung Selatan 35365, Lampung\nEmail:ronaldoblackviper@gmail.com , Phone : 089648033807",font2);
                                jln.setAlignment(Element.ALIGN_CENTER);
                                document.add(jln);
                                Paragraph para = new Paragraph("\n\n\nFormulir Pendaftaran Siswa\n\n");
                                para.setAlignment(Element.ALIGN_CENTER);
                                document.add(para);                
                                document.add(new Paragraph("Id Siswa : "+txtidsiswa.getText())); 
                                document.add(new Paragraph("Nama : "+txtnamasiswa.getText())); 
                                document.add(new Paragraph("Jenis Kelamin : "+txtkelaminsiswa.getSelectedItem())); 
                                document.add(new Paragraph("Alamat : "+txtalamatsiswa.getText())); 
                                document.add(new Paragraph("Username : "+txtusersiswa.getText())); 
                                document.add(new Paragraph("Password : "+txtpasssiswa.getText()+"\n\n"));
                                document.add(new Paragraph("            Dengan ini saya menyatakan, mendaftarkan diri sebagai siswa di HORRY Musik Lampung, dan saya akan mematuhi semua tata tertib dan peraturan yang berlaku di HORRY Musik Lampung\n\n\n\n"));
                                Paragraph nyata = new Paragraph("Yang Menyatakan\n\n\n");
                                nyata.setAlignment(Element.ALIGN_RIGHT);
                                document.add(nyata);
                                Paragraph namasetuju = new Paragraph(txtnamasiswa.getText());
                                namasetuju.setAlignment(Element.ALIGN_RIGHT);
                                document.add(namasetuju);                
                                document.close();
                            } catch (DocumentException ex) {
                                Logger.getLogger(UpdateDataSiswaAdmin.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            try{
                                koneksi.prepareStatement("insert into siswa values ('"+
                                        txtidsiswa.getText()+"','"+
                                        txtnamasiswa.getText()+"','"+
                                        txtkelaminsiswa.getSelectedItem()+"','"+
                                        txtalamatsiswa.getText()+"','"+
                                        txtusersiswa.getText()+"','"+
                                        txtpasssiswa.getText()+"')").execute();

                                txtalamatsiswa.setText("");
                                txtkelaminsiswa.setSelectedItem("Laki-Laki");
                                txtnamasiswa.setText("");
                                txtusersiswa.setText("");
                                txtpasssiswa.setText("");
                                autonumber();
                                JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
                                dispose();
                                new Beranda().setVisible(true);
                            }catch(Exception e){
                                System.out.println(e);

                                JOptionPane.showMessageDialog(rootPane, "Data Sudah Diinputkan");
                            }
                        }
                    }            
            }catch(Exception e){
                System.out.println(e);

            }
        }                
    }//GEN-LAST:event_submitsiswaActionPerformed

    private void backpendsiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backpendsiswaMouseClicked
        // TODO add your handling code here:
        dispose();
        new Beranda().setVisible(true);
    }//GEN-LAST:event_backpendsiswaMouseClicked

    private void resetpendsiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetpendsiswaMouseClicked
        // TODO add your handling code here:
        txtalamatsiswa.setText("");
        txtkelaminsiswa.setSelectedItem("Laki-Laki");
        txtnamasiswa.setText("");
        txtusersiswa.setText("");
        txtpasssiswa.setText("");
    }//GEN-LAST:event_resetpendsiswaMouseClicked

    private void txtusersiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusersiswaActionPerformed
        // TODO add your handling code here:
        cekusername();
    }//GEN-LAST:event_txtusersiswaActionPerformed

    private void txtpasssiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasssiswaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasssiswaActionPerformed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        // TODO add your handling code here:
        mousePX = evt.getX();
        mousePY = evt.getY();
    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel9MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseDragged
        // TODO add your handling code here:
        int koordinatX = evt.getXOnScreen();
        int koordinatY = evt.getYOnScreen();

        this.setLocation(koordinatX-mousePX, koordinatY-mousePY);
    }//GEN-LAST:event_jLabel9MouseDragged

    private void mizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mizeMouseClicked
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_mizeMouseClicked

    private void tutup3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tutup3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_tutup3MouseClicked

    private void txtnamasiswaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnamasiswaKeyTyped
        // TODO add your handling code here:
        if(Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtnamasiswaKeyTyped

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        cekusername();
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(PendaftaranSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PendaftaranSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PendaftaranSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PendaftaranSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PendaftaranSiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backpendsiswa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mize;
    private javax.swing.JLabel resetpendsiswa;
    private javax.swing.JButton submitsiswa;
    private javax.swing.JLabel tutup3;
    private javax.swing.JTextArea txtalamatsiswa;
    private javax.swing.JTextField txtidsiswa;
    private javax.swing.JComboBox txtkelaminsiswa;
    private javax.swing.JTextField txtnamasiswa;
    private javax.swing.JPasswordField txtpasssiswa;
    private javax.swing.JTextField txtusersiswa;
    // End of variables declaration//GEN-END:variables
    
    private void autonumber(){
        try{
            MysqlDataSource submit = new MysqlDataSource();
            submit.setServerName("localhost");
            submit.setUser("root");
            submit.setPassword("");
            submit.setPortNumber(3306);
            submit.setDatabaseName("private_musik");
            
            Connection koneksi=submit.getConnection();
            Statement state = koneksi.createStatement();
            String query = "SELECT MAX(Right(Id_Siswa,2)) as no FROM siswa";
            
            ResultSet rs = state.executeQuery(query);
            while(rs.next()){
                if(rs.last()){
                    //rs.next();
                    int auto_id = rs.getInt(1)+1;
                    String no = String.valueOf(auto_id);
                    int noLong = no.length();
                                for(int a=0;a<3-noLong;a++){
                                    no = "0" + no;
                                }
                    txtidsiswa.setText("A"+no);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "error \n"+ e.toString(),"Kesalahan", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void cekusername(){
        String user=txtusersiswa.getText();
        if(user.equals("")){
            JOptionPane.showMessageDialog(null, "Username kosong!");
        }else{
            try{
                MysqlDataSource submit = new MysqlDataSource();
                submit.setServerName("localhost");
                submit.setUser("root");
                submit.setPassword("");
                submit.setPortNumber(3306);
                submit.setDatabaseName("private_musik");

                Connection koneksi=submit.getConnection();

                ResultSet rs = koneksi.prepareStatement("select Username from siswa where"+
                        " Username='"+txtusersiswa.getText()+"'").executeQuery();                       
                    if(rs.next()){
                        JOptionPane.showMessageDialog(null, "Username sudah digunakan!");
                    }else{
                        JOptionPane.showMessageDialog(null, "Username dapat digunakan!");
                    }            
            }catch(Exception e){
                System.out.println(e);

            }
        }        
    }
}