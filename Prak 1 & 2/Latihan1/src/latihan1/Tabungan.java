/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author Sultan Firdaus
 */
public class Tabungan {

    int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public void ambilUang(int nominal) {
        saldo -= nominal;
    }
}
