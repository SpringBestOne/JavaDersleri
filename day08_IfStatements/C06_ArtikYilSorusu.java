package day08_IfStatements;

import java.util.Scanner;

public class C06_ArtikYilSorusu {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("bir yıl giriniz");
        int a= scan.nextInt();
        if(a%4==0){
            if (a%100==0){
                if (a%400==0){
                    System.out.println("artık yıl");
                }else
                    System.out.println("artık yıl değil");
            }else
                System.out.println("artık yıl");
        }else
            System.out.println("artık yıl değil");

    }
}
