/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import interfaces.CalculatorInterface;

/**
 *
 * @author Sultan Firdaus
 */
public class CalculatorPersegi extends Calculator implements CalculatorInterface {

    public CalculatorPersegi(double sisi) {
        super(sisi);
    }

    public CalculatorPersegi() {
        super();
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        super.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }

}
