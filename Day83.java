package OneHundredDaysOfCoding;
public class Day83 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int total = 0;
        System.out.println("Panjang array\t: "+arr.length);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print("Index ["+i+"]\t: "+arr[i]+" + "+total+" = ");
            total += arr[i];
            System.out.println(total);
        }
        System.out.println("Total penjumlahan: "+total);
    }
}
