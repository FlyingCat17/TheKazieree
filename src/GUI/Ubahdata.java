/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import db.konekdb;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import GUI.data_barang_1;
import java.awt.event.KeyEvent;
/**
 *
 * @author LenataHoma
 */
public class Ubahdata extends javax.swing.JFrame {

    int x, y;

    /**
     * Creates new form Login2
     */
    
    public String id_barang;
    public Ubahdata (data_barang_1 aThis, String idku, String nama, String satuann, String harga_b, String harga_j,String jumlah) {
        initComponents();
        setLocationRelativeTo(null);
        kodebarang.setText(idku);
        id_barang= idku;
        namabarang.setText(nama);
        boxsatuan.setSelectedItem(satuann);
        hargabeli.setText(harga_b);
        hargajual.setText(harga_j);
        jumlahbarang.setText(jumlah);
    }

    private Ubahdata() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        hargajual = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        kodebarang = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        namabarang = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jumlahbarang = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        hargabeli = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        boxsatuan = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(728, 575));
        setUndecorated(true);
        setOpacity(0.0F);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logodatabarang/Ubah Barang_1.png"))); // NOI18N
        jLabel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel9MouseDragged(evt);
            }
        });
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logodatabarang/Batal.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logodatabarang/Rectangle 362.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logodatabarang/Kode Barang _.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logodatabarang/Nama Barang _.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logodatabarang/Satuan _.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logodatabarang/Jumlah Barang _.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 140, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logodatabarang/Harga Beli _.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 140, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logodatabarang/Harga Jual _.png"))); // NOI18N
        jLabel10.setText(" ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        hargajual.setBackground(new java.awt.Color(196, 196, 196));
        hargajual.setFont(new java.awt.Font("Quicksand Medium", 0, 16)); // NOI18N
        hargajual.setBorder(null);
        hargajual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargajualActionPerformed(evt);
            }
        });
        hargajual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hargajualKeyTyped(evt);
            }
        });
        getContentPane().add(hargajual, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 380, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logodatabarang/Rectangle 298.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));

        kodebarang.setBackground(new java.awt.Color(196, 196, 196));
        kodebarang.setFont(new java.awt.Font("Quicksand Medium", 0, 16)); // NOI18N
        kodebarang.setBorder(null);
        kodebarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodebarangActionPerformed(evt);
            }
        });
        kodebarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                kodebarangKeyTyped(evt);
            }
        });
        getContentPane().add(kodebarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 380, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logodatabarang/Rectangle 298.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        namabarang.setBackground(new java.awt.Color(196, 196, 196));
        namabarang.setFont(new java.awt.Font("Quicksand Medium", 0, 16)); // NOI18N
        namabarang.setBorder(null);
        namabarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namabarangActionPerformed(evt);
            }
        });
        getContentPane().add(namabarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 380, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logodatabarang/Rectangle 298.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        jumlahbarang.setBackground(new java.awt.Color(196, 196, 196));
        jumlahbarang.setFont(new java.awt.Font("Quicksand Medium", 0, 16)); // NOI18N
        jumlahbarang.setBorder(null);
        jumlahbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahbarangActionPerformed(evt);
            }
        });
        jumlahbarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jumlahbarangKeyTyped(evt);
            }
        });
        getContentPane().add(jumlahbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 380, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logodatabarang/Rectangle 298.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        hargabeli.setBackground(new java.awt.Color(196, 196, 196));
        hargabeli.setFont(new java.awt.Font("Quicksand Medium", 0, 16)); // NOI18N
        hargabeli.setBorder(null);
        hargabeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargabeliActionPerformed(evt);
            }
        });
        hargabeli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hargabeliKeyTyped(evt);
            }
        });
        getContentPane().add(hargabeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 380, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logodatabarang/Rectangle 298.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        boxsatuan.setBackground(new java.awt.Color(196, 196, 196));
        boxsatuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pcs", "Cm", "M" }));
        boxsatuan.setBorder(null);
        getContentPane().add(boxsatuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 190, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logodatabarang/bi_qr-code-scan.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logodatabarang/Simpan.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 100, 50));

        btn_simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logodatabarang/Rectangle 300_1.png"))); // NOI18N
        btn_simpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_simpanMouseClicked(evt);
            }
        });
        getContentPane().add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 460, 130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseDragged
        // TODO add your handling code here:
        int ex = evt.getXOnScreen();
        int ye = evt.getYOnScreen();

        this.setLocation(ex - x, ye - y);
    }//GEN-LAST:event_jLabel9MouseDragged

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabel9MousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for (double i = 0.0; i <= 1.0; i = i + 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
//        setOpacity((float) 1.0);
//        for (double i = 1.0; i >= 1.0; i = i - 0.1) {
//            String val = i + "";
//            float f = Float.valueOf(val);
//            this.setOpacity(f);
//            try {
//                Thread.sleep(10);
//            } catch (Exception e) {
//                
//            }
//        }

    }//GEN-LAST:event_formWindowClosed

    
   
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Ubahdata.this.setOpacity((float) 1.0);
        for (double i = 1.0; i >= 1.0; i = i - 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_formWindowClosing

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void hargajualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargajualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargajualActionPerformed

    private void kodebarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodebarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodebarangActionPerformed

    private void namabarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namabarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namabarangActionPerformed

    private void jumlahbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahbarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahbarangActionPerformed

    private void hargabeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargabeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargabeliActionPerformed

    private void btn_simpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpanMouseClicked
        // TODO add your handling code here:
        String kb= kodebarang.getText();
        String nb= namabarang.getText();
        String st= (String)boxsatuan.getSelectedItem();
        String jb= jumlahbarang.getText();
        String hb= hargabeli.getText();
        String hj= hargajual.getText();
        try {
            String update = "UPDATE tb_barang SET id_barang = '"+ kb +"',nama_barang = '"+ nb +"', satuan = '"+ st +"', harga_dasar = '"+ hb +"', harga_jual = '"+ hj +"', stok = '"+ jb +
                    "' WHERE id_barang = '"+ id_barang +"'";
            java.sql.Connection con = (Connection)konekdb.GetConnection();
            java.sql.PreparedStatement stm = con.prepareStatement(update);
            stm.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            data_barang_1.datatable();
            this.dispose();
        } catch (Exception t){
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan");
        }
    }//GEN-LAST:event_btn_simpanMouseClicked

    private void kodebarangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kodebarangKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_kodebarangKeyTyped

    private void jumlahbarangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumlahbarangKeyTyped
        // TODO add your handling code here:
        char k = evt.getKeyChar();
        if (!(Character.isDigit(k) || k == KeyEvent.VK_BACK_SPACE || k == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        if (jumlahbarang.getText().length()>=11) {
            evt.consume();
        }
    }//GEN-LAST:event_jumlahbarangKeyTyped

    private void hargabeliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hargabeliKeyTyped
        // TODO add your handling code here:
        char k = evt.getKeyChar();
        if (!(Character.isDigit(k) || k == KeyEvent.VK_BACK_SPACE || k == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        if (hargabeli.getText().length()>=11) {
            evt.consume();
        }
    }//GEN-LAST:event_hargabeliKeyTyped

    private void hargajualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hargajualKeyTyped
        // TODO add your handling code here:
        char k = evt.getKeyChar();
        if (!(Character.isDigit(k) || k == KeyEvent.VK_BACK_SPACE || k == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        if (hargajual.getText().length()>=11) {
            evt.consume();
        }
    }//GEN-LAST:event_hargajualKeyTyped

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ubahdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ubahdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ubahdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ubahdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new Ubahdata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxsatuan;
    private javax.swing.JLabel btn_simpan;
    private javax.swing.JTextField hargabeli;
    private javax.swing.JTextField hargajual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jumlahbarang;
    private javax.swing.JTextField kodebarang;
    private javax.swing.JTextField namabarang;
    // End of variables declaration//GEN-END:variables
}
