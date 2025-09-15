package OneHundredDaysOfCoding;
public class Day8 {
    public static void main(String[] args) {
        String nama = "Muh Rayhan S";
        
        // Panjang string
        System.out.println("Panjang: " + nama.length());

        // Mengambil karakter pada indeks tertentu
        System.out.println("Karakter ke-0: " + nama.charAt(0));
        System.out.println("Karakter ke-4: " + nama.charAt(4));

        // Mengubah huruf menjadi kapital/kecil
        System.out.println("Uppercase: " + nama.toUpperCase());
        System.out.println("Lowercase: " + nama.toLowerCase());

        // Mengecek apakah mengandung teks tertentu
        System.out.println("Mengandung 'S'? " + nama.contains("S"));
        System.out.println("Mengandung 'ID'? " + nama.contains("ID"));

        // Menggabungkan string
        String gabungan = nama + " - 100 Days Of Coding";
        System.out.println("Gabungan: " + gabungan);

        // Mengganti teks
        String ganti = nama.replace("Rayhan", "Raihan");
        System.out.println("Sesudah replace: " + ganti);

        // Memotong string (substring)
        System.out.println("Substring(0, 12): " + nama.substring(0, 12));
        System.out.println("Substring(4, 10): " + nama.substring(4, 10));
        System.out.println("Substring(0, 1): " + nama.substring(0, 1));
    }
}
