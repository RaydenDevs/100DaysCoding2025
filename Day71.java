package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day71 {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int t = i.nextInt();
        for (int v = 1; v <= t; v++) {
            for (int j = 1; j <= v; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
