/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lat1_OOP;

/**
 *
 * @author Sultan Firdaus
 */
public class TestOOP {

    public static void main(String[] args) {
        double nilai[][] = new double[4][3];

        nilai[0][0] = 81;
        nilai[0][1] = 90;
        nilai[0][2] = 62;

        nilai[1][0] = 50;
        nilai[1][1] = 83;
        nilai[1][2] = 87;

        nilai[2][0] = 89;
        nilai[2][1] = 55;
        nilai[2][2] = 65;

        nilai[3][0] = 77;
        nilai[3][1] = 70;
        nilai[3][2] = 92;

        Mahasiswa mahasiswa[] = new Mahasiswa[4];
        mahasiswa[0] = new Mahasiswa(1, "Ahmad", nilai[0]);
        mahasiswa[1] = new Mahasiswa(2, "Adang", nilai[1]);
        mahasiswa[2] = new Mahasiswa(3, "Dani", nilai[2]);
        mahasiswa[3] = new Mahasiswa(4, "Edi", nilai[3]);

        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println(mahasiswa[i].getNrp() + "\t" + mahasiswa[i].getRataRata());
        }
    }
}
