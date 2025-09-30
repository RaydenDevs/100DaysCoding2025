package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        System.out.print("Panjang Persegi = ");
        int p = i.nextInt();
        
        System.out.print("lebar Persegi = ");
        int l = i.nextInt();
        
        int ls = p*l;
        System.out.printf("Sebuah persegi panjang memiliki panjang %d cm dan lebar %d cm, berarti luas persegi panjang adalah %d cm\n", p, l, ls);

        i.close();
    }
}
