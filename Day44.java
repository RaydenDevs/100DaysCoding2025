package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai: ");
        int a = i.nextInt();
        
        if (a >= 93) {
            System.out.println("Predikat A");
        } else if (a >= 81 && a <= 93) {
            System.out.println("Predikat B");
        } else if (a >= 75 && a <= 81) {
            System.out.println("Predikat C");
        } else if (a >= 60 && a <= 75) {
            System.out.println("Predikat D");
        } else {
            System.out.println("Predikat E");
        }
    }
}
