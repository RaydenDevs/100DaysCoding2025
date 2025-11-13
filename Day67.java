package OneHundredDaysOfCoding;
import java.util.Scanner;
public class Day67 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Tinggi pola: ");
        int t = i.nextInt();
        char ascii = 65;
        for (int v = 1; v <= (t/5); v++) {
            for (int j = 0; j <= t; j++) {
                if (ascii > 90) ascii = 65;
                System.out.print(ascii+" ");
                ascii++;
            }
            System.out.println();
        }
    }
}
