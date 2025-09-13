package OneHundredDaysOfCoding;
public class Day6 {
    public static void main(String[] args) {
        float f = 3.1415926f;  // harus pakai 'f' di akhir
        /*
        32-bit (4 byte)
        6–7 digit desimal
        Lebih hemat memori, tapi presisi lebih rendah. Harus pakai huruf f di akhir literal.
        */
        double d = 3.141592653589793; // default desimal adalah double
        /*
        64-bit (8 byte)
        15–16 digit desimal
        Lebih presisi, standar default untuk angka desimal di Java.
        */
        
        System.out.println("Float  : " + f);
        System.out.println("Double : " + d);
    }
}
