/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import db.konekdb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Lutfi
 */
public class data_suplai1 extends javax.swing.JInternalFrame {

    konekdb conn = new konekdb();

    /**
     * Creates new form data_suplai
     */
    public data_suplai1() {
        konekdb conn = new konekdb();
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI gui = (BasicInternalFrameUI)this.getUI();
        gui.setNorthPane(null);
        loadTable();
//        jPanel3.setEnabled(false);
//        jPanel3.setOpaque(false);
//        formtambah.setEnabled(false);
        
        
    }

//    private void autonumber() {
//        try {
//            Connection conn = (Connection) konekdb.GetConnection();
//            Statement s = conn.createStatement();
//            String sql = "SELECT * FROM tb_supplier ORDER BY id_supplier  DESC";
//            ResultSet r = s.executeQuery(sql);
//            if (r.next()) {
//                String NoFaktur = r.getString("id_supplier ").substring(2);
//                String BR = "" + (Integer.parseInt(NoFaktur) + 1);
//                String Nol = "";
//
//                if (BR.length() == 1) {
//                    Nol = "00";
//                } else if (BR.length() == 2) {
//                    Nol = "0";
//                } else if (BR.length() == 3) {
//                    Nol = "";
//                }
//
//                idsuplier.setText("BR" + Nol + BR);
//            } else {
//                idsuplier.setText("BR001");
//            }
//            r.close();
//            s.close();
//        } catch (Exception e) {
//            System.out.println("autonumber error");
//        }
//    }

    public void clear() {
//        txt_nama_suplier.setText("");
//        txt_nama_usaha.setText("");
//        txt_alamat_suplier.setText("");
//        txt_no_telp.setText("");
    }

    
//    public void loadData() {
//        model.getDataVector().removeAllElements();
//
//        model.fireTableDataChanged();
//
//        try {
//            Connection conn = (Connection) konekdb.GetConnection();
//            Statement s = conn.createStatement();
//
//            String sql = "SELECT * FROM tb_supplier;";
//            ResultSet r = s.executeQuery(sql);
//
//            jtable.setModel(model);
//            while (r.next()) {
//                Object[] o = new Object[7];
//                o[0] = r.getString("id_supplier ");
//                o[1] = r.getString("Nama_suplaier");
//                o[2] = r.getString("Nama_usaha");
//                o[3] = r.getString("Alamat");
//                o[4] = r.getString("No_telp");
//
//                model.addRow(o);
//            }
//            r.close();
//            s.close();
//        } catch (Exception e) {
//            System.out.println("terjadi kesalahan");
//        }
//    }

