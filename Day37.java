package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        System.out.print("Masukkan Angka: ");
        int a = i.nextInt();
        
        System.out.println("===== Hasil Penentuan =====");
        
        if (a%2 == 0) {
            System.out.println(a+" Adalah angka genap");
        }else {
            System.out.println(a+" Adalah angka ganjil");
        }
    }
}
