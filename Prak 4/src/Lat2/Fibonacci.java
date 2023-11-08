/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lat2;

/**
 *
 * @author Sultan Firdaus
 */
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int input;
        int fibonacci[] = new int[100];
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan batas: ");
        input = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if (i == 1 || i == 0) {
                fibonacci[i] = i;
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
            System.out.print(fibonacci[i] + " ");
        }
    }

}
