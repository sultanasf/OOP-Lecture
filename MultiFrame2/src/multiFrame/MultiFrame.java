/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiFrame;

/**
 *
 * @author Sultan Firdaus
 */
public class MultiFrame {

    private Frame1 frame1;
    private Frame2 frame2;
    private Frame3 frame3;
    private Frame4 frame4;
    private Frame5 frame5;
    private Frame6 frame6;
    private Frame7 frame7;
    private Frame8 frame8;
    private Frame9 frame9;
    private Frame10 frame10;

    public MultiFrame() {
        frame1 = new Frame1(this, "frame 1", "G ada");
        frame1.setVisible(true);
    }

    public void showFrame1(String prevFrameName) {
        frame1 = new Frame1(this, "frame 1", prevFrameName);
        frame1.setVisible(true);
    }

    public void showFrame2(String prevFrameName) {
        frame2 = new Frame2(this, "frame 2", prevFrameName);
        frame2.setVisible(true);
    }

    public void showFrame3(String prevFrameName) {
        frame3 = new Frame3(this, "frame 3", prevFrameName);
        frame3.setVisible(true);
    }

    public void showFrame4(String prevFrameName) {
        frame4 = new Frame4(this, "frame 4", prevFrameName);
        frame4.setVisible(true);
    }

    public void showFrame5(String prevFrameName) {
        frame5 = new Frame5(this, "frame 5", prevFrameName);
        frame5.setVisible(true);
    }

    public void showFrame6(String prevFrameName) {
        frame6 = new Frame6(this, "frame 6", prevFrameName);
        frame6.setVisible(true);
    }

    public void showFrame7(String prevFrameName) {
        frame7 = new Frame7(this, "frame 7", prevFrameName);
        frame7.setVisible(true);
    }

    public void showFrame8(String prevFrameName) {
        frame8 = new Frame8(this, "frame 8", prevFrameName);
        frame8.setVisible(true);
    }

    public void showFrame9(String prevFrameName) {
        frame9 = new Frame9(this, "frame 9", prevFrameName);
        frame9.setVisible(true);
    }

    public void showFrame10(String prevFrameName) {
        frame10 = new Frame10(this, "frame 10", prevFrameName);
        frame10.setVisible(true);
    }

    public static void main(String[] args) {
//        new MultiFrame();
//        java.awt.EventQueue.invokeLater(() -> {
            new MultiFrame();
//        });
    }
}
