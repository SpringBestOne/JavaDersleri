package Elif_Hoca_Day6;

import java.util.Scanner;

public class Q03_DoWhileLoop {
    public static void main(String[] args) {
            /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.


    */
        Scanner abc= new Scanner(System.in);
        String okunan="";
        do {
            System.out.println("Harf giriniz : ");
           okunan=abc.next();
            System.out.println("Program çalışıyor");
        }while (!okunan.equalsIgnoreCase("x"));
        System.out.println("Program bitti");
    }


}

/*

char karakter;
while (true){
    Scanner scan=new Scanner(System.in);
    karakter=scan.nextLine().charAt(0);
    if(karakter=='x'){break;}
        System.out.println("Program Calisiyor");

}System.out.println("Program bitti");

 */