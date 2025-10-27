package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int a = i.nextInt();
        
        System.out.println(a%2==0 ? "Genap" : "Ganjil");
    }
}
