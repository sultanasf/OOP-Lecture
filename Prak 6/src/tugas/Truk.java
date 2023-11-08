/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author Sultan Firdaus
 */
public class Truk {

    public int bebanMaks;
    private int beban;

    public Truk(int bebanMaks) {
        this.bebanMaks = bebanMaks;
        this.beban = 0;
    }

    public void getInfoBeban() {
        System.out.println("Jumlah beban sekarang = " + beban);
        System.out.println("Beban maks = " + bebanMaks);
    }

    public int getInfoSisaBeban() {
        return (bebanMaks - beban);
    }

    public boolean addBeban(int beban) {
        if (this.beban + beban > this.bebanMaks) {
            return false;
        }
        this.beban += beban;
        return true;
    }
}
