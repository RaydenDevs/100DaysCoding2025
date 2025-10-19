package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        System.out.print("Masukkan Angka: ");
        int a = i.nextInt();
        
        if (a % 3 == 0 && a % 5 == 0){
            System.out.println("Angka merupakan kelipatan 3 dan 5");
        } else if (a % 3 == 0) {
            System.out.println("Angka merupakan kelipatan 3");
        } else if (a % 5 == 0) {
            System.out.println("Angka merupakan kelipatan 5");
        } else {
            System.out.println("Angka bukan kelipatan 3 ataupun 5");
        }
    }
}
