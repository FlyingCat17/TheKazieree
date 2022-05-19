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
import java.awt.event.KeyEvent;
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
        int disk;
        if (!(diskon.getText().equals(""))) {
            disk = Integer.parseInt(diskon.getText());
            if (disk == 0) {
                int ttl = sub;
                total_harga.setText(Integer.toString(ttl));
            } else if (disk > 0) {
                int ttl = sub - disk;
                if (!(ttl < 0)) {
                    total_harga.setText(Integer.toString(ttl));
                } else {
                    diskon.setText("0");
                    JOptionPane.showMessageDialog(null, "Diskon tidak boleh lebih dari Sub Total!");
                }
            }
        }
    }

    public void kembalian() {
        int sub = Integer.parseInt(total_harga.getText());
        int disk;
        if (!(total_bayar.getText().equals(""))) {
            disk = Integer.parseInt(total_bayar.getText());
            int ttl = disk - sub;
            if (!(ttl < 0)) {
                kembalian.setText(Integer.toString(ttl));
            } else {
                kembalian.setText("");
            }
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

        diskon = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        total_harga = new javax.swing.JTextField();
        total_bayar = new javax.swing.JTextField();
        kembalian = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        diskon.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        diskon.setBorder(null);
        diskon.setOpaque(false);
        diskon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                diskonKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                diskonKeyTyped(evt);
            }
        });
        getContentPane().add(diskon, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 370, 40));

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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                total_bayarKeyTyped(evt);
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
            if (diskon.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "diskon harus di isi minimal 0");
            } else if (total_bayar.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "total bayar harus di isi minimal 0");
            } else {
                try {
                    String sql = "INSERT INTO `tb_jual`(`id_transaksi`, "
                            + "`tgl_transaksi`,`id_pengguna`, `total_harga`, `total_diskon`, "
                            + "`nominal_bayar`) VALUES ('" + id_trx.getText() + "',"
                            + "'" + date.getText() + "', 'USER', '" + total_harga.getText() + "',"
                            + "'" + diskon.getText() + "', '" + total_bayar.getText() + "')";
                    java.sql.Connection con = (Connection) konekdb.GetConnection();
                    java.sql.PreparedStatement pst = con.prepareStatement(sql);
                    pst.execute();
                    int jumlah_baris = trx_jual.jTable1.getRowCount();
                    DefaultTableModel model = (DefaultTableModel) trx_jual.jTable1.getModel();
                    if (jumlah_baris == 0) {
                        JOptionPane.showMessageDialog(rootPane, "Table Masih Kosong!");
                    } else {
                        try {
                                for (int i = 0; i < jumlah_baris; i++) {
                                    String jumlah = (String) model.getValueAt(i, 4);
                                    String harga = (String) model.getValueAt(i, 5);
                                    String id_prodk = (String) model.getValueAt(i, 1);
                                    String nama_p = (String) model.getValueAt(i, 2);
                                    String sql1 = "INSERT INTO `tb_detailjual`(`id_transaksi`, `id_produk`, `nama_produk`, `jumlah_produk`, `total_harga`) VALUES ("
                                            + "'" + id_trx.getText() + "', '" + id_prodk + "', '" + nama_p + "', '" + jumlah + "', '" + harga + "')";
                                    java.sql.PreparedStatement ps1 = con.prepareStatement(sql1);
                                    ps1.execute();
                                }
                                for (int i = jumlah_baris - 1; i >= 0; i--) {
                                    System.out.println("hapus baris ke-"+i);
                                    model.removeRow(i);
                            }
                            }catch (Exception e) {
                            JOptionPane.showMessageDialog(rootPane, "Gagal Menyimpan! Error : " + e);
                        }
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e);
                }
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

    private void total_bayarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_total_bayarKeyTyped
        // TODO add your handling code here:
        char k = evt.getKeyChar();
        if (!(Character.isDigit(k) || k == KeyEvent.VK_BACK_SPACE || k == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_total_bayarKeyTyped

    private void diskonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diskonKeyTyped
        // TODO add your handling code here:
        char k = evt.getKeyChar();
        if (!(Character.isDigit(k) || k == KeyEvent.VK_BACK_SPACE || k == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_diskonKeyTyped


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
