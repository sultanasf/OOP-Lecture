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
public class CalculatorLingkaran extends Calculator implements CalculatorInterface {

    public CalculatorLingkaran(double r) {
        super(r);
    }

    public CalculatorLingkaran() {
        super();
    }

    public double getR() {
        return super.sisi;
    }

    public void setR(double r) {
        super.sisi = r;
    }

    @Override
    public double hitungLuas() {
        return 3.14 * sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        return 2 * 3.14 * sisi;
    }

}
