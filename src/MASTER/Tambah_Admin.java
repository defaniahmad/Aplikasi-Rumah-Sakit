/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MASTER;

import com.mysql.jdbc.Statement;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author DEFANI AHMAD RAMADHAN/180101054
 */
public class Tambah_Admin extends javax.swing.JDialog {
    private final DefaultTableModel tabel;
    Boolean fungsi_simpan=false, fungsi_ubah=false;
    public Statement stt;
    public Connection con;
    private TableColumn column;

    /**
     * Creates new form Form_1_Pengguna
     */
    public Tambah_Admin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        String[] judul={"ID Admin","Nama Admin","Username","No Telepon","Alamat"};
        tabel = new DefaultTableModel(judul,0);
        jTable1.setModel(tabel);
        tampil();
        aturKolom();
        aturFokus();
        hitungData();
        ImageIcon ico = new ImageIcon("src/gambar/icon2_original.png");
        setIconImage(ico.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tf_username = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_id_pengguna = new javax.swing.JTextField();
        tf_nama_pengguna = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cari = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        tf_password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        pencarian = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jumlah_data = new javax.swing.JLabel();
        batal = new javax.swing.JButton();
        tf_no_telp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_alamat = new javax.swing.JTextArea();
        keluar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Master Pengguna");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Alamat");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 104, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText(":");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 104, -1, -1));

        tf_username.setEditable(false);
        tf_username.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_username.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        tf_username.setMargin(new java.awt.Insets(0, 3, 0, 3));
        tf_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_usernameKeyTyped(evt);
            }
        });
        getContentPane().add(tf_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 170, 250, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("No Telepon");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 248, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText(":");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 248, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icon2.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 11, 70, 64));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nama Admin");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 142, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Username");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 177, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText(":");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 177, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText(":");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 142, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText(":");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 104, -1, -1));

        tf_id_pengguna.setEditable(false);
        tf_id_pengguna.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_id_pengguna.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        tf_id_pengguna.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tf_id_pengguna.setMargin(new java.awt.Insets(0, 3, 0, 3));
        getContentPane().add(tf_id_pengguna, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 98, 80, 30));

        tf_nama_pengguna.setEditable(false);
        tf_nama_pengguna.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_nama_pengguna.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        tf_nama_pengguna.setMargin(new java.awt.Insets(0, 3, 0, 3));
        tf_nama_pengguna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_nama_penggunaKeyTyped(evt);
            }
        });
        getContentPane().add(tf_nama_pengguna, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 134, 250, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText(":");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 213, -1, -1));

        jScrollPane2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(17);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 327, 1021, 192));

        cari.setText("Cari");
        cari.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        getContentPane().add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 284, 87, 37));

        tambah.setText("Tambah");
        tambah.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tambah.setBorderPainted(false);
        tambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tambah.setIconTextGap(2);
        tambah.setMargin(new java.awt.Insets(2, 0, 2, 0));
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        getContentPane().add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 286, 87, 37));

        simpan.setText("Simpan");
        simpan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        simpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simpan.setEnabled(false);
        simpan.setIconTextGap(1);
        simpan.setMargin(new java.awt.Insets(2, 0, 2, 0));
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        getContentPane().add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 286, 87, 37));

        ubah.setText("Ubah");
        ubah.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ubah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ubah.setEnabled(false);
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });
        getContentPane().add(ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 286, 87, 37));

        hapus.setText("Hapus");
        hapus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        hapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hapus.setEnabled(false);
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        getContentPane().add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 286, 87, 37));

        refresh.setText("Refresh");
        refresh.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refresh.setMargin(new java.awt.Insets(2, 0, 2, 0));
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        getContentPane().add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(852, 523, 87, 37));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Jumlah Data");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 533, -1, -1));

        tf_password.setEditable(false);
        tf_password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_password.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        tf_password.setMargin(new java.awt.Insets(0, 3, 0, 3));
        tf_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_passwordKeyTyped(evt);
            }
        });
        getContentPane().add(tf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 206, 250, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TAMBAH ADMIN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 35, -1, -1));

        pencarian.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pencarian.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        pencarian.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pencarian.setMargin(new java.awt.Insets(0, 3, 0, 3));
        pencarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencarianActionPerformed(evt);
            }
        });
        getContentPane().add(pencarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 284, 232, 37));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("ID Admin");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 104, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("RUMAH SAKIT POS");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, 14));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Password");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 213, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText(":");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 533, -1, -1));

        jumlah_data.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jumlah_data.setForeground(new java.awt.Color(255, 255, 255));
        jumlah_data.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jumlah_data.setText("0000");
        getContentPane().add(jumlah_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 533, 38, -1));

        batal.setText("Batal");
        batal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        batal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        batal.setMargin(new java.awt.Insets(2, 0, 2, 0));
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });
        getContentPane().add(batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 286, 87, 37));

        tf_no_telp.setEditable(false);
        tf_no_telp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_no_telp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        tf_no_telp.setMargin(new java.awt.Insets(0, 3, 0, 3));
        tf_no_telp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_no_telpKeyTyped(evt);
            }
        });
        getContentPane().add(tf_no_telp, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 242, 250, 30));

        tf_alamat.setEditable(false);
        tf_alamat.setColumns(20);
        tf_alamat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_alamat.setRows(5);
        tf_alamat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        tf_alamat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_alamatKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tf_alamat);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 250, 98));

        keluar.setText("Keluar");
        keluar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        keluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        keluar.setMargin(new java.awt.Insets(2, 0, 2, 0));
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(944, 523, 87, 37));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Form Master.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_usernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_usernameKeyTyped
        String batas = tf_username.getText();
        if(batas.length()>=20){
            evt.consume();
        }
    }//GEN-LAST:event_tf_usernameKeyTyped

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        tf_id_pengguna.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        tf_nama_pengguna.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        tf_username.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        try {
            com.mysql.jdbc.Connection koneksi = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/rumahsakit","root","");
            ResultSet re=koneksi.createStatement().executeQuery("SELECT * FROM user_pengguna WHERE id_pengguna='"+jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()+"'");
            while(re.next()){                
                tf_password.setText(re.getString(4));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi Kesalahan Tampil Mouse Klik Tabel");
        }
        tf_no_telp.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        tf_alamat.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
        
        tambah.setEnabled(false);
        hapus.setEnabled(true);
        ubah.setEnabled(true);
        simpan.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        empty_field();
        enable_field();
        penomoran_otomatis();
        fungsi_simpan=true;
        fungsi_ubah=false;
        tambah.setEnabled(false);
        ubah.setEnabled(false);
        hapus.setEnabled(false);
        simpan.setEnabled(true);
        tf_nama_pengguna.requestFocus();                
    }//GEN-LAST:event_tambahActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        //Simpan Data
        if(fungsi_simpan==true && fungsi_ubah==false){
            if(tf_id_pengguna.getText().isEmpty() || tf_nama_pengguna.getText().isEmpty() || tf_password.getText().isEmpty() || tf_username.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Lengkapi Data Terlebih Dahulu !");
            }else{
                fungsi_simpan_data();
            }
        }
        //Ubah Data
        else if(fungsi_simpan==false && fungsi_ubah==true){
            if(tf_id_pengguna.getText().isEmpty() || tf_nama_pengguna.getText().isEmpty() || tf_password.getText().isEmpty() || tf_username.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Lengkapi Data Terlebih Dahulu !");
            }else{
                fungsi_ubah_data();
            }
        }
        hitungData();
        pencarian.requestFocus();
    }//GEN-LAST:event_simpanActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        if(tf_id_pengguna.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Pilih Data Terlebih Dahulu !");
        } else{
            enable_field();
            ubah.setEnabled(false);
            tambah.setEnabled(false);
            hapus.setEnabled(false);
            simpan.setEnabled(true);
            fungsi_simpan=false;
            fungsi_ubah=true;
        }
        tf_id_pengguna.requestFocus();
    }//GEN-LAST:event_ubahActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        if(tf_id_pengguna.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Pilih Data Terlebih Dahulu !");
        }
        else{
            int reply = JOptionPane.showConfirmDialog(this,"Hapus Data Admin ?","Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (reply == JOptionPane.YES_OPTION) {
                try {
                    Connection koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/rumahsakit","root","");
                    koneksi.createStatement().executeUpdate("DELETE FROM user_pengguna where id_pengguna='"+tf_id_pengguna.getText()+"'");
                    JOptionPane.showMessageDialog(this, "Data Dihapus !");
                    tampil();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Data Gagal Dihapus !");
                }
                empty_field();
            }
        }
        batalActionPerformed(evt);
    }//GEN-LAST:event_hapusActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        tampil();
        if(fungsi_simpan==true && fungsi_ubah==false){
            empty_field();
        }else
        if(fungsi_ubah==true && fungsi_simpan==false){

        }else{
            empty_field();
        }
        disable_field();
        tambah.setEnabled(true);
        ubah.setEnabled(false);
        hapus.setEnabled(false);
        simpan.setEnabled(false);
        fungsi_simpan=false;
        fungsi_ubah=false;
        hitungData();
        pencarian.requestFocus();
    }//GEN-LAST:event_refreshActionPerformed

    private void tf_passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_passwordKeyTyped
        String batas = String.valueOf(tf_password.getPassword());
        if(batas.length()>=20){
            evt.consume();
        }
    }//GEN-LAST:event_tf_passwordKeyTyped

    private void tf_nama_penggunaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nama_penggunaKeyTyped
        FilterHanyaHuruf(evt);
        String batas = tf_nama_pengguna.getText();
        if(batas.length()>=150){
            evt.consume();
        }
    }//GEN-LAST:event_tf_nama_penggunaKeyTyped

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        fungsi_pencarian();
        hitungData();
        pencarian.requestFocus();
    }//GEN-LAST:event_cariActionPerformed

    private void pencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencarianActionPerformed
        fungsi_pencarian();
        hitungData();
    }//GEN-LAST:event_pencarianActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        tampil();
        if(fungsi_simpan==true && fungsi_ubah==false){
            empty_field();
        }else
        if(fungsi_ubah==true && fungsi_simpan==false){

        }else{
            empty_field();
        }
        disable_field();
        tambah.setEnabled(true);
        ubah.setEnabled(false);
        hapus.setEnabled(false);
        simpan.setEnabled(false);
        fungsi_simpan=false;
        fungsi_ubah=false;
        pencarian.requestFocus();
    }//GEN-LAST:event_batalActionPerformed

    private void tf_no_telpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_no_telpKeyTyped
        FilterHanyaAngka(evt);
        String batas = tf_no_telp.getText();
        if(batas.length()>=14){
            evt.consume();
        }
    }//GEN-LAST:event_tf_no_telpKeyTyped

    private void tf_alamatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_alamatKeyTyped
        String batas = tf_alamat.getText();
        if(batas.length()>=250){
            evt.consume();
        }
    }//GEN-LAST:event_tf_alamatKeyTyped

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        this.dispose();
    }//GEN-LAST:event_keluarActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tambah_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tambah_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tambah_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tambah_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Tambah_Admin dialog = new Tambah_Admin(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JButton cari;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jumlah_data;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField pencarian;
    private javax.swing.JButton refresh;
    private javax.swing.JButton simpan;
    private javax.swing.JButton tambah;
    private javax.swing.JTextArea tf_alamat;
    private javax.swing.JTextField tf_id_pengguna;
    private javax.swing.JTextField tf_nama_pengguna;
    private javax.swing.JTextField tf_no_telp;
    private javax.swing.JPasswordField tf_password;
    private javax.swing.JTextField tf_username;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
    
    private void empty_field() {
        tf_id_pengguna.setText(null);
        tf_nama_pengguna.setText(null);
        tf_password.setText(null);
        tf_username.setText(null);
        tf_no_telp.setText(null);
        tf_alamat.setText(null);
        pencarian.setText(null);
    }

    private void enable_field() {
        //tf_id_pengguna.setEditable(true);
        tf_nama_pengguna.setEditable(true);
        tf_password.setEditable(true);
        tf_username.setEditable(true);
        tf_no_telp.setEditable(true);
        tf_alamat.setEditable(true);
    }
    
    private void disable_field() {
        //tf_id_pengguna.setEditable(false);
        tf_nama_pengguna.setEditable(false);
        tf_password.setEditable(false);
        tf_username.setEditable(false);
        tf_no_telp.setEditable(false);
        tf_alamat.setEditable(false);
    }
    
    private void FilterHanyaHuruf(KeyEvent evt) {
        char c = evt.getKeyChar();
        if (! ((Character.isLetter(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_COMMA) || (c == KeyEvent.VK_SPACE) || (c == KeyEvent.VK_PERIOD) )))
        {
            evt.consume();            
        }
    }
    
    private void FilterHanyaAngka(KeyEvent evt) {
        char c = evt.getKeyChar();
        if (! ((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))))
        {
            evt.consume();            
        }
    }

    private void koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver") ;
            con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/rumahsakit","root","");
            stt = (Statement) con.createStatement();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Koneksi Database Error");
        }
    }
    
    private void penomoran_otomatis() {
        int no_kode_pengguna=0;
        String temp_kode_pengguna="";
        try {
            koneksi();
            String sql = "select id_pengguna from user_pengguna order by id_pengguna desc limit 1";                        
            ResultSet res=stt.executeQuery(sql);
            while (res.next()) {
                temp_kode_pengguna = res.getString(1);                
                String nomor_blkg = temp_kode_pengguna.substring(2,4);
                no_kode_pengguna=Integer.parseInt(nomor_blkg);
            }
                        
            no_kode_pengguna++;
            String nilai=String.valueOf(no_kode_pengguna);                      
            if(nilai.length()==1){
                tf_id_pengguna.setText("P00"+no_kode_pengguna);
            }else
            if(nilai.length()==2){
                tf_id_pengguna.setText("P0"+no_kode_pengguna);
            }else
            if(nilai.length()==3){
                tf_id_pengguna.setText("P"+no_kode_pengguna);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Error Penomoran !");
        }
    }

    private void fungsi_simpan_data() {
        try {
            Connection koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/rumahsakit","root","");
            koneksi.createStatement().executeUpdate("INSERT INTO user_pengguna VALUES('"+tf_id_pengguna.getText()+"'"
            + ",'"+tf_nama_pengguna.getText()+"','"+tf_username.getText()+"','"+String.valueOf(tf_password.getPassword())+"'"
            + ",'"+tf_no_telp.getText()+"','"+tf_alamat.getText()+"')");
            JOptionPane.showMessageDialog(this, "Data Disimpan !");            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Data Gagal Disimpan !");
        }
        tambah.setEnabled(true);
        ubah.setEnabled(false);
        hapus.setEnabled(false);
        simpan.setEnabled(false);
        fungsi_simpan=false;
        fungsi_ubah=false;
        disable_field();
        tampil();
    }
    
    private void fungsi_ubah_data() {
        try {
            Connection koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/rumahsakit","root","");
            koneksi.createStatement().executeUpdate("UPDATE user_pengguna SET id_pengguna='"+tf_id_pengguna.getText()+"'"
            + ",nama_pengguna='"+tf_nama_pengguna.getText()+"',alamat_pengguna='"+tf_alamat.getText()+"'"
            + ",username='"+tf_username.getText()+"',no_telp_pengguna='"+tf_no_telp.getText()+"'"
            + " WHERE id_pengguna='"+tf_id_pengguna.getText()+"'");
           JOptionPane.showMessageDialog(this, "Data Diubah !");
        } catch (SQLException ex1) {
           JOptionPane.showMessageDialog(this, "Data Gagal Diubah !");
        }
        tambah.setEnabled(true);
        ubah.setEnabled(false);
        hapus.setEnabled(false);
        simpan.setEnabled(false);
        fungsi_simpan=false;
        fungsi_ubah=false;
        disable_field();
        tampil();
    }
    
    private void tampil() {
        try {
            int data = jTable1.getRowCount();
            for(int i=0;i<data;i++){
            tabel.removeRow(0);
            }
            com.mysql.jdbc.Connection koneksi = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/rumahsakit","root","");
            ResultSet re=koneksi.createStatement().executeQuery("SELECT * FROM user_pengguna ORDER BY id_pengguna");            
            while(re.next()){                
                String[] tabel_master={re.getString(1),re.getString(2),re.getString(3),re.getString(5),re.getString(6)};
                tabel.addRow(tabel_master);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi Kesalahan Tampil Tabel");
        }
    }   

    private void aturKolom() {
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
        column = jTable1.getColumnModel().getColumn(0);
        column.setPreferredWidth(125);        
        column = jTable1.getColumnModel().getColumn(1); 
        column.setPreferredWidth(250); 
        column = jTable1.getColumnModel().getColumn(2); 
        column.setPreferredWidth(125);
        column = jTable1.getColumnModel().getColumn(3);
        column.setPreferredWidth(125);
        column = jTable1.getColumnModel().getColumn(4);
        column.setPreferredWidth(390);
    }        

    private void fungsi_pencarian() {
        try {
            int data = jTable1.getRowCount();
            for(int i=0;i<data;i++){
                tabel.removeRow(0);
            }
            com.mysql.jdbc.Connection koneksi = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/rumahsakit","root","");
            ResultSet re=koneksi.createStatement().executeQuery("SELECT * FROM user_pengguna where id_pengguna LIKE '%"+pencarian.getText()+"%'"
            +"or nama_pengguna like '%"+pencarian.getText()+"%'"+"or no_telp_pengguna like '%" + pencarian.getText()+"%'"+"or alamat_pengguna like '%" + pencarian.getText()+"%' "
            + "ORDER BY id_pengguna");
            while(re.next()){                    
                String[] tabel_master={re.getString(1),re.getString(2),re.getString(3),re.getString(5),re.getString(6)};
                tabel.addRow(tabel_master);
            }
            if(jTable1.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Data Tidak Ditemukan !");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi Kesalahan Fungsi Pencarian !");
        }
    }

    private void aturFokus() {
        tf_id_pengguna.setNextFocusableComponent(tf_nama_pengguna);
        tf_nama_pengguna.setNextFocusableComponent(tf_username);
        tf_username.setNextFocusableComponent(tf_password);
        tf_password.setNextFocusableComponent(tf_no_telp);
        tf_no_telp.setNextFocusableComponent(tf_alamat);
        tf_alamat.setNextFocusableComponent(tf_id_pengguna);
    }
    
    private void hitungData() {
        int total_baris = jTable1.getRowCount();
        if(String.valueOf(total_baris).length()==1){
            jumlah_data.setText("000"+total_baris);
        }else
        if(String.valueOf(total_baris).length()==2){
            jumlah_data.setText("00"+total_baris);
        }else
        if(String.valueOf(total_baris).length()==3){
            jumlah_data.setText("0"+total_baris);
        }else
        if(String.valueOf(total_baris).length()==4){
            jumlah_data.setText(""+total_baris);
        }
    }
}
