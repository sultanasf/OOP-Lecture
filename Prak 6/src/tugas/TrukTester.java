/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author Sultan Firdaus
 */
public class TrukTester {

    public static void main(String[] args) {
        Truk fuso = new Truk(1000);

        fuso.addBeban(800);

        if (fuso.addBeban(200)) {
            System.out.println("Berhasil menambah beban");
            fuso.getInfoBeban();
        } else {
            System.out.println("Gagal menambah beban, sisa hanya = " + fuso.getInfoSisaBeban());
        }

    }
}
