package Odev;

import java.util.Scanner;

public class Replit_Scanner10 {
    public static void main(String[] args) {

        //Dakika gir , dakikaları yıl ve gün sayısına dönüştur

        Scanner scan = new Scanner(System.in);
        System.out.println("Dakika giriniz");
        int dakika = scan.nextInt();

        int yil = (dakika / (24 * 60)) / 365;
        int gun = (dakika / (24 * 60)) % 365;
        System.out.println(dakika + " dakika yaklasik " + yil + " yıl " + gun + " gundur");


    }
}
