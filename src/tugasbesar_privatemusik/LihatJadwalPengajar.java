/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar_privatemusik;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Ronaldo
 */
public class LihatJadwalPengajar extends javax.swing.JFrame {
    DefaultTableModel tabelmodel;
    int mousePX;
    int mousePY;
    /**
     * Creates new form LihatJadwalPengajar
     */
    public LihatJadwalPengajar() {
        initComponents();
        setLocationRelativeTo(null);
        
        String[] judul={"Hari","Jam","Jumlah Siswa","Alat Musik","Ruangan"};
        tabelmodel = new DefaultTableModel(null, judul);
        lihattabelpengajar.setModel(tabelmodel);
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        lihattabelpengajar = new javax.swing.JTable();
        mize = new javax.swing.JLabel();
        tutup1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 200));
        getContentPane().setLayout(null);

        lihattabelpengajar.setAutoCreateRowSorter(true);
        lihattabelpengajar.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(lihattabelpengajar);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 40, 540, 110);

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
        tutup1.setBounds(570, 0, 20, 30);

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
        jLabel8.setBounds(30, 160, 100, 30);

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
        jLabel2.setBounds(0, 0, 600, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackgroundLihatJadwal.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        dispose();
        new FormPengajar().setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void mizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mizeMouseClicked
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_mizeMouseClicked

    private void tutup1tutupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tutup1tutupMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_tutup1tutupMouseClicked

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
            java.util.logging.Logger.getLogger(LihatJadwalPengajar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LihatJadwalPengajar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LihatJadwalPengajar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LihatJadwalPengajar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LihatJadwalPengajar().setVisible(true);
            }
        });
    }

    public void tampil() {
        try{
            MysqlDataSource submit = new MysqlDataSource();
            submit.setServerName("localhost");
            submit.setUser("root");
            submit.setPassword("");
            submit.setPortNumber(3306);
            submit.setDatabaseName("private_musik");
            
            Connection koneksi=submit.getConnection();
            
            ResultSet rs = koneksi.prepareStatement("select Distinct Hari,Jam,"+
                    "alat_musik.Nama_Alat_Musik,ruangan.Nama_Ruangan from jadwal "+                    
                    "INNER JOIN alat_musik ON jadwal.Id_Alat_Musik=alat_musik.Id_Alat_Musik "+
                    "INNER JOIN ruangan ON jadwal.Id_Ruangan=ruangan.Id_Ruangan "+                    
                    " where Id_Pengajar='"+UserSession.getUserLogin()+"'").executeQuery();            
                while(rs.next()){
                    switch (rs.getString(1)) {
                        case "Senin":
                            String senin=String.valueOf(jumlahsiswa("Senin"));
                            tabelmodel.addRow(new  String[]{
                                rs.getString(1),
                                rs.getString(2),
                                senin,
                                rs.getString(3),
                                rs.getString(4)}
                            );
                            break;
                        case "Selasa":
                            String selasa=String.valueOf(jumlahsiswa("Selasa"));
                            tabelmodel.addRow(new  String[]{
                                rs.getString(1),
                                rs.getString(2),
                                selasa,
                                rs.getString(3),
                                rs.getString(4)}
                            );
                            break;
                        case "Rabu":
                            String rabu=String.valueOf(jumlahsiswa("Rabu"));
                            tabelmodel.addRow(new  String[]{
                                rs.getString(1),
                                rs.getString(2),
                                rabu,
                                rs.getString(3),
                                rs.getString(4)}
                            );
                            break;
                        case "Kamis":
                            String kamis=String.valueOf(jumlahsiswa("Kamis"));
                            tabelmodel.addRow(new  String[]{
                                rs.getString(1),
                                rs.getString(2),
                                kamis,
                                rs.getString(3),
                                rs.getString(4)}
                            );
                            break;
                        case "Jumat":
                            String jumat=String.valueOf(jumlahsiswa("Jumat"));
                            tabelmodel.addRow(new  String[]{
                                rs.getString(1),
                                rs.getString(2),
                                jumat,
                                rs.getString(3),
                                rs.getString(4)}
                            );
                            break;
                        case "Sabtu":
                            String sabtu=String.valueOf(jumlahsiswa("Sabtu"));
                            tabelmodel.addRow(new  String[]{
                                rs.getString(1),
                                rs.getString(2),
                                sabtu,
                                rs.getString(3),
                                rs.getString(4)}
                            );
                            break;
                    }
                }            
        }catch(Exception e){
            System.out.println(e);
            
        }
    }
    
    public int jumlahsiswa(String hari){
        int jumlah=0;
        try{
            MysqlDataSource submit = new MysqlDataSource();
            submit.setServerName("localhost");
            submit.setUser("root");
            submit.setPassword("");
            submit.setPortNumber(3306);
            submit.setDatabaseName("private_musik");
            
            Connection koneksi=submit.getConnection();
            
            ResultSet rs = koneksi.prepareStatement("select Hari,Jam from jadwal"+
                    " where Hari='"+hari+"' and Id_Pengajar='"+UserSession.getUserLogin()+"'").executeQuery();
                while(rs.next()){
                    jumlah++;
                }            
        }catch(Exception e){
            System.out.println(e);
            
        }
        return jumlah;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lihattabelpengajar;
    private javax.swing.JLabel mize;
    private javax.swing.JLabel tutup1;
    // End of variables declaration//GEN-END:variables
}