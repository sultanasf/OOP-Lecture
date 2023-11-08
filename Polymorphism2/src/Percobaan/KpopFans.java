/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;

/**
 *
 * @author Sultan Firdaus
 */
public class KpopFans extends Fans {

    public KpopFans() {
        super();
    }

    public KpopFans(String name) {
        super(name);
    }

    public void watchingPerformance(Musician musician, String expression) {
        super.showName();
        System.out.print(": " + expression + " ");
        musician.perform();
    }
}
