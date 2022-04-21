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
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Lutfi
 */
public class data_suplai extends javax.swing.JInternalFrame {

    konekdb conn = new konekdb();

    /**
     * Creates new form data_suplai
     */
    public data_suplai() {
        konekdb conn = new konekdb();
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI gui = (BasicInternalFrameUI)this.getUI();
        gui.setNorthPane(null);
        loadTable();
        
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
        txt_nama_suplier.setText("");
        txt_nama_usaha.setText("");
        txt_alamat_suplier.setText("");
        txt_no_telp.setText("");
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
                jtable.setModel(tab);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        idsuplier = new javax.swing.JTextField();
        txt_nama_suplier = new javax.swing.JTextField();
        txt_nama_usaha = new javax.swing.JTextField();
        txt_alamat_suplier = new javax.swing.JTextField();
        txt_no_telp = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        cari = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        btn_kembali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(969, 859));
        jPanel1.setPreferredSize(new java.awt.Dimension(969, 859));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_close_int.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1239, 0, 35, 26));

        jLabel2.setFont(new java.awt.Font("Quicksand SemiBold", 1, 17)); // NOI18N
        jLabel2.setText("_");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1224, 3, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("ID SUPLIER");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 119, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("NAMA SUPLIER");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 159, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("NAMA USAHA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 135, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("ALAMAT SUPLIER");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("NO TELEPON");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 159, -1));

        idsuplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idsuplierActionPerformed(evt);
            }
        });
        jPanel1.add(idsuplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 235, 31));
        jPanel1.add(txt_nama_suplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 235, 30));

        txt_nama_usaha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nama_usahaActionPerformed(evt);
            }
        });
        jPanel1.add(txt_nama_usaha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 235, 30));

        txt_alamat_suplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_alamat_suplierActionPerformed(evt);
            }
        });
        jPanel1.add(txt_alamat_suplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 235, 28));
        jPanel1.add(txt_no_telp, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 235, 28));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 168, 35));

        cari.setForeground(new java.awt.Color(255, 255, 255));
        cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/bx_search.png"))); // NOI18N
        cari.setBorder(null);
        cari.setContentAreaFilled(false);
        cari.setFocusPainted(false);
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        jPanel1.add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 50, 40));

        btn_hapus.setForeground(new java.awt.Color(255, 255, 255));
        btn_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/Group 26.png"))); // NOI18N
        btn_hapus.setBorderPainted(false);
        btn_hapus.setContentAreaFilled(false);
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        jPanel1.add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 139, -1));

        btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/Group_27-removebg-preview.png"))); // NOI18N
        btn_edit.setBorderPainted(false);
        btn_edit.setContentAreaFilled(false);
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel1.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 150, -1));

        btn_simpan.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/Group 25.png"))); // NOI18N
        btn_simpan.setBorderPainted(false);
        btn_simpan.setContentAreaFilled(false);
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        jPanel1.add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 130, -1));

        btn_batal.setForeground(new java.awt.Color(255, 255, 255));
        btn_batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/Group 24.png"))); // NOI18N
        btn_batal.setBorderPainted(false);
        btn_batal.setContentAreaFilled(false);
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });
        jPanel1.add(btn_batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 130, -1));

        btn_kembali.setForeground(new java.awt.Color(255, 255, 255));
        btn_kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/Group 28.png"))); // NOI18N
        btn_kembali.setBorderPainted(false);
        btn_kembali.setContentAreaFilled(false);
        btn_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembaliActionPerformed(evt);
            }
        });
        jPanel1.add(btn_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 140, -1));

        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", ""
            }
        ));
        jScrollPane1.setViewportView(jtable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 780, 70));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/Data Suplai (1).png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 380, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 820, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == MouseEvent.BUTTON1) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void idsuplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idsuplierActionPerformed

    }//GEN-LAST:event_idsuplierActionPerformed

    private void txt_nama_usahaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nama_usahaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nama_usahaActionPerformed

    private void txt_alamat_suplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_alamat_suplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_alamat_suplierActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed

