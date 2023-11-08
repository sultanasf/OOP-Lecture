/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiFrameCLass;

/**
 *
 * @author Sultan Firdaus
 */
public class MultiFrame {

    private Frame1 frame1;
    private Frame2 frame2;
    private Frame3 frame3;
    private Frame4 frame4;

    public MultiFrame() {
        frame1 = new Frame1(this, "Lingkaran");
        frame2 = new Frame2(this, "Persegi");
        frame3 = new Frame3(this, "Suhu");
        frame4 = new Frame4(this, "Mata Uang");

        frame1.setVisible(true);
    }

    public void moveToFrame(BaseFrame frameBefore, BaseFrame frameTarget) {
        frameBefore.setVisible(false);
        if (frameTarget instanceof Frame1) {
            Frame1 frame = (Frame1) frameTarget;
            frame.setPrevFrameName(frameBefore.getFrameName());
            frame.setVisible(true);
            System.out.println("Frame 1");
        } else if (frameTarget instanceof Frame2) {
            Frame2 frame = (Frame2) frameTarget;
            frame.setPrevFrameName(frameBefore.getFrameName());
            frame.setVisible(true);
            System.out.println("Frame 2");
        } else if (frameTarget instanceof Frame3) {
            Frame3 frame = (Frame3) frameTarget;
            frame.setPrevFrameName(frameBefore.getFrameName());
            frame.setVisible(true);
            System.out.println("Frame 3");
        } else if (frameTarget instanceof Frame4) {
            Frame4 frame = (Frame4) frameTarget;
            frame.setPrevFrameName(frameBefore.getFrameName());
            frame.setVisible(true);
            System.out.println("Frame 4");
        }
    }

    public void moveToFrame(String frameTarget, String prevFrameName) {
        switch (frameTarget) {
            case "frame 1":
                frame1.setPrevFrameName(prevFrameName);
                frame1.setVisible(true);
                break;
            case "frame 2":
                frame2.setPrevFrameName(prevFrameName);
                frame2.setVisible(true);
                break;
            case "frame 3":
                frame3.setPrevFrameName(prevFrameName);
                frame3.setVisible(true);
                break;
            case "frame 4":
                frame4.setPrevFrameName(prevFrameName);
                frame4.setVisible(true);
                break;
        }
    }

    public Frame1 getFrame1() {
        return frame1;
    }

    public Frame2 getFrame2() {
        return frame2;
    }

    public Frame3 getFrame3() {
        return frame3;
    }

    public Frame4 getFrame4() {
        return frame4;
    }
//
//    public Frame5 getFrame5() {
//        return frame5;
//    }
//
//    public Frame6 getFrame6() {
//        return frame6;
//    }
//
//    public Frame7 getFrame7() {
//        return frame7;
//    }
//
//    public Frame8 getFrame8() {
//        return frame8;
//    }
//
//    public Frame9 getFrame9() {
//        return frame9;
//    }
//
//    public Frame10 getFrame10() {
//        return frame10;
//    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new MultiFrame();
        });
    }
}
