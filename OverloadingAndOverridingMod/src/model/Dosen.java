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
    
    public Dosen(String username, String password, String key){
        super(username, password);
        this.key = key;
    }

    public boolean loginPhone(String phone, String password, String key) {
        return super.loginPhone(phone, password) && key.equals(this.key);
    }

    public boolean login(String username, String password, String key) {
        return super.login(username, password) && key.equals((this.key));
    }

}
