package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = i.nextInt();
        System.out.print("1-N: ");
        for (int j = 1; j <= n; j++) {
            System.out.print(j+" ");
        }
        System.out.print("\nN-1: ");
        for (int j = 1; j <= n ; n--) {
            System.out.print(n+" ");
        }
    }
}
