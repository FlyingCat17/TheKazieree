/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trx_jual;

import GUI.Dashboard2;
import java.awt.Dimension;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lutfi
 */
public class ganti_tjual extends javax.swing.JInternalFrame {

    /**
     * Creates new form ganti_tjual
     */
    public ganti_tjual() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI gui = (BasicInternalFrameUI) this.getUI();
        gui.setNorthPane(null);
        Dimension desktopSize = Dashboard2.dpane.getSize();
        Dimension jInternalFrameSize = this.getSize();
        this.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jumlah = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        stok = new javax.swing.JLabel();
        nama_barang = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jumlah.setText("jTextField1");
        getContentPane().add(jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 380, 30));

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, -1, -1));

        jButton2.setText("jButton2");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, -1, -1));

        stok.setText("jLabel3");
        getContentPane().add(stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 370, 30));

        nama_barang.setText("jLabel2");
        getContentPane().add(nama_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 380, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trx_jual/ubah.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
//        trx_jual tjual = new trx_jual();
        DefaultTableModel model = (DefaultTableModel) trx_jual.jTable1.getModel();
        
        int index = trx_jual.jTable1.getSelectedRow();
//        String nama = nama_barang.getText();
//        String stok = stok.getText();
        String jumlah = ganti_tjual.jumlah.getText();
//        System.out.println(index);
        
//        model.setValueAt(nama, index, 2);
//        model.setValueAt(stok, index, 1);
        model.setValueAt(jumlah, index, 4);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JTextField jumlah;
    public static javax.swing.JLabel nama_barang;
    public static javax.swing.JLabel stok;
    // End of variables declaration//GEN-END:variables
}
