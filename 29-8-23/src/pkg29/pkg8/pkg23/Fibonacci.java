/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg29.pkg8.pkg23;

/**
 *
 * @author Sultan Firdaus
 */
public class Fibonacci {

    private long now;
    private long before;
    private long temp;

    public void cariFibonacci(int n) {
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                now = 1;
                before = 1;
            } else {
                temp = now;
                now += before;
                before = temp;
            }
            System.out.print(now + " ");
        }
    }
}
