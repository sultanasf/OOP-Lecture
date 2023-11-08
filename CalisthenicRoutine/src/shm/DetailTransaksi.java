/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shm;

/**
 *
 * @author Sultan Firdaus
 */
public class DetailTransaksi {

    private int harga;
    private String kerusakan;

    public DetailTransaksi(int harga, String kerusakan) {
        this.harga = harga;
        this.kerusakan = kerusakan;
    }

    public int getHarga() {
        return harga;
    }

    public String getKerusakan() {
        return kerusakan;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setKerusakan(String kerusakan) {
        this.kerusakan = kerusakan;
    }

}
