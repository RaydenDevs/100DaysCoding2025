package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        System.out.print("Pilih angka dari 1 sampai 3: ");
        int a = i.nextInt();
        
        switch (a){
            case 1:
                System.out.println("Anda memilih angka 1");
                break;
            case 2:
                System.out.println("Anda memilih angka 2");
                break;
            case 3:
                System.out.println("Anda memilih angka 3");
                break;
            default:
                System.out.println("Angka tidak valid");
        }
    }
}
