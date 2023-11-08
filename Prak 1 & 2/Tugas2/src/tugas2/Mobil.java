/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author Sultan Firdaus
 */
public class Mobil {

    public String brand;
    public String warna;
    public String tipe;
    public int harga;
    public int kuantitas;

    public Mobil(String brand, String warna, String tipe, int harga, int kuantitas) {
        this.brand = brand;
        this.harga = harga;
        this.warna = warna;
        this.tipe = tipe;
        this.kuantitas = kuantitas;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    public void infoMobil() {
        System.out.println("Merk: " + brand);
        System.out.println("Warna: " + warna);
        System.out.println("Tipe: " + tipe);
        System.out.println("Harga: " + harga);
        System.out.println("Kuantitas: " + kuantitas);

    }
}
