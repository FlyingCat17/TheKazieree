/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import db.konekdb;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author LenataHoma
 */
public class dialogboxhapusdata extends javax.swing.JFrame {

    /**
     * Creates new form dialogboxlogin
     */
    public dialogboxhapusdata(data_barang_1 aThis,String idku) {
        initComponents();
        setLocationRelativeTo(null);
        jLabel4.setText(idku);
        jLabel1.requestFocus();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(17, 17, 17));
        setMinimumSize(new java.awt.Dimension(349, 178));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Quicksand Medium", 1, 18)); // NOI18N
        jLabel2.setText("Hapus Data");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 120, 30));

        jLabel1.setFont(new java.awt.Font("Quicksand Medium", 0, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("OK");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jLabel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel1KeyPressed(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 30, 20));

        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logodatabarang/Vector.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 310, 180));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logodatabarang/akar-icons_cross.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        String h = jLabel4.getText();
        try {
            String sql = "DELETE from tb_barang where id_barang ='" + h + "'";
            Connection conn = (Connection)konekdb.GetConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal dihapus");
            
        }
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
         String h = jLabel4.getText();
        try {
            String sql = "DELETE from tb_barang where id_barang ='" + h + "'";
            Connection conn = (Connection)konekdb.GetConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal dihapus");
        }   
        }
    }//GEN-LAST:event_jLabel1KeyPressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
