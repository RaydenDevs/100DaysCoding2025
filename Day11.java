package OneHundredDaysOfCoding;
import java.util.Scanner;
public class Day2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("String1: ");
        String a = input.nextLine();
        
        System.out.println("string2: ");
        String b = input.next();
        input.nextLine(); 
        
        /*
        setelah input.next(), karakter "Enter" masih tertinggal di buffer input
        dan jika dibiarkan maka input.nextLine() setelah input.next() hanya akan
        membaca "Enter"nya saja sehingga akan terjadi skip input
        */
        
        System.out.println("String3: ");
        String b2 = input.nextLine();
        
        System.out.println("Masukkan angka mulai dari 0-127: ");
        byte c0 = input.nextByte();
        
        System.out.println("Angka Favorit (Hanya angka pertama yang dihitung): ");
        char c = input.next().charAt(0);
        
        input.close();
        
        /*
        Dari penjelasan yang saya dapat, Scanner membuka stream input dari
        keyboard (System.in) yang dimana jika tidak ditutup "input.close()"
        maka bisa menyebabkan memory leak
        */
        
        System.out.println("String 1: " + a);
        System.out.println("String 2: " + b);
        System.out.println("String 2: " + b2);
        System.out.println("Angka 0-127: " + c0);
        System.out.println("Angka Favorit: " + c);
        
        /*
        byte     b = input.nextByte();
        short    s = input.nextShort();
        int      i = input.nextInt();
        long     l = input.nextLong();
        float    f = input.nextFloat();
        double   d = input.nextDouble();
        boolean  bool = input.nextBoolean();
        char     c = input.next().charAt(0);
        String   kata = input.next();
        String   kalimat = input.nextLine();
        */
    }
}
