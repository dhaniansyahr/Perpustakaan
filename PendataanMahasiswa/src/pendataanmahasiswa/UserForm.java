/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pendataanmahasiswa;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author meone
 */
public class UserForm extends javax.swing.JFrame {

    /**
     * Creates new form UserForm
     */
    public UserForm() {
        initComponents();
    }
    
    int randNpm(){
        Random r = new Random(System.currentTimeMillis());
        return ((1 + r.nextInt(9)) * 10000 + r.nextInt(9999));
    }
    
    boolean validateText(){
        if (nameUser.getText().equals("") || emailUser.getText().equals("") || passUser.getText().equals("")
                || ttlUser.getDate() == null || npmUser.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Mohon Lengkapi Data Anda!!");
            return false;
        }else if ( ttlUser.getDate().compareTo(new Date()) > 0){
            JOptionPane.showMessageDialog(null, "Tolong isi Tanggal lahir dengan Benar");
            return false;
        }else{
            return true;
        }
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nameUser = new javax.swing.JTextField();
        prodiUser = new javax.swing.JComboBox<>();
        emailUser = new javax.swing.JTextField();
        passUser = new javax.swing.JPasswordField();
        priaRadioButton = new javax.swing.JRadioButton();
        wanitaRadioButton = new javax.swing.JRadioButton();
        ttlUser = new com.toedter.calendar.JDateChooser();
        npmUser = new javax.swing.JTextField();
        lihatPass = new javax.swing.JCheckBox();
        RandomButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        DaftarButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nomorUser = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bitstream Charter", 1, 18)); // NOI18N
        jLabel1.setText("FULL NAME :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bitstream Charter", 1, 18)); // NOI18N
        jLabel2.setText("Prodi :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bitstream Charter", 1, 18)); // NOI18N
        jLabel3.setText("EMAIL :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bitstream Charter", 1, 18)); // NOI18N
        jLabel4.setText("PASSWORD :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bitstream Charter", 1, 18)); // NOI18N
        jLabel5.setText("GENDER :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bitstream Charter", 1, 18)); // NOI18N
        jLabel6.setText("Tanggal Lahir :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, -1, -1));

        jLabel7.setFont(new java.awt.Font("Bitstream Charter", 1, 18)); // NOI18N
        jLabel7.setText("NPM :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Bitstream Charter", 1, 48)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("UNIVERSITAS Y");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 700, 100));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pendataanmahasiswa/ProfileUniv.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pendataanmahasiswa/Back.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 650));

        nameUser.setBackground(new java.awt.Color(0, 204, 0));
        nameUser.setFont(new java.awt.Font("Bitstream Charter", 0, 18)); // NOI18N
        nameUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jPanel1.add(nameUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 170, 310, -1));

        prodiUser.setBackground(new java.awt.Color(0, 204, 0));
        prodiUser.setFont(new java.awt.Font("Bitstream Charter", 0, 18)); // NOI18N
        prodiUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PDSI", "HUKUM", "IT" }));
        prodiUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jPanel1.add(prodiUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 210, 310, -1));

        emailUser.setBackground(new java.awt.Color(0, 204, 0));
        emailUser.setFont(new java.awt.Font("Bitstream Charter", 0, 18)); // NOI18N
        emailUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jPanel1.add(emailUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 250, 310, -1));

        passUser.setBackground(new java.awt.Color(0, 204, 0));
        passUser.setFont(new java.awt.Font("Bitstream Charter", 0, 18)); // NOI18N
        passUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jPanel1.add(passUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 330, 310, -1));

        priaRadioButton.setBackground(new java.awt.Color(0, 204, 0));
        buttonGroup1.add(priaRadioButton);
        priaRadioButton.setFont(new java.awt.Font("Bitstream Charter", 0, 18)); // NOI18N
        priaRadioButton.setText("PRIA");
        jPanel1.add(priaRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 370, -1, -1));

        wanitaRadioButton.setBackground(new java.awt.Color(0, 204, 0));
        buttonGroup1.add(wanitaRadioButton);
        wanitaRadioButton.setFont(new java.awt.Font("Bitstream Charter", 0, 18)); // NOI18N
        wanitaRadioButton.setText("WANITA");
        jPanel1.add(wanitaRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 370, -1, -1));

        ttlUser.setBackground(new java.awt.Color(0, 204, 0));
        ttlUser.setDateFormatString("d - MMM - y");
        ttlUser.setFont(new java.awt.Font("Bitstream Charter", 0, 18)); // NOI18N
        jPanel1.add(ttlUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 410, 310, -1));

        npmUser.setEditable(false);
        npmUser.setBackground(new java.awt.Color(0, 204, 0));
        npmUser.setFont(new java.awt.Font("Bitstream Charter", 0, 18)); // NOI18N
        npmUser.setForeground(new java.awt.Color(204, 204, 204));
        npmUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jPanel1.add(npmUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 450, 310, -1));

        lihatPass.setFont(new java.awt.Font("Bitstream Charter", 0, 15)); // NOI18N
        lihatPass.setText("Lihat Password");
        lihatPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lihatPassMouseClicked(evt);
            }
        });
        jPanel1.add(lihatPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 330, -1, -1));

        RandomButton.setBackground(new java.awt.Color(102, 102, 102));
        RandomButton.setFont(new java.awt.Font("Bitstream Charter", 0, 18)); // NOI18N
        RandomButton.setText("Random");
        RandomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandomButtonActionPerformed(evt);
            }
        });
        jPanel1.add(RandomButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 440, 110, -1));

        CancelButton.setBackground(new java.awt.Color(102, 102, 102));
        CancelButton.setFont(new java.awt.Font("Bitstream Charter", 1, 18)); // NOI18N
        CancelButton.setText("CANCEL");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 530, -1, -1));

        DaftarButton.setBackground(new java.awt.Color(102, 102, 102));
        DaftarButton.setFont(new java.awt.Font("Bitstream Charter", 1, 18)); // NOI18N
        DaftarButton.setText("DAFTAR");
        DaftarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaftarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(DaftarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 530, -1, -1));

        jLabel8.setFont(new java.awt.Font("Bitstream Charter", 0, 48)); // NOI18N
        jLabel8.setText("MAHASISWA FORM");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 60, -1, -1));

        jLabel9.setFont(new java.awt.Font("Bitstream Charter", 1, 18)); // NOI18N
        jLabel9.setText("No Telepon :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, -1, -1));

        nomorUser.setBackground(new java.awt.Color(0, 204, 0));
        nomorUser.setFont(new java.awt.Font("Bitstream Charter", 0, 18)); // NOI18N
        nomorUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        nomorUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomorUserKeyTyped(evt);
            }
        });
        jPanel1.add(nomorUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 290, 310, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RandomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RandomButtonActionPerformed
        // TODO add your handling code here:
        String prodi = prodiUser.getItemAt(prodiUser.getSelectedIndex());
        
        if (prodi.equalsIgnoreCase("IT")){
            String npm = "1402" + Integer.toString(ThreadLocalRandom.current().nextInt(999999));
            npmUser.setText(npm);
        }else if (prodi.equalsIgnoreCase("HUKUM")){
            String npm = "1202" + Integer.toString(ThreadLocalRandom.current().nextInt(999999));
            npmUser.setText(npm);
        }else {
            String npm = "1502" + Integer.toString(ThreadLocalRandom.current().nextInt(999999));
            npmUser.setText(npm);
        }
    }//GEN-LAST:event_RandomButtonActionPerformed

    private void lihatPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lihatPassMouseClicked
        // TODO add your handling code here:
        if (lihatPass.isSelected()){
            passUser.setEchoChar('\u0000');
        }else{
            passUser.setEchoChar('*');
        }
    }//GEN-LAST:event_lihatPassMouseClicked

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        // TODO add your handling code here:
        new LoginForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void DaftarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaftarButtonActionPerformed
        // TODO add your handling code here:
        String nama = nameUser.getText().trim();
        String prodi = prodiUser.getItemAt(prodiUser.getSelectedIndex());
        String email = emailUser.getText().trim();
        String pass = passUser.getText().trim();
        String nomor = nomorUser.getText().trim();
        String gender;
        if (priaRadioButton.isSelected()){
            gender = "PRIA";
        }else{
            gender = "WANITA";
        }
        String npm = npmUser.getText().trim();
        
        if (validateText()){
            SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
            String date = dt.format(ttlUser.getDate());
            
            Mahasiswa mhs = new Mahasiswa();
            
            mhs.InsertUpdateDelete('i', nama, prodi, email, pass, gender, date, npm, nomor, nama);
        }
        
    }//GEN-LAST:event_DaftarButtonActionPerformed

    private void nomorUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomorUserKeyTyped
        // allow to only number for number phone
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_nomorUserKeyTyped

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        new LoginForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

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
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton DaftarButton;
    private javax.swing.JButton RandomButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField emailUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox lihatPass;
    private javax.swing.JTextField nameUser;
    private javax.swing.JTextField nomorUser;
    private javax.swing.JTextField npmUser;
    private javax.swing.JPasswordField passUser;
    private javax.swing.JRadioButton priaRadioButton;
    private javax.swing.JComboBox<String> prodiUser;
    private com.toedter.calendar.JDateChooser ttlUser;
    private javax.swing.JRadioButton wanitaRadioButton;
    // End of variables declaration//GEN-END:variables
}