package Elif_Hoca_Day4;

import java.awt.*;
import java.util.Scanner;

public class Q01_MethodCreation {
    public static void main(String[] args) {

    /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
    
        String input = "aabbcccccddddaaa";

        tekyazdir();
    }
    public static void tekyazdir() {
        String input = "aabbcccccddddaaa";
        String benzersizInput="";


        for (int i =1; i <input.length(); i++) {
            if (!benzersizInput.contains(input.substring(i,i+1))){
                System.out.print(", "+ input.substring(i,i+1));
                benzersizInput+=input.substring(i,i+1);
            }
        }
        System.out.println("");
        System.out.println("inpt: " + input);
        System.out.println("benzersiz input : " + benzersizInput);
        
     */
        
        birkereyazdir("aabbcccccddddaaa");
        
    }

    public static void birkereyazdir(String str) {
        String output=""; // isleme etki etmesin diye hiclik aldik

        for (int i = 0; i < str.length(); i++) { //int i = 0; i <= str.length()-1; i++ bu sekilde de olur
            if(!output.contains(str.substring(i,i+1))){ //tekrarsiz karakterleri dondurecegimiz icin sonucumuz str den aldigimiz herhangi bir karakteri icermesin
                output +=str.substring(i,i+1); //o zaman sonuca eklesin
            }
        }
        System.out.println(output);
    }
}
