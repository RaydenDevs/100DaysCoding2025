package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int a = i.nextInt();
        
        if (a>0){
            System.out.println("Angka merupakan bilangan positif");
        } else if (a<0){
            System.out.println("Angka merupakan bilangan negatif");
        } else {
            System.out.println("Angka merupakan angka nol");
        }
    }
}
