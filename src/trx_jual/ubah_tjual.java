/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trx_jual;

import GUI.Dashboard2;
import db.konekdb;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lutfi
 */
public class ubah_tjual extends javax.swing.JInternalFrame {

    /**
     * Creates new form ubah_tjual
     */
    public String idk;
    public int total, harga;
    trx_jual tjual = new trx_jual();

    public ubah_tjual() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI gui = (BasicInternalFrameUI) this.getUI();
        gui.setNorthPane(null);
        Dimension desktopSize = Dashboard2.dpane.getSize();
        Dimension jInternalFrameSize = this.getSize();
        this.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 2);
        
//        DefaultTableModel model = (DefaultTableModel) trx_jual.jTable1.getModel();
        
//        int a = tjual.jTable1.getSelectedRow();
//        System.out.println(a);
//        String namanya = (String.valueOf(tjual.jTable1.getValueAt(a, 2)));
//        String jumlahnya = (String.valueOf(tjual.jTable1.getValueAt(a, 4)));
//        String idnya = (String.valueOf(tjual.jTable1.getValueAt(a, 1)));
//        nama_barang.setText(namanya);
//        jumlah_barang.setText(jumlahnya);
//        
//        try {
//            String sql = "SELECT tb_produk.nama_produk, tb_stokbarang.stok_produk "
//                    + "FROM tb_produk JOIN tb_stokbarang ON tb_produk.id_produk = tb_stokbarang.id_produk WHERE id_produk = '"+idnya+"'";
//            java.sql.Connection conn = (Connection) konekdb.GetConnection();
//            java.sql.Statement stm = conn.createStatement();
//            java.sql.ResultSet res = stm.executeQuery(sql);
//            if (res.next()) {
//                stok.setText(res.getString(2));
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
        
//        try {
//            String sql = "SELECT * FROM `temp_trx_jual` WHERE id_brg='" + id + "'";
//            java.sql.Connection con = (java.sql.Connection) konekdb.GetConnection();
//            java.sql.Statement pst = con.createStatement();
//            java.sql.ResultSet rs = pst.executeQuery(sql);
//            while (rs.next()) {
//                nama_barang.setText(rs.getString("nama"));
//                jumlah_barang.setText(rs.getString("jumlah"));
//                try {
//                    String sql1 = "SELECT * FROM `tb_barang` WHERE id_barang='" + rs.getString("fk_data_brg") + "'";
//                    java.sql.Connection cone = (java.sql.Connection) konekdb.GetConnection();
//                    java.sql.Statement pste = cone.createStatement();
//                    java.sql.ResultSet res = pste.executeQuery(sql1);
//                    while (res.next()) {
//                        stok.setText(res.getString("stok"));
//                    }
//                } catch (Exception e) {
//                }
//            }
//            rs.last();
//            int jumlahdata = rs.getRow();
//            rs.first();
//        } catch (Exception e) {
//        }
    }
    
//    public ubah_tjual(String a, String b, String c) {
//        nama_barang.setText(a);
//        jumlah_barang.setText(b);
//        stok.setText(c);
//    }

    public void simpan() {
//        tjual.jTable1.getEditingColumn();
//        tjual.jTable1.getSelectedRow();
        
//        try {
//            String sqli = "SELECT * FROM `temp_trx_jual` WHERE id_brg='" + idk + "'";
//            java.sql.Connection cone = (Connection) konekdb.GetConnection();
//            java.sql.Statement sta = cone.createStatement();
//            java.sql.ResultSet rs = sta.executeQuery(sqli);
//            if (rs.next()) {
//                if (!(jumlah_barang.getText().equals("0"))) {
//                    harga = rs.getInt("harga");
//                    jml = ubah * harga;
//                    try {
//                        String sql = "UPDATE `temp_trx_jual` "
//                                + "SET `jumlah`='" + jumlah_barang.getText() + "',`total`='" + jml + "' WHERE id_brg='" + idk + "'";
//                        java.sql.Connection con = (Connection) konekdb.GetConnection();
//                        java.sql.PreparedStatement pst = con.prepareStatement(sql);
//                        pst.execute();
//                        getDesktopPane().add(new trx_jual()).setVisible(true);
//                        dispose();
//                    } catch (Exception e) {
//                    }
//                } else if (jumlah_barang.getText().equals("0")) {
//                    JOptionPane.showMessageDialog(null, "Jumlah barang minimal 1");
//                }
//            }
//        } catch (Exception e) {
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        stok = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jumlah_barang.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        jumlah_barang.setBorder(null);
        jumlah_barang.setOpaque(false);
        jumlah_barang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jumlah_barangKeyTyped(evt);
            }
        });
        getContentPane().add(jumlah_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 290, 370, 30));

        nama_barang.setEditable(false);
        nama_barang.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        nama_barang.setBorder(null);
        nama_barang.setOpaque(false);
        getContentPane().add(nama_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 370, 30));

        stok.setEditable(false);
        stok.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        stok.setBorder(null);
        stok.setOpaque(false);
        getContentPane().add(stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 370, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trx_jual/batal.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trx_jual/simpan.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trx_jual/ubah.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == MouseEvent.BUTTON1) {
            this.dispose();
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == MouseEvent.BUTTON1) {
//            simpan();
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jumlah_barangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumlah_barangKeyTyped
        // TODO add your handling code here:
        char k = evt.getKeyChar();
        if (!(Character.isDigit(k) || k == KeyEvent.VK_BACK_SPACE || k == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jumlah_barangKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static final javax.swing.JTextField jumlah_barang = new javax.swing.JTextField();
    public static final javax.swing.JTextField nama_barang = new javax.swing.JTextField();
    private javax.swing.JTextField stok;
    // End of variables declaration//GEN-END:variables
}
