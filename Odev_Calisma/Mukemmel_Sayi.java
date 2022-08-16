package Odev_Calisma;

import java.util.Scanner;

public class Mukemmel_Sayi {
    public static void main(String[] args) {
           /*
            Problem Tanımı :
            Kullanıcıdan alınan  bir sayinin mükemmel olup olmadiğini bulan bir program yaziniz.
            Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
            ORNEK:
            INPUT     : 6
            OUTPUT : 1,2,3
                          1+2+3 = 6 = 6 (Mükemmel)
            */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scan.nextInt();
        String bol = "";
        int boltop = 0;
        for (int i = 1; i < sayi; i++) {
            if(sayi%i==0){
                bol+=i + "";
                boltop+=i;
            }
            else if (boltop == sayi) {
                System.out.println(sayi + " Sayısı Mükemmel Sayıdır. Sayının Bölenleri :" + bol );
        }else System.out.println(sayi + " Mukemmel Sayidir degildir.");

    }
}}
