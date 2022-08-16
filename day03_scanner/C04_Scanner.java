package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //kullanıcıdan ismini isteyin
        //girilrn ismi   isminiz :İsmail şeklinde yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String kullaniciIsmi =scan.next();
        System.out.println("isminiz  :"+kullaniciIsmi);

    }
}
