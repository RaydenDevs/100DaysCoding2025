package OneHundredDaysOfCoding;
public class Day80 {

    public static void main(String[] args) {
        int[] nomor = {5,10,15,20};
        boolean[] benar = {true,false,false,true};
        String[] kata = {"lima","sepuluh","lima belas","dua puluh"};
        
        for (int i = 0; i < nomor.length; i++) {
            System.out.println("===== Perulangan ke "+(i+1)+" =====");
            System.out.println("Isi ketiga array di index "+i+"\nadalah ("+nomor[i]+","+benar[i]+","+kata[i]+")");
        }
    }
}
