package OneHundredDaysOfCoding;
public class Day34 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a <  b : " + (a < b));
        System.out.println("a >  b : " + (a > b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a >= b : " + (a >= b));

        System.out.println("(a < b) && (a > 0) : " + ((a < b) && (a >= 5)));
        System.out.println("(a > b) || (a > 0) : " + ((a > b) || (a >= 10)));
        System.out.println("(a < b) && (b > 0) : " + ((a < b) && (b >= 5)));
        System.out.println("(a > b) || (b > 0) : " + ((a > b) || (b >= 10)));
        System.out.println("!(a == b) : " + ((a == b)));
        System.out.println("!(a == b) : " + (!(a == b)));
    }
}
