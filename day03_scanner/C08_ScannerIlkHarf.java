package day03_scanner;

import java.util.Locale;
import java.util.Scanner;

public class C08_ScannerIlkHarf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ismiznizi giriniz");
        char ilkHarf= scan.next().toUpperCase().charAt(0);
        System.out.println("isminizin ilk harfi:"+ ilkHarf);

    }
}
