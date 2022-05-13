/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trx_jual;

import GUI.Dashboard2;
import db.konekdb;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import static trx_jual.trx_jual.jTable1;

/**
 *
 * @author Lutfi
 */
public class tbh_trx_jual extends javax.swing.JInternalFrame {

    /**
     * Creates new form tbh_trx_jual
     */
    public String id;
    public int subTotal;

    public tbh_trx_jual() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI gui = (BasicInternalFrameUI) this.getUI();
        gui.setNorthPane(null);

        Dimension desktopSize = Dashboard2.dpane.getSize();
        Dimension jInternalFrameSize = this.getSize();
        this.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 2);

        otomatis();
    }

    public int countSubtotal() {
        subTotal = 0;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            subTotal = subTotal + Integer.parseInt(jTable1.getValueAt(i, 4).toString());
        }
        return subTotal;
    }

    public void load() {
        try {
            String sql = "select * from `tb_barang` where id_barang='" + id_barang.getText() + "'";
            java.sql.Connection con = (Connection) konekdb.GetConnection();
            java.sql.Statement st = con.createStatement();
            java.sql.ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                nama.setText(rs.getString("nama_barang"));
                stok.setText(rs.getString("stok"));
                jumlah_barang.setText("0");
            }
        } catch (Exception e) {
        }
    }

    public void search() {
        if (id_barang.getText().equals("")) {
            nama.setText("");
            stok.setText("");
            jumlah_barang.setText("");
        } else {
            try {
                String sql = "SELECT * FROM tb_barang WHERE Id_barang LIKE '" + id_barang.getText() + "%'";
                java.sql.Connection conn = (Connection) konekdb.GetConnection();
                java.sql.Statement stm = conn.createStatement();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                java.sql.ResultSet res = stm.executeQuery(sql);
                pst.execute();
                while (res.next()) {
                    id_barang.setText(res.getString(1));
                    nama.setText(res.getString(2));
                    stok.setText(res.getString(6));
                }
            } catch (Exception e) {
            }
        }
    }

    public void otomatis() {  //Otomatis id transaksi, jika tanggal ganti kembali ke 1 lagi
        try {
            DateFormat hari = new SimpleDateFormat("yyyy-MM-dd");
            String a = hari.format(Calendar.getInstance().getTime());

            String sql = "SELECT MAX(right(id_brg,6)) AS Kode_Pinjam "
                    + "FROM temp_trx_jual Where tgl like '" + a + "';";
            java.sql.Connection con = (java.sql.Connection) konekdb.GetConnection();
            java.sql.Statement pst = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            java.sql.ResultSet rs = pst.executeQuery(sql);
            while (rs.next()) {
                if (rs.first() == true) //                {
                //                    id = "id_0000001";
                //                } else 
                {
                    rs.last();
                    int auto_id = rs.getInt(1) + 1;
                    String no = String.valueOf(auto_id);
                    int NomorJual = no.length();
                    //MENGATUR jumlah 0
                    for (int j = 0; j < 6 - NomorJual; j++) {
                        no = "0" + no;
                    }
                    id = "id_" + no;
                }
            }
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());

        }
    }

    public void simpan() {
        String nama;
        int harga, jml, ttl;
        DateFormat hari = new SimpleDateFormat("yyyy-MM-dd");
        String a = hari.format(Calendar.getInstance().getTime());
        if (id_barang.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "id barang tidak boleh kosong");
        } else {
            try {
                String sql1 = "SELECT * FROM tb_barang WHERE id_barang = '" + id_barang.getText() + "'";

                java.sql.Connection con = (Connection) konekdb.GetConnection();
                java.sql.Statement st = con.createStatement();
                java.sql.ResultSet rs = st.executeQuery(sql1);
                if (rs.next()) {
                    nama = rs.getString("nama_barang");
                    harga = rs.getInt("harga_jual");
                    jml = Integer.parseInt(jumlah_barang.getText());
                    ttl = harga * jml;
                    try {
                        String sql = "INSERT INTO `temp_trx_jual`(`id_brg`, `nama`, `harga`, "
                                + "`jumlah`, `total`, `tgl`, `fk_data_brg`, `id_trx`) VALUES "
                                + "('" + id + "','" + nama + "','" + harga + "',"
                                + "'" + jml + "','" + ttl + "','" + a + "','" + id_barang.getText() + "','" + trx_jual.jLabel20.getText() + "')";
                        java.sql.PreparedStatement ps = con.prepareStatement(sql);
                        ps.execute();
                        this.dispose();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(rootPane, e);
                    }

                }
            } catch (Exception e) {
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

        nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jumlah_barang = new javax.swing.JTextField();
        stok = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id_barang = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setEnabled(false);
        setFocusCycleRoot(false);
        setFocusable(false);
        setPreferredSize(new java.awt.Dimension(762, 627));
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nama.setEditable(false);
        nama.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        nama.setBorder(null);
        nama.setOpaque(false);
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 370, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trx_jual/batal.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, -1, -1));

        jumlah_barang.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        jumlah_barang.setBorder(null);
        jumlah_barang.setOpaque(false);
        getContentPane().add(jumlah_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 392, 370, 40));

        stok.setEditable(false);
        stok.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        stok.setBorder(null);
        stok.setOpaque(false);
        getContentPane().add(stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 322, 370, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trx_jual/simpan.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trx_jual/pilih_brg.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 192, -1, -1));

        id_barang.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        id_barang.setBorder(null);
        id_barang.setOpaque(false);
        id_barang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                id_barangKeyReleased(evt);
            }
        });
        getContentPane().add(id_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 370, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trx_jual/tambah_brg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == MouseEvent.BUTTON1) {
            simpan();
            getDesktopPane().add(new trx_jual()).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void id_barangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_barangKeyReleased
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_id_barangKeyReleased

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == MouseEvent.BUTTON1) {
            this.dispose();
        }
    }//GEN-LAST:event_jLabel3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id_barang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jumlah_barang;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField stok;
    // End of variables declaration//GEN-END:variables
}
