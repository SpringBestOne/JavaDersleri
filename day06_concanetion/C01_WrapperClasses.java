package day06_concanetion;

import java.util.Locale;
import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {

        String str= "Java ile hayat ne güzel";
        System.out.println(str.toUpperCase());

        boolean guzelMi= true;  //

        Boolean buGuzelMi= true;
        buGuzelMi.toString();


        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);



        String ogrNo= "123456";
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen Kullanıcıdan bir şifre giriniz");

        String sifre= scan.nextLine();
        Integer sifreSayi=Integer.parseInt(sifre);
        System.out.println("Girilen sifre:"+ sifre);
        System.out.println("Integer sifre:"+ sifre);

        System.out.println("Girilen sifrenin 3 fazlası:"+ (sifre+3));
        System.out.println("Integer sifrenin 3 fazlası:"+ (sifreSayi+3));

    }
}
