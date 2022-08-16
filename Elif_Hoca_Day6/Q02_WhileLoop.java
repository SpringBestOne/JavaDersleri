package Elif_Hoca_Day6;

import java.util.Scanner;

public class Q02_WhileLoop {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scan.nextInt();

        int count=0;

        while (sayi>0){
            if(sayi%2==1){
                System.out.println(sayi);
                count++;
            }
            sayi--;
        }
        System.out.println("count =" + count);
    }

}
   /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
          int sayi=7;
        while(sayi<10){
            System.out.println(sayi);
            sayi++;

        int sayi = 7;
        while (sayi <= 10) {
            sayi++;
            if (!(sayi % 2 == 0)) {

                System.out.println(sayi);
            }
        }

           */