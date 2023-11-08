/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konversi;

import java.util.Scanner;

/**
 *
 * @author Sultan Firdaus
 */
public class Konversi {

    static String decToBin(int x) {
        String biner;
        int sisa;
        biner = "";
        while (x > 0) {
            sisa = x % 2;
            biner = sisa + biner;
            x /= 2;
        }
        return biner;
    }

    static String hexToBin(int x) {
        String heksa = "";
        int sisa;
        while (x > 0) {
            sisa = x % 16;
            if (sisa > 9) {
                sisa = sisa + 55;
                heksa = (char) sisa + heksa;
            } else {
                heksa = sisa + heksa;
            }
            x = x / 16;
        }
        return heksa;
    }

    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Konversi Desimal ke biner & heksadesimal");
        System.out.print("Masukkan bilangan desimal : ");
        input = sc.nextInt();
        System.out.printf("Hasil konversi dari %d ke biner = %s\n", input, decToBin(input));
        System.out.printf("Hasil konversi dari %d ke heksadesimal = %s\n", input, hexToBin(input));
    }

}
