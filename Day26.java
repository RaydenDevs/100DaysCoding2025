package OneHundredDaysOfCoding;
public class Day26 {
    public static void main(String[] args) {
        int a = 10;

        System.out.println("Nilai awal a = " + a);
        a += 5;
        System.out.println("Setelah a += 5: " + a); //15
        a -= 3;
        System.out.println("Setelah a -= 3: " + a); //12
        a *= 2;
        System.out.println("Setelah a *= 2: " + a); //24
        a /= 4;
        System.out.println("Setelah a /= 4: " + a); //6
        a %= 3;
        System.out.println("Setelah a %= 3: " + a); //0
    }
}
