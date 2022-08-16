package Elif_Hoca_Day4;

import java.util.Scanner;

public class Q02_MethodCreation {
    public static void main(String[] args) {
              /*
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
      */
        Scanner scan=new Scanner(System.in);
        System.out.println("cm cinsinden bir sayi giriniz");
        double cmValue= scan.nextDouble();
        
        convertCM(cmValue);
   
/*

    public static void cmMdonustur() {
        Scanner scan=new Scanner(System.in);
        System.out.println("cm cinsinden bir sayi giriniz");
        double sayi= scan.nextDouble();
        System.out.println( sayi/100 +" metredir");



 */


}

    public static void convertCM(double cmValue) {
        double meter=cmValue/100;
        double kMeter= cmValue/100000;
        System.out.println("girdiginiz cm degeri :" +cmValue +" "+ meter + "m dir, " + kMeter + "km dir" );

    }
}

