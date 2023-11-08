/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author Sultan Firdaus
 */
public class SegiEmpat {

    private int sisi1;
    private int sisi2;

    public SegiEmpat(int sisi1, int sisi2) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    public void getInfoBangun() {
        System.out.println("sisi1 = " + sisi1);
        System.out.println("sisi2 = " + sisi2);
    }

    public void changeSisi(int sisi1, int sisi2) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    public int calculateKeliling() {
        return 2 * (sisi1 + sisi2);
    }

    public int calculateLuas() {
        return sisi1 * sisi2;
    }
}
