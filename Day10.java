package OneHundredDaysOfCoding;
public class Day10 {
    // Deklarasi konstanta global dengan kata kunci 'final'
    public static final double PI = 3.14159;
    public static final int MAX_VALUE = 100;
    
    public static String nama = "Muh Rayhan S";
    
    public static void main(String[] args) {
        // Contoh penggunaan konstanta lokal
        final String APP_NAME = "Belajar Java";
        
        String prodi = "Informatika";
        
        /*
        Jika nilai APP_NAME diubah jadi (Contoh seperti di bawah) maka akan terjadi error
        karena nilai dari APP_NAME sudah final dan tidak bisa diubah2 lagi
        */
        
        //APP_NAME = "bruh"; //Error

        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Nama Aplikasi: " + APP_NAME);
        System.out.println("Nilai PI: " + PI);
        System.out.println("Nilai Maksimum: " + MAX_VALUE);
    }
}
