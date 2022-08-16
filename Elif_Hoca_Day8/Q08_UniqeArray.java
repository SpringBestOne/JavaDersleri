package Elif_Hoca_Day8;

import Mzfr_Hoca_Day_10_Practice.ARRAY.Array;

import java.util.ArrayList;
import java.util.List;

public class Q08_UniqeArray {
    public static <Arrlist> void main(String[] args) {
        /*
         * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
         * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
         */

        int[] arr = {1, 2, 2, 3, 1, 4, 2, -2, 5, 6, 8, 7, 5, 6, -2, 9, 3, 10};
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> list3 = new ArrayList<Integer>();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] && !list1.contains(arr[i])) {
                list1.add(arr[i]);
            }
        }
        System.out.print(list1);

        for (int i = 0; i < arr.length; i++) {
            if (!list2.contains(arr[i])) {
                list2.add(arr[i]);
            }

        }
        System.out.println(list2);

        for (int j = 0; j < list2.size(); j++) {
            if (!list1.contains(list2.get(j))) {
                list3.add(list2.get(j));
            }

        }
        System.out.println(list3);
    }

}
