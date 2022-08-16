package replit_Collections1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections3 {
    /*
    Preview of README.md
Bir ArrayList oluşturalım ve birinci ve üçüncü elemanlarını yazdıralım.

ArrayList elemanları: beyaz,siyah,sari,kirmizi,turuncu

Beklenen Çıktı:
Arrayin 1. elemani: beyaz
Arrayin 3. elemani: sari
     */
    public static void main(String[] args) {

        List<String > arr=new ArrayList<>(Arrays.asList("beyaz","siyah","sari","kirmizi","turuncu"));


        System.out.println("Arrayin 1. elemani:" +  arr.get(0));
        System.out.println("Arrayin 3. elemani:" +  arr.get(2));

    }
}
