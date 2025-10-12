package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        System.out.print("Masukkan Text: ");
        String a = i.nextLine();
        int b = a.length();
        if (b<=0){
            System.out.println("Tidak memiliki panjang");
        } else if (b>0 && b<=10) {
            System.out.println("\nPanjang text diantara 1-10");
            System.out.println("Panjang text adalah: "+b);
            System.out.println("\nKata \""+a+"\" Memiliki jumlah huruf sebanyak: "+b);
        } else {
            System.out.println("\nPanjang text lebih dari 10");
            System.out.println("Panjang text adalah: "+b);
            System.out.println("\nKata \""+a+"\" Memiliki jumlah huruf sebanyak: "+b);
        }
        
        System.out.println("\n===== Karakter Awal & Akhir =====");
        
        System.out.println("Apakah anda ingin menampilkan karakter awal dan karakter akhir text? (true/false)");
        boolean karakter = i.nextBoolean();
        
        if (karakter == true){
            System.out.println("Karakter awal dari \""+a+"\" adalah \""+a.substring(0, 1)+"\"");
            System.out.println("Karakter akhir dari \""+a+"\" adalah \""+a.substring(b-1)+"\"");
        } else if (karakter == false){
            System.out.println("Karakter awal dan akhir tidak ditampilkan.");
        } else {
            System.out.println("Perintah yang dimasukkan salah - karakter.");
        }
        
        System.out.println("\n===== Pangkas Text =====");
        
        System.out.println("Apakah anda ingin memangkas panjang text? (true/false)");
        boolean pangkas = i.nextBoolean();
        
        if (pangkas == true){
            System.out.println("Berapa panjang text yang ingin ditampilkan? masukkan angka 0-"+b);
            int jpangkas = i.nextInt();
            int tpangkas = b-jpangkas;
            System.out.println("Jumlah huruf yang dihapus: "+tpangkas);
            System.out.println("sekarang text \""+a+"\" menjadi \""+a.substring(0, jpangkas)+"\" setelah dipangkas.");
        } else if (pangkas == false){
            System.out.println("Text tidak dipangkas.");
        } else {
            System.out.println("Perintah perintah yang dimasukkan salah - Pangkas.");
        }
        
    }
}
