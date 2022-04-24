/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Dialog_Box.dialogbox_namaSupplierKosong;
import db.konekdb;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import GUI.data_barang_1;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LenataHoma
 */
public class EditSuplai extends javax.swing.JFrame {

    int x, y;

    /**
     * Creates new form Login2
     */
    private String kb,nb,st,hb,hj,jb;
    public EditSuplai() {
        initComponents();
        setLocationRelativeTo(null);
        setBackground(new Color(0,0,0,0));
        jTextArea1.setOpaque(false);
        scrollText.getViewport().setOpaque(false);
        scrollText.setOpaque(false);
//        user_id();
        warning_nama.setVisible(false);
        warning_usaha.setVisible(false);
        warning_alamat.setVisible(false);
        warning_telpon.setVisible(false);
        loadData();
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        warning_telpon = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        warning_alamat = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        warning_usaha = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        warning_nama = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        scrollText = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txt_no_telpon = new javax.swing.JTextField();
        txt_usaha_supplier = new javax.swing.JTextField();
        txt_nama_supplier = new javax.swing.JTextField();
        txt_id_supplier = new javax.swing.JTextField();
        btn_batal = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JLabel();
        form = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(775, 606));
        setUndecorated(true);
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

        warning_telpon.setMaximumSize(new java.awt.Dimension(456, 231));
        warning_telpon.setMinimumSize(new java.awt.Dimension(456, 231));
        warning_telpon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button_Design/btn_ok.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        warning_telpon.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 60, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/notif_noTelponSupplier.png"))); // NOI18N
        warning_telpon.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 230));

        getContentPane().add(warning_telpon, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        warning_alamat.setMaximumSize(new java.awt.Dimension(456, 231));
        warning_alamat.setMinimumSize(new java.awt.Dimension(456, 231));
        warning_alamat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button_Design/btn_ok.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        warning_alamat.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 60, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/notif_alamatSupplier.png"))); // NOI18N
        warning_alamat.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 230));

        getContentPane().add(warning_alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        warning_usaha.setMaximumSize(new java.awt.Dimension(456, 231));
        warning_usaha.setMinimumSize(new java.awt.Dimension(456, 231));
        warning_usaha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button_Design/btn_ok.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        warning_usaha.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 60, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/notif_usahaSupplier.png"))); // NOI18N
        warning_usaha.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 230));

        getContentPane().add(warning_usaha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        warning_nama.setMaximumSize(new java.awt.Dimension(456, 231));
        warning_nama.setMinimumSize(new java.awt.Dimension(456, 231));
        warning_nama.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button_Design/btn_ok.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        warning_nama.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 60, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/notif_namaSupplier.png"))); // NOI18N
        warning_nama.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 230));

        getContentPane().add(warning_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        scrollText.setBorder(null);
        scrollText.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scrollText.setOpaque(false);

        jTextArea1.setBackground(new Color(0,0,0,0)
        );
        jTextArea1.setColumns(15);
        jTextArea1.setFont(new java.awt.Font("Quicksand Medium", 0, 13)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setOpaque(false);
        scrollText.setViewportView(jTextArea1);

        getContentPane().add(scrollText, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 415, 70));

        txt_no_telpon.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        txt_no_telpon.setBorder(null);
        txt_no_telpon.setOpaque(false);
        txt_no_telpon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_no_telponActionPerformed(evt);
            }
        });
        getContentPane().add(txt_no_telpon, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 400, 37));

        txt_usaha_supplier.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        txt_usaha_supplier.setBorder(null);
        txt_usaha_supplier.setOpaque(false);
        txt_usaha_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usaha_supplierActionPerformed(evt);
            }
        });
        getContentPane().add(txt_usaha_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 227, 400, 37));

        txt_nama_supplier.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        txt_nama_supplier.setBorder(null);
        txt_nama_supplier.setOpaque(false);
        txt_nama_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nama_supplierActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nama_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 165, 400, 37));

        txt_id_supplier.setEditable(false);
        txt_id_supplier.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        txt_id_supplier.setBorder(null);
        txt_id_supplier.setOpaque(false);
        txt_id_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_supplierActionPerformed(evt);
            }
        });
        getContentPane().add(txt_id_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 104, 220, 37));

        btn_batal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/btn_batal_tambahSuplai.png"))); // NOI18N
        btn_batal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_batalMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_batalMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_batalMouseReleased(evt);
            }
        });
        getContentPane().add(btn_batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 130, 40));

        btn_simpan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/btn_simpan_tambahSuplai.png"))); // NOI18N
        btn_simpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_simpanMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_simpanMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_simpanMouseReleased(evt);
            }
        });
        getContentPane().add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 480, 130, 40));

        form.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/formedit.png"))); // NOI18N
        getContentPane().add(form, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 790, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
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

    public void loadData(){
        try {
            String lihat = "SELECT * FROM tb_supplier WHERE id_supplier = '"+txt_id_supplier.getText()+"';";
            java.sql.Connection con = (Connection)konekdb.GetConnection();
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet rs = stm.executeQuery(lihat);
            while (rs.next()) {                
                txt_nama_supplier.setText(rs.getString("nama_supplier"));
                txt_usaha_supplier.setText(rs.getString("nama_usaha"));
                jTextArea1.setText(rs.getString("alamat_supplier"));
                txt_no_telpon.setText(rs.getString("no_telp"));
            }
        } catch (Exception e) {
            
        }
    }
   
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        EditSuplai.this.setOpacity((float) 1.0);
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

    
    private void btn_batalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_batalMousePressed
        ImageIcon clickbatal = new ImageIcon("src/Icon/btn_batal_tambahSuplai_click.png");
        btn_batal.setIcon(clickbatal);
        
    }//GEN-LAST:event_btn_batalMousePressed

    private void btn_batalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_batalMouseReleased
        // TODO add your handling code here:
        ImageIcon releasebatal = new ImageIcon("src/Icon/btn_batal_tambahSuplai.png");
        btn_batal.setIcon(releasebatal);
    }//GEN-LAST:event_btn_batalMouseReleased

    private void btn_batalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_batalMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_batalMouseClicked

    private void txt_id_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_supplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_supplierActionPerformed

    private void txt_nama_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nama_supplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nama_supplierActionPerformed

    private void txt_usaha_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usaha_supplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usaha_supplierActionPerformed

    private void txt_no_telponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_no_telponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_no_telponActionPerformed

    private void btn_simpanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpanMousePressed
        ImageIcon clickSimpan = new ImageIcon("src/Icon/btn_simpan_tambahSuplai_click.png");
        btn_simpan.setIcon(clickSimpan);
    }//GEN-LAST:event_btn_simpanMousePressed

    private void btn_simpanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpanMouseReleased
        ImageIcon releaseSimpan = new ImageIcon("src/Icon/btn_simpan_tambahSuplai.png");
        btn_simpan.setIcon(releaseSimpan);
    }//GEN-LAST:event_btn_simpanMouseReleased

    private void btn_simpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpanMouseClicked
        // TODO add your handling code here:
