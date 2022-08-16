package day09_TernaryOperator;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

   char harf= Scan.next().charAt(0);
        System.out.println("Pazartesi");
       String sonuc= (harf>='a' && harf <'z') ? ("kucuk harf") :
               ((harf >='A' && harf <='Z') ? "Buyuk Harf" : "Gecersiz Karakter");
        System.out.println(sonuc);



    }
}
