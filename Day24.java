package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        System.out.print("panjang Jari-jari = ");
        double r = i.nextDouble();
        
        final double pi = 3.14;
        
        double l = pi*r*r;
        
        System.out.println("Luas Jari-jari = " + l);
    }
}
