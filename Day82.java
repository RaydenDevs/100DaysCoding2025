package OneHundredDaysOfCoding;
import java.util.Scanner;
public class Day82 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int array, nol = 0, total = 0;
        
        System.out.print("Masukkan jumlah elemen array: ");
        array = i.nextInt();
        
        int[] arr = new int[array];
        for (int j = 0; j < array; j++) {
            System.out.print("Masukkan nilai Array [" + j + "]: ");
            arr[j] = i.nextInt();
            if (arr[j] <= 0) {
                arr[j] = 0;
                nol++;
            }
            total += arr[j];
        }
        
        double rata = (double) total/array;
        
        System.out.println("===== OUTPUT =====");
        System.out.print("Elemen Array\t: ");
        for (int j = 0; j < array; j++) {
            System.out.print(arr[j]+", ");
        }
        System.out.println();
        System.out.println("Total \t\t: "+total);
        System.out.printf("Rata-rata\t: %.2f",rata);
        System.out.println("\nArray nol\t: "+nol);
        
    }
}
