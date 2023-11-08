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
    
    public Mahasiswa(String username, String password, String phone){
        super(username, password, phone);
    }

}
