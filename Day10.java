package OneHundredDaysOfCoding;
public class Day10 {
    public static void main(String[] args) {
        final String nama = "Muh Rayhan S";
        final String prodi = "Informatika";
        final String a = "Java";
        final double b = 3.14159;
        final int c = 100;
        
        /*
        Jika nilai variabel diatas diupdate/diubah maka akan terjadi error
        karena nilai dari variabel sudah final dan tidak bisa diubah2 lagi
        */
        
        //Contoh:
        //a = "Lua"; //Error

        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Bahasa Pemrograman: " + a);
        System.out.println("Nilai b: " + b);
        System.out.println("Nilai c: " + c);
    }
}
