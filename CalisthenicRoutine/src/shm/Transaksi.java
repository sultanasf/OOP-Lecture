/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shm;

import java.util.ArrayList;

/**
 *
 * @author Sultan Firdaus
 */
public class Transaksi {

    private Mobil mobil;
    private String tanggal;
    private String statusSelesai;
    private String statusPembayaran;
    private int totalHarga;
    private ArrayList<DetailTransaksi> detailTransaksi;

    public Transaksi(String merkMobil, String platNomor, String tanggal, String statusSelesai,
            String statusPembayaran) {
        this.totalHarga = 0;
        this.detailTransaksi = new ArrayList<>();
        setMobil(new Mobil(merkMobil, platNomor));
        this.tanggal = tanggal;
        this.statusSelesai = statusSelesai;
        this.statusPembayaran = statusPembayaran;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getStatusSelesai() {
        return statusSelesai;
    }

    public String getStatusPembayaran() {
        return statusPembayaran;
    }

    public ArrayList<DetailTransaksi> getDetailTransaksi() {
        return detailTransaksi;
    }

    public DetailTransaksi getOneDetailTransaksi(int index) {
        return detailTransaksi.get(index);
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    public void setTotalHarga() {
        this.totalHarga = 0;
        for (DetailTransaksi data : detailTransaksi) {
            this.totalHarga += data.getHarga();
        }
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void setStatusSelesai(String statusSelesai) {
        this.statusSelesai = statusSelesai;
    }

    public void setStatusPembayaran(String statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }

    public void setDetailTransaksi(ArrayList<DetailTransaksi> detailTransaksi) {
        this.detailTransaksi = detailTransaksi;
    }

}
