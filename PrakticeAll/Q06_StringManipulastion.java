package PrakticeAll;

import java.util.Scanner;

public class Q06_StringManipulastion {

    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.
    public static void main(String[] args) {
/*
V    Scanner scan = new Scanner(System.in); //mesaj vermeden de konsol da girdi girilir
        String kelime = scan.next();
        System.out.println(kelime.length());
        if (kelime.length() <= 4) {
            char bir = kelime.charAt(0);
            char iki = kelime.charAt(1);
            char uc = kelime.charAt(2);
            char dort = kelime.charAt(3);
            System.out.println("Tersden :" + dort + uc + iki + bir);
        } else {
            System.out.println("Girdiginiz kelime uzunlugu 4 karakterden fazla");
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen metin giriniz");
      String metin = scan.nextLine();

        if(metin.contains(" ") || metin.isEmpty()){
            System.out.println("bosluk icerir");
        }else System.out.println("bosluk icermez");




    }
}
