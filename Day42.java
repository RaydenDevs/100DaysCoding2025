package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        System.out.print("Masukkan Gaji Pokok: ");
        int gp = i.nextInt();
        System.out.print("Masukkan tunjangan: ");
        int tj = i.nextInt();
        System.out.print("Masukkan potongan: ");
        int pt = i.nextInt();
        
        int tg = (gp + tj) - pt;
        System.out.println("Gaji Bersih: " + tg);
    }
}
