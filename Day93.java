package OneHundredDaysOfCoding;
import java.util.Scanner;
public class Day93 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Nilai x: ");
        double x = i.nextDouble();
        System.out.println("\nx = "+x);
        System.out.println("y = x*1,37");
        System.out.println("===== Nilai X =====");
        System.out.printf("Nilai\t: %.2f\n",x);
        System.out.println("Ceil\t: "+Math.ceil(x));
        System.out.println("Floor\t: "+Math.floor(x));
        System.out.println("Round\t: "+Math.round(x));
        double y = x*1.37;
        System.out.println("===== Nilai Y =====");
        System.out.printf("Nilai\t: %.2f\n",y);
        System.out.println("Ceil\t: "+Math.ceil(y));
        System.out.println("Floor\t: "+Math.floor(y));
        System.out.println("Round\t: "+Math.round(y));
    }
}
