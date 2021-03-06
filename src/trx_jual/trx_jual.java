/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trx_jual;

import db.konekdb;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Lutfi
 */
public class trx_jual extends javax.swing.JInternalFrame {

    public int uk_jml, hrg_tbl, ttl_brs, tl_harga;
    public int subTotal;
    public String id;
    public String nomornya, idnya, namanya, harganya, jumlahnya, totalnya;
    
    public DefaultTableModel tabel = new DefaultTableModel();

    /**
     * Creates new form trx_jual
     */
    public trx_jual() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI gui = (BasicInternalFrameUI) this.getUI();
        gui.setNorthPane(null);
        jTable1.getTableHeader().setFont(new Font("Quicksand", Font.PLAIN, 17));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(254, 149, 46));
        jTable1.getTableHeader().setForeground(new Color(255, 255, 255));
        jTable1.setRowHeight(20);
        Tampil_Jam();
        otomatis();
//        DefaultTableModel model = new DefaultTableModel();
//        model.addColumn("Nama");
//        jTable1.setModel(model);
        gettabel();
    }

    public void otomatis() {  //Otomatis id transaksi, jika tanggal ganti kembali ke 1 lagi
        try {
            DateFormat vblnth = new SimpleDateFormat("yyyyMMdd");
            String blnth = vblnth.format(Calendar.getInstance().getTime());

            DateFormat hari = new SimpleDateFormat("yyyy-MM-dd");
            String a = hari.format(Calendar.getInstance().getTime());

            String sql = "SELECT MAX(right(id_transaksi,6)) AS Kode_Pinjam "
                    + "FROM tb_jual Where tgl_transaksi like '" + a + "';";
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
                    jLabel20.setText("TJ/" + blnth + "/" + no);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());

        }
    }

    public int countSubtotal() {
        subTotal = 0;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            subTotal = subTotal + Integer.parseInt(jTable1.getValueAt(i, 5).toString());
        }
        return subTotal;
    }

    public void refresh() {
        String n = Integer.toString(countSubtotal());
        total_harga.setText(n);
    }

    public void Tampil_Jam() {
        ActionListener taskPerformer = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                String nol_jam = "", nol_menit = "", nol_detik = "";

                java.util.Date dateTime = new java.util.Date();
                int nilai_jam = dateTime.getHours();
                int nilai_menit = dateTime.getMinutes();
                int nilai_detik = dateTime.getSeconds();

                if (nilai_jam <= 9) {
                    nol_jam = "0";
                }
                if (nilai_menit <= 9) {
                    nol_menit = "0";
                }
                if (nilai_detik <= 9) {
                    nol_detik = "0";
                }

                String jam = nol_jam + Integer.toString(nilai_jam);
                String menit = nol_menit + Integer.toString(nilai_menit);
                String detik = nol_detik + Integer.toString(nilai_detik);

                java.util.Date tglsekarang = new java.util.Date();
                SimpleDateFormat smpdtfmt = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                String tanggal = smpdtfmt.format(tglsekarang);

                jLabel19.setText(tanggal + " " + jam + ":" + menit + ":" + detik + "");

                int total = 0;
                for (int i = 0; i < jTable1.getRowCount(); i++) {
                    int amount = Integer.parseInt((String) jTable1.getValueAt(i, 5));
                    total += amount;
                }
                total_harga.setText("" + total);
            }
        };
        new Timer(1, taskPerformer).start();
    }
    
    public void gettabel() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("ID Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Harga");
        model.addColumn("Jumlah");
        model.addColumn("Total Harga");
        jTable1.setModel(model);
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
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        total_harga.setFont(new java.awt.Font("Quicksand", 0, 24)); // NOI18N
        total_harga.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        total_harga.setText("0");
        jPanel1.add(total_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 230, 50));

        jLabel10.setFont(new java.awt.Font("Quicksand", 0, 36)); // NOI18N
        jLabel10.setText("Rp");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, 50));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image2/ttl_hrg_trx_jual.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 330, 50));

        jLabel6.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        jLabel6.setText("Tanggal Transaksi");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        jLabel7.setText("ID Transaksi");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        jLabel19.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        jLabel19.setText("jLabel19");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        jLabel20.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        jLabel20.setText("jLabel20");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image2/bg_trx_jual.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 860, 195));

        jLabel4.setFont(new java.awt.Font("Quicksand", 1, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(247, 125, 6));
        jLabel4.setText("Transaksi Jual");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 450, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image2/garis_trx_jual.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, 20));

        jLabel12.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Tambah");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 130, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image2/butn_trx_jual.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jLabel16.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trx_jual/btn_ubah.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 140, 30));

        jLabel17.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Hapus");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 130, 30));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image2/butn_trx_jual.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, -1, -1));

        jLabel18.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Bayar >>");
        jLabel18.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 330, 130, 30));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image2/butn_trx_jual.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 330, -1, -1));

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 850, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == MouseEvent.BUTTON1) {
            this.getDesktopPane().add(new tambah_barang()).setVisible(true);
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == MouseEvent.BUTTON1) {
            int jumlah_baris = jTable1.getRowCount();
            if (jumlah_baris == 0) {
                JOptionPane.showMessageDialog(rootPane, "Table Masih Kosong!");
            } else {
                bayar_trx_jual n = new bayar_trx_jual();
                n.id_trx.setText(jLabel20.getText());
                n.sub_total.setText(total_harga.getText());
                getDesktopPane().add(n);
                n.setVisible(true);
            }

        }
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == MouseEvent.BUTTON1) {
            if (id == null) {
                JOptionPane.showMessageDialog(this, "Silahkan pilih baris pada tabel");
            } else {
//                this.getDesktopPane().add(new hps_trx_jual()).setVisible(true);
                hps_trx_jual hapusin = new hps_trx_jual();
                getDesktopPane().add(hapusin);
                hapusin.pack();
                hapusin.setVisible(true);
                hapusin.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            }
        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == MouseEvent.BUTTON1) {
            int jumlah_baris = jTable1.getRowCount();
            int pilih = jTable1.getSelectedRow();
            if (jumlah_baris == 0) {
                JOptionPane.showMessageDialog(rootPane, "Table Masih Kosong!");
            } else {
                ganti_tjual n = new ganti_tjual();
                n.nama_barang.setText(jTable1.getValueAt(pilih, 0).toString());
                n.stok.setText(jTable1.getValueAt(pilih, 1).toString());
                getDesktopPane().add(n);
                n.setVisible(true);
            }
            
            
//            if (!(id == null)) {
//                ubah_tjual ujual = new ubah_tjual();
//                ujual.nama_barang.setText(namanya);
//                ujual.jumlah_barang.setText(jumlahnya);
//                this.getDesktopPane().add(ujual).setVisible(true);
                
//            } else {
//                JOptionPane.showMessageDialog(this, "Silahkan pilih baris pada tabel");
//            }
        }
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        ganti_tjual ganti = new ganti_tjual();
        int index = jTable1.getSelectedRow();
        
        ganti.nama_barang.setText(jTable1.getValueAt(index, 2).toString());
        ganti.stok.setText(jTable1.getValueAt(index, 1).toString());
        ganti.jumlah.setText(jTable1.getValueAt(index, 4).toString());
        
        this.getDesktopPane().add(ganti);
        ganti.setVisible(true);
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    public static final javax.swing.JLabel jLabel20 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public static final javax.swing.JTable jTable1 = new javax.swing.JTable();
    public static final javax.swing.JLabel total_harga = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
}
