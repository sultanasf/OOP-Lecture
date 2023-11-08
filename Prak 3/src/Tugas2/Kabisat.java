/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author Sultan Firdaus
 */
import java.util.Scanner;

public class Kabisat {

    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan tahun (1900-2005): ");
        input = sc.nextInt();

        if (input < 1900) {
            System.out.println("Maaf, tahun input dibawah 1900");
        } else if (input > 2005) {
            System.out.println("Maaf, tahun input diatas 2005");
        } else {
            if (input % 4 != 0) {
                System.out.println(input + " bukan tahun kabisat");
            } else {
                System.out.println(input + " adalah tahun kabisat");
            }
        }
    }
}
