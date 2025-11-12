package OneHundredDaysOfCoding;

public class Day66 {
    public static void main(String[] args) {
        char ascii = 65;
        for (int i = 1; i <= 15; i++) {
            for (int j = 1; j <= 3; j++) {
                if (ascii > 90) ascii = 65;
                System.out.print(ascii+" ");
                ascii++;
            }
            System.out.println();
        }
    }
}
