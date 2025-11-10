package OneHundredDaysOfCoding;
import java.util.Scanner;
public class Day64 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        System.out.print("Nilai M: ");
        int m = i.nextInt();
        System.out.print("Nilai N: ");
        int n = i.nextInt();
        
        int p = m;
        
        for (int j = 1; j < n; j++) {
            p *= m;
        }
        
        System.out.println(m + " pangkat " + n+ " = " + p);
    }
}
