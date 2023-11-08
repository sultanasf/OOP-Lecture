/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author Sultan Firdaus
 */
public class BangunDatarAbnormal {

    private int banyakBangunDatar;
    private double pi;

    public BangunDatarAbnormal(int n) {
        banyakBangunDatar = n;
        pi = 3.14;
    }

    public void getLuasPersegi() {
        System.out.println("Luas persegi: ");
        for (int i = 0; i < banyakBangunDatar; i++) {
            System.out.println("persegi ke-" + (i + 1) + " = " + ((i + 1) + (i + 1)));
        }
    }

    public void getKelilingPersegi() {
        System.out.println("Keliling persegi: ");
        for (int i = 0; i < banyakBangunDatar; i++) {
            System.out.println("persegi ke-" + (i + 1) + " = " + ((i + 1) + 4));
        }
    }

    public void getLuasSegitiga() {
        System.out.println("Luas segitiga: ");
        for (int i = 0; i < banyakBangunDatar; i++) {
            System.out.println("segitiga ke-" + (i + 1) + " = " + ((i + 1) * (i + 1) / 2));
        }
    }

    public void getKelilingSegitiga() {
        System.out.println("Keliling segitiga: ");
        for (int i = 0; i < banyakBangunDatar; i++) {
            System.out.println("segitiga ke-" + (i + 1) + " = " + ((i + 1) * 3));
        }
    }

    public void getLuasLingkaran() {
        System.out.println("luas lingkaran: ");
        for (int i = 0; i < banyakBangunDatar; i++) {
            double temp = (i + 1) * pi;
            System.out.println("lingkaran ke-" + (i + 1) + " = " + (temp));
        }
    }

    public void getKelilingLingkaran() {
        System.out.println("Keliling lingkaran: ");
        for (int i = 0; i < banyakBangunDatar; i++) {
            double temp = (i + 1) + pi;
            System.out.println("lingkaran ke-" + (i + 1) + " = " + (temp));
        }
    }

    public void getLuasJG() {
        System.out.println("Luas jajargenjang: ");
        for (int i = 0; i < banyakBangunDatar; i++) {
            System.out.println("jajargenjang ke-" + (i + 1) + " = " + (((i + 1) + (i + 1)) / 2));
        }
    }

    public void getKelilingJG() {
        System.out.println("keliling jajargenjang: ");
        for (int i = 0; i < banyakBangunDatar; i++) {
            System.out.println("jajargenjang ke-" + (i + 1) + " = " + ((i + 1) * (i + 1)));
        }
    }

    public void getLuasKubus() {
        System.out.println("Luas Kubus: ");
        for (int i = 0; i < banyakBangunDatar; i++) {
            int temp = ((i + 1) + (i + 1)) * 6;
            System.out.println("kubus ke-" + (i + 1) + " = " + (temp));
        }
    }

    public void getVolumeKubus() {
        System.out.println("Volume kubus: ");
        for (int i = 0; i < banyakBangunDatar; i++) {
            int temp = ((i + 1) + (i + 1)) * (i + 1);
            System.out.println("kubus ke-" + (i + 1) + " = " + (temp));
        }
    }

    public void getLuasBalok() {
        System.out.println("Luas balok: ");
        for (int i = 0; i < banyakBangunDatar; i++) {
            int temp = ((i + 1) + (i + 1)) * 10;
            System.out.println("balok ke-" + (i + 1) + " = " + (temp));
        }
    }

    public void getVolumeBalok() {
        System.out.println("Volume balok: ");
        for (int i = 0; i < banyakBangunDatar; i++) {
            int temp = ((i + 1) + (i + 1)) * (i + 1);
            System.out.println("balok ke-" + (i + 1) + " = " + (temp));
        }
    }
}
