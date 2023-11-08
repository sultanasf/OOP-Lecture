/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lat1_OOP;

/**
 *
 * @author Sultan Firdaus
 */
public class Mahasiswa {

    private final double nilai[];
    private final String nama;
    private final int nrp;

    public Mahasiswa(int nrp, String nama, double nilai[]) {
        this.nrp = nrp;
        this.nama = nama;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public int getNrp() {
        return nrp;
    }

    public double[] getNilai() {
        return nilai;
    }

    public double getRataRata() {
        double rerata = 0.0;
        for (int i = 0; i < nilai.length; i++) {
            rerata += nilai[i];
        }
        rerata /= nilai.length;
        return rerata;
    }

}
