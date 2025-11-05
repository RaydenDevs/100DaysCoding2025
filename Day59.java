package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = i.nextInt();
        i.nextLine();
        System.out.print("Angka Ganjil 1-N: ");
        for (int j = 1; j <= n; j++) {
            if (j % 2 == 1){
                System.out.print(j+" ");
            }
        }
        System.out.print("\nAngka Genap 1-N: ");
        for (int j = 1; j <= n; j++) {
            if (j % 2 == 0){
                System.out.print(j+" ");
            }
        }
    }
}
