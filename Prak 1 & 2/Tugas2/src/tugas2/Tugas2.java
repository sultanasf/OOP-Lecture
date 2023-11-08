/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2;

/**
 *
 * @author Sultan Firdaus
 */
public class Tugas2 {

    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Biru", "Minibus", 2000, 7);
        Mobil mobil2 = new Mobil("Daihatsu", "Hitam", "Pickup", 1500, 2);
        Mobil mobil3 = new Mobil("Suzuki", "Silver", "SUV", 1800, 5);
        Mobil mobil4 = new Mobil("Honda", "Merah", "Sedan", 1300, 5);

        mobil1.infoMobil();
        System.out.println("---------------");
        mobil2.infoMobil();
        System.out.println("---------------");
        mobil3.infoMobil();
        System.out.println("---------------");
        mobil4.infoMobil();
    }

}
