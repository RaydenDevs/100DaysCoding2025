package OneHundredDaysOfCoding;
import java.util.Scanner;
public class Day62 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        System.out.print("Nilai N: ");
        int n = i.nextInt();
        int m = 0;
        for (int j = 1; j <= n; j++) {
            System.out.print(m+" + "+j+" = ");
            m += j;
            System.out.println(m);
        }
        System.out.println("Total: "+m);
    }
}
