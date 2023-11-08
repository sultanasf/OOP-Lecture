/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan3;

/**
 *
 * @author Sultan Firdaus
 */
public class Truk {

    public double muatan;
    public double muatanMaks;

    public Truk(double beratMaks) {
        muatanMaks = beratMaks;
        muatan = 0;
    }

    public double getMuatan() {
        return muatan;
    }

    public double getMuatanMaks() {
        return muatanMaks;
    }

    public void tambahMuatan(double berat) {
        if (muatan + berat > muatanMaks) {
            System.out.println("Muatan melebihi maksimum, tidak bisa menambah");
        } else {
            muatan += berat;
        }
    }
}
