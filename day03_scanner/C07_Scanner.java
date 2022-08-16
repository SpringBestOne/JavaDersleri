package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ismiznizi,soyisminizi,yasinizi giriniz\n aralarda Enter e basınız");
        String isim= scan.nextLine();
        String soyisim= scan.next();
        int yas= scan.nextInt();

        System.out.println("girilen bilgiler= "+isim+", "+soyisim+", "+yas);

    }
}
