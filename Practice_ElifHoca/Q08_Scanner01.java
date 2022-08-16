package Practice_ElifHoca;

import java.util.Scanner;

public class Q08_Scanner01 {
    // kullanicidan 2 tam sayi alin
    // bu tam sayilari toplayin ve sonucu yazdirin


    public static void main(String[] args) {

       Scanner Scan =new Scanner(System.in);
        System.out.print("Lütfen iki tam sayi giriniz");
             int sayi1= Scan.nextInt();
        int sayi2= Scan.nextInt();
        System.out.println("iki sayinin toplami"+ (sayi1+sayi2));



    }
}
