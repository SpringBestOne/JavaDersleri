package day08_IfStatements;

import java.util.Scanner;

public class C05_Nested_IfElseStatements {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        System.out.println("sifre giriniz");

        String sifre = Scan.nextLine();
        char ilkHarf = sifre.charAt(0);
        if (ilkHarf >= 'A' && ilkHarf <= 'Z'){
            if(ilkHarf=='A');
            System.out.println("gecerli sifre");}
        else if (ilkHarf>='a'&& ilkHarf<='z') {
            if (ilkHarf=='z') {
                System.out.println("gecerli sifre");
            }else {
                System.out.println("gecersiz sifre");
            }

        }else{
            System.out.println("Lutfen ilk karakter icin harf giriniz");
        }


    }
}
