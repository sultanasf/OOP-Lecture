/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan;

/**
 *
 * @author Sultan Firdaus
 */
public class Nasabah {

    private String namaAwal;
    private String namaAkhir;
    private final String noRekening;
    private String pin;
    private Tabungan tabungan;

    public Nasabah(String namaAwal, String namaAkhir, String noRekening, String pin) {
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
        this.noRekening = noRekening;
        this.pin = pin;
    }

    public String getNamaAwal() {
        return namaAwal;
    }

    public String getNamaAkhir() {
        return namaAkhir;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public String getPin() {
        return pin;
    }

    public Tabungan getTabungan() {
        return tabungan;
    }

    public void setNamaAwal(String namaAwal) {
        this.namaAwal = namaAwal;
    }

    public void setNamaAkhir(String namaAkhir) {
        this.namaAkhir = namaAkhir;
    }

    public void setTabungan(Tabungan tabungan) {
        this.tabungan = tabungan;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
