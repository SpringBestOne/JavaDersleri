package day09_TernaryOperator;

import java.util.Scanner;

public class C05Switch_Statement {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int gunNo= Scan.nextInt();
        switch (gunNo){
            case 1:
                System.out.println("Pazartesi");
            case 2:
                System.out.println("Sali");
            case 3:
                System.out.println("Carsamba");
            case 4:
                System.out.println("Persembe");
            case 5:
                System.out.println("Cuma");
            case 6:
                System.out.println("Cumartesi");
            case 7:
                System.out.println("Pazar");
            default:
                System.out.println("Gecerli gun numarasi giriniz");



    }
}}
