/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author DANH
 */
public class frmCheckIn extends javax.swing.JFrame {

    /**
     * Creates new form frmCheckIn
     */
    private Connection conn=null;
    
    public frmCheckIn() {
        initComponents();
        this.setTitle("Check-in");
    }
    private void kn() {
        String url = "jdbc:sqlserver://DESKTOP-G06V6DT\\SQLEXPRESS;databasename=ChamCong;"
                    + "username=sa;password=sa2019";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url);
//        } catch (Exception e) {
//            System.out.println("Kết nối cơ sở dữ liệu thất bại");
//        }
        } catch (ClassNotFoundException e) {
            System.out.println("Không tìm thấy SQL Server JDBC Driver");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Kết nối đến cơ sở dữ liệu thất bại");
            e.printStackTrace();
        }
    }
    
    
    //Hàm kiểm tra nhập rỗng hay không vào dữ liệu
    private boolean kiemtrarong(){
        if(TextField_manhanvien.getText().equals("") && TextField_password.getText().equals("")){
            Label_trangthai.setText("Vui lòng nhập Mã nhân viên và Mật khẩu!");
            return false;
        } else if (TextField_manhanvien.getText().equals("")){
            Label_trangthai.setText("Vui lòng nhập Mã nhân viên!");
            return false;
        }  else if (TextField_password.getText().equals("")){
            Label_trangthai.setText("Vui lòng nhập Mật khẩu!");
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Button_checkin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TextField_manhanvien = new javax.swing.JTextField();
        Label_trangthai = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextField_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Check-in");

        Button_checkin.setText("Check-in");
        Button_checkin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_checkinActionPerformed(evt);
            }
        });

        jLabel2.setText("Nhập Mã Nhân viên");

        TextField_manhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_manhanvienActionPerformed(evt);
            }
        });

        jLabel3.setText("Nhập Mật khẩu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(Button_checkin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_trangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextField_manhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(TextField_password))))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(Label_trangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextField_manhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextField_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(Button_checkin)
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TextField_manhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_manhanvienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_manhanvienActionPerformed

    public static String tenNV = "";
    public static String maNV = "";

    private void Button_checkinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_checkinActionPerformed
        if (kiemtrarong()) {
            try {
                kn();
                String sql = "SELECT * FROM dbo.Employee WHERE employeeID = ? AND password = ?";
                try (PreparedStatement ps = conn.prepareStatement(sql)) {
                    ps.setString(1, TextField_manhanvien.getText());
                    ps.setString(2, TextField_password.getText());

                    try (ResultSet rs = ps.executeQuery()) {
                        if (rs.next()) {
                            String employeeID = rs.getString("employeeID").trim();
                            tenNV = rs.getString("name");
                            maNV = rs.getString("employeeID");

                            sql = "INSERT INTO dbo.ChamCong(employeeID, date, checkin) VALUES (?, ?, ?)";
                            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                                LocalDate date = LocalDate.now();
                                LocalTime time = LocalTime.now();

                                pstmt.setString(1, employeeID);
                                pstmt.setString(2, date.toString());
                                pstmt.setString(3, time.toString());
                                pstmt.executeUpdate();

                                frmThongTin thongtin = new frmThongTin();
                                this.setVisible(false);
                                thongtin.setVisible(true);
                            }
                        } else {
                            Label_trangthai.setText("Bạn đã nhập sai tài khoản hoặc mật khẩu!");
                        }
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                try {
                    if (conn != null && !conn.isClosed()) {
                        conn.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_Button_checkinActionPerformed

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
            java.util.logging.Logger.getLogger(frmCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCheckIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_checkin;
    private javax.swing.JLabel Label_trangthai;
    private javax.swing.JTextField TextField_manhanvien;
    private javax.swing.JPasswordField TextField_password;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
