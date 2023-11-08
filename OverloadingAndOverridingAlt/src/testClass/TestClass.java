/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testClass;

import model.*;

/**
 *
 * @author Sultan Firdaus
 */
public class TestClass {

    public static void main(String arguments[]) {
        Mahasiswa fadilah = new Mahasiswa();
        fadilah.setUsername("fadilah");
        fadilah.setPassword("123456");
        fadilah.setPhone("083853501388");
        boolean result = fadilah.login("083853501388", "123456");
        if (result) {
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login gagal");
        }

        Dosen fahrul = new Dosen("fahrul", "123456");
        fahrul.setKey("19990129");
        result = fahrul.login("fahrul", "123456", "19990129");
        if (result) {
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login gagal");
        }

    }

}
