package Odev_Calisma;

import java.util.Scanner;

public class Tersine_Ceviren_Kod {
    public static void main(String[] args) {
//Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)
//
//Input :1238
//
//Output :Girilen Numananin Tersi: 8321
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();

        String ters="";

        for (int i = str.length()-1; i >=0 ; i--) {
            ters+= str.charAt(i);


        }System.out.println(ters);
           }
}
/*
 public static String reverseString(String str) {

        String reversed="";
        for (int i = str.length()-1 ; i >=0 ; i--) {
            reversed+=str.charAt(i);
        }
        return reversed;
    }
 */