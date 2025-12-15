package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day99 {
    
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int n = i.nextInt();

        System.out.println("Bilangan prima dari 1 sampai dengan " + n + ":");

        for (int k = 2; k <= n; k++) {
            int a = 0;

            for (int j = 1; j <= k; j++) {
                if (k % j == 0) a++;
            }

            if (a == 2) {
                if (k == 19) {
                    System.out.println(k); 
                } else {
                    System.out.print(k + " ");
                }
            }
        }
    }
}
