/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan1;

/**
 *
 * @author Sultan Firdaus
 */
public class Percobaan1 {

    public static void main(String args[]) {
        int nilai[] = new int[3];
        nilai[0] = 70;
        nilai[1] = 80;
        nilai[2] = 65;
        double ratarata = 0.0;
        for (int i = 0; i < nilai.length; i++) {
            ratarata += nilai[i];
        }
        ratarata /= nilai.length;
        System.out.println("Nilai rata-rata = " + ratarata);
    }
}
