package Odev_Calisma;

import java.util.Scanner;

public class C02_tolgaCalisma {
    public static void main(String[] args) {

      //  Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.
        //
        //Input : 6
        //
        //Output: 6!=65432*1=720

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int faktoriyel=1;

        for (int i = 1; i <=sayi ; i++) {
            faktoriyel=faktoriyel*i;}
            System.out.println(faktoriyel);

        }
    }
