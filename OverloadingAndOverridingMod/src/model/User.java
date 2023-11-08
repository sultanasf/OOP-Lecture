/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Sultan Firdaus
 */
public class User {

    private String id;
    private String phone;
    private String username;
    private String password;

    public User() {
        // Instance Only
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public User(String username, String password, String phone){
        this.username = username;
        this.password = password;
        this.phone = phone;
    }

    public boolean login(String username, String password) {
        return password.equals(this.password) && username.equals(this.username);
    }

    public boolean loginPhone(String phone, String password) {
        return this.phone.equals(phone) && this.password.equals(password);
    }

}
