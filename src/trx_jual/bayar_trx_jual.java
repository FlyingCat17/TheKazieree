/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trx_jual;

import GUI.Dashboard2;
import db.konekdb;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lutfi
 */
public class bayar_trx_jual extends javax.swing.JInternalFrame {

    /**
     * Creates new form bayar_trx_jual
     */
    public bayar_trx_jual() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI gui = (BasicInternalFrameUI) this.getUI();
        gui.setNorthPane(null);
        Dimension desktopSize = Dashboard2.dpane.getSize();
        Dimension jInternalFrameSize = this.getSize();
        this.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 2);
        Tampil_tgl();
    }

    public void Tampil_tgl() {

        java.util.Date tglsekarang = new java.util.Date();
        SimpleDateFormat smpdtfmt = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String tanggal = smpdtfmt.format(tglsekarang);

        date.setText(tanggal);
    }

    public void diskon() {
        int sub = Integer.parseInt(sub_total.getText());
        int disk = Integer.parseInt(diskon.getText());
        if (disk == 0) {
            int ttl = sub;
            total_harga.setText(Integer.toString(ttl));
        } else if (disk > 0) {
            int ttl = sub - disk;
            total_harga.setText(Integer.toString(ttl));
        } else {

        }
    }

    public void kembalian() {
        if (total_bayar.getText().equals("0")) {

        } else {
            int sub = Integer.parseInt(total_harga.getText());
            int disk = Integer.parseInt(total_bayar.getText());
            int ttl = disk - sub;
            kembalian.setText(Integer.toString(ttl));
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        date = new javax.swing.JTextField();
        diskon = new javax.swing.JTextField();
        total_harga = new javax.swing.JTextField();
        total_bayar = new javax.swing.JTextField();
        kembalian = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        date.setEditable(false);
        date.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        date.setBorder(null);
        date.setOpaque(false);
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 370, 30));

        id_trx.setEditable(false);
        id_trx.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        id_trx.setBorder(null);
        id_trx.setOpaque(false);
        getContentPane().add(id_trx, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 370, 30));

        sub_total.setEditable(false);
        sub_total.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        sub_total.setBorder(null);
        sub_total.setOpaque(false);
        getContentPane().add(sub_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 370, 30));

        diskon.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        diskon.setBorder(null);
        diskon.setOpaque(false);
        diskon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                diskonKeyReleased(evt);
            }
        });
        getContentPane().add(diskon, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 370, 40));

        total_harga.setEditable(false);
        total_harga.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        total_harga.setBorder(null);
        total_harga.setOpaque(false);
        getContentPane().add(total_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 370, 40));

        total_bayar.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        total_bayar.setBorder(null);
        total_bayar.setOpaque(false);
        total_bayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                total_bayarKeyReleased(evt);
            }
        });
        getContentPane().add(total_bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 370, 40));

        kembalian.setEditable(false);
        kembalian.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        kembalian.setBorder(null);
        kembalian.setOpaque(false);
        getContentPane().add(kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 370, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trx_jual/batal.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trx_jual/simpan.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trx_jual/pembayaran.png"))); // NOI18N
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
            try {
                String sql = "INSERT INTO `tb_transjual`(`id_transjual`, "
                        + "`tgl_transaksi`, `total_harga`, `nominal_bayar`, "
                        + "`kembalian`) VALUES ('" + id_trx.getText() + "',"
                        + "'" + date.getText() + "','" + total_harga.getText() + "',"
                        + "'" + total_bayar.getText() + "','" + kembalian.getText() + "')";
                java.sql.Connection con = (Connection) konekdb.GetConnection();
                java.sql.PreparedStatement pst = con.prepareStatement(sql);
                pst.execute();
                DefaultTableModel mdl = new DefaultTableModel();
                mdl.addColumn("id");
                int jumlah_baris = trx_jual.jTable1.getRowCount();
                if (jumlah_baris == 0) {
                    JOptionPane.showMessageDialog(rootPane, "Table Masih Kosong!");
                } else {
                    try {
                        for (int i = 0; i < jumlah_baris; i++) {
                            String jumlah = (String) trx_jual.jTable1.getValueAt(i, 3);
                            String harga = (String) trx_jual.jTable1.getValueAt(i, 4);
                            String id_brg = (String) trx_jual.jTable1.getValueAt(i, 5);
                            String sql1 = "INSERT INTO `tb_detail_transjual`(`id_transjual`, `id_barang`, `jumlah`, `harga`) VALUES ("
                                    + "'" + id_trx.getText() + "',"
                                    + "'" + id_brg + "',"
                                    + "'" + jumlah + "','" + harga + "')";
                            java.sql.PreparedStatement ps1 = con.prepareStatement(sql1);
                            ps1.execute();
                        }
                        try {
                            String query = "DELETE FROM `temp_trx_jual` WHERE id_trx='" + id_trx.getText() + "'";
                            java.sql.PreparedStatement ps = con.prepareStatement(query);
                            ps.execute();
                            getDesktopPane().add(new trx_jual()).setVisible(true);
                            dispose();
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(rootPane, "ini salah");
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(rootPane, "Gagal Menyimpan! Error : " + e);
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }


    }//GEN-LAST:event_jLabel4MouseClicked

    private void diskonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diskonKeyReleased
        // TODO add your handling code here:
        diskon();
    }//GEN-LAST:event_diskonKeyReleased

    private void total_bayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_total_bayarKeyReleased
        // TODO add your handling code here:
        kembalian();
    }//GEN-LAST:event_total_bayarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField date;
    private javax.swing.JTextField diskon;
    public static final javax.swing.JTextField id_trx = new javax.swing.JTextField();
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField kembalian;
    public static final javax.swing.JTextField sub_total = new javax.swing.JTextField();
    private javax.swing.JTextField total_bayar;
    private javax.swing.JTextField total_harga;
    // End of variables declaration//GEN-END:variables
}
