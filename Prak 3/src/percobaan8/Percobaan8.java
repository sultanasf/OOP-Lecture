/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan8;

/**
 *
 * @author Sultan Firdaus
 */
public class Percobaan8 {

    public static void main(String args[]) {
        int a, b;
        for (a = 0; a < 2; a++) {
            Mulai:
            for (b = 0; b < 3; b++) {
                if (b == 1) {
                    break Mulai;
                }
                System.out.println("a=" + a + " ; b=" + b);
            }
        }
    }

}
