package Odev_Calisma;

import java.util.Arrays;

public class Arrays_Aranan_Sayiyi_Bulma {
    public static void main(String[] args) {
        /*
        Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.

Array: [12,15,43,23,56,76,78,90,77,43]

Aranan değer:56
Beklenen Çıktı:
56 sayısı arrayin 4. elemanı
         */

        int [] arr= {12,15,43,23,56,76,78,90,77,43};

        int arananDeger=56;

        System.out.println(java.util.Arrays.toString(arr));
        // Varsa index, yoksa -sira
        System.out.println("56 sayısı arrayin " + Arrays.binarySearch(arr,arananDeger) + ". elemani");
    }
}
