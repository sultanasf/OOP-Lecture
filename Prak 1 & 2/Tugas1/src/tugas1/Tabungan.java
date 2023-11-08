/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author Sultan Firdaus
 */
public class Tabungan {

    public int saldo;

    public Tabungan(int initSaldo) {
        saldo = initSaldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void simpanUang(int jumlah) {
        saldo += jumlah;
    }

    public boolean ambilUang(int jumlah) {
        if (jumlah > saldo) {
            return false;
        }
        saldo -= jumlah;
        return true;
    }
}
