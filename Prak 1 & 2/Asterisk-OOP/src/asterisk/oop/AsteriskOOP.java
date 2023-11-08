package asterisk.oop;

import java.util.Scanner;

/**
 *
 * @author Sultan Firdaus
 */
class Asterisk {

    private final int limit;

    public Asterisk(int limit) {
        this.limit = limit;
    }

    public void createSquare() {
        for (int i = 0; i < limit; i++) {
            for (int j = 0; j < limit; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public void createTriangle() {
        for (int i = 0; i < limit; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}

public class AsteriskOOP {

    private static Scanner sc;
    private static Asterisk asterisk;
    private static int limit;

    public static void main(String[] args) {
        System.out.print("Masukkan batas: ");
        sc = new Scanner(System.in);
        limit = sc.nextInt();
        asterisk = new Asterisk(limit);
        menu();
    }

    public static void menu() {
        int option;
        System.out.println("Menu:");
        System.out.println("1. Square");
        System.out.println("2. Triangle");
        System.out.print("Chhose one: ");
        option = sc.nextInt();
        switch (option) {
            case 1:
                asterisk.createSquare();
                break;
            case 2:
                asterisk.createTriangle();
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }

}
