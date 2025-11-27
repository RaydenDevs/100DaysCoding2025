package OneHundredDaysOfCoding;
import java.util.Scanner;
public class Day81 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String[] nama = {"Rayhan", "Steven", "Rasya", "Rifky", "Muzita", "Tasya", "Yugo"};
        int index;
        do {
            System.out.println("Tampilkan nama (ketik 1-" + nama.length + ")");
            System.out.print("Angka: ");
            index = i.nextInt();
            if (index < 1 || index > nama.length) System.out.println(">> Angka tidak valid! <<\n");
        } while (index < 1 || index > nama.length);
        System.out.println("Nama: " + nama[index-1]);
    }
}
