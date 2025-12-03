package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day87 {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String[] a = {"Apel", "Jeruk", "Nanas", "Semangka"};
        System.out.print("Pengecekan Buah: ");
        String b = i.nextLine();
        String c = "Tidak ada";
        for (int j = 0; j < a.length; j++) {
            if (b.equalsIgnoreCase(a[j])) {
                c = "ada";
                break;
            }
        }
        System.out.println("Status : " + c);
    }
}
