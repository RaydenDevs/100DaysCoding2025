package OneHundredDaysOfCoding;
public class Day13 {
    public static void main(String[] args) {
        char a = ('&');
        char b = ('$');
        char c = ('@');
        char d;
        
        System.out.printf("URUTAN NILAI SEBELUM DITUKAR: %c, %c, %c\n\n", a, b, c);
        
        d = a;
        a = b;
        b = d;
        //Nilai c masih sama jadi tidak perlu ditukar/ubah
        
        System.out.printf("URUTAN NILAI SESUDAH DITUKAR: %c, %c, %c\n\n", a, b, c);
    }
}
