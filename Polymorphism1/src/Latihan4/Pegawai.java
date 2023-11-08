/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan4;

/**
 *
 * @author Sultan Firdaus
 */
public class Pegawai {

    protected String nama;
    protected int gaji;

    public Pegawai() {
        this.nama = "anonim";
        this.gaji = 0;
    }

    public Pegawai(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public int infoGaji() {
        return this.gaji;
    }
}
