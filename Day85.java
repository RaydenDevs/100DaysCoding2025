package OneHundredDaysOfCoding;
public class Day85 {
    public static void main(String[] args) {
        int[] a = {1,9,5};
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b) b = a[i];
        }
        System.out.println("Angka terbesar : "+b);
    }
}
