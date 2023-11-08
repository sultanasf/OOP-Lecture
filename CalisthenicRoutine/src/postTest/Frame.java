package postTest;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Sultan Firdaus
 */
public class Frame extends javax.swing.JFrame {

    private final LoginPanel loginPanel;
    private final MainPanel mainPanel;
    private InsertPanel insertPanel;
    private EditPanel editPanel;

    public Frame() {
        initComponents();
        ImageIcon img = new ImageIcon(getClass().getResource("/assets/icon.png"));
        this.setIconImage(img.getImage());
        loginPanel = new LoginPanel(this);
        mainPanel = new MainPanel(this);
        loadPanel(loginPanel);
    }

    public void loadPanel(JPanel panel) {
        getContentPane().removeAll();
        getContentPane().add(panel);
        panel.setVisible(true);
        pack();
        revalidate();
        repaint();
    }

    public MainPanel getMainPanel() {
        return mainPanel;
    }

    public InsertPanel getInsertPanel() {
        insertPanel = new InsertPanel(this);
        return insertPanel;
    }
    
    public EditPanel getEditPanel(int index) {
        editPanel = new EditPanel(this, index);
        return editPanel;
    }

    public LoginPanel getLoginPanel() {
        return loginPanel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SahabatMobil");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Frame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
