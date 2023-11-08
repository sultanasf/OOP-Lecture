/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lat1;

/**
 *
 * @author Sultan Firdaus
 */
public class Latihan1 {

    public static void main(String[] args) {
        int nrp[] = {1, 2, 3, 4};
//        String namaMhs[] = {"Ahmad, Adang, Dani, Edi"};
        double nilai[][] = new double[4][3];
        double rerata[] = new double[4];

        //isi nilai
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

        System.out.println("NRP\tRata-rata");
        System.out.println("------------");
        //cari rata2 dan tampilkan
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                rerata[i] += nilai[i][j];
            }
            rerata[i] /= nilai[0].length;
            System.out.println(nrp[i] + "\t" + rerata[i]);
        }

    }
}
