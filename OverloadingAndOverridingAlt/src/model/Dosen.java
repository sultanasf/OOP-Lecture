/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Sultan Firdaus
 */
public class Dosen extends User {

    private String pangkat;
    private String golongan;
    private String key;

    public Dosen() {
        // Instance Only
    }

    public Dosen(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean login(String phoneOrUsername, String password) {
        return (phoneOrUsername.equals(super.getUsername())
                || phoneOrUsername.equals(super.getPhone()))
                && password.equals(super.getPassword());
    }

    public boolean login(String phoneOrUsername, String password, String key) {
        if (phoneOrUsername.equals(super.getUsername()) || phoneOrUsername.equals(super.getPhone()) && password.equals(super.getPassword())) {
            return this.key.equals(key);
        }
        return false;
    }

    public String getPangkat() {
        return pangkat;
    }

    public void setPangkat(String pangkat) {
        this.pangkat = pangkat;
    }

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}
