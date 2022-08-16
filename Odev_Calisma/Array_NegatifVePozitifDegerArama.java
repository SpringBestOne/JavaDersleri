package Odev_Calisma;

import java.util.Arrays;

public class Array_NegatifVePozitifDegerArama {
    public static void main(String[] args) {
        // Tamsayilardan olusan bir array de  en kucuk pozitif elemanı ve
        // en buyuk negatif elemanı bulun
        // Ornek: {-12,18,-5,23,-2} ==> En kucuk pozitif sayi= 18 , En buyuk negatif sayi=-2
        int [] arr={-12,18,-5,23,-2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));  // [-12, -5, -2, 18, 23]
        int enKucukPozitifSayi=arr[arr.length-1];
        int enBuyukNegatifSayi=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0 && enKucukPozitifSayi>arr[i]){
                enKucukPozitifSayi=arr[i];
            }else if(arr[i]<0 && enBuyukNegatifSayi<arr[i]){
                enBuyukNegatifSayi=arr[i];
            }
        }
        System.out.println("enBuyukNegatifSayi = " + enBuyukNegatifSayi);
        System.out.println("enKucukPozitifSayi = " + enKucukPozitifSayi);

    }
}
/*
 int[] arr = {-12, 18, -5, 23, -2};
        List<Integer> list= new ArrayList<Integer>();
        List<Integer> pozitif = new ArrayList<Integer>();
        List<Integer> negatif = new ArrayList<Integer>();
        int enkucukpozıtıfsayı;
        int enbuyuknegatifsayı;
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<0){
                negatif.add(list.get(i));
            }
            else{
                pozitif.add(list.get(i));
            }
        }
        System.out.println("negatif = " + negatif);//negatif = [-12, -5, -2]
        System.out.println("pozitif = " + pozitif);//pozitif = [18, 23]
Collections.sort(negatif);
Collections.sort(pozitif);
enbuyuknegatifsayı=negatif.get(negatif.size()-1);
enkucukpozıtıfsayı=pozitif.get(0);
        System.out.println("enbuyuknegatifsayı = " + enbuyuknegatifsayı);
        System.out.println("enkucukpozıtıfsayı = " + enkucukpozıtıfsayı);
        /

 */
