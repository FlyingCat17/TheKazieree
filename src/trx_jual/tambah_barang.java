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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import static trx_jual.trx_jual.jTable1;
import static trx_jual.trx_jual.total_harga;

/**
 *
 * @author Lutfi
 */
public class tambah_barang extends javax.swing.JInternalFrame {

    /**
     * Creates new form tambah_barang
     */
    public String id;
    public int subTotal;
    
    public tambah_barang() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI gui = (BasicInternalFrameUI) this.getUI();
        gui.setNorthPane(null);
        
        Dimension desktopSize = Dashboard2.dpane.getSize();
        Dimension jInternalFrameSize = this.getSize();
        this.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 2);
        search();
        load();
    }
    
    public void search() {
        if (id_barang.getText().equals("")) {
            nama_br.setText("");
            stok.setText("");
            jumlah_barang.setText("");
        } else {
            try {
                String sql = "SELECT tb_produk.id_produk, tb_produk.nama_produk, tb_stokbarang.stok_produk "
                        + "FROM tb_produk JOIN tb_stokbarang ON tb_produk.id_produk = tb_stokbarang.id_produk";
                java.sql.Connection conn = (Connection) konekdb.GetConnection();
                java.sql.Statement stm = conn.createStatement();
                java.sql.ResultSet res = stm.executeQuery(sql);
                while (res.next()) {
                    if (id_barang.getText().equals(res.getString(1))) {
                        nama_br.setText(res.getString(2));
                        stok.setText(res.getString(3));
                        jumlah_barang.setText("0");
                    } else if (id_barang.getText().isEmpty()) {
                        nama_br.setText("");
                        stok.setText("");
                        jumlah_barang.setText("");
                    } else {
                        nama_br.setText("");
                        stok.setText("");
                        jumlah_barang.setText("");
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
                nama_br.setText("");
                stok.setText("");
                jumlah_barang.setText("");
            }
        }
    }
    
    public void otomatis() {
        int idk = trx_jual.jTable1.getRowCount();
        if (idk > 0) {
            for (int i = 0; i < idk; i++) {
                String jumlah = (String) trx_jual.jTable1.getValueAt(i, 0);
                int auto_id = Integer.parseInt(jumlah.substring(jumlah.length()-3)) + 1;
                String no = String.valueOf(auto_id);
                int NomorJual = no.length();
                //MENGATUR jumlah 0
                for (int j = 0; j < 3 - NomorJual; j++) {
                    no = "0" + no;
                }
                id = no;
            }
        } else {
            id = "001";
        }
    }
    
    public void simpan() {
        otomatis();
        String nama;
        int harga, jml, ttl;
        String jumlah = jumlah_barang.getText();
        DateFormat hari = new SimpleDateFormat("yyyy-MM-dd");
        String a = hari.format(Calendar.getInstance().getTime());
        if (id_barang.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "id barang tidak boleh kosong!");
        } else if (jumlah.equals("0")) {
            JOptionPane.showMessageDialog(null, "jumlah barang tidak boleh 0!");
        } else if (jumlah_barang.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Jumlah barang harus di isi!");
        } else {
            try {
                String sql1 = "SELECT * FROM tb_produk WHERE id_produk = '" + id_barang.getText() + "'";
                
                java.sql.Connection con = (Connection) konekdb.GetConnection();
                java.sql.Statement st = con.createStatement();
                java.sql.ResultSet rs = st.executeQuery(sql1);
                if (rs.next()) {
                    nama = rs.getString("nama_produk");
                    harga = rs.getInt("harga_jual");
                    jml = Integer.parseInt(jumlah_barang.getText());
                    ttl = harga * jml;
                    
                    DefaultTableModel model = (DefaultTableModel) trx_jual.jTable1.getModel();
                    
                    Object [] row = {
                        id,
                        id_barang.getText(),
                        nama,
                        Integer.toString(harga),
                        Integer.toString(jml),
                        Integer.toString(ttl)
                    };
                    model.addRow(row);
                    this.dispose();
                }
            } catch (Exception e) {
            }
        }
        
    }
    
    public void load() {
        ActionListener taskPerformer = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    String sql = "SELECT tb_produk.id_produk, tb_produk.nama_produk, tb_stokbarang.stok_produk "
                            + "FROM tb_produk JOIN tb_stokbarang ON tb_produk.id_produk = tb_stokbarang.id_produk";
                    java.sql.Connection conn = (Connection) konekdb.GetConnection();
                    java.sql.Statement stm = conn.createStatement();
                    java.sql.ResultSet res = stm.executeQuery(sql);
                    while (res.next()) {
                        if (id_barang.getText().equals(res.getString(1))) {
                            nama_br.setText(res.getString(2));
                            stok.setText(res.getString(3));
                        }
                    }
                } catch (Exception e) {
                    nama_br.setText("");
                    stok.setText("");
                    jumlah_barang.setText("");
                }
            }
        };
        new Timer(1, taskPerformer).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nama_br = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jumlah_barang = new javax.swing.JTextField();
        stok = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id_barang.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        id_barang.setBorder(null);
        id_barang.setOpaque(false);
        id_barang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                id_barangKeyReleased(evt);
            }
        });
        getContentPane().add(id_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 370, 40));

        nama_br.setEditable(false);
        nama_br.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        nama_br.setBorder(null);
        nama_br.setOpaque(false);
        getContentPane().add(nama_br, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 370, 30));

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
        jumlah_barang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jumlah_barangKeyTyped(evt);
            }
        });
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
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trx_jual/tambah_brg.png"))); // NOI18N
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
            simpan();
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void id_barangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_barangKeyReleased
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_id_barangKeyReleased

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == MouseEvent.BUTTON1) {
            this.getDesktopPane().add(new pilih_barang()).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jumlah_barangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumlah_barangKeyTyped
        // TODO add your handling code here:
        char k = evt.getKeyChar();
        if (!(Character.isDigit(k) || k == KeyEvent.VK_BACK_SPACE || k == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jumlah_barangKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JTextField id_barang = new javax.swing.JTextField();
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jumlah_barang;
    private javax.swing.JTextField nama_br;
    private javax.swing.JTextField stok;
    // End of variables declaration//GEN-END:variables
}
