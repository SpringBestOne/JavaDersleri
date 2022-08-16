package day07_ifStatements;

import java.util.Scanner;

public class C06_ifElseStatements {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Lutfen yasınızı giriniz");
        int yas=Scan.nextInt();

        if(yas<65){
            System.out.println("emekli olamazsın, "+(65-yas)+" calısmalısın");
        }else {
            System.out.println("emekli olabilirsin");
        }

    }
}
