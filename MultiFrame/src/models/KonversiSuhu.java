/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import interfaces.KonversiInterface;

/**
 *
 * @author Sultan Firdaus
 */
public class KonversiSuhu implements KonversiInterface {

    private double celcius;

    public KonversiSuhu() {
    }

    public KonversiSuhu(double celcius) {
        this.celcius = celcius;
    }

    public double getCelcius() {
        return celcius;
    }

    public void setCelcius(double celcius) {
        this.celcius = celcius;
    }

    @Override
    public double convert() {
        return (celcius * 9 / 5) + 32;
    }

}
