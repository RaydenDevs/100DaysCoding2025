package OneHundredDaysOfCoding;
public class Day20 {
    public static void main(String[] args) {
        int a = 12;
        double b = 22.22;
        boolean c = true;
        
        String a1 = String.valueOf(a);
        String b1 = String.valueOf(b);
        String c1 = String.valueOf(c);
        
        System.out.println("===== Value Of =====");
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        
        String a2 = Integer.toString(a);
        String b2 = Double.toString(b);
        String c2 = Boolean.toString(c);
        
        System.out.println("===== To String =====");
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);
        
        String a3 = String.format("%d", a);
        String b3 = String.format("%.2f", b);
        String c3 = String.format("%b", c);
        
        System.out.println("===== String Format =====");
        System.out.println(a3);
        System.out.println(b3);
        System.out.println(c3);
    }
}
