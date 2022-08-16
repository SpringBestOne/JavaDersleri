package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_Modulus {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı pozitif bir tam sayı giriniz");
        int sayi= scan.nextInt();  //5267

        int birlerBasamagi= 0;
        int rakamlarToplami=0;
        int ilkGirirlenSayi= sayi;

        birlerBasamagi=sayi%10;   //7
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        birlerBasamagi=sayi%10; //6
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        birlerBasamagi=sayi%10; //2
        rakamlarToplami+=birlerBasamagi; //13+2= 15
        sayi/=10; //5

        birlerBasamagi=sayi%10;
        rakamlarToplami += birlerBasamagi;  //5
        sayi/=10;

        birlerBasamagi=sayi%10;
        rakamlarToplami+= birlerBasamagi;  //5
        sayi/=10;
        System.out.println(ilkGirirlenSayi+ "Sayının rakamlar toplami:" +rakamlarToplami);











    }
}
