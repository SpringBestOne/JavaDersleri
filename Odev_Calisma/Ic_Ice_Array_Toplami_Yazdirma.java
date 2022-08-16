package Odev_Calisma;

import java.util.Arrays;

public class Ic_Ice_Array_Toplami_Yazdirma {
    public static void main(String[] args) {
/*// Soru 3) Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip
//elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru) arr1 = { {1,2},
//{3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }*/


int[][] arr1= { {1,2},{3,4,5}, {6} };
int[][] arr2 = { {7,8,9}, {10,11}, {12} };

int toplam1=0;
int toplam2=0;
        int[] yeniArr=new int[arr1.length];

        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                toplam1+=arr1[i][j];
            }
            yeniArr[i]=toplam1;
            toplam1=0;
        }
        System.out.println("Istenen yeni array : " + Arrays.toString(yeniArr));
    }
            }


/*
int[][] input= { {1,2,3}, {4,5}, {6,7} };
    int[] yeniArr=new int[input.length];
    int toplam=0;
        for (int i = 0; i < input.length ; i++) { // dis loop outer array'i gezer
        for (int j = 0; j <input[i].length ; j++) { // ic loop ise inner array'leri gezer
        toplam+=input[i][j];
        }
        yeniArr[i]=toplam;
        toplam=0;
        }
        System.out.println("Istenen yeni array : " + Arrays.toString(yeniArr));
        }
        }


 */