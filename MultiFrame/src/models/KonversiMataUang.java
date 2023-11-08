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
public class KonversiMataUang implements KonversiInterface {

    private double usd;

    public KonversiMataUang() {
    }

    public KonversiMataUang(double usd) {
        this.usd = usd;
    }

    public double getUsd() {
        return usd;
    }

    public void setUsd(double usd) {
        this.usd = usd;
    }

    @Override
    public double convert() {
        return usd * 15.613;
    }

}
