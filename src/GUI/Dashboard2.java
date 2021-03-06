/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import trx_jual.trx_jual;
import trxx_beli.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import trxx_beli.a_transbeli_utama;

/**
 *
 * @author LenataHoma
 */
public class Dashboard2 extends javax.swing.JFrame {

    int x, y;
    ImageIcon navbarClicked = new ImageIcon("src/GUI/navbar.png");
    ImageIcon resetNavbar = new ImageIcon("src/GUI/reset_navbar.png");
    ImageIcon resetBeranda = new ImageIcon("src/icon/btn_beranda_putih.png");
    ImageIcon resetBarang = new ImageIcon("src/icon/btn_barang_putih.png");
    ImageIcon resetTransjual = new ImageIcon("src/icon/btn_transjual_putih.png");
    ImageIcon resetTransbeli = new ImageIcon("src/icon/btn_transbeli_putih.png");
    ImageIcon resetSuplai = new ImageIcon("src/icon/btn_suplai_putih.png");
    ImageIcon resetLaporan = new ImageIcon("src/icon/btn_laporan_putih.png");
    ImageIcon resetRiwayat = new ImageIcon("src/Icon/btn_histori_putih.png");
    ImageIcon resetRetur = new ImageIcon("src/Icon/btn_retur_putih.png");

