/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;

/**
 *
 * @author Sultan Firdaus
 */
public class Fans {

    private String name;

    public Fans() {
        this.name = "noname";
    }

    public Fans(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.print(this.name);
    }

    public void watchingPerformance() {
        this.showName();
        System.out.println(": melihat idolanya dari youtube");
    }

    public void watchingPerformance(Musician musician) {
        this.showName();
        musician.perform();
    }
}
