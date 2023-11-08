package konversi.oop;

import java.util.Scanner;

/**
 *
 * @author Sultan Firdaus
 */
class Konversi {

    private final int dec;

    public Konversi(int dec) {
        this.dec = dec;
    }

    public String decToBin() {
        int x = dec, remainder;
        String bin = "";
        while (x > 0) {
            remainder = x % 2;
            bin = remainder + bin;
            x /= 2;
        }
        return bin;
    }

    public String decToHex() {
        int x = dec, remainder;
        String hex = "";
        while (x > 0) {
            remainder = x % 16;
            hex = remainder > 9 ? (char) (remainder + 55) + hex : remainder + hex;
            x /= 16;
        }
        return hex;
    }
}

public class KonversiOOP {

    public static void main(String[] args) {
        int dec;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan dalam decimal: ");
        dec = sc.nextInt();

        Konversi konversi = new Konversi(dec);

        System.out.printf("%d dalam biner = %s\n", dec, konversi.decToBin());
        System.out.printf("%d dalam heksadesimal = %s\n", dec, konversi.decToHex());
    }

}
