/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package overide.securityplanners;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author user
 */
public class Jadwal extends javax.swing.JFrame {
    int x = 0;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    /**
     * Creates new form Jadwal
     */
    public Jadwal() {
        initComponents();
        cmdShift.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Pagi", "Siang", "Malam"}));
        cmdLokasi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Komplek 1", "Komplek 2", "Komplek 3"}));
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btdashboard = new javax.swing.JButton();
        btpetugas = new javax.swing.JButton();
        btjadwal = new javax.swing.JButton();
        btlokasi = new javax.swing.JButton();
        btlogout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        dashboard = new javax.swing.JButton();
        petugas = new javax.swing.JButton();
        jadwal = new javax.swing.JButton();
        lokasi = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tbAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbjadwal = new javax.swing.JTable();
        tbBersih = new javax.swing.JButton();
        tbDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIDJadwal = new javax.swing.JTextField();
        txtpetugas = new javax.swing.JTextField();
        cmdShift = new javax.swing.JComboBox<>();
        cmdLokasi = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        tbKeluar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 0, 153));

        btdashboard.setBackground(new java.awt.Color(51, 0, 153));
        btdashboard.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btdashboard.setForeground(new java.awt.Color(255, 255, 255));
        btdashboard.setText("Dashboard");
        btdashboard.setBorder(null);
        btdashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdashboardActionPerformed(evt);
            }
        });

        btpetugas.setBackground(new java.awt.Color(51, 0, 153));
        btpetugas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btpetugas.setForeground(new java.awt.Color(255, 255, 255));
        btpetugas.setText("Petugas");
        btpetugas.setBorder(null);
        btpetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpetugasActionPerformed(evt);
            }
        });

        btjadwal.setBackground(new java.awt.Color(51, 0, 153));
        btjadwal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btjadwal.setForeground(new java.awt.Color(255, 255, 255));
        btjadwal.setText("Jadwal");
        btjadwal.setBorder(null);
        btjadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjadwalActionPerformed(evt);
            }
        });

        btlokasi.setBackground(new java.awt.Color(51, 0, 153));
        btlokasi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btlokasi.setForeground(new java.awt.Color(255, 255, 255));
        btlokasi.setText("Lokasi");
        btlokasi.setBorder(null);
        btlokasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlokasiActionPerformed(evt);
            }
        });

        btlogout.setBackground(new java.awt.Color(51, 0, 153));
        btlogout.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btlogout.setForeground(new java.awt.Color(255, 255, 255));
        btlogout.setText("Logout");
        btlogout.setBorder(null);
        btlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btpetugas, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(btjadwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btlokasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btlogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btdashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btdashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btpetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btjadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btlokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(51, 0, 153));

        dashboard.setBackground(new java.awt.Color(51, 0, 153));
        dashboard.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dashboard.setForeground(new java.awt.Color(255, 255, 255));
        dashboard.setText("Dashboard");
        dashboard.setBorder(null);
        dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardActionPerformed(evt);
            }
        });

        petugas.setBackground(new java.awt.Color(51, 0, 153));
        petugas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        petugas.setForeground(new java.awt.Color(255, 255, 255));
        petugas.setText("Petugas");
        petugas.setBorder(null);
        petugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petugasActionPerformed(evt);
            }
        });

        jadwal.setBackground(new java.awt.Color(51, 0, 153));
        jadwal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jadwal.setForeground(new java.awt.Color(255, 255, 255));
        jadwal.setText("Jadwal");
        jadwal.setBorder(null);
        jadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jadwalActionPerformed(evt);
            }
        });

        lokasi.setBackground(new java.awt.Color(51, 0, 153));
        lokasi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lokasi.setForeground(new java.awt.Color(255, 255, 255));
        lokasi.setText("Lokasi");
        lokasi.setBorder(null);
        lokasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lokasiActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(51, 0, 153));
        logout.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.setBorder(null);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(petugas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jadwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lokasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(petugas, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("KELOLA JADWAL");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
        );

        tbAdd.setBackground(new java.awt.Color(51, 0, 153));
        tbAdd.setForeground(new java.awt.Color(255, 255, 255));
        tbAdd.setText("Add");
        tbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbAddActionPerformed(evt);
            }
        });

        tbjadwal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama Petugas", "Lokasi", "Tanggal", "Shift"
            }
        ));
        jScrollPane1.setViewportView(tbjadwal);

        tbBersih.setBackground(new java.awt.Color(51, 0, 153));
        tbBersih.setForeground(new java.awt.Color(255, 255, 255));
        tbBersih.setText("Bersihkan");
        tbBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbBersihActionPerformed(evt);
            }
        });

        tbDelete.setBackground(new java.awt.Color(51, 0, 153));
        tbDelete.setForeground(new java.awt.Color(255, 255, 255));
        tbDelete.setText("Delete");
        tbDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbDeleteActionPerformed(evt);
            }
        });

        jLabel2.setText("ID Jadwal");

        jLabel3.setText("Nama Petugas");

        jLabel4.setText("Lokasi");

        jLabel5.setText("Tanggal");

        jLabel6.setText("Shift");

        txtIDJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDJadwalActionPerformed(evt);
            }
        });

        txtpetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpetugasActionPerformed(evt);
            }
        });

        cmdShift.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmdShift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdShiftActionPerformed(evt);
            }
        });

        cmdLokasi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmdLokasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLokasiActionPerformed(evt);
            }
        });

        tbKeluar.setBackground(new java.awt.Color(51, 0, 153));
        tbKeluar.setForeground(new java.awt.Color(255, 255, 255));
        tbKeluar.setText("Keluar");
        tbKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(cmdLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmdShift, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(tbAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbBersih)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tbKeluar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(119, 119, 119)
                                        .addComponent(jLabel6))
                                    .addComponent(txtIDJadwal)
                                    .addComponent(txtpetugas)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(19, 19, 19))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIDJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmdShift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbAdd)
                    .addComponent(tbBersih)
                    .addComponent(tbDelete)
                    .addComponent(tbKeluar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 422, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

    private void btlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlogoutActionPerformed
        // TODO add your handling code here:
        new LoginAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btlogoutActionPerformed

    private void btlokasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlokasiActionPerformed
        // TODO add your handling code here:
        new Lokasi().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btlokasiActionPerformed

    private void btjadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjadwalActionPerformed
        // TODO add your handling code here:
        new Jadwal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btjadwalActionPerformed

    private void btpetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpetugasActionPerformed
        // TODO add your handling code here:
        new PetugasJaga().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btpetugasActionPerformed

    private void btdashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdashboardActionPerformed
        // TODO add your handling code here:
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btdashboardActionPerformed

    private void txtIDJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDJadwalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDJadwalActionPerformed

    private void tbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbDeleteActionPerformed
        // TODO add your handling code here:
    tbjadwal.setValueAt("",tbjadwal.getSelectedRow(), 0);
    tbjadwal.setValueAt("",tbjadwal.getSelectedRow(), 1);
    tbjadwal.setValueAt("",tbjadwal.getSelectedRow(), 2);
    tbjadwal.setValueAt("",tbjadwal.getSelectedRow(), 3);
    tbjadwal.setValueAt("",tbjadwal.getSelectedRow(), 4);
    }//GEN-LAST:event_tbDeleteActionPerformed

    private void tbBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbBersihActionPerformed
        //txtpetugasdd your handling code here:
    txtIDJadwal.setText("");
    txtpetugas.setText("");
    cmdLokasi.setSelectedItem("");
    cmdShift.setSelectedItem("");
    }//GEN-LAST:event_tbBersihActionPerformed

    private void tbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbAddActionPerformed

     Date date = jDateChooser1.getDate();
     String dateString = dateFormat.format(date);
        
        tbjadwal.setValueAt(txtIDJadwal.getText(), x, 0);
        tbjadwal.setValueAt(txtpetugas.getText(), x, 1);
        tbjadwal.setValueAt(cmdLokasi.getSelectedItem(), x, 2);
        tbjadwal.setValueAt(dateString, x, 3);
        tbjadwal.setValueAt(cmdShift.getSelectedItem(), x, 4);

        x = x + 1;
    }//GEN-LAST:event_tbAddActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed

    }//GEN-LAST:event_logoutActionPerformed

    private void lokasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lokasiActionPerformed

    }//GEN-LAST:event_lokasiActionPerformed

    private void jadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jadwalActionPerformed

    }//GEN-LAST:event_jadwalActionPerformed

    private void petugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petugasActionPerformed

    }//GEN-LAST:event_petugasActionPerformed

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed

    }//GEN-LAST:event_dashboardActionPerformed

    private void txtpetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpetugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpetugasActionPerformed

    private void cmdLokasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLokasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdLokasiActionPerformed

    private void cmdShiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdShiftActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdShiftActionPerformed

    private void tbKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbKeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_tbKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(Jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jadwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btdashboard;
    private javax.swing.JButton btjadwal;
    private javax.swing.JButton btlogout;
    private javax.swing.JButton btlokasi;
    private javax.swing.JButton btpetugas;
    private javax.swing.JComboBox<String> cmdLokasi;
    private javax.swing.JComboBox<String> cmdShift;
    private javax.swing.JButton dashboard;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jadwal;
    private javax.swing.JButton logout;
    private javax.swing.JButton lokasi;
    private javax.swing.JButton petugas;
    private javax.swing.JButton tbAdd;
    private javax.swing.JButton tbBersih;
    private javax.swing.JButton tbDelete;
    private javax.swing.JButton tbKeluar;
    private javax.swing.JTable tbjadwal;
    private javax.swing.JTextField txtIDJadwal;
    private javax.swing.JTextField txtpetugas;
    // End of variables declaration//GEN-END:variables
}
