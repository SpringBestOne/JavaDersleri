package Odev;

import java.util.Arrays;

public class Iki_Arrayi_Birlestir {
    public static void main(String[] args) {
          /*

        2 tamsayı Diziyi parametre olarak kabul eden ve yeni bir Diziye 2 dizi ekleyen ve yazdıran bir dönüş yöntemi yazın.

Girdi1={1,2,3,4,}

Giriş2={5,6}

Çıktı={1,2,3,4,5,6}

         */

        int[] arr1={1,2,3,4};
        int[] arr2={5,6};

        ikiArrayiBirlestir(arr1,arr2);

    }

    private static void ikiArrayiBirlestir(int[] arr1, int[] arr2) {
        int[] yeniArr=new int[arr1.length+ arr2.length];

        for (int i = 0; i < yeniArr.length ; i++) {
            if (i < arr1.length){
                yeniArr[i]=arr1[i];
            }else {
                yeniArr[i]=arr2[i- arr1.length];
            }
        }
        System.out.println(Arrays.toString(yeniArr));


    }
    }

