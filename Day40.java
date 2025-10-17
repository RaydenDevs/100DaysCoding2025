package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.println("===== KALKULATOR SEDERHANA =====");
        
        System.out.print("Masukkan angka pertama: ");
        double a = i.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char op = i.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double b = i.nextDouble();
        
        double hasil;

        if (op == '+') {
            hasil = a + b;
            System.out.println("Hasil: " + hasil);
        } else if (op == '-') {
            hasil = a - b;
            System.out.println("Hasil: " + hasil);
        } else if (op == '*') {
            hasil = a * b;
            System.out.println("Hasil: " + hasil);
        } else if (op == '/') {
            if (b != 0) {
                hasil = a / b;
                System.out.println("Hasil: " + hasil);
            } else {
                System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
            }
        } else {
            System.out.println("Operator tidak valid.");
        }
    }
}
