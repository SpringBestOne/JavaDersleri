package Mzfr_Hoca_Day_10_Practice.OkulProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Hosgeldiniz okulumuza");

        System.out.println("isim giriniz");

        String isim=scan.next();

        System.out.println("soyisim giriniz");
        String soyisim=scan.next();

        System.out.println("yasinizi giriniz");
        int yas= scan.nextInt();

        System.out.println("brans giriniz");
        String brans=scan.next();
        scan.nextLine();//dummy hayalet komut
        System.out.println("tel no giriniz");
        String tel=scan.next();

        Ogretmen_Bilgileri adayOgretmen=new Ogretmen_Bilgileri(isim,soyisim,yas,brans,tel);
        List<Ogretmen_Bilgileri> ogretmenList=new ArrayList<>();
ogretmenList.add(adayOgretmen);
        System.out.println("ogretmenList = " + ogretmenList);
    }
}
