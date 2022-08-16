package Odev_Calisma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class YazilanDegeri_ArraydeArama {
    public static void main(String[] args) {
        /* yazılan değerin array içerisinde arayan Java Kodu yazınız.

Array: [1551,1223,1443,1267,1789,1023,2020]

Aranan Değer:2020
Beklenen Çıktı:**True**
Aranan Değer:2010
Beklenen Çıktı :**False**


   String[] harfler= {"Y", "B", "D", "G", "O","A"};
            String arananHarf="Y";
            System.out.println(Arrays.binarySearch(harfler,arananHarf));
            System.out.println(C03_Contains.contains(harfler,arananHarf));
            // binarySearch bize aradigimiz elemanin index'ini dondurur
            // array sirali olmadigi icin arama sonucunu dogru bulamayabilir
            // emin olmak icin once sort yapmaliyiz
            Arrays.sort(harfler);
            System.out.println(Arrays.toString(harfler));
            System.out.println(Arrays.binarySearch(harfler,arananHarf));
            System.out.println(C03_Contains.contains(harfler,arananHarf));

            int [] verilenArr={8, 6, 33, 100};
            boolean boom=yediVarMiHadi(verilenArr);
    }
    private static boolean yediVarMiHadi(int[] verilenArr) {
        boolean boomMu=false;
        String sayilarStr=Arrays.toString(verilenArr);
        sayilarStr=sayilarStr.replaceAll("\\D","");
        if (sayilarStr.contains("7")) {
            System.out.println("Boom!");
            boomMu=true;
        }else {
            System.out.println("dizide 7 rakamı yok");
            boomMu=false;
        }
        return boomMu;
    }




        String[] arr = {"1551", "1223", "1443", "1267", "1789", "1023", "2020"};


        String arananDeger1 = "2020"; //**True**
        String arananDeger2 = "2010";


        boolean sonuc =false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains(arananDeger1)) {
                sonuc = true;

            }else  System.out.println("dizide  yok");
            sonuc=false;

        }}}


/*
        int [] arr={1551,1223,1443,1267,1789,1023,2020};
        Arrays.sort(arr);
        if(Arrays.binarySearch(arr,2020)>=0){
            System.out.println("**True**");
        }
        if(Arrays.binarySearch(arr,2010)<0){
            System.out.println("**False**");
        }}}


         */

        int arr[] = {1551, 1223, 1443, 1267, 1789, 1023, 2020};
        Arrays.sort(arr);
        int aranan = 2010;//true, 2010 olursa false, (dinamik)


        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);}


        if(sayilar.contains(aranan)){
            System.out.println(true);}else System.out.println(false);



    }}




