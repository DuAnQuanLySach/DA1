/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import DAO.DoTuoiDAO;
import java.awt.Color;
import javax.swing.JOptionPane;
import DAO.NgonNguDAO;
import DAO.NgonNguDAO;
import Entity.DoTuoi;
import Entity.NgonNgu;
import Entity.TheLoai;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utils.MsgBox;

/**
 *
 * @author ADMIN
 */
public class NgonNguFrom extends javax.swing.JPanel {

    /**
     * Creates new form NgonNguFrom
     *
     */
    DoTuoiDAO dAOdt = new DoTuoiDAO();
    List<DoTuoi> listdt = new ArrayList<>();
    NgonNguDAO dAOnn = new NgonNguDAO();
    List<NgonNgu> listnn = new ArrayList<>();
    int row = -1;

    private void showinforNN() {
        String MaNN = (String) tblNN.getValueAt(this.row, 0);
        NgonNgu NN = dAOnn.selectById(MaNN);
        this.setFormNN(NN);
    }

    private void setforNN(NgonNgu NN) {
        txtLoaiNN.setText(NN.getLoaiNN());
        txtMaNN.setText(NN.getMaNN());
        if (NN.getTrangThai() == 1) {
            rdbhdNN.setSelected(true);
        } else {
            rdbKHDNN.setSelected(true);
        }
    }

    private NgonNgu getFormNN() {
        NgonNgu NN = new NgonNgu();
        NN.setMaNN(txtMaNN.getText());
        NN.setLoaiNN(txtLoaiNN.getText());
        if (rdbhdNN.isSelected()) {
            NN.setTrangThai(1);
        } else {
            NN.setTrangThai(0);
        }
        return NN;
    }

    private void showinFormDT() {
        String MaDT = (String) tblDT.getValueAt(this.row, 0);
        DoTuoi DT = dAOdt.selectById(MaDT);
        this.setFormDT(DT);
    }

    private void setFormDT(DoTuoi DT) {
        txtDoTuoi.setText(DT.getDoTuoi());
        txtMaDoTuoi.setText(DT.getMaDTuoi() + "");
        if (DT.getTrangThai() == 1) {
            rdbHĐT.setSelected(true);
        } else {
            rdbKHĐT.setSelected(true);
        }
    }

    private DoTuoi getFormDT() {
        DoTuoi DT = new DoTuoi();
        DT.setDoTuoi(txtDoTuoi.getText());
        DT.setMaDTuoi(Integer.parseInt(txtMaDoTuoi.getText()));
        if (rdbHĐT.isSelected()) {
            DT.setTrangThai(1);
        } else {
            DT.setTrangThai(0);
        }
        return DT;
    }

    public NgonNguFrom() {
        initComponents();
        init();

    }

    public void init() {
        filltableDT();
        filltableNN();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrDT = new javax.swing.ButtonGroup();
        btngrNN = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblNN = new javax.swing.JTable();
        txtMaNN = new javax.swing.JTextField();
        btnInsertNN = new javax.swing.JButton();
        btnUpdateNN = new javax.swing.JButton();
        btnCleanNN = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtLoaiNN = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        rdbhdNN = new javax.swing.JRadioButton();
        rdbKHDNN = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDT = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lblMaDT = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDoTuoi = new javax.swing.JTextField();
        txtMaDoTuoi = new javax.swing.JTextField();
        btnThemDT = new javax.swing.JButton();
        btnSuaDT = new javax.swing.JButton();
        btnNhapMoiDT = new javax.swing.JButton();
        rdbHĐT = new javax.swing.JRadioButton();
        rdbKHĐT = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jPanel1, java.awt.BorderLayout.LINE_END);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Mã Ngôn Ngữ :");

