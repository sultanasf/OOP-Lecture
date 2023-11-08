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
public class Cashier {

    private final ArrayList<Transaksi> transaksi;
    private int jumlahTransaksi;
    private final Admin admin;

    public Cashier() {
        transaksi = new ArrayList<>();
        admin = new Admin("admin", "admin123");
        jumlahTransaksi = 0;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void tambahTransaksi(String merkMobil, String platNomor, String tanggal, String statusSelesai,
            String statusPembayaran) {
        transaksi.add(new Transaksi(merkMobil, platNomor, tanggal, statusSelesai, statusPembayaran));
        jumlahTransaksi++;
    }

    public void hapusTransaksi(int index) {
        transaksi.remove(index);
        jumlahTransaksi--;
    }

    public ArrayList<Transaksi> getTransaksi() {
        return transaksi;
    }

    public int getJumlahTransaksi() {
        return jumlahTransaksi;
    }

    public Transaksi getOneTransaksi(int index) {
        return transaksi.get(index);
    }
}