    /**
     * Creates new form Dashboard2
     */
    public Dashboard2() {
        initComponents();
        setLocationRelativeTo(null);
        dpane.add(new Berandaaa()).setVisible(true);
        ImageIcon berandaClicked = new ImageIcon("src/Icon/btn_beranda_hitam.png");
        icon_beranda.setIcon(berandaClicked);
        sethidden.setVisible(false);
        sethidden.setVisible(false);
        setview.setVisible(true);
        setview.setEnabled(true);
        //more button
        
//        btn_dataPengguna.setVisible(false);
//        btn_dataPengguna.setEnabled(false);
        
        
        txt_beranda.setForeground(new Color(46,43,43));
        navbar_beranda.setIcon(navbarClicked);
        
        //barang
        txt_dataBarang.setForeground(new Color(255,255,255));
        icon_barang.setIcon(resetBarang);
        navbar_barang.setIcon(resetNavbar);
        
        //transjual
        txt_transjual.setForeground(new Color(255,255,255));
        icon_transjual.setIcon(resetTransjual);
        navbar_tranjual.setIcon(resetNavbar);
        
        //tranbeli
        txt_transbeli.setForeground(new Color(255,255,255));
        icon_transbeli.setIcon(resetTransbeli);
        navbar_transbeli.setIcon(resetNavbar);
        
        //suplai
        txt_suplai.setForeground(new Color(255,255,255));
        icon_suplai.setIcon(resetSuplai);
        navbar_suplai.setIcon(resetNavbar);
        
        //retur
        txt_retur.setForeground(new Color(255,255,255));
        icon_retur.setIcon(resetRetur);
        navbar_retur.setIcon(resetNavbar);
        
        //laporan
        txt_laporan.setForeground(new Color(255,255,255));
        icon_laporan.setIcon(resetLaporan);
        navbar_laproran.setIcon(resetNavbar);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sethidden = new javax.swing.JLabel();
        setview = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();
        icon_beranda = new javax.swing.JLabel();
        txt_beranda = new javax.swing.JLabel();
        navbar_beranda = new javax.swing.JLabel();
        txt_dataBarang = new javax.swing.JLabel();
        icon_barang = new javax.swing.JLabel();
        navbar_barang = new javax.swing.JLabel();
        icon_transjual = new javax.swing.JLabel();
        txt_transjual = new javax.swing.JLabel();
        navbar_tranjual = new javax.swing.JLabel();
        txt_transbeli = new javax.swing.JLabel();
        icon_transbeli = new javax.swing.JLabel();
        navbar_transbeli = new javax.swing.JLabel();
        icon_suplai = new javax.swing.JLabel();
        txt_suplai = new javax.swing.JLabel();
        navbar_suplai = new javax.swing.JLabel();
        txt_retur = new javax.swing.JLabel();
        icon_retur = new javax.swing.JLabel();
        navbar_retur = new javax.swing.JLabel();
        txt_laporan = new javax.swing.JLabel();
        icon_laporan = new javax.swing.JLabel();
        navbar_laproran = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(54, 54, 54));
        setMinimumSize(new java.awt.Dimension(1240, 730));
        setUndecorated(true);
        setOpacity(0.0F);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sethidden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/MoreButton.png"))); // NOI18N
        sethidden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sethiddenMouseClicked(evt);
            }
        });
        getContentPane().add(sethidden, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 690, 50, 30));

        setview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/MoreButton.png"))); // NOI18N
        setview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setviewMouseClicked(evt);
            }
        });
        getContentPane().add(setview, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 690, 50, 30));

        sidebar.setBackground(new java.awt.Color(246, 122, 2));
        sidebar.setFocusTraversalPolicyProvider(true);
        sidebar.setFocusable(false);
        sidebar.setMinimumSize(new java.awt.Dimension(287, 707));
        sidebar.setPreferredSize(new java.awt.Dimension(287, 707));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon_beranda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/btn_beranda_putih.png"))); // NOI18N
        sidebar.add(icon_beranda, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 40, 60));

        txt_beranda.setBackground(new java.awt.Color(255, 255, 255));
        txt_beranda.setFont(new java.awt.Font("Quicksand Medium", 0, 17)); // NOI18N
        txt_beranda.setForeground(new java.awt.Color(255, 255, 255));
        txt_beranda.setText("Beranda");
        txt_beranda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_berandaMouseClicked(evt);
            }
        });
        sidebar.add(txt_beranda, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 180, 60));

        navbar_beranda.setMinimumSize(new java.awt.Dimension(280, 40));
        navbar_beranda.setPreferredSize(new java.awt.Dimension(280, 40));
        sidebar.add(navbar_beranda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 280, 60));

        txt_dataBarang.setBackground(new java.awt.Color(255, 255, 255));
        txt_dataBarang.setFont(new java.awt.Font("Quicksand Medium", 0, 17)); // NOI18N
        txt_dataBarang.setForeground(new java.awt.Color(255, 255, 255));
        txt_dataBarang.setText("Data Barang");
        txt_dataBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_dataBarangMouseClicked(evt);
            }
        });
        sidebar.add(txt_dataBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 180, 60));

        icon_barang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/btn_barang_putih.png"))); // NOI18N
        sidebar.add(icon_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 40, 60));

        navbar_barang.setMinimumSize(new java.awt.Dimension(280, 40));
        navbar_barang.setPreferredSize(new java.awt.Dimension(280, 40));
        sidebar.add(navbar_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 280, 60));

        icon_transjual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/btn_transjual_putih.png"))); // NOI18N
        sidebar.add(icon_transjual, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 40, 60));

        txt_transjual.setBackground(new java.awt.Color(255, 255, 255));
        txt_transjual.setFont(new java.awt.Font("Quicksand Medium", 0, 17)); // NOI18N
        txt_transjual.setForeground(new java.awt.Color(255, 255, 255));
        txt_transjual.setText("Transaksi Jual");
        txt_transjual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_transjualMouseClicked(evt);
            }
        });
        sidebar.add(txt_transjual, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 180, 60));

        navbar_tranjual.setMinimumSize(new java.awt.Dimension(280, 40));
        navbar_tranjual.setPreferredSize(new java.awt.Dimension(280, 40));
        sidebar.add(navbar_tranjual, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 280, 60));

        txt_transbeli.setBackground(new java.awt.Color(255, 255, 255));
        txt_transbeli.setFont(new java.awt.Font("Quicksand Medium", 0, 17)); // NOI18N
        txt_transbeli.setForeground(new java.awt.Color(255, 255, 255));
        txt_transbeli.setText("Transaksi Beli");
        txt_transbeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_transbeliMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_transbeliMouseEntered(evt);
            }
        });
        sidebar.add(txt_transbeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 190, 60));

        icon_transbeli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/btn_transbeli_putih.png"))); // NOI18N
        sidebar.add(icon_transbeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 40, 60));

        navbar_transbeli.setMinimumSize(new java.awt.Dimension(280, 40));
        navbar_transbeli.setPreferredSize(new java.awt.Dimension(280, 40));
        sidebar.add(navbar_transbeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 280, 60));

        icon_suplai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/btn_suplai_putih.png"))); // NOI18N
        sidebar.add(icon_suplai, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 40, 60));

        txt_suplai.setBackground(new java.awt.Color(255, 255, 255));
        txt_suplai.setFont(new java.awt.Font("Quicksand Medium", 0, 17)); // NOI18N
        txt_suplai.setForeground(new java.awt.Color(255, 255, 255));
        txt_suplai.setText("Data Pemasok");
        txt_suplai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_suplaiMouseClicked(evt);
            }
        });
        sidebar.add(txt_suplai, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 190, 60));

        navbar_suplai.setMinimumSize(new java.awt.Dimension(280, 40));
        navbar_suplai.setPreferredSize(new java.awt.Dimension(280, 40));
        sidebar.add(navbar_suplai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 280, 60));

        txt_retur.setBackground(new java.awt.Color(255, 255, 255));
        txt_retur.setFont(new java.awt.Font("Quicksand Medium", 0, 17)); // NOI18N
        txt_retur.setForeground(new java.awt.Color(255, 255, 255));
        txt_retur.setText("Retur");
        txt_retur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_returMouseClicked(evt);
            }
        });
        sidebar.add(txt_retur, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 190, 60));

        icon_retur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/btn_retur_putih.png"))); // NOI18N
        sidebar.add(icon_retur, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 40, 60));

        navbar_retur.setMinimumSize(new java.awt.Dimension(280, 40));
        navbar_retur.setPreferredSize(new java.awt.Dimension(280, 40));
        sidebar.add(navbar_retur, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 280, 60));

        txt_laporan.setBackground(new java.awt.Color(255, 255, 255));
        txt_laporan.setFont(new java.awt.Font("Quicksand Medium", 0, 17)); // NOI18N
        txt_laporan.setForeground(new java.awt.Color(255, 255, 255));
        txt_laporan.setText("Laporan");
        txt_laporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_laporanMouseClicked(evt);
            }
        });
        sidebar.add(txt_laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, 190, 60));

        icon_laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/btn_laporan_putih.png"))); // NOI18N
        sidebar.add(icon_laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 40, 60));

        navbar_laproran.setMinimumSize(new java.awt.Dimension(280, 40));
        navbar_laproran.setPreferredSize(new java.awt.Dimension(280, 40));
        sidebar.add(navbar_laproran, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 280, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/icon_sidebar.png"))); // NOI18N
        sidebar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 220, 110));

        getContentPane().add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 730));

        javax.swing.GroupLayout dpaneLayout = new javax.swing.GroupLayout(dpane);
        dpane.setLayout(dpaneLayout);
        dpaneLayout.setHorizontalGroup(
            dpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 962, Short.MAX_VALUE)
        );
        dpaneLayout.setVerticalGroup(
            dpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        getContentPane().add(dpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 962, 710));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_close_int.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, -1, -1));

        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 960, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for (double i = 0.0; i <= 1.0; i = i + 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                
            }
        }
        System.out.println("Window Aplikasi Terbuka");
    }//GEN-LAST:event_formWindowOpened

    private void txt_berandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_berandaMouseClicked
        // TODO add your handling code here:
        dpane.removeAll();
        Berandaaa home = new Berandaaa();
        dpane.add(home).setVisible(true);
        
        ImageIcon berandaClicked = new ImageIcon("src/Icon/btn_beranda_hitam.png");
        icon_beranda.setIcon(berandaClicked);
        txt_beranda.setForeground(new Color(46,43,43));
        navbar_beranda.setIcon(navbarClicked);
        
        //barang
        txt_dataBarang.setForeground(new Color(255,255,255));
        icon_barang.setIcon(resetBarang);
        navbar_barang.setIcon(resetNavbar);
        
        //transjual
        txt_transjual.setForeground(new Color(255,255,255));
        icon_transjual.setIcon(resetTransjual);
        navbar_tranjual.setIcon(resetNavbar);
        
        //tranbeli
        txt_transbeli.setForeground(new Color(255,255,255));
        icon_transbeli.setIcon(resetTransbeli);
        navbar_transbeli.setIcon(resetNavbar);
        
        //suplai
        txt_suplai.setForeground(new Color(255,255,255));
        icon_suplai.setIcon(resetSuplai);
        navbar_suplai.setIcon(resetNavbar);
        
        //retur
        txt_retur.setForeground(new Color(255,255,255));
        icon_retur.setIcon(resetRetur);
        navbar_retur.setIcon(resetNavbar);
        
        //laporan
        txt_laporan.setForeground(new Color(255,255,255));
        icon_laporan.setIcon(resetLaporan);
        navbar_laproran.setIcon(resetNavbar);
    }//GEN-LAST:event_txt_berandaMouseClicked

    private void txt_dataBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_dataBarangMouseClicked
        // TODO add your handling code here:
        dpane.removeAll();
        data_barang_1 brg = new data_barang_1();
        dpane.add(brg).setVisible(true);
        ImageIcon barangClicked = new ImageIcon("src/Icon/btn_barang_hitam.png");
        icon_barang.setIcon(barangClicked);
        txt_dataBarang.setForeground(new Color(46,43,43));
        navbar_barang.setIcon(navbarClicked);
        
        //beranda
        txt_beranda.setForeground(new Color(255,255,255));
        icon_beranda.setIcon(resetBeranda);
        navbar_beranda.setIcon(resetNavbar);
        
        //transjual
        txt_transjual.setForeground(new Color(255,255,255));
        icon_transjual.setIcon(resetTransjual);
        navbar_tranjual.setIcon(resetNavbar);
        
        //tranbeli
        txt_transbeli.setForeground(new Color(255,255,255));
        icon_transbeli.setIcon(resetTransbeli);
        navbar_transbeli.setIcon(resetNavbar);
        
        //suplai
        txt_suplai.setForeground(new Color(255,255,255));
        icon_suplai.setIcon(resetSuplai);
        navbar_suplai.setIcon(resetNavbar);
        
        //riwayat
        txt_retur.setForeground(new Color(255,255,255));
        icon_retur.setIcon(resetRetur);
        navbar_retur.setIcon(resetNavbar);
        
        //laporan
        txt_laporan.setForeground(new Color(255,255,255));
        icon_laporan.setIcon(resetLaporan);
        navbar_laproran.setIcon(resetNavbar);
    }//GEN-LAST:event_txt_dataBarangMouseClicked

    private void txt_transjualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_transjualMouseClicked
        // TODO add your handling code here:
        ImageIcon transjualClicked = new ImageIcon("src/Icon/btn_transjual_hitam.png");
        icon_transjual.setIcon(transjualClicked);
        txt_transjual.setForeground(new Color(46,43,43));
        navbar_tranjual.setIcon(navbarClicked);
        
        //beranda
        txt_beranda.setForeground(new Color(255,255,255));
        icon_beranda.setIcon(resetBeranda);
        navbar_beranda.setIcon(resetNavbar);
        
        //barang
        txt_dataBarang.setForeground(new Color(255,255,255));
        icon_barang.setIcon(resetBarang);
        navbar_barang.setIcon(resetNavbar);
        
        //tranbeli
        txt_transbeli.setForeground(new Color(255,255,255));
        icon_transbeli.setIcon(resetTransbeli);
        navbar_transbeli.setIcon(resetNavbar);
        
        //suplai
        txt_suplai.setForeground(new Color(255,255,255));
        icon_suplai.setIcon(resetSuplai);
        navbar_suplai.setIcon(resetNavbar);
        
        //retur
        txt_retur.setForeground(new Color(255,255,255));
        icon_retur.setIcon(resetRetur);
        navbar_retur.setIcon(resetNavbar);
        
        //laporan
        txt_laporan.setForeground(new Color(255,255,255));
        icon_laporan.setIcon(resetLaporan);
        navbar_laproran.setIcon(resetNavbar);
        if (evt.getButton() == MouseEvent.BUTTON1) {
            dpane.add(new trx_jual()).setVisible(true);
        }
    }//GEN-LAST:event_txt_transjualMouseClicked

    private void txt_transbeliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_transbeliMouseClicked
        // TODO add your handling code here:
        dpane.removeAll();
        a_transbeli_utama beli = new  a_transbeli_utama();
        dpane.add(beli).setVisible(true);
        ImageIcon transbeliClicked = new ImageIcon("src/Icon/btn_transbeli_hitam.png");
        icon_transbeli.setIcon(transbeliClicked);
        txt_transbeli.setForeground(new Color(46,43,43));
        navbar_transbeli.setIcon(navbarClicked);
        
        //beranda
        txt_beranda.setForeground(new Color(255,255,255));
        icon_beranda.setIcon(resetBeranda);
        navbar_beranda.setIcon(resetNavbar);
        
        //barang
        txt_dataBarang.setForeground(new Color(255,255,255));
        icon_barang.setIcon(resetBarang);
        navbar_barang.setIcon(resetNavbar);
        
        //transjual
        txt_transjual.setForeground(new Color(255,255,255));
        icon_transjual.setIcon(resetTransjual);
        navbar_tranjual.setIcon(resetNavbar);
        
        //suplai
        txt_suplai.setForeground(new Color(255,255,255));
        icon_suplai.setIcon(resetSuplai);
        navbar_suplai.setIcon(resetNavbar);
        
        //retur
        txt_retur.setForeground(new Color(255,255,255));
        icon_retur.setIcon(resetRetur);
        navbar_retur.setIcon(resetNavbar);
        
        //laporan
        txt_laporan.setForeground(new Color(255,255,255));
        icon_laporan.setIcon(resetLaporan);
        navbar_laproran.setIcon(resetNavbar);
    }//GEN-LAST:event_txt_transbeliMouseClicked

    private void txt_suplaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_suplaiMouseClicked
        // TODO add your handling code here:
