package Elif_Hoca_Day6;

import java.util.Scanner;

public class Q01_WhileLoop {
    public static void main(String[] args) {

        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

        /*

        int input=5432;

        int rakamlarToplami=0;
        int birlerBasamagi=0;
        int temp=input;


        while (temp > 0) {
            birlerBasamagi=temp%10;
            rakamlarToplami+=birlerBasamagi;
            temp/=10;

        }

        System.out.println(input+ "sayisinin rakamlar toplami: " + rakamlarToplami);
    }


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scan.nextInt();

        int rakamlarToplami=0;
        int birlerBasamagi=0;
        int temp=sayi;

        while (temp>0){
            birlerBasamagi=temp%10;
            rakamlarToplami+=birlerBasamagi;
            temp/=10;
        }
        System.out.println("Girilen sayinin rakamlar toplami: " +rakamlarToplami);

         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scan.nextInt();

        basamakToplama(sayi);
        System.out.println(basamakToplama(sayi));
    }

    private static int basamakToplama(int sayi) {
        int toplam=0;
        while (sayi!=0){
            toplam+=sayi%10;
            sayi/=10;
        }

        return  toplam;
    }
}
