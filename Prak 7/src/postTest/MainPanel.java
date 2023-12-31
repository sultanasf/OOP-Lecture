/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package postTest;

/**
 *
 * @author Sultan Firdaus
 */
public class MainPanel extends javax.swing.JPanel {

    private final MainFrame frame;

    /**
     * Creates new form MainPanel
     *
     * @param frame
     */
    public MainPanel(MainFrame frame) {
        initComponents();
        this.frame = frame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bankAppLabel = new javax.swing.JLabel();
        btnAdmin = new javax.swing.JButton();
        btnNasabah = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        bankAppLabel.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        bankAppLabel.setText("Bank App");
        add(bankAppLabel);
        bankAppLabel.setBounds(80, 6, 99, 26);

        btnAdmin.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnAdmin.setText("Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });
        add(btnAdmin);
        btnAdmin.setBounds(80, 50, 99, 32);

        btnNasabah.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnNasabah.setText("Nasabah");
        btnNasabah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNasabahActionPerformed(evt);
            }
        });
        add(btnNasabah);
        btnNasabah.setBounds(80, 100, 101, 32);

        btnExit.setBackground(java.awt.Color.red);
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnExit.setForeground(java.awt.Color.black);
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        add(btnExit);
        btnExit.setBounds(80, 150, 99, 32);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bg.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 249, 202);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        this.setVisible(true);
        frame.showAdminLoginPanel();
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnNasabahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNasabahActionPerformed
        this.setVisible(true);
        frame.showNasabahLoginPanel();
    }//GEN-LAST:event_btnNasabahActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bankAppLabel;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNasabah;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
