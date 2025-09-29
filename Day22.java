package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        System.out.print("Panjang sisi = ");
        int s = i.nextInt();
        
        int l = s*s;
        System.out.println("Luas persegi dengan panjang sisi " + s + " adalah " + l);
    }
}