//        ImageIcon suplaiIcon = new ImageIcon("src/Icon/btn_suplai_hitam.png");
//        icon_suplai.setIcon(suplaiIcon);
        dpane.removeAll();
        data_suplai1 sup = new data_suplai1();
        dpane.add(sup).setVisible(true);
        ImageIcon suplaiClicked = new ImageIcon("src/Icon/btn_suplai_hitam.png");
        icon_suplai.setIcon(suplaiClicked);
        txt_suplai.setForeground(new Color(46,43,43));
        navbar_suplai.setIcon(navbarClicked);
//        

        navbar_suplai.setIcon(navbarClicked);

        //beranda
        txt_beranda.setForeground(new Color(255,255,255));
        icon_beranda.setIcon(resetBeranda);
        navbar_beranda.setIcon(resetNavbar);
        
        //barang
        txt_dataBarang.setForeground(new Color(255,255,255));
        icon_barang.setIcon(resetBarang);
        navbar_barang.setIcon(resetNavbar);
        
        //transjual
        txt_transjual.setForeground(new Color(255,255,255));
        icon_transjual.setIcon(resetTransjual);
        navbar_tranjual.setIcon(resetNavbar);
        
        //tranbeli
        txt_transbeli.setForeground(new Color(255,255,255));
        icon_transbeli.setIcon(resetTransbeli);
        navbar_transbeli.setIcon(resetNavbar);
        
        //retur
        txt_retur.setForeground(new Color(255,255,255));
        icon_retur.setIcon(resetRetur);
        navbar_retur.setIcon(resetNavbar);
        
        //laporan
        txt_laporan.setForeground(new Color(255,255,255));
        icon_laporan.setIcon(resetLaporan);
        navbar_laproran.setIcon(resetNavbar);
    }//GEN-LAST:event_txt_suplaiMouseClicked

    private void txt_returMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_returMouseClicked
        // TODO add your handling code here:
        ImageIcon riwayatClicked = new ImageIcon("src/Icon/btn_retur_hitam.png");
        icon_retur.setIcon(riwayatClicked);
        txt_retur.setForeground(new Color(46,43,43));
        navbar_retur.setIcon(navbarClicked);
        
        //beranda
        txt_beranda.setForeground(new Color(255,255,255));
        icon_beranda.setIcon(resetBeranda);
        navbar_beranda.setIcon(resetNavbar);
        
        //barang
        txt_dataBarang.setForeground(new Color(255,255,255));
        icon_barang.setIcon(resetBarang);
        navbar_barang.setIcon(resetNavbar);
        
        //transjual
        txt_transjual.setForeground(new Color(255,255,255));
        icon_transjual.setIcon(resetTransjual);
        navbar_tranjual.setIcon(resetNavbar);
        
        //tranbeli
        txt_transbeli.setForeground(new Color(255,255,255));
        icon_transbeli.setIcon(resetTransbeli);
        navbar_transbeli.setIcon(resetNavbar);
        
        //suplai
        txt_suplai.setForeground(new Color(255,255,255));
        icon_suplai.setIcon(resetSuplai);
        navbar_suplai.setIcon(resetNavbar);
        
        //laporan
        txt_laporan.setForeground(new Color(255,255,255));
        icon_laporan.setIcon(resetLaporan);
        navbar_laproran.setIcon(resetNavbar);
    }//GEN-LAST:event_txt_returMouseClicked

    private void txt_laporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_laporanMouseClicked
        // TODO add your handling code here:
        dpane.removeAll();
        laporan lapor = new laporan();
        dpane.add(lapor).setVisible(true);
        ImageIcon laporanCliked = new ImageIcon("src/Icon/btn_laporan_hitam.png");
        icon_laporan.setIcon(laporanCliked);
        txt_laporan.setForeground(new Color(46,43,43));
        navbar_laproran.setIcon(navbarClicked);
        
        //beranda
        txt_beranda.setForeground(new Color(255,255,255));
        icon_beranda.setIcon(resetBeranda);
        navbar_beranda.setIcon(resetNavbar);
        
        //barang
        txt_dataBarang.setForeground(new Color(255,255,255));
        icon_barang.setIcon(resetBarang);
        navbar_barang.setIcon(resetNavbar);
        
        //transjual
        txt_transjual.setForeground(new Color(255,255,255));
        icon_transjual.setIcon(resetTransjual);
        navbar_tranjual.setIcon(resetNavbar);
        
        //tranbeli
        txt_transbeli.setForeground(new Color(255,255,255));
        icon_transbeli.setIcon(resetTransbeli);
        navbar_transbeli.setIcon(resetNavbar);
        
        //suplai
        txt_suplai.setForeground(new Color(255,255,255));
        icon_suplai.setIcon(resetSuplai);
        navbar_suplai.setIcon(resetNavbar);
        
        //retur
        txt_retur.setForeground(new Color(255,255,255));
        icon_retur.setIcon(resetRetur);
        navbar_retur.setIcon(resetNavbar);
    }//GEN-LAST:event_txt_laporanMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == MouseEvent.BUTTON1) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void setviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setviewMouseClicked
        dpane.removeAll();
        morePanel more = new morePanel();
        dpane.add(more).setVisible(true);
        
        
    }//GEN-LAST:event_setviewMouseClicked

    private void sethiddenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sethiddenMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sethiddenMouseClicked

    private void txt_transbeliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_transbeliMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_transbeliMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JDesktopPane dpane = new javax.swing.JDesktopPane();
    private javax.swing.JLabel icon_barang;
    private javax.swing.JLabel icon_beranda;
    private javax.swing.JLabel icon_laporan;
    private javax.swing.JLabel icon_retur;
    private javax.swing.JLabel icon_suplai;
    private javax.swing.JLabel icon_transbeli;
    private javax.swing.JLabel icon_transjual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel navbar_barang;
    private javax.swing.JLabel navbar_beranda;
    private javax.swing.JLabel navbar_laproran;
    private javax.swing.JLabel navbar_retur;
    private javax.swing.JLabel navbar_suplai;
    private javax.swing.JLabel navbar_tranjual;
    private javax.swing.JLabel navbar_transbeli;
    private javax.swing.JLabel sethidden;
    private javax.swing.JLabel setview;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel txt_beranda;
    private javax.swing.JLabel txt_dataBarang;
    private javax.swing.JLabel txt_laporan;
    private javax.swing.JLabel txt_retur;
    private javax.swing.JLabel txt_suplai;
    private javax.swing.JLabel txt_transbeli;
    private javax.swing.JLabel txt_transjual;
    // End of variables declaration//GEN-END:variables
}
