package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day47 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        System.out.println("Masukkan angka 1-7 (Senin = 1)");
        int a = i.nextInt();
        
        switch (a){
            case 1 -> System.out.println("Hari Senin");
            case 2 -> System.out.println("Hari Selasa");
            case 3 -> System.out.println("Hari Rabu");
            case 4 -> System.out.println("Hari Kamis");
            case 5 -> System.out.println("Hari Jum'at");
            case 6 -> System.out.println("Hari Sabtu");
            case 7 -> System.out.println("Hari Minggu");
            default -> System.out.println("Pilihan Tidak Ada.");
        }
        
    }
}