//        DefaultTableModel tabel = new DefaultTableModel();
//
//        tabel.addColumn("id_supplier ");
//        tabel.addColumn("Nama_suplier");
//        tabel.addColumn("Nama_usaha");
//        tabel.addColumn("alamat");
//        tabel.addColumn("no_telp");
//
//        try {
//            Connection conn = (Connection) konekdb.GetConnection();
//            String sql = "Select * from id_suplier";
//            Statement stat = conn.createStatement();
//            ResultSet rs = stat.executeQuery(sql);
//            while (rs.next()) {
//                tabel.addRow(new Object[]{
//                    rs.getString(1),
//                    rs.getString(2),
//                    rs.getString(3),
//                    rs.getString(4),
//                    rs.getString(5),});
//            }
//            jtable.setModel(tabel);
//
//        } catch (Exception e) {
//            System.out.println("Cari Data Error");
//        } finally {
//        }
    }//GEN-LAST:event_cariActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
//        int i = jtable.getSelectedRow();
//        if (i == -1) {
//            return;
//        }
//
//        String id = (String) model.getValueAt(i, 0);
//
//        int pernyataan = JOptionPane.showConfirmDialog(null, "Yakin Data Akan Dihapus", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
//        if (pernyataan == JOptionPane.OK_OPTION) {
//            try {
//                Connection conn = (Connection) konekdb.GetConnection();
//                String sql = "Select * from id_suplier";
//                PreparedStatement p = conn.prepareStatement(sql);
//                p.setString(1, id);
//                p.executeUpdate();
//                p.close();
//                JOptionPane.showMessageDialog(null, "Data Terhapus");
//            } catch (Exception e) {
//                System.out.println("Terjadi Kesalahan");
//            } finally {
//                btn_simpan.setEnabled(true);
//                btn_batal.setEnabled(false);
//                btn_hapus.setEnabled(false);
//                btn_edit.setEnabled(false);
//
//            }
//        }
//        if (pernyataan == JOptionPane.CANCEL_OPTION) {
//
//        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        int i = jtable.getSelectedRow();
//        if (i == -1) {
//            return;
//        }
//        String id = (String) model.getValueAt(i, 0);
//        String nama = txt_nama_suplier.getText();
//        String nama_usaha = txt_nama_usaha.getText();
//        String alamat = txt_alamat_suplier.getText();
//        String no_telp = txt_no_telp.getText();
//
//        try {
//            Connection k;
//            Connection conn = (Connection) konekdb.GetConnection();
//            String sql = "insert into tb_supplier values(?,?,?,?,?)";
//            PreparedStatement o = conn.prepareStatement(sql);
//            o.setString(1, id);
//            o.setString(2, nama);
//            o.setString(3, nama_usaha);
//            o.setString(1, alamat);
//            o.setString(1, no_telp);
//            o.executeUpdate();
//            o.close();
//            JOptionPane.showMessageDialog(null, "Data Tersimpan");
//
//        } catch (Exception e) {
//            System.out.println("gagal");
//        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        String id = idsuplier.getText();
        String nama = txt_nama_suplier.getText();
        String nama_usaha = txt_nama_usaha.getText();
        String alamat = txt_alamat_suplier.getText();
        String no_telp = txt_no_telp.getText();

        try {
            Connection k;
            Connection conn = (Connection) konekdb.GetConnection();
            String sql = "insert into tb_supplier values(?,?,?,?,?)";
            PreparedStatement o = conn.prepareStatement(sql);
            o.setString(1, id);
            o.setString(2, nama);
            o.setString(3, nama_usaha);
            o.setString(1, alamat);
            o.setString(1, no_telp);
            o.executeUpdate();
            o.close();
            JOptionPane.showMessageDialog(null, "Data Tersimpan");

        } catch (Exception e) {
            System.out.println("gagal");
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        // TODO add your handling code here:
//        clear();
////        loadData();
//        btn_simpan.setEnabled(true);
//        btn_edit.setEnabled(false);
//        btn_hapus.setEnabled(false);
//        btn_batal.setEnabled(false);
//        autonumber();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembaliActionPerformed
//        setVisible(false);
//        Dashboard2 mm = new Dashboard2();
//        mm.setVisible(true);
    }//GEN-LAST:event_btn_kembaliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton cari;
    private javax.swing.JTextField idsuplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable jtable;
    private javax.swing.JTextField txt_alamat_suplier;
    private javax.swing.JTextField txt_nama_suplier;
    private javax.swing.JTextField txt_nama_usaha;
    private javax.swing.JTextField txt_no_telp;
    // End of variables declaration//GEN-END:variables
}
