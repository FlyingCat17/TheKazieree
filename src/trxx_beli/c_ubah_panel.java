/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trxx_beli;

/**
 *
 * @author LENOVO
 */
public class c_ubah_panel extends javax.swing.JPanel {

    /**
     * Creates new form b_ubah_panel
     */
    public c_ubah_panel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBorder(null);
        jTextField1.setOpaque(false);
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 350, 40));

        jTextField2.setBorder(null);
        jTextField2.setOpaque(false);
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 350, 40));

        jLabel4.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Simpan");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 130, 40));

        jLabel1.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hapus");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 130, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trxx_beli/gmbr_button_bayar.png"))); // NOI18N
        jLabel3.setText("jLabel2");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 130, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trxx_beli/gmbr_button_hapus.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 130, 40));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trxx_beli/gmbr_ubahBeliStok.png"))); // NOI18N
        add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 340));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
