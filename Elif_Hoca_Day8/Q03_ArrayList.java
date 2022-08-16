package Elif_Hoca_Day8;

import java.util.ArrayList;
import java.util.List;

public class Q03_ArrayList {
    public static void main(String[] args) {
        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */

        int[] arr = {2, 5, -9, 45, 43, 11, 8, 102, 102, 47, 0};
        int n = 4;

        List<Integer> list = new ArrayList<>();
        //listeye elemanları ekleyelim
        for (int each : arr) {
            list.add(each);

        }
        List<Integer> maxList = new ArrayList<>();
        int count = 1;
        while (count <= n) {
            int max = list.get(0); //list in ilk elemanı mximum olsun
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > max && !(maxList.contains(list.get(i)))) { //listenin herhangi bir elemanı max dan buyukse
                    max = list.get(i);// max artık o eleman olsun
                }

            }
            maxList.add(max);
            list.remove(list.indexOf(max)); // tekrar aynı sayıya bakmamak için kaldırdık
            count++;

        }
        System.out.println("arrayin max " +n+ " elemani "+maxList );
    }
}
/*
   int Input []= {1,2,3,4,5,6,7,8};
        String enbuyuk="";
        int n=2;
        for (int i = Input.length-1; i > (Input.length-1)-n; i--) {
            enbuyuk+=Input[i]+", ";



        }
        System.out.println(enbuyuk);


    }
}
 */