package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day70 {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        double t = i.nextInt();
        for (double v = 1; v <= t; v++) {
            for (double j = 1; j <= (t/1.5); j++) {
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
