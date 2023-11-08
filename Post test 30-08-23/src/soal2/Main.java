/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author Sultan Firdaus
 */
public class Main {

    public static void main(String[] args) {
        Persegi persegi = new Persegi(500);
        BangunDatarAbnormal bangun = new BangunDatarAbnormal(500);
        BangunDatar bangunNormal = new BangunDatar(500);

        System.out.println("Luas Persegi: ");
        persegi.getLuas();
        System.out.println("Keliling Persegi: ");
        persegi.getKeliling();
        System.out.println("---------------------");
        System.out.println("Abnormal");
        bangun.getLuasPersegi();
        bangun.getKelilingPersegi();
        bangun.getLuasSegitiga();
        bangun.getKelilingSegitiga();
        bangun.getLuasLingkaran();
        bangun.getKelilingLingkaran();
        bangun.getLuasJG();
        bangun.getKelilingJG();
        System.out.println("---------------------");
        System.out.println("Normal");
        bangunNormal.getLuasPersegi();
        bangunNormal.getKelilingPersegi();
        bangunNormal.getLuasSegitiga();
        bangunNormal.getKelilingSegitiga();
        bangunNormal.getLuasLingkaran();
        bangunNormal.getKelilingLingkaran();
        bangunNormal.getLuasJG();
        bangunNormal.getKelilingJG();
        bangunNormal.getLuasKubus();
        bangunNormal.getVolumeKubus();
        bangunNormal.getLuasBalok();
        bangunNormal.getVolumeBalok();
        System.out.println("---------------------");
        System.out.println("Abnormal");
        bangun.getLuasPersegi();
        bangun.getLuasKubus();
        bangun.getVolumeKubus();
        bangun.getLuasBalok();
        bangun.getVolumeBalok();

    }
}
