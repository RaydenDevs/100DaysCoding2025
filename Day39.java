package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        //Menu utama
        String a = "Pop Ice";
        String b = "Kopi";
        String c = "Teh";
        
        //Varian Pop Ice
        String a1 = "Coklat";
        String a2 = "Vanilla";
        String a3 = "Blueberry";
        
        //Varian Kopi
        String b1 = "Americano";
        String b2 = "Cappucino";
        String b3 = "Kopi Susu";
        
        //Varian Teh
        String c1 = "Es Teh Manis";
        String c2 = "Teh Susu";
        String c3 = "Teh Hijau";
        String c4 = "Teh Hangat";
        
        //Menampilkan Menu
        System.out.println("===== MENU MINUMAN =====");
        System.out.println("1."+a+"\n2."+b+"\n3."+c);
        
        System.out.println("===== PILIH PESANAN =====");
        System.out.print("Pilih: ");
        int select = i.nextInt();
        
        //Menentukan Pesanan
        if (select == 1){
            System.out.println("===== VARIAN =====");
            System.out.println("Pilih Varian: ");
            System.out.println("1."+a1+"\n2."+a2+"\n3."+a3);
            System.out.print("Pilih: ");
            int vSelect = i.nextInt();
            System.out.println("===== HASIL =====");
            if (vSelect == 1){
                System.out.println("Anda memesan "+a+" dengan varian "+a1);
            } else if (vSelect == 2){
                System.out.println("Anda memesan "+a+" dengan varian "+a2);
            } else if (vSelect == 3){
                System.out.println("Anda memesan "+a+" dengan varian "+a3);
            } else {
                System.out.println("Varian tidak ada");
            }
        } else if (select == 2){
            System.out.println("===== VARIAN =====");
            System.out.println("Pilih Varian: ");
            System.out.println("1."+b1+"\n2."+b2+"\n3."+b3);
            System.out.print("Pilih: ");
            int vSelect = i.nextInt();
            System.out.println("===== HASIL =====");
            if (vSelect == 1){
                System.out.println("Anda memesan "+b+" dengan varian "+b1);
            } else if (vSelect == 2){
                System.out.println("Anda memesan "+b+" dengan varian "+b2);
            } else if (vSelect == 3){
                System.out.println("Anda memesan "+b+" dengan varian "+b3);
            } else {
                System.out.println("Varian tidak ada");
            }
        } else if (select == 3){
            System.out.println("===== VARIAN =====");
            System.out.println("Pilih Varian: ");
            System.out.println("1."+c1+"\n2."+c2+"\n3."+c3+"\n4."+c4);
            System.out.print("Pilih: ");
            int vSelect = i.nextInt();
            System.out.println("===== HASIL =====");
            if (vSelect == 1){
                System.out.println("Anda memesan "+c+" dengan varian "+c1);
            } else if (vSelect == 2){
                System.out.println("Anda memesan "+c+" dengan varian "+c2);
            } else if (vSelect == 3){
                System.out.println("Anda memesan "+c+" dengan varian "+c3);
            } else if (vSelect == 4){
                System.out.println("Anda memesan "+c+" dengan varian "+c4);
            } else {
                System.out.println("Varian tidak ada");
            }
        } else {
            System.out.println("Pilihan tidak ada atau tidak tersedia.");
        }
    }
}
