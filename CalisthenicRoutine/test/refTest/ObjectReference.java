/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package refTest;

import shm.Mobil;

/**
 *
 * @author Sultan Firdaus
 */
public class ObjectReference {

    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Honda", "L");
        Mobil mobil2 = mobil1;
        mobil2.setMerkMobil("Toyota");
        mobil1.setMerkMobil("Mazda");
        System.out.println(mobil2.getMerkMobil() + " " + mobil2.getPlatNomor());
        System.out.println(mobil1.getMerkMobil() + " " + mobil1.getPlatNomor());
    }
}
