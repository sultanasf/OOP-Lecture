/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.util.ArrayList;
import shm.Cashier;
import shm.DetailTransaksi;

/**
 *
 * @author Sultan Firdaus
 */
public class CashierService {

    private static Cashier cashier = new Cashier();

    public static Cashier getCashier() {
        return cashier;
    }
}
