package OneHundredDaysOfCoding;
public class Day2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        System.out.println(a==b && b==a); //false
        System.out.println(a!=b && b!=a); //true
        System.out.println(a>=b && b<=a); //false
        System.out.println(a<=b && b>=a); //true
    }
}