//        Dialog_Box.dialogbox_namaSupplierKosong namaKosong = new dialogbox_namaSupplierKosong();
//        namaKosong.setVisible(true);
//        if (txt_nama_supplier.equals("")) {
//            JOptionPane.showMessageDialog(null, "Warnintg");
////        } else if (txt_usaha_supplier.equals("")) {
////            warning_usaha.setVisible(true);
////        } else if (jTextArea1.equals("")) {
////            warning_alamat.setVisible(true);
////        } else if (txt_no_telpon.equals("")) {
////            warning_telpon.setVisible(true);
////        } else {
////            System.out.println("Lengkap");
//        }
        String id = txt_id_supplier.getText();
        String nama = txt_nama_supplier.getText();
        String usaha = txt_usaha_supplier.getText();
        String alamat = jTextArea1.getText();
        String no = txt_no_telpon.getText();
        try {
            String tambah = "";
            java.sql.Connection con = (Connection) konekdb.GetConnection();
            java.sql.PreparedStatement pst = con.prepareStatement(tambah);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil !!");
            data_suplai1 sp = new data_suplai1();
            sp.loadTable();
        } catch (Exception e) {
            Logger.getLogger(EditSuplai.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btn_simpanMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        warning_nama.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        ImageIcon okHover = new ImageIcon("src/Button_Design/btn_ok_hover.png");
        jLabel2.setIcon(okHover);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        ImageIcon okHoverExited = new ImageIcon("src/Button_Design/btn_ok.png");
        jLabel2.setIcon(okHoverExited);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        warning_usaha.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        warning_alamat.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        warning_telpon.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseExited

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TambahSuplai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TambahSuplai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TambahSuplai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TambahSuplai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TambahSuplai().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_batal;
    private javax.swing.JLabel btn_simpan;
    private javax.swing.JLabel form;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane scrollText;
    public javax.swing.JTextField txt_id_supplier;
    public javax.swing.JTextField txt_nama_supplier;
    public javax.swing.JTextField txt_no_telpon;
    public javax.swing.JTextField txt_usaha_supplier;
    private javax.swing.JPanel warning_alamat;
    private javax.swing.JPanel warning_nama;
    private javax.swing.JPanel warning_telpon;
    private javax.swing.JPanel warning_usaha;
    // End of variables declaration//GEN-END:variables

    
}
