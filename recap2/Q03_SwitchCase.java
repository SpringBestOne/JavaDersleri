package recap2;

import java.util.Scanner;

public class Q03_SwitchCase {
    // Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("3 Basamakli bir sayi giriniz : ");
        int sayi=scan.nextInt();

        int birlerBasamagi= sayi%10; // 123 ün 3 ü

        int onlarBasamagi= (sayi/10)%10; //123 ün 23 ü

        int yuzlerbasanmagi= sayi/100; // 123 ün 100 ü

        // int birlerBasamagi= sayi%10, onlarBasamagi= (sayi/10)%10,yuzlerbasanmagi= sayi%100;    yan yana da yazabiliriz


        if (sayi>99 && sayi<1000)

        switch (yuzlerbasanmagi) {
            case 0: System.out.println("");break;
            case 1: System.out.println("yuz\t");break;
            case 2: System.out.println("ikiyuz\t");break;
            case 3: System.out.println("ucyuz\t");break;
            case 4: System.out.println("dortyuz\t");break;
            case 5: System.out.println("besyuz\t");break;
            case 6: System.out.println("altiyuz\t");break;
            case 7: System.out.println("yediyuz\t");break;
            case 8: System.out.println("sekizyuz\t");break;
            case 9: System.out.println("dokuzyuz\t");break;


        }switch (onlarBasamagi) {
            case 0: System.out.println("");break;
            case 1: System.out.println("on\t");break;
            case 2: System.out.println("yirmi\t");break;
            case 3: System.out.println("otuz\t");break;
            case 4: System.out.println("kirk\t");break;
            case 5: System.out.println("elli\t");break;
            case 6: System.out.println("altmis\t");break;
            case 7: System.out.println("yetmis\t");break;
            case 8: System.out.println("seksen\t");break;
            case 9: System.out.println("doksan\t");break;

        }
        switch (birlerBasamagi) {
            case 0: System.out.println("");break;
            case 1: System.out.println("bir");break;
            case 2: System.out.println("iki");break;
            case 3: System.out.println("uc");break;
            case 4: System.out.println("dort");break;
            case 5: System.out.println("bes");break;
            case 6: System.out.println("alti");break;
            case 7: System.out.println("yedi");break;
            case 8: System.out.println("sekiz");break;
            case 9: System.out.println("dokuz");break;
        }
    }//else  ("3 basamakli sayi giriniz..");
}





