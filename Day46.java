package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        int saldo = 20000;
        System.out.println("Saldo anda: "+saldo);
        
        System.out.println("===== MENU MAKANAN =====");
        System.out.println("1. Nasi Goreng - Rp13.000");
        System.out.println("2. Nasi Kuning - Rp12.000");
        System.out.print("Pilih: ");
        int a = i.nextInt();
        
        switch (a){
            case 1:
                System.out.println("\nAnda memesan Nasi Goreng.");
                saldo-=13000;
                break;
            case 2:
                System.out.println("\nAnda memesan Nasi Kuning.");
                saldo-=12000;
                break;
            default:
                System.out.println("\nPilihan tidak ada.");
        }
        
        System.out.println("Sisa saldo anda: "+saldo);
    }
}
