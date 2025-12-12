package OneHundredDaysOfCoding;
public class Day96 {
    
    public static void main(String[] args) {
        double a = 5, b = 10;
        System.out.println(a+" + "+b+" = "+tambah(a,b));
        System.out.println(a+" - "+b+" = "+kurang(a,b));
        System.out.println(a+" * "+b+" = "+kali(a,b));
        System.out.println(a+" / "+b+" = "+bagi(a,b));
    }
    public static double tambah(double a, double b) {return a + b;}
    public static double kurang(double a, double b){return a - b;}
    public static double kali(double a, double b){return a * b;}
    public static double bagi(double a, double b){return a / b;}
}
