package de1_2025;

import de1_2025.NhanVien;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class QuanLyNhanVien extends javax.swing.JFrame {

    public static List<NhanVien> listNV = new ArrayList<>();
    public static final String FILE_PATH = "./src/de1_2025/nhanvien.txt";

    public ArrayList<NhanVien> getList() {
        return (ArrayList<NhanVien>) this.listNV;
    }

    /**
     * Creates new form QuanLyNhanVien
     */
    public QuanLyNhanVien() {
        initComponents();
        initUI();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    private void initUI() {
        checkBT.setEnabled(false);
        checkNN.setEnabled(false);
        txThuong.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txHoten = new javax.swing.JTextField();
        txThamnien = new javax.swing.JTextField();
        txQueQuan = new javax.swing.JTextField();
        txGiolam = new javax.swing.JTextField();
        rdNVB = new javax.swing.JRadioButton();
        rdNVTN = new javax.swing.JRadioButton();
        checkBT = new javax.swing.JCheckBox();
        checkNN = new javax.swing.JCheckBox();
        btnLuu = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        btnSaveFile = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txThuong = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        jLabel2.setText("Họ Tên:");

        jLabel3.setText("Thâm niên:");

        jLabel4.setText("Quê quán:");

        jLabel5.setText("Số giờ làm:");

        jLabel6.setText("Nhân viên:");

        buttonGroup1.add(rdNVB);
        rdNVB.setText("Nhân viên bếp");
        rdNVB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNVBActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdNVTN);
        rdNVTN.setText("Nhân viên thu ngân");
        rdNVTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNVTNActionPerformed(evt);
            }
        });

        checkBT.setText("Bếp trưởng");
        checkBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBTActionPerformed(evt);
            }
        });

        checkNN.setText("Biết ngoại ngữ");

        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnShow.setText("Hiển thị");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        btnSaveFile.setText("Lưu file");
        btnSaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveFileActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Họ tên", "Thâm niên", "Quê quán", "Nhân viên", "Giờ làm việc", "Lương"
            }
        ));
        jScrollPane1.setViewportView(table);

        jLabel7.setText("Thưởng chức vụ:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdNVB)
                                        .addGap(74, 74, 74)
                                        .addComponent(checkBT, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdNVTN)
                                        .addGap(49, 49, 49)
                                        .addComponent(checkNN))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txThamnien, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txGiolam, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txHoten, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txThuong, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 57, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(btnLuu)
                .addGap(102, 102, 102)
                .addComponent(btnShow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSaveFile)
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txHoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txThuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txThamnien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txGiolam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdNVB, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(checkBT)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdNVTN)
                    .addComponent(checkNN))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu)
                    .addComponent(btnSaveFile)
                    .addComponent(btnShow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdNVBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNVBActionPerformed
        if (rdNVB.isSelected()) {
            checkBT.setEnabled(true);
            checkNN.setSelected(false);
            checkNN.setEnabled(false);
        }
    }//GEN-LAST:event_rdNVBActionPerformed

    private void rdNVTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNVTNActionPerformed
        if (rdNVTN.isSelected()) {
            checkBT.setEnabled(false);
            checkBT.setSelected(false);
            checkNN.setEnabled(true);
        }
    }//GEN-LAST:event_rdNVTNActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        try {
            String hoTen = txHoten.getText().trim();
            Integer thamNien = Integer.parseInt(txThamnien.getText().trim());
            String queQuan = txQueQuan.getText().trim();
            Double soGioLam = Double.parseDouble(txGiolam.getText().trim());
            boolean chucVu = rdNVB.isSelected() ? true : false; // True - bếp trưởng, false - nhân viên thu ngân

            if (hoTen.isEmpty() | queQuan.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Vui lòng kiểm tra định dạng dữ liệu");
                return;
            }

            if (chucVu) {
                boolean isBepTruong = checkBT.isSelected();
                Double thuongChucVu = isBepTruong ? Double.parseDouble(txThuong.getText()) : 0;
                listNV.add(new NhanVienBep(isBepTruong, thuongChucVu, hoTen, queQuan, thamNien, soGioLam));
            } else {
                boolean bietNN = checkNN.isSelected();
                listNV.add(new NhanVienThuNgan(bietNN, hoTen, queQuan, thamNien, soGioLam));
            }
            JOptionPane.showMessageDialog(null, "lưu thành công");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Vui lòng kiểm tra định dạng dữ liệu");
        }


    }//GEN-LAST:event_btnLuuActionPerformed

    private void checkBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBTActionPerformed
        if (checkBT.isSelected()) {
            txThuong.setEnabled(true);
        } else {
            txThuong.setEnabled(false);
        }
    }//GEN-LAST:event_checkBTActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        dtm.setRowCount(0);

        for (NhanVien nv : listNV) {
            String chucVu = (nv instanceof NhanVienBep) ? "Nhân viên bếp" : "Nhân viên thu ngân";
            dtm.addRow(new Object[]{
                nv.getHoTen(),
                nv.getThamNien(),
                nv.getQueQuan(),
                chucVu,
                nv.getSoGioLamViec(),
                nv.tinhLuong()
            });
        }

        table.setModel(dtm);
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnSaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveFileActionPerformed
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            ArrayList<NhanVien> ds = getList();
            for (NhanVien nv : ds) {
                bw.write(nv.toString());
                bw.newLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(QuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveFileActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSaveFile;
    private javax.swing.JButton btnShow;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkBT;
    private javax.swing.JCheckBox checkNN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdNVB;
    private javax.swing.JRadioButton rdNVTN;
    private javax.swing.JTable table;
    private javax.swing.JTextField txGiolam;
    private javax.swing.JTextField txHoten;
    private javax.swing.JTextField txQueQuan;
    private javax.swing.JTextField txThamnien;
    private javax.swing.JTextField txThuong;
    // End of variables declaration//GEN-END:variables
}
