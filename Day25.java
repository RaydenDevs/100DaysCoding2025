package OneHundredDaysOfCoding;
public class Day25 {
    public static void main(String[] args) {
        int a = 5;
        
        System.out.println("Default = " + a);
        
        a++;
        System.out.println("Setelah ditambah dengan a++ = " +a);
        ++a;
        System.out.println("Setelah ditambah dengan ++a = " +a);
        
        a = 5;
        
        --a;
        System.out.println("Setelah dikurangi dengan --a = " +a);
        a--;
        System.out.println("Setelah dikurangi dengan a-- = " +a);
    }
}
