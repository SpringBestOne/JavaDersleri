package replit_Collections1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Collections1 {
    public static void main(String[] args) {
        /*
        Bir ArrayList oluşturun ve array elemanlarını tek tek yazdırın.

Array elemanları: siyah,sari,mavi,turuncu

Beklenen Çıktı:
siyah
sari
mavi
turuncu
         */


       List<String> ll1=new ArrayList<>();

        ll1.add("siyah");
        ll1.add("sari");
        ll1.add("mavi");
        ll1.add("turuncu");

        for (String each:ll1) {
            System.out.println(each);
        }
    }
}
