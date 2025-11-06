package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = i.nextInt();
        int c = n;
        i.nextLine();
        System.out.print("Angka Ganjil N-1: ");
        for (int j = 1; j <= n; n--) {
            if (n % 2 == 1){
                System.out.print(n+" ");
            }
        }
        n = c;
        System.out.print("\nAngka Genap N-1: ");
        for (int j = 1; j <= n; n--) {
            if (n % 2 == 0){
                System.out.print(n+" ");
            }
        }
    }
}
