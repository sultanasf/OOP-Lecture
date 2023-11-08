/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author Sultan Firdaus
 */
public class Persegi {

    private int banyakPersegi;

    public Persegi(int n) {
        banyakPersegi = n;
    }

    public void getLuas() {
        for (int i = 0; i < banyakPersegi; i++) {
            System.out.println("Luas persegi ke-" + (i + 1) + " = " + ((i + 1) * (i + 1)));
        }
    }

    public void getKeliling() {
        for (int i = 0; i < banyakPersegi; i++) {
            System.out.println("Keliling persegi ke-" + (i + 1) + " = " + ((i + 1) * 4));
        }
    }
}
