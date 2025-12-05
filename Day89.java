package OneHundredDaysOfCoding;
import java.util.Scanner;
public class Day89 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Angka Awal\t: ");
        int awal = i.nextInt();
        System.out.print("Angka Akhir\t: ");
        int akhir = i.nextInt();
        deretanAngka(awal,akhir);
    }
    public static void deretanAngka(int a, int b){
        System.out.print("Deretan Angka\t: ");
        for (int i = a; i <= b; i++) {
            System.out.print(i+" ");
        }
    }
}
