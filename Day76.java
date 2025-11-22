package OneHundredDaysOfCoding;
public class Day76 {
    public static void main(String[] args) {
        String word = "admin123";
        String key = "Admin123";
        System.out.println(word.equals(key));
        System.out.println(word.equalsIgnoreCase(key));
        System.out.println(word.contains("123"));
        System.out.println(word.isEmpty());
    }
}
