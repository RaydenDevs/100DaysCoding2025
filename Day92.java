package OneHundredDaysOfCoding;
import java.util.Scanner;
public class Day92 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String nama = i.nextLine();
        int umur = i.nextInt();
        System.out.println(cekData(nama, umur));
    }
    public static String cekData(String nama, int umur) {
        if (nama.isEmpty()) {
            return "Nama tidak boleh kosong!";
        }
        if (umur < 0) {
            return "Umur tidak valid!";
        }
        return "Data valid: " + nama + " (" + umur + ")";
    }
}
