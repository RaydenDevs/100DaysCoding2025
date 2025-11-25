package OneHundredDaysOfCoding;
import java.util.Scanner;
public class Day79 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String trueUser, truePass, user, pass;

        System.out.println("==== SIGN UP ====");
        System.out.print("Username: ");
        trueUser = i.nextLine();
        System.out.print("Password: ");
        truePass = i.nextLine();
        System.out.println("\nAkun berhasil dibuat.");

        do {
            System.out.println("==== SIGN IN ====");
            System.out.print("Username: ");
            user = i.nextLine();
            System.out.print("Password: ");
            pass = i.nextLine();
            if (pass.equals(truePass) && user.equals(trueUser)) {
                System.out.println("Login berhasil.");
            } else {
                System.out.println("Login gagal, coba lagi.");
            }
            System.out.println();
        } while (!pass.equals(truePass) || !user.equals(trueUser));
    }
}
