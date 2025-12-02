package OneHundredDaysOfCoding;
public class Day85 {
    public static void main(String[] args) {
        int[] a = {8,5,3,6,9};
        int b = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < b) b = a[i];
            System.out.print(a[i]+" ");
        }
        System.out.println("Angka terkecil : "+b);
    }
}
