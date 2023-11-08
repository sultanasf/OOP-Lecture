/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak.pkg2.pkg3;

/**
 *
 * @author Sultan Firdaus
 */
public class Prak23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Siswa anak = new Siswa(22);
        System.out.println("NRP Awal(variabel nrp dalam object anak): " + anak.nrp);
        anak.setNrp(55);
        System.out.println("NRP Setelah diubah(method getNrp()): " + anak.getNrp());
    }

}
