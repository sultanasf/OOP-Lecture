/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shm;

/**
 *
 * @author Sultan Firdaus
 */
public class Mobil {

    private String merkMobil;
    private String platNomor;

    public Mobil(String merkMobil, String platNomor) {
        this.merkMobil = merkMobil;
        this.platNomor = platNomor;
    }

    public String getMerkMobil() {
        return merkMobil;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setMerkMobil(String merkMobil) {
        this.merkMobil = merkMobil;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }
}
