package Odev_Calisma;

import java.util.ArrayList;
import java.util.List;

public class Arrayi_Liste_cevirmek {
    public static void main(String[] args) {
        /*
        Array i ARRAYLIST e çeviren Java Kodunu yazınız.

Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]

Beklenen Çıktı:
[Python, JAVA, PHP, Perl, C#, C++]
         */
        List<String> isimler=new ArrayList<>();

        String [] arr={"Python", "JAVA", "PHP", "Perl", "C#", "C++" };
        for (int i = 0; i <arr.length; i++) {
            isimler.add(arr[i]);


        }System.out.println(isimler);
    }
}
