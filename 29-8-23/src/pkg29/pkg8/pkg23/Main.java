/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg29.pkg8.pkg23;

import java.util.Scanner;

/**
 *
 * @author Sultan Firdaus
 */
public class Main {

    public static void main(String[] args) {
        int input, option;
        Scanner scanner = new Scanner(System.in);
        Fibonacci fibonacci = new Fibonacci();
        Prima prima = new Prima();

        System.out.print("Masukkan batas: ");
        input = scanner.nextInt();
        System.out.println("Menu: ");
        System.out.println("1. Tampilkan deret Fibonacci sampai ke-" + input);
        System.out.println("2. Tampilkan deret Prima sampai " + input);
        System.out.print("Pilihan anda: ");
        option = scanner.nextInt();

        switch (option) {
            case 1:
                fibonacci.cariFibonacci(input);
                break;
            case 2:
                prima.cariPrima(input);
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }

}
