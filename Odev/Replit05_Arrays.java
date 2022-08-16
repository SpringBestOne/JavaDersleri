package Odev;

import java.util.Arrays;

public class Replit05_Arrays {
    public static void main(String[] args) {

//define an array
        int intArray[] = {1551,1223,1443,1267,1789,1023,2020};
        System.out.println("The input Array : " + Arrays.toString(intArray));
        //define the key to be searched
        int key = 2010;
        System.out.println("\nThe key to be searched:" + key);
        //call binarySearch method on the given array with key to be searched
        int result = Arrays.binarySearch(intArray,key);
        //print the return result
        if (result < 0)
            System.out.println("\nKey is not found in the array!");
        else
            System.out.println("\nKey is found at index: "+result + " in the array.");
    }
}
