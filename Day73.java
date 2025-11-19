package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day73 {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        double angka, total = 0, rataRata = 0, max = 0, min = 0, valid = 0;
        while (true) {
            System.out.print("Masukkan Angka (negatif untuk berhenti): ");
            angka = i.nextDouble();
            if (angka > 0) {
                valid++;
                total += angka;
                rataRata = total/valid;
                if (min > angka || min == 0) min = angka;
                if (max < angka) max = angka;
            } else if (angka < 0 && total == 0){
                System.out.println("Tidak ada data untuk dihitung.");
                break;
            } else if (angka < 0){
                System.out.println("===== HASIL =====");
                System.out.println("Total penjumlahan\t: "+total);
                System.out.println("Jumlah angka valid\t: "+valid);
                System.out.println("Rata - rata\t\t: "+rataRata);
                System.out.println("Angka maksimum\t\t: "+max);
                System.out.println("Angka minimum\t\t: "+min);
                break;
            }else {
                System.out.println("Angka 0 diabaikan");
            }
        }
    }
}
