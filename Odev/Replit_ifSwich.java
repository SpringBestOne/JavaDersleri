package Odev;

import java.util.Scanner;

public class Replit_ifSwich {
    public static void main(String[] args) {
        //Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır. Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.
        //Eger aynı karakterlere sahipse
        //"isim ayni karakterlere sahiptir." yazdirin.
        //Eger ayni kaakterlere sahip degilse
        //"Dizenin benzersiz karakterleri var" yazdirin.
        //Ternary kullanin.

        Scanner scan=new Scanner(System.in);
        System.out.println("uc harfli bir isim giriniz");
        String isim=scan.next();

       char ilk=isim.charAt(0);
       char iki=isim.charAt(1);
       char uc=isim.charAt(2);

        System.out.println( ilk==iki ? "ayni harf var ": ilk==uc ? "ayni harf var":iki==uc ? "ayni harf var" : "ayni harf yok" );

    }
}
