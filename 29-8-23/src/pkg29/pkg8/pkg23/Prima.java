/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg29.pkg8.pkg23;

/**
 *
 * @author Sultan Firdaus
 */
public class Prima {

    private int startPrima;

    public Prima() {
        startPrima = 2;
    }

    public void cariPrima(int n) {
        while (startPrima <= n) {
            if (isPrima(startPrima)) {
                System.out.print(startPrima + " ");
            }
            startPrima++;
        }
    }

    public boolean isPrima(int x) {
        boolean flag = true;
        int i = 2;
        while (i <= x / 2) {
            if (x % i == 0) {
                flag = false;
                break;
            }
            i++;
        }
        return flag;
    }
}
