/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trxx_beli;

import db.konekdb;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.Timer;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class a_transbeli_utama extends javax.swing.JInternalFrame {

    /**
     * Creates new form transbeli
     */
    public a_transbeli_utama() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI gui = (BasicInternalFrameUI) this.getUI();
        gui.setNorthPane(null);
        id_trans();
        set_tanggal();
        isi_tabel();
        jTable1.getTableHeader().setFont(new Font("Quicksand", Font.PLAIN, 17));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(254, 149, 46));
        jTable1.getTableHeader().setForeground(new Color(255, 255, 255));
        jTable1.setRowHeight(20);
    }
    
    public void id_trans() {
        try {
            DateFormat tanggals = new SimpleDateFormat("yyyyMMdd");
            String bulan_tahun = tanggals.format(Calendar.getInstance().getTime());
            
            DateFormat haris = new SimpleDateFormat("yyyy-MM-dd");
            String hr = haris.format(Calendar.getInstance().getTime());
            
            String sql = "SELECT MAX(right(id_transbeli,6)) AS ambil_id "
                    + "FROM tb_transbeli Where tgl_transaksi like '" + hr + "';";
            java.sql.Connection con = (java.sql.Connection) konekdb.GetConnection();
            java.sql.Statement pst = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            java.sql.ResultSet rs = pst.executeQuery(sql);
            while (rs.next()) {
                if (rs.last()) {
                    int auto_id = rs.getInt(1) + 1;
                    String no = String.valueOf(auto_id);
                    int NomorJual = no.length();
                    //MENGATUR jumlah 0
                    for (int j = 0; j < 6 - NomorJual; j++) {
                        no = "0" + no;
                    }
                    jLabel4.setText("TB/" + bulan_tahun + "/" + no);
                }
            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
        
    }
    
    public void set_tanggal() {
        ActionListener taskPerformer = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String zero_jam = "", zero_menit = "", zero_detik = "";
                
                java.util.Date tanggalss = new java.util.Date();
                int point_jam = tanggalss.getHours();
                int point_menit = tanggalss.getMinutes();
                int point_detik = tanggalss.getSeconds();
                
                if (point_jam <= 9) {
                    zero_jam = "0";
                }
                if (point_menit <= 9) {
                    zero_menit = "0";
                    
                }
                if (point_detik <= 9) {
                    zero_detik = "0";
                }
                String ejam = zero_jam + Integer.toString(point_jam);
                String emenenit = zero_menit + Integer.toString(point_menit);
                String edetik = zero_detik + Integer.toString(point_detik);
                
                java.util.Date nowDate = new java.util.Date();
                SimpleDateFormat formatTgl = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                String tanggalString = formatTgl.format(nowDate);
                
                jLabel5.setText(tanggalString + " " + ejam + ":" + emenenit + ":" + edetik + ":");
            }
        };
        new Timer(1, taskPerformer).start();
        
    }
    public void isi_tabel(){
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID Barang");
        tableModel.addColumn("Nama Barang");
        tableModel.addColumn("Harga Jual");
        tableModel.addColumn("Jumlah");
        tableModel.addColumn("Total Harga");
        try {
            String sql = "SELECT * FROM `temp_trx_beli`";
            java.sql.Connection con = (java.sql.Connection) konekdb.GetConnection();
            java.sql.Statement pst = con.createStatement();
            java.sql.ResultSet rs = pst.executeQuery(sql);
            while (rs.next()) {
                tableModel.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(7)
                });
            }
            jTable1.setModel(tableModel);
            
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

        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_tambah = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JLabel();
        btn_hapus = new javax.swing.JLabel();
        btn_ubah = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panel_atas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bg_bayar = new javax.swing.JLabel();
        bg_hapuis = new javax.swing.JLabel();
        bg_ubah = new javax.swing.JLabel();
        bg_btn_tambah = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(962, 710));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        jButton1.setText("Pilih Supplier");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Quicksand Medium", 0, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Rp 300,000");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 255, 250, 50));

        jLabel7.setFont(new java.awt.Font("Quicksand Medium", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Total");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, 100, -1));

        jLabel6.setFont(new java.awt.Font("Quicksand Medium", 0, 17)); // NOI18N
        jLabel6.setText("-");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Quicksand Medium", 0, 17)); // NOI18N
        jLabel4.setText("-");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Quicksand Medium", 0, 17)); // NOI18N
        jLabel5.setText("-");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        btn_tambah.setFont(new java.awt.Font("Quicksand Medium", 0, 17)); // NOI18N
        btn_tambah.setForeground(new java.awt.Color(255, 255, 255));
        btn_tambah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_tambah.setText("Tambah");
        btn_tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tambahMouseClicked(evt);
            }
        });
        getContentPane().add(btn_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 350, 120, -1));

        btn_simpan.setFont(new java.awt.Font("Quicksand Medium", 0, 17)); // NOI18N
        btn_simpan.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_simpan.setText("Simpan");
        btn_simpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_simpanMouseClicked(evt);
            }
        });
        getContentPane().add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 345, 130, 30));

        btn_hapus.setFont(new java.awt.Font("Quicksand Medium", 0, 17)); // NOI18N
        btn_hapus.setForeground(new java.awt.Color(255, 255, 255));
        btn_hapus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_hapus.setText("Hapus");
        getContentPane().add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 345, 130, 30));

        btn_ubah.setFont(new java.awt.Font("Quicksand Medium", 0, 17)); // NOI18N
        btn_ubah.setForeground(new java.awt.Color(255, 255, 255));
        btn_ubah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_ubah.setText("Ubah");
        btn_ubah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ubahMouseClicked(evt);
            }
        });
        getContentPane().add(btn_ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 346, 130, 30));

        jLabel2.setFont(new java.awt.Font("Quicksand Medium", 0, 17)); // NOI18N
        jLabel2.setText("Supplier");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Quicksand Medium", 0, 17)); // NOI18N
        jLabel3.setText("ID Transaksi");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel1.setFont(new java.awt.Font("Quicksand Medium", 0, 17)); // NOI18N
        jLabel1.setText("Tanggal Trasnsaksi");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        panel_atas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel_atas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trxx_beli/gmbr_panel_atas.png"))); // NOI18N
        getContentPane().add(panel_atas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 860, 170));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 860, 260));

        bg_bayar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg_bayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trxx_beli/gmbr_button_bayar.png"))); // NOI18N
        getContentPane().add(bg_bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(778, 340, 130, 40));

        bg_hapuis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg_hapuis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trxx_beli/gmbr_button_hapus.png"))); // NOI18N
        getContentPane().add(bg_hapuis, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 340, 130, 40));

        bg_ubah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg_ubah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trxx_beli/gmbr_button_ubah.png"))); // NOI18N
        getContentPane().add(bg_ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 130, 40));

        bg_btn_tambah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg_btn_tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trxx_beli/gmbr_buton_tambah.png"))); // NOI18N
        getContentPane().add(bg_btn_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 340, 130, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trxx_beli/gmbr_transbelix.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMouseClicked
        
        b_tamb_panel tamb = new b_tamb_panel();
        if (evt.getButton() == MouseEvent.BUTTON1) {
            tamb.setVisible(true);
//            btn_tambah.setVisible(false);
//            bg_btn_tambah.setVisible(false);
//            
//        }else if (tamb.isVisible()){
//         btn_tambah.setVisible(true);
//         bg_btn_tambah.setVisible(true);
        }
    }//GEN-LAST:event_btn_tambahMouseClicked

    private void btn_ubahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ubahMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            new c_ubh_panel().setVisible(true);
        }
    }//GEN-LAST:event_btn_ubahMouseClicked

    private void btn_simpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpanMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            new d_simp_beli().setVisible(true);
        }
    }//GEN-LAST:event_btn_simpanMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel bg_bayar;
    private javax.swing.JLabel bg_btn_tambah;
    private javax.swing.JLabel bg_hapuis;
    private javax.swing.JLabel bg_ubah;
    private javax.swing.JLabel btn_hapus;
    private javax.swing.JLabel btn_simpan;
    private javax.swing.JLabel btn_tambah;
    private javax.swing.JLabel btn_ubah;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static final javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel panel_atas;
    // End of variables declaration//GEN-END:variables
}
