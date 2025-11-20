package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day74 {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String nama, hobi, hewan;
        int pilihan;
        do {
            System.out.println("===== Pilih saja =====");
            System.out.println("1. Hobi");
            System.out.println("2. Hewan");
            System.out.println("3. keluar");
            System.out.print("Pilihan: ");
            pilihan = i.nextInt();
            i.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("Siapa nama anda?: ");
                    nama = i.nextLine();
                    System.out.print("Apa Hobi anda?: ");
                    hobi = i.nextLine();
                    System.out.println("\nNama: "+nama);
                    System.out.println("Hobi: "+hobi);
                    break;
                case 2:
                    System.out.print("Siapa nama anda?: ");
                    nama = i.nextLine();
                    System.out.print("Apa Hewan Kesukaan anda?: ");
                    hewan = i.nextLine();
                    System.out.println("\nNama\t\t: "+nama);
                    System.out.println("Hewan Kesukaan\t: "+hewan);
                    break;
                case 3:
                    System.out.println("Keluar.");
                    break;
                default:
                    System.out.println("Pilihan Tidak Ada");
            } 
        } while (pilihan != 3);
        
    }
}
