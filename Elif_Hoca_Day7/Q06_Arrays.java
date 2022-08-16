package Elif_Hoca_Day7;

import java.util.Arrays;
import java.util.Scanner;



public class Q06_Arrays {
    public static void main(String[] args) {
          /*
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */
        farkiBul();


    }

    public static void farkiBul() {
        Scanner scan=new Scanner(System.in);
        System.out.println("array uzunlugunu giriniz: ");
        int uzunluk= scan.nextInt();
        int arr[]=new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.println("arrayin " + (i+1) +". elemanini giriniz"); //i oldugunda0. eleman diyecek, biz index değil, eleman sorduk
            arr[i]=scan.nextInt(); // for i den gelen indexler, kullanıcı tarafından döngü bitene kadar girilen elemanlar alınır

                  }

        Arrays.sort(arr);
        System.out.println("arraydeki, en buyuk eleman ile en kucuk eleman arasındaki fark :" +(arr[uzunluk-1]-arr[0]));


    }
}
