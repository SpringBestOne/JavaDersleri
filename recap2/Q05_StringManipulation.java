

package recap2;

import java.util.Locale;
import java.util.Scanner;

public class Q05_StringManipulation {
    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("isim girinizi ve soyisim giriniz");
       String  isim =scan.nextLine(),
               soyisim =scan.nextLine(); // multiple declaration

        System.out.println(isim.concat(" " + soyisim).toUpperCase());
    }
}
