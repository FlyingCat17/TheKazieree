/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import db.konekdb;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lutfi
 */
public class data_barang_1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form data_barang
     */
    private String id,namabarang,satuan,hargadasar,hargajual,stok;
    public data_barang_1() {
        initComponents();
        datatable();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI gui = (BasicInternalFrameUI) this.getUI();
        gui.setNorthPane(null);
        jTable1.getTableHeader().setBackground(new Color(254,149,46));
        jTable1.getTableHeader().setForeground(new Color(255,255,255));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setFont(new Font("Quicksand SemiBold", Font.BOLD, 12));
    }
     public void datatable(){
         DefaultTableModel tbl = new DefaultTableModel();
         tbl.addColumn("Id barang");
         tbl.addColumn("Nama Barang");
         tbl.addColumn("Satuan");
         tbl.addColumn("Harga Dasar");
         tbl.addColumn("Harga Jual");
         tbl.addColumn("Stok");
         jTable1.setModel(tbl);
         try {
            String sql = "SELECT * FROM tb_barang";
            java.sql.Connection conn = (Connection)konekdb.GetConnection();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while(res.next())
            {
                tbl.addRow(new Object[]{
                    res.getString(1),
                    res.getString(2),
                    res.getString(3),
                    res.getString(4),
                    res.getString(5),
                    res.getString(6),
            });
                jTable1.setModel(tbl);
            }
         } catch (Exception e) {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        barcode = new javax.swing.JLabel();
        Search = new javax.swing.JLabel();
        textfieldsearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnhapus = new javax.swing.JLabel();
        btntambah = new javax.swing.JLabel();
        btnubah = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Data Barang.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 29, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Rectangle 292.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 92, 900, -1));

        barcode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bi_qr-code-scan.png"))); // NOI18N
        jPanel1.add(barcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bx_search.png"))); // NOI18N
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
        });
        jPanel1.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 152, -1, 40));

        textfieldsearch.setBackground(new java.awt.Color(196, 196, 196));
        textfieldsearch.setFont(new java.awt.Font("Quicksand SemiBold", 0, 18)); // NOI18N
        textfieldsearch.setBorder(null);
        textfieldsearch.setOpaque(false);
        jPanel1.add(textfieldsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 151, 300, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Rectangle 298.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setRowHeight(35);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 209, 860, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Hapus.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 120, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Tambah.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 100, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Ubah.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 90, 30));

        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Rectangle 302.png"))); // NOI18N
        btnhapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhapusMouseClicked(evt);
            }
        });
        jPanel1.add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, -1, -1));

        btntambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Rectangle 302.png"))); // NOI18N
        btntambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntambahMouseClicked(evt);
            }
        });
        jPanel1.add(btntambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, -1));

        btnubah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Rectangle 302.png"))); // NOI18N
        jPanel1.add(btnubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
        // TODO add your handling code here:
        /*try {
            String sql = "SELECT * FROM tbl_mobil WHERE Id_mobil=('"+txt_cari.getText()+"');";
            java.sql.Connection conn=(Connection)Config.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            java.sql.ResultSet res=stm.executeQuery(sql);
            pst.execute();
            while (res.next()) {
                tbl.addRow(new Object[]{
                    res.getString("Id_Mobil"),
                    res.getString("merek"),
                    res.getString("Seri"),
                    res.getString("plat_nomor"),
                    res.getString("harga"),
                    res.getString("Status")
                });
                tabel.setModel(tbl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "salah");
        }*/
    }//GEN-LAST:event_SearchMouseClicked

    private void btnhapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhapusMouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        id =String.valueOf(jTable1.getModel().getValueAt(row, 0));
        try {
            String sql = "DELETE from tb_barang where id_barang ='" + id + "'";
            Connection conn = (Connection)konekdb.GetConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            datatable();
            JOptionPane.showMessageDialog(null, "Data Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal dihapus");
        }
    }//GEN-LAST:event_btnhapusMouseClicked

    private void btntambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntambahMouseClicked
        // TODO add your handling code here:
        Tambahandata j = new Tambahandata();
        j.setVisible(true);
    }//GEN-LAST:event_btntambahMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Search;
    private javax.swing.JLabel barcode;
    private javax.swing.JLabel btnhapus;
    private javax.swing.JLabel btntambah;
    private javax.swing.JLabel btnubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textfieldsearch;
    // End of variables declaration//GEN-END:variables
 
}
