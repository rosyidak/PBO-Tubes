/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar_privatemusik;

/**
 *
 * @author USER
 */
public class AboutUs extends javax.swing.JFrame {
    int mousePX;
    int mousePY;
    /**
     * Creates new form AboutUs
     */
    public AboutUs() {
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

        jLabel7 = new javax.swing.JLabel();
        mize1 = new javax.swing.JLabel();
        tutup1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

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
        jLabel7.setBounds(30, 350, 100, 30);

        mize1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mize1.setForeground(new java.awt.Color(255, 255, 255));
        mize1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonMinimize.png"))); // NOI18N
        mize1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mize1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mize1MouseClicked(evt);
            }
        });
        getContentPane().add(mize1);
        mize1.setBounds(550, 0, 20, 30);

        tutup1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tutup1.setForeground(new java.awt.Color(255, 255, 255));
        tutup1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonExit.png"))); // NOI18N
        tutup1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tutup1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tutup1MouseClicked(evt);
            }
        });
        getContentPane().add(tutup1);
        tutup1.setBounds(570, 0, 20, 30);

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
        jLabel3.setBounds(0, 0, 600, 50);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Software ini bertujuan untuk memudahkan masyarakat \nuntuk mendaftar private music ,dengan adanya aplikasi ini\npendaftar dapat melihat jenis les apa saja yang disediakan\noleh tempat les tersebut, pengguna juga dapat melihat pembagian\njadwal dari tiap kelasnya . aplikasi ini juga memberikan fitur \nuntuk masyarakat yang ingin mendaftarkan diri sebagai guru dari private\nmusic ini dengan hanya mengisi form registrasi yang sudah disediakan\noleh aplikasi ini, aplikasi ini dapat dengan mudah digunakan oleh user,\nsehingga semua proses administrasi dapat dilakukan dengan lebih mudah dan \npendaftar tidak perlu takut akan kehilangan data , selain itu juga penyampaian\ninformasi akan lebih efisien dan tepat untuk diterima oleh user.\n software ini kami rancang dengan segenap jiwa, dan waktu yang tisak sebentar\nagar dapat memenuhi kebutuhan user, dan dapat diterima dimasyarakat luas.");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 60, 540, 280);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AboutUs.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 600, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void mize1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mize1MouseClicked
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_mize1MouseClicked

    private void tutup1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tutup1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_tutup1MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        dispose();
        new Beranda().setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutUs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel mize1;
    private javax.swing.JLabel tutup1;
    // End of variables declaration//GEN-END:variables
}
