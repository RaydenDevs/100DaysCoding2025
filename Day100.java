package OneHundredDaysOfCoding;

import java.util.Scanner;

public class Day100 {
    
    public static void main(String[] args) {
        //String Cantik ISC
        //Jika terdapat karakter I-S-C dari sebuah string secara berurut = CANTIK
        //Jika tidak berurut = TIDAK CANTIK
        Scanner i = new Scanner(System.in);
        
        //Input kata
        System.out.print("String: ");
        String kata = i.nextLine().toLowerCase().replace(" ", "");
        
        char[] isc = {'i','s','c'};
        String urutanISC = "";
        int indexISC = 0;
        
        //Mencari kombinasi urutan "isc"
        for (int j = 0; j < kata.length(); j++) {
            if (kata.charAt(j) == isc[indexISC]){
                urutanISC += kata.charAt(j);
                indexISC++;
            }
            if (urutanISC.equals("isc")) break;
        }
        
        //Pengecekan String - Output
        if (urutanISC.equals("isc")){
            System.out.println("CANTIK");
        } else {
            System.out.println("TIDAK CANTIK");
        }
        
        //System.out.println("String "+'c'); //Test String+Char
    }
}
