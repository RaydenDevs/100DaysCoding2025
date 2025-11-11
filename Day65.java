package OneHundredDaysOfCoding;
import java.util.Scanner;
public class Day65 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai: ");
        int a = i.nextInt();
        int f = 1;
        
        for (int j = 1; j <= a; j++) {
            f *= j;
        }
        
        System.out.println("Hasil Faktorial: "+f);
    }
}
