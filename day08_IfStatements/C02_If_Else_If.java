package day08_IfStatements;

import java.util.Scanner;

public class C02_If_Else_If {
    public static void main(String[] args) {

        // Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
// Not'u harf sistemine cevirip yazdirin.
// 50’den kucukse "D",
// 50-60 arasi "C",
// 60-80 arasi "B",
// 80’nin uzerinde ise "A"

        Scanner Scan = new Scanner(System.in);
        System.out.println("Lutfen 0' dan 100 e kadar bir sayi giriniz");
       double note= Scan.nextDouble();

       if(note<0 || note>100) {
           System.out.println("Lutfen Gecerli bir not giriniz");

       } else if (note<50) {
           System.out.println("notunuz: D");
       } else if (note<60) {
           System.out.println("notunuz: C");

       } else if (note<80) {
           System.out.println("notunuz:B");
       }else {
           System.out.println("notunuz: A");

       }

    }


    }

