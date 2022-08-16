package Odev_Calisma;

import java.util.Arrays;

public class Dizi_Elemanlarını_Bir_Saga_Kaydirma {
    public static void main(String[] args) {

        /*
 Verilen 3 elemanlı bir array'in tum elemanlarını
 bir sonraki konuma taşıyacak bir program yaziniz.
     */
        int[] sayilar = {1,2,3,4,5,6,7,8,9};
        int sonuncuEleman = sayilar[sayilar.length-1];  // sonuncu elemanı sakladım

        for (int i = sayilar.length - 1; i >= 1; i--) {  // döngüyü son indexten 1. indexe kadar kurduk
            sayilar[i] = sayilar[i-1];  //
        }
        sayilar[0] = sonuncuEleman;
        System.out.println(Arrays.toString(sayilar));
    }}