   private void loadTable(){
        DefaultTableModel tab = new DefaultTableModel();
        tab.addColumn("ID Supplier");
        tab.addColumn("Nama_Supplier");
        tab.addColumn("Usaha");
        tab.addColumn("Alamat");
        tab.addColumn("No HP");
        try {
            String sql = "SELECT * FROM tb_supplier";
            java.sql.Connection con = (Connection)konekdb.GetConnection();
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {     
                tab.addRow(new Object[]{
                rs.getString("id_supplier"),
                rs.getString("nama_supplier"),
                rs.getString("nama_usaha"),
                rs.getString("alamat_supplier"),
                rs.getString("no_telp")
                });
                jTable1.setModel(tab);
            };
        } catch (Exception e) {
            
        }
    }
//    public void cariData() {
//        DefaultTableModel tabel = new DefaultTableModel();
//
//        tabel.addColumn("id_supplier ");
//        tabel.addColumn("Nama_supalaier");
//        tabel.addColumn("Nama_usaha");
//        tabel.addColumn("Alamat");
//        tabel.addColumn("No_telp");
//
//        try {
//            Connection conn = (Connection) konekdb.GetConnection();
//            String sql = "Select * from tb_supplier where id_supplier  '%" + jTextField1.getText() + "%'"
//                    + "or nama_suplier like '%" + jTextField1.getText() + "%'";
//            Statement stat = conn.createStatement();
//            ResultSet rs = stat.executeQuery(sql);
//            while (rs.next()) {
//                tabel.addRow(new Object[]{
//                    rs.getString(1),
//                    rs.getString(2),
//                    rs.getString(3),
//                    rs.getString(4),
//                    rs.getString(5),
//                    rs.getString(6),
//                    rs.getString(7),});
//            }
//            jtable.setModel(tabel);
//            loadData();
//        } catch (Exception e) {
//            System.out.println("Cari Data Error");
//        } finally {
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        searchBox = new javax.swing.JLabel();
        btn_hapusSuplai = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_tambahSuplai = new javax.swing.JLabel();
        btn_ubahSuplai = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBorder(null);
        setMinimumSize(new java.awt.Dimension(962, 710));
        setPreferredSize(new java.awt.Dimension(962, 710));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(238, 238, 238));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 860, 420));

        jTextField1.setFont(new java.awt.Font("Quicksand Medium", 0, 15)); // NOI18N
        jTextField1.setBorder(null);
        jTextField1.setOpaque(false);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 42, 290, 40));

        searchBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Rectangle 298.png"))); // NOI18N
        jPanel1.add(searchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 41, -1, -1));

        btn_hapusSuplai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/btn_hapus_suplai.png"))); // NOI18N
        btn_hapusSuplai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_hapusSuplaiMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_hapusSuplaiMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_hapusSuplaiMouseReleased(evt);
            }
        });
        jPanel1.add(btn_hapusSuplai, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_search.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 41, 40, 40));

        btn_tambahSuplai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/btn_tambah_suplai.png"))); // NOI18N
        btn_tambahSuplai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tambahSuplaiMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_tambahSuplaiMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_tambahSuplaiMouseReleased(evt);
            }
        });
        jPanel1.add(btn_tambahSuplai, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, 40));

        btn_ubahSuplai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/btn_ubah_suplai.png"))); // NOI18N
        btn_ubahSuplai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ubahSuplaiMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_ubahSuplaiMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_ubahSuplaiMouseReleased(evt);
            }
        });
        jPanel1.add(btn_ubahSuplai, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, -1, 40));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 960, 560));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/bg_dataSuplai.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 680));

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_hapusSuplaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusSuplaiMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_hapusSuplaiMouseClicked

    private void btn_hapusSuplaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusSuplaiMousePressed
        // TODO add your handling code here:
        ImageIcon clickHapus = new ImageIcon("src/Icon/btn_hapus_suplai_hover.png");
        btn_hapusSuplai.setIcon(clickHapus);
    }//GEN-LAST:event_btn_hapusSuplaiMousePressed

    private void btn_hapusSuplaiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusSuplaiMouseReleased
        // TODO add your handling code here:
        ImageIcon releaseHapus = new ImageIcon("src/Icon/btn_hapus_suplai.png");
        btn_hapusSuplai.setIcon(releaseHapus);
    }//GEN-LAST:event_btn_hapusSuplaiMouseReleased

    private void btn_tambahSuplaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahSuplaiMouseClicked
        // TODO add your handling code here:
        TambahSuplai tmb = new TambahSuplai();
        tmb.setVisible(true);
        
    }//GEN-LAST:event_btn_tambahSuplaiMouseClicked

    private void btn_tambahSuplaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahSuplaiMousePressed
        // TODO add your handling code here:
        ImageIcon clicktambah = new ImageIcon("src/Icon/btn_tambah_suplai_hover.png");
        btn_tambahSuplai.setIcon(clicktambah);
    }//GEN-LAST:event_btn_tambahSuplaiMousePressed

    private void btn_tambahSuplaiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahSuplaiMouseReleased
        // TODO add your handling code here:
        ImageIcon releasetambah = new ImageIcon("src/Icon/btn_tambah_suplai.png");
        btn_tambahSuplai.setIcon(releasetambah);
    }//GEN-LAST:event_btn_tambahSuplaiMouseReleased

    private void btn_ubahSuplaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ubahSuplaiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ubahSuplaiMouseClicked

    private void btn_ubahSuplaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ubahSuplaiMousePressed
        // TODO add your handling code here:
        ImageIcon clickUbah = new ImageIcon("src/Icon/btn_ubah_suplai_hover.png");
        btn_ubahSuplai.setIcon(clickUbah);
        
    }//GEN-LAST:event_btn_ubahSuplaiMousePressed

    private void btn_ubahSuplaiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ubahSuplaiMouseReleased
        // TODO add your handling code here:
        ImageIcon releaseUbah = new ImageIcon("src/Icon/btn_ubah_suplai.png");
        btn_ubahSuplai.setIcon(releaseUbah);
    }//GEN-LAST:event_btn_ubahSuplaiMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_hapusSuplai;
    private javax.swing.JLabel btn_tambahSuplai;
    private javax.swing.JLabel btn_ubahSuplai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel searchBox;
    // End of variables declaration//GEN-END:variables
}
