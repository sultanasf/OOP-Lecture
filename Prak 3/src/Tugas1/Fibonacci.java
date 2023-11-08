/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author Sultan Firdaus
 */
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int input, sum = 1, before = 0, temp = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan berapa deret Fibonacci? ");
        input = scanner.nextInt();

        for (int i = 0; i < input; i++) {
            sum = sum + temp;
            temp = before;
            before = sum;
            System.out.print(sum + " ");
        }
    }
}
