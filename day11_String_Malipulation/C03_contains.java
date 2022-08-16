package day11_String_Malipulation;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {

        /*  Kullanicidan email adresini girmesini isteyin,
         mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
        @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
        @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin*\
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mail adresi giriniz");
        String email=scan.next();
        
        if (!email.contains("@gmail")){
            System.out.println("lutfen gmail adresi giriniz");
        } else if (email.lastIndexOf("@gmail.com")==(email.length()-10)) {
            System.out.println("email adresiniz kaydedildi");
        }else {
            System.out.println("lütfen yazımı kontrol ediniz");
            
        }

    }
}
