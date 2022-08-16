package day09_TernaryOperator;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        Scanner Scan =new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi= Scan.nextDouble();

        System.out.println(sayi>=0? sayi:(-1*sayi));



    }
}
