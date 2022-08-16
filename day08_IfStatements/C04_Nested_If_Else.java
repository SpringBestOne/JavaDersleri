package day08_IfStatements;

import java.util.Scanner;

public class C04_Nested_If_Else {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Lutfen dort basamakli bir sayi giriniz");
        int sayi = Scan.nextInt();

        if (sayi < 1000 || sayi > 9999) {
            System.out.println("Lutfen dort basamakli sayi giriniz");
        } else if (sayi % 5 == 0) {
            if (sayi % 10 == 0) {
                System.out.println("5 e bolunen cift sayi");
            } else {
                System.out.println("5 e bolunen tek sayi");

            }


        }
    }}