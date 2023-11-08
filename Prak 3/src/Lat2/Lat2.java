package Lat2;

/**
 *
 * @author Sultan Firdaus
 */
import java.util.Scanner;

public class Lat2 {

    public static void main(String[] args) {
        int input, nFaktorial = 1, n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        input = scanner.nextInt();

        System.out.println("n\tn!");
        System.out.println("----------");

        for (n = 1; n <= input; n++) {
            nFaktorial = n * nFaktorial;
            System.out.println(n + "\t" + nFaktorial);
        }

    }
}
