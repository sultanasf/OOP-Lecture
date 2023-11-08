/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan;

import java.util.ArrayList;

/**
 *
 * @author Sultan Firdaus
 */
public class Bank {

    private ArrayList<Nasabah> nasabah;
    private int jumlahNasabah;
    private Admin admin;

    public Bank() {
        nasabah = new ArrayList<>();
        jumlahNasabah = 0;
        admin = new Admin("admin", "admin123");
    }

    public void tambahNasabah(String namaAwal, String namaAkhir, String noRekening, String pin) {
        nasabah.add(new Nasabah(namaAwal, namaAkhir, noRekening, pin));
        jumlahNasabah++;
    }

    public void hapusNasabah(int index) {
        nasabah.remove(index);
        jumlahNasabah--;
    }

    public int getJumlahNasabah() {
        return jumlahNasabah;
    }

    public Nasabah getNasabah(int indeks) {
        return nasabah.get(indeks);
    }

    public ArrayList<Nasabah> getAllNasabah() {
        return nasabah;
    }

    public Admin getAdmin() {
        return admin;
    }
}
