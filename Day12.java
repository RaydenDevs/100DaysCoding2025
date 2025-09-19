package OneHundredDaysOfCoding;
import java.util.Scanner;
public class Day12 {
    public static void main(String[] args) {
        //Biodata Sederhana
        Scanner i = new Scanner(System.in);
        
        System.out.print("Nama Lengkap: ");
        String nama = i.nextLine();
        System.out.print("Umur (Tahun): ");
        int umur = i.nextInt();
        i.nextLine();
        System.out.print("Alamat: ");
        String alamat = i.nextLine();
        System.out.print("Tempat Lahir: ");
        String tempat = i.nextLine();
        System.out.print("Tanggal Lahir: ");
        String tanggal = i.nextLine();
        
        System.out.println("\n========== BIODATA SEDERHANA ==========\n");
        
        System.out.println("Nama Lengkap\t\t: "+ nama);
        System.out.println("Umur\t\t\t: " + umur + " Tahun");
        System.out.println("Alamat\t\t\t: "+ alamat);
        System.out.println("Tempat,Tanggal Lahir\t: "+ tempat + ", " + tanggal);
    }
}