        tblNN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Ngôn Ngữ", "Loại Ngôn Ngữ", "Trạng Thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNN.setRowHeight(22);
        tblNN.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tblNN.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblNN.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblNNAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tblNN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNNMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblNN);

        txtMaNN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNNActionPerformed(evt);
            }
        });

        btnInsertNN.setText("Thêm/ Lưu");
        btnInsertNN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertNNActionPerformed(evt);
            }
        });

        btnUpdateNN.setText("Sửa/Cập nhật");
        btnUpdateNN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateNNActionPerformed(evt);
            }
        });

        btnCleanNN.setText("Nhập mới");
        btnCleanNN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanNNActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Loại Ngôn Ngữ :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Trạng Thái");

        btngrNN.add(rdbhdNN);
        rdbhdNN.setText("ĐangHD");
        rdbhdNN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbhdNNActionPerformed(evt);
            }
        });

        btngrNN.add(rdbKHDNN);
        rdbKHDNN.setText("KhôngHD");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLoaiNN, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(txtMaNN))
                .addGap(71, 71, 71)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rdbhdNN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdbKHDNN, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(265, 265, 265)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnInsertNN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdateNN, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(btnCleanNN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(211, 211, 211))
            .addComponent(jScrollPane3)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(txtLoaiNN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnInsertNN))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtMaNN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdateNN))
                        .addGap(18, 18, 18)
                        .addComponent(btnCleanNN))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(rdbhdNN)
                        .addGap(19, 19, 19)
                        .addComponent(rdbKHDNN)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tblDT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Độ Tuổi", "Độ tuổi", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDT.setRowHeight(22);
        tblDT.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tblDT.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblDT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDTMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDT);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mã Độ Tuổi :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Độ Tuổi :");

        txtDoTuoi.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDoTuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoTuoiActionPerformed(evt);
            }
        });
        txtDoTuoi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDoTuoiKeyTyped(evt);
            }
        });

        txtMaDoTuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaDoTuoiActionPerformed(evt);
            }
        });
        txtMaDoTuoi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMaDoTuoiKeyTyped(evt);
            }
        });

        btnThemDT.setText("Thêm/Lưu");
        btnThemDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemDTActionPerformed(evt);
            }
        });

        btnSuaDT.setText("Sửa/Cập nhật");
        btnSuaDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaDTActionPerformed(evt);
            }
        });

        btnNhapMoiDT.setText("Nhâp mới");
        btnNhapMoiDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapMoiDTActionPerformed(evt);
            }
        });

        btngrDT.add(rdbHĐT);
        rdbHĐT.setText("ĐangHĐ");
        rdbHĐT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbHĐTActionPerformed(evt);
            }
        });

        btngrDT.add(rdbKHĐT);
        rdbKHĐT.setText("KhôngHĐ");
        rdbKHĐT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbKHĐTActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Trạng Thái ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaDT, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaDoTuoi, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                    .addComponent(txtDoTuoi))))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdbKHĐT, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdbHĐT, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnSuaDT, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                .addComponent(btnThemDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnNhapMoiDT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(210, 210, 210))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMaDoTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThemDT))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtDoTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addComponent(lblMaDT, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnSuaDT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnNhapMoiDT)
                                    .addComponent(rdbKHĐT)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(rdbHĐT)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void rdbhdNNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbhdNNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbhdNNActionPerformed

    private void txtMaNNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNNActionPerformed

    private void btnUpdateNNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateNNActionPerformed
        this.btnUpdateNN();
    }//GEN-LAST:event_btnUpdateNNActionPerformed

    private void btnInsertNNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertNNActionPerformed
        this.btnInsertNN();
    }//GEN-LAST:event_btnInsertNNActionPerformed

    private void btnCleanNNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanNNActionPerformed
        this.btnCleanNN();
    }//GEN-LAST:event_btnCleanNNActionPerformed

    private void tblNNAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblNNAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tblNNAncestorAdded

    private void tblNNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNNMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.row = tblNN.getSelectedRow();

            int row = tblNN.getSelectedRow();
            String MaNgonNgu = tblNN.getValueAt(row, 0).toString();
            String LoaiNgonNgu = tblNN.getValueAt(row, 1).toString();
            String TrangThai = (String) tblNN.getValueAt(row, 2);

            txtMaNN.setText(MaNgonNgu);
            txtLoaiNN.setText(LoaiNgonNgu);

            if (TrangThai.equals("Đang hoạt động")) {
                rdbhdNN.setSelected(true);
                rdbKHDNN.setSelected(false);
            } else {
                rdbKHDNN.setSelected(true);
                rdbhdNN.setSelected(false);
            }
        }
    }//GEN-LAST:event_tblNNMouseClicked

    private void rdbKHĐTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbKHĐTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbKHĐTActionPerformed

    private void rdbHĐTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbHĐTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbHĐTActionPerformed

    private void btnNhapMoiDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapMoiDTActionPerformed
        this.btnNhapMoiDT();
    }//GEN-LAST:event_btnNhapMoiDTActionPerformed

    private void btnSuaDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaDTActionPerformed
        this.btnSuaDT();
    }//GEN-LAST:event_btnSuaDTActionPerformed

    private void btnThemDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemDTActionPerformed
        this.btnThemDT();
    }//GEN-LAST:event_btnThemDTActionPerformed

    private void txtMaDoTuoiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaDoTuoiKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMaDoTuoiKeyTyped

    private void txtMaDoTuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaDoTuoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaDoTuoiActionPerformed

    private void txtDoTuoiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDoTuoiKeyTyped

    }//GEN-LAST:event_txtDoTuoiKeyTyped

    private void txtDoTuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoTuoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoTuoiActionPerformed

    private void tblDTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDTMouseClicked
        // TODO add your handling code here:
        int row = tblDT.getSelectedRow();
        String MaDT = tblDT.getValueAt(row, 0).toString();
        String DoTuoi = tblDT.getValueAt(row, 1).toString();
        String TrangThaiString = (String) tblDT.getValueAt(row, 2);

        txtDoTuoi.setText(DoTuoi);
        txtMaDoTuoi.setText(MaDT);

        if (TrangThaiString.equals("Đang hoạt động")) {
            rdbHĐT.setSelected(true);
            rdbKHĐT.setSelected(false);

        } else {
            rdbHĐT.setSelected(false);
            rdbKHĐT.setSelected(true);
        }
    }//GEN-LAST:event_tblDTMouseClicked

    private void setFormNN(NgonNgu nn) {
        txtMaNN.setText(nn.getMaNN());
        txtLoaiNN.setText(nn.getLoaiNN());

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCleanNN;
    private javax.swing.JButton btnInsertNN;
    private javax.swing.JButton btnNhapMoiDT;
    private javax.swing.JButton btnSuaDT;
    private javax.swing.JButton btnThemDT;
    private javax.swing.JButton btnUpdateNN;
    private javax.swing.ButtonGroup btngrDT;
    private javax.swing.ButtonGroup btngrNN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblMaDT;
    private javax.swing.JRadioButton rdbHĐT;
    private javax.swing.JRadioButton rdbKHDNN;
    private javax.swing.JRadioButton rdbKHĐT;
    private javax.swing.JRadioButton rdbhdNN;
    private javax.swing.JTable tblDT;
    private javax.swing.JTable tblNN;
    private javax.swing.JTextField txtDoTuoi;
    private javax.swing.JTextField txtLoaiNN;
    private javax.swing.JTextField txtMaDoTuoi;
    private javax.swing.JTextField txtMaNN;
    // End of variables declaration//GEN-END:variables

    private void btnThemDT() {
        StringBuilder sb = new StringBuilder();
        if (txtDoTuoi.getText().equals("")) {
            sb.append("bạn chưa ghi độ tuổi  \n");
            txtDoTuoi.setBackground(Color.red);
            txtDoTuoi.requestFocus();
        } else {
            txtDoTuoi.setBackground(Color.GREEN);
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString());
            return;
        }
        try {
            DoTuoi doTuoi = new DoTuoi();
            doTuoi.setDoTuoi(txtDoTuoi.getText());
            DoTuoiDAO dAO = new DoTuoiDAO();
            dAO.insert(doTuoi);
            filltableDT();
            JOptionPane.showMessageDialog(this, "Độ tuổi đã được lưu vào csdl");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void btnCleanNN() {
        txtMaNN.setText("");
        txtMaNN.setBackground(Color.white);
        txtLoaiNN.setText("");
        txtLoaiNN.setBackground(Color.white);

    }

    private void btnInsertNN() {
        StringBuilder sb = new StringBuilder();
        if (txtLoaiNN.getText().equals("")) {
            sb.append("không được để trống ngôn ngữ \n");
            txtLoaiNN.setBackground(Color.red);
            txtLoaiNN.requestFocus();
        } else {
            txtLoaiNN.setBackground(Color.GREEN);
        }
        if (txtMaNN.getText().equals("")) {
            sb.append("không được để trống mã ngôn ngữ  \n");
            txtMaNN.setBackground(Color.red);
            txtMaNN.requestFocus();
        } else {
            txtMaNN.setBackground(Color.GREEN);
        }

        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString());
            return;
        }

        try {
            NgonNgu ngonNgu = getFormNN();
            dAOnn.insert(ngonNgu);
            filltableNN();
            JOptionPane.showMessageDialog(this, "Sách đã được lưu vào csdl");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }

    }

    private void btnUpdateNN() {
        StringBuilder sb = new StringBuilder();
        if (txtLoaiNN.getText().equals("")) {
            sb.append("bạn phải nhập lại ngôn ngữ \n");
            txtLoaiNN.setBackground(Color.yellow);
            txtLoaiNN.requestFocus();
        } else {
            txtLoaiNN.setBackground(Color.GREEN);
        }
        if (txtMaNN.getText().equals("")) {
            sb.append("bạn phải nhập lại mã ngôn ngữ  \n");
            txtMaNN.setBackground(Color.yellow);
            txtMaNN.requestFocus();
        } else {
            txtMaNN.setBackground(Color.GREEN);
        }

        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString());
            return;
        }

        try {
            NgonNgu NN = getFormNN();
            dAOnn.update(NN);
            filltableNN();
            tblNN.setRowSelectionInterval(row, row);
            MsgBox.alert(this, "cập nhật thành công");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại");
        }

    }

    private void btnNhapMoiDT() {
        txtMaDoTuoi.setText("");
        txtMaDoTuoi.setBackground(Color.white);
        txtDoTuoi.setText("");
        txtDoTuoi.setBackground(Color.white);

    }

    private void btnSuaDT() {
        StringBuilder sb = new StringBuilder();
        if (txtDoTuoi.getText().equals("")) {
            sb.append("bạn phải nhập lại độ tuổi \n");
            txtDoTuoi.setBackground(Color.yellow);
            txtDoTuoi.requestFocus();
        } else {
            txtDoTuoi.setBackground(Color.GREEN);
        }
        if (txtMaDoTuoi.getText().equals("")) {
            sb.append("bạn phải nhập lại mã độ tuổi  \n");
            txtMaDoTuoi.setBackground(Color.yellow);
            txtMaDoTuoi.requestFocus();
        } else {
            txtMaDoTuoi.setBackground(Color.GREEN);
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString());
            return;
        }
        try {
            DoTuoi doTuoi = new DoTuoi();
            doTuoi.setDoTuoi(txtDoTuoi.getText());
            doTuoi.setMaDTuoi(Integer.parseInt(txtMaDoTuoi.getText()));
            DoTuoiDAO dAO = new DoTuoiDAO();
            dAO.insert(doTuoi);
            filltableDT();
            JOptionPane.showMessageDialog(this, "bạn đã cập nhật thành công \n");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void filltableDT() {
        DefaultTableModel tblModel = (DefaultTableModel) tblDT.getModel();
        tblModel.setRowCount(0);
        try {
            listdt = dAOdt.selecALL();
            listdt.stream().forEach((dt) -> {
                tblModel.addRow(new Object[]{
                    dt.getMaDTuoi(), dt.getDoTuoi(), dt.getTrangThai() == 1 ? "Đang hoạt động" : "Đang Ẩn"
                });

            });

        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn");
            e.printStackTrace();
        }

    }

    private void filltableNN() {
        DefaultTableModel tblModel = (DefaultTableModel) tblNN.getModel();
        tblModel.setRowCount(0);
        try {
            listnn = dAOnn.selecALL();
            listnn.stream().forEach((nn) -> {
                tblModel.addRow(new Object[]{
                    nn.getMaNN(), nn.getLoaiNN(), nn.getTrangThai() == 1 ? "Đang hoạt động" : "Đang Ẩn"
                });

            });

        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn");
            e.printStackTrace();
        }

    }

}
