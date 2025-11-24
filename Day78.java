package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String trueUser = "M Rayhan S";
        String truePass = "Admin123";
        
        System.out.print("Username: ");
        String user = i.nextLine();
        System.out.print("Password: ");
        String pass = i.nextLine();
        
        user.isEmpty();
        System.out.println("Username: "+user.equalsIgnoreCase(trueUser));
        System.out.println("Username Length: "+user.length());
        System.out.println("Password: "+pass.equals(truePass));
        System.out.println("Password Length: "+pass.length());
        
        System.out.println("Hello, "+user.toUpperCase()+"!");
    }
}
