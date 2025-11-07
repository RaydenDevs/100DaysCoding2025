package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        System.out.print("Nilai M: ");
        int m = i.nextInt();
        System.out.print("Nilai N: ");
        int n = i.nextInt();
        i.nextLine();
        System.out.print("Kelipatan M: ");
        for (int j = 1; j <= n; j++) {
            if (j % m == 0){
                System.out.print(j+" ");
            }
        }
    }
}
