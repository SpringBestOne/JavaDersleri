package day25_constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructor {
    public static void main(String[] args) {



        C01          obj1       =   new         C01()       ;
    // class adi    obje adi        keyword     constructor

        Scanner scan=new Scanner(System.in);
        Random rnd=new Random();
        List<String> list=new ArrayList<>();
       //  List<String> list=new List<>(); //  new List olmaz,
/* Javada bir obje olusturabilmek için mutlaka constructor kullanmalisiniz


 */
        System.out.println(obj1.sayi); // default değer atar 0 olur. null string te idi
        obj1.deneme(); // C01 den deneme methodu calisir
    }
}

