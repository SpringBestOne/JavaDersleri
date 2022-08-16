package Odev_Calisma;

import java.util.Arrays;

public class Yazilan_Array_BinarySearch {
    public static void main(String[] args) {

        int[] numbers={0,2,5,7,6,};




        int key = 0;
        int last=numbers.length-1;
        System.out.println(Arrays.binarySearch(numbers,0,last,key));
    }

}

