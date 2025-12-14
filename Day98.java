package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day98 {
    
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int n = i.nextInt();
        int a = 0, b = 1;
        for (int j = 0; j < n; j++) {
            System.out.print(a+" ");
            int c = a+b;
            a = b;
            b = c;
        }
    }
}
