package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day55 {

    public static void main(String[] args) {
        // Swap Elemen Array
        Scanner i = new Scanner(System.in);
        System.out.print("Panjang Array: ");
        int p = i.nextInt();

        int[] arr = new int[p];
        
        System.out.println("(Isi dengan bilangan bulat (Angka))");
        for (int j = 0; j < p; j++) {
            System.out.print("Isi elemen ke "+ (j+1)+": ");
            arr[j] = i.nextInt();
        }

        System.out.println("\nDeretan angka awal (Sebelum ditukar)");
        for (int j : arr) {
            System.out.print("[" + j + "] ");
        }

        boolean lanjut = true;
        while (lanjut) {
            System.out.println("\n\n======= Pilih Elemen Yang Ingin Ditukar =======");
            System.out.println("Syarat: Min. angka 1 & Max sesuai panjang array.");
            System.out.print("Pilih elemen Pertama\t: ");
            int a = i.nextInt() - 1;
            System.out.print("Pilih elemen Kedua\t: ");
            int b = i.nextInt() - 1;

            if (a >= 0 && b < p) {
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;

                System.out.println("\nDeretan angka setelah ditukar");
                for (int j : arr) {
                    System.out.print("[" + j + "] ");
                }
                System.out.print("\nMasih ingin menukar? (true/false): ");
                lanjut = i.nextBoolean();
            } else {
                System.out.println("Invalid!");
                break;
            }
        }
    }
}
