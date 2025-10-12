package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        System.out.print("Masukkan Angka: ");
        int a = i.nextInt();
        
        if (a > 0){
            if (a <= 100){
                System.out.println("Angka lebih besar dari 0 dan lebih kecil dari 100");
            } else {
                System.out.println("Angka lebih besar dari 0 dan 100");
            }
        } else if (a < 0){
            if (a >= -100){
                System.out.println("Angka lebih kecil dari 0 dan lebih besar dari -100");
            } else {
                System.out.println("Angka lebih kecil dari 0 dan 100");
            }
        } else {
            System.out.println("Angka merupakan angka 0");
        }
    }
}
