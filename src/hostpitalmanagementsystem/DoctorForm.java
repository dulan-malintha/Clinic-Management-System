
package hostpitalmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DoctorForm extends javax.swing.JFrame {
    
    int token;
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public DoctorForm() {
        initComponents();
    }
    
    public ArrayList<Medicine> listItems() throws SQLException{
        ArrayList<Medicine> listItems = new  ArrayList<>();
        con = DriverManager.getConnection("jdbc:mysql://localhost/cms","root","");
        String sql = "SELECT * FROM medicine WHERE token_number=?";
        pst = con.prepareStatement(sql);
        pst.setString(1, token+"");
        rs = pst.executeQuery();
        Medicine medicine;
        while(rs.next()){
            medicine = new Medicine(rs.getString("item"));
            listItems.add(medicine);
        }
        return listItems;
    }
    public void showItems() throws SQLException{
        ArrayList<Medicine> list = listItems();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[1];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getItem();
            model.addRow(row);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button_register = new javax.swing.JButton();
        button_register1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Text_NIC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Text_Medi = new javax.swing.JTextField();
        button_register2 = new javax.swing.JButton();
        button_register3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        button_register4 = new javax.swing.JButton();
        Label_token = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        button_register5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        button_register.setBackground(new java.awt.Color(240, 0, 1));
        button_register.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        button_register.setForeground(new java.awt.Color(255, 255, 255));
        button_register.setText("Register");
        button_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_registerActionPerformed(evt);
            }
        });

        button_register1.setBackground(new java.awt.Color(240, 0, 1));
        button_register1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        button_register1.setForeground(new java.awt.Color(255, 255, 255));
        button_register1.setText("Register");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Channelling");

        Text_NIC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("issue medicine to patients");

        jLabel5.setText("Patient NIC");

        jLabel7.setText("Add and Delete Medicine");

        Text_Medi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Text_Medi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Text_MediMouseClicked(evt);
            }
        });

        button_register2.setBackground(new java.awt.Color(240, 0, 1));
        button_register2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        button_register2.setForeground(new java.awt.Color(255, 255, 255));
        button_register2.setText("Add");
        button_register2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_register2ActionPerformed(evt);
            }
        });

        button_register3.setBackground(new java.awt.Color(240, 0, 1));
        button_register3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        button_register3.setForeground(new java.awt.Color(255, 255, 255));
        button_register3.setText("Delete");
        button_register3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_register3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Items"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        button_register4.setBackground(new java.awt.Color(240, 0, 1));
        button_register4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        button_register4.setForeground(new java.awt.Color(255, 255, 255));
        button_register4.setText("Check NIC");
        button_register4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_register4ActionPerformed(evt);
            }
        });

        Label_token.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Label_token.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setText("Token number");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 0, 1));
        jLabel12.setText("Log Out");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        button_register5.setBackground(new java.awt.Color(240, 0, 1));
        button_register5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        button_register5.setForeground(new java.awt.Color(255, 255, 255));
        button_register5.setText("Finish");
        button_register5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_register5ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled-2.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(Text_Medi, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_token, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(button_register2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button_register3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(Text_NIC, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button_register4)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(button_register5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_NIC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_register4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_token, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text_Medi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(button_register3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button_register5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addComponent(button_register2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_registerActionPerformed
        
    }//GEN-LAST:event_button_registerActionPerformed

    private void button_register2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_register2ActionPerformed
        DefaultTableModel newmodel = (DefaultTableModel) jTable1.getModel();
        newmodel.setRowCount(0);
        try {
            String sql = "INSERT INTO `medicine`(`item`, `token_number`) VALUES (?,?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost/cms","root","");
            pst = con.prepareStatement(sql);
            String Medi = Text_Medi.getText().toString();
            pst.setString(1, Medi);
            pst.setString(2, token+"");
            pst.executeUpdate();
            showItems();
        } catch (Exception ex) {
            System.out.println("Eroor : "+ex);
        }    
    }//GEN-LAST:event_button_register2ActionPerformed

    private void button_register3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_register3ActionPerformed
            DefaultTableModel newmodel = (DefaultTableModel) jTable1.getModel();
            newmodel.setRowCount(0);
            try {
                String sql = "DELETE FROM `medicine` WHERE item=? AND token_number=?";
                con = DriverManager.getConnection("jdbc:mysql://localhost/cms","root","");
                pst = con.prepareStatement(sql);
                pst.setString(1, Text_Medi.getText());
                pst.setString(2, token+"");
                pst.execute();
                showItems();
            } catch (Exception e) {
                System.out.println("Error : "+e);
            }
            
    }//GEN-LAST:event_button_register3ActionPerformed

    private void button_register4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_register4ActionPerformed

        Random rand = new Random();
        try{
            String sql = "SELECT * FROM users WHERE u_NIC=? AND u_account_type=?";
            con = DriverManager.getConnection("jdbc:mysql://localhost/cms","root","");
            pst = con.prepareStatement(sql);
            String NIC = Text_NIC.getText();
            pst.setString(1, NIC);
            pst.setString(2, "Patient");
            rs = pst.executeQuery();
            if(rs.next()){
                String patientName = rs.getString("u_name");
                JOptionPane.showMessageDialog(null, "NIC is valid,\nPatient : "+patientName);

                    try{
                        token = 10000  + rand.nextInt(1000000000-10000);
                        sql = "INSERT INTO `token`(`u_NIC`, `token_number` , `token_status`) VALUES (?,?,?)";
                        con = DriverManager.getConnection("jdbc:mysql://localhost/cms","root","");
                        pst = con.prepareStatement(sql);
                        pst.setString(1, NIC);
                        pst.setString(2, token+"");
                        pst.setString(3, "notcomplete");
                        pst.executeUpdate();
                        Label_token.setText(token+"");
                    }catch(Exception ex){
                        System.out.println("Error : "+ex);
                    } 

            }else{
                JOptionPane.showMessageDialog(null, "check NIC");
            }
        }catch(Exception ex){
            System.out.println("Query Update Fall "+ex);
        }
    }//GEN-LAST:event_button_register4ActionPerformed

    private void Text_MediMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text_MediMouseClicked
        Text_Medi.setText("");
    }//GEN-LAST:event_Text_MediMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked

        DoctorForm doctorForm = new DoctorForm();
        doctorForm.setVisible(false);
        dispose();
        HomeFrame homeFrame = new HomeFrame();
        homeFrame.setVisible(true);
        homeFrame.pack();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void button_register5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_register5ActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Do you want medicine now?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(response == JOptionPane.YES_OPTION){
            String sql = "UPDATE token SET token_status=? WHERE token_number=?";
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/cms","root","");
                pst = con.prepareStatement(sql);
                pst.setString(1, "pending");
                pst.setString(2, Label_token.getText());
                pst.executeUpdate();
            } catch (Exception ex) {
                System.out.println(""+ex);
            }
        }else if(response == JOptionPane.NO_OPTION){
            Text_NIC.setText("");
            Text_Medi.setText("");
            Label_token.setText("");
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
        }
    }//GEN-LAST:event_button_register5ActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_token;
    private javax.swing.JTextField Text_Medi;
    private javax.swing.JTextField Text_NIC;
    private javax.swing.JButton button_register;
    private javax.swing.JButton button_register1;
    private javax.swing.JButton button_register2;
    private javax.swing.JButton button_register3;
    private javax.swing.JButton button_register4;
    private javax.swing.JButton button_register5;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
