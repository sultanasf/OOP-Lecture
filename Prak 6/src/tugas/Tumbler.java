/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author Sultan Firdaus
 */
public class Tumbler {

    public String konten;
    public int dayaTampung;
    public int isi;

    public Tumbler(String konten, int dayaTampung) {
        this.dayaTampung = dayaTampung;
        this.konten = konten;
    }

    public void getInfoTumbler() {
        System.out.println("Daya tampung = " + dayaTampung + "ML");
        System.out.println("Isi saat ini sebanyak = " + isi + "ML");
    }

    public String getInfoKonten() {
        return konten;
    }

    public boolean gantiIsi(String konten) {
        if (isi == 0) {
            this.konten = konten;
            return true;
        }
        System.out.println("Kosongkan tumbler terlebih dahulu");
        return false;
    }

    public boolean kosongkanIsi() {
        if (isi == 0) {
            System.out.println("Tumbler sudah kosong");
            return false;
        }
        return true;
    }

}
