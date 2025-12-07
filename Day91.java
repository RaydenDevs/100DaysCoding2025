package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day91 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String nama = i.nextLine();
        int umur = i.nextInt();
        umurDelapanBelas(nama,umur);
    }
    public static void umurDelapanBelas(String nama, int umur) {
        if (umur >=18) {
            System.out.println("umur "+nama+" sudah mencapai 18");
        } else {
            System.out.println("umur "+nama+" belum mencapai 18");
        }
    }
}
