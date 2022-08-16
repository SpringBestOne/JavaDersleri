package day09_TernaryOperator;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        Scanner Scan =new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
       int sayi= Scan.nextInt();
        System.out.println(sayi>0? "sayi pozitif": sayi*sayi);

    }
}
