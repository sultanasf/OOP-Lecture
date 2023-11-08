/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Sultan Firdaus
 */
public class Mahasiswa extends User {

    private Dosen dosenWali;
    private String kelas;

    public Mahasiswa() {
        // Instance Only
    }

    public Mahasiswa(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean login(String phone, String password) {
        return super.getPhone().equals(phone) && super.getPassword().equals(password);
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

}
