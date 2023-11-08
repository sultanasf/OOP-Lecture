/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan4;

/**
 *
 * @author Sultan Firdaus
 */
public class Test {

    public void checkRole(Pegawai pegawai) {
        // Pegawai pegawai = new Kurir()
        if(pegawai instanceof Manajer){
            System.out.println("ini manajer");
        }else if(pegawai instanceof Kurir){
            System.out.println("Ini kurir");
        }
    }

    public static void main(String[] args) {
        Pegawai peg1 = new Manajer();
        Pegawai peg2 = new Kurir();
        Test tes = new Test();
        tes.checkRole(new Manajer());
    }
}
