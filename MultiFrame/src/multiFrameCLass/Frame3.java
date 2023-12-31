/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package multiFrameCLass;

import models.KonversiSuhu;

/**
 *
 * @author Sultan Firdaus
 */
public class Frame3 extends BaseFrame {

    public Frame3(MultiFrame multiFrame, String frameName) {
        super(multiFrame, frameName);
        initComponents();
        labelCurrentFrame.setText(super.getFrameName());
    }

    private void changeView(int index) {
        switch (index) {
            case 1:
                super.getMultiFrame().moveToFrame(this, super.getMultiFrame().getFrame1());
                break;
            case 2:
                super.getMultiFrame().moveToFrame(this, super.getMultiFrame().getFrame2());
                break;
            case 3:
                super.getMultiFrame().moveToFrame(this, super.getMultiFrame().getFrame3());
                break;
            case 4:
                super.getMultiFrame().moveToFrame(this, super.getMultiFrame().getFrame4());
                break;
            default:
                throw new AssertionError();
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

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelCurrentFrame = new javax.swing.JLabel();
        labelPreviousFrame = new javax.swing.JLabel();
        btnFrame1 = new javax.swing.JButton();
        btnFrame2 = new javax.swing.JButton();
        btnFrame3 = new javax.swing.JButton();
        btnFrame4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnConvert = new javax.swing.JButton();
        labelHasil = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Current Frame     : ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Previous Frame   : ");

        labelCurrentFrame.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCurrentFrame.setText("label");

        labelPreviousFrame.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelPreviousFrame.setText("Ga Ada");

        btnFrame1.setText("Frame 1");
        btnFrame1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrame1ActionPerformed(evt);
            }
        });

        btnFrame2.setText("Frame 2");
        btnFrame2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrame2ActionPerformed(evt);
            }
        });

        btnFrame3.setText("Frame 3");
        btnFrame3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrame3ActionPerformed(evt);
            }
        });

        btnFrame4.setText("Frame 4");
        btnFrame4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrame4ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Konverter Suhu");

        jLabel4.setText("Celcius(c°)");

        btnConvert.setText("Convert");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        labelHasil.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelHasil.setForeground(new java.awt.Color(51, 255, 51));
        labelHasil.setText("Hasil");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPreviousFrame, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(labelCurrentFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnFrame1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFrame2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFrame3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFrame4)
                        .addGap(48, 48, 48))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelHasil)
                .addGap(197, 197, 197))
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(btnConvert)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelCurrentFrame))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelPreviousFrame))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(btnConvert)
                .addGap(18, 18, 18)
                .addComponent(labelHasil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFrame1)
                    .addComponent(btnFrame2)
                    .addComponent(btnFrame3)
                    .addComponent(btnFrame4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFrame2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrame2ActionPerformed
        changeView(2);
    }//GEN-LAST:event_btnFrame2ActionPerformed

    private void btnFrame3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrame3ActionPerformed
        changeView(3);
    }//GEN-LAST:event_btnFrame3ActionPerformed

    private void btnFrame4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrame4ActionPerformed
        changeView(4);
    }//GEN-LAST:event_btnFrame4ActionPerformed

    private void btnFrame1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrame1ActionPerformed
        changeView(1);
    }//GEN-LAST:event_btnFrame1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        labelPreviousFrame.setText(super.getPrevFrameName());
        labelHasil.setText("Hasil");
    }//GEN-LAST:event_formComponentShown

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        double c = Double.parseDouble(txtInput.getText());
        KonversiSuhu suhu = new KonversiSuhu(c);
        labelHasil.setText(String.valueOf(suhu.convert()) + "F");
    }//GEN-LAST:event_btnConvertActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvert;
    private javax.swing.JButton btnFrame1;
    private javax.swing.JButton btnFrame2;
    private javax.swing.JButton btnFrame3;
    private javax.swing.JButton btnFrame4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel labelCurrentFrame;
    private javax.swing.JLabel labelHasil;
    private javax.swing.JLabel labelPreviousFrame;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}
