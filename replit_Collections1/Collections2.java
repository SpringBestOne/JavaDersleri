package replit_Collections1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;



public class Collections2 {
    public static void main(String[] args) {
        /*
        Array list oluşturun daha sonra aşağıda belirtilen yerlere yebi array elemanlarını ekleyen java kodunu yazınız.

Array List: siyah,mavi,kirmizi,beyaz

en başa: pembe

mavi-kirmizi arasına yesil renk eklenecek.

Beklenen Çıktı:
[pembe,siyah,mavi,yesil,kirmizi,beyaz]
         */

        List<String > renkler=new ArrayList<>();
       renkler.add("siyah");
       renkler.add("mavi");
       renkler.add("kirmizi");
       renkler.add("beyaz");
        System.out.println(renkler);

        renkler.add(0,"pembe");
        System.out.println(renkler);
        renkler.add(3,"yesil");
        System.out.println(renkler);
/*
 //
  public static void main(String[] args) {

        String [] sinifList={"Ali Can", "Nida Yucedal", "Musa Yaman"};
        String eklenecekIsim="Murat Babayigit";

        sinifList=elemanEkle(sinifList, eklenecekIsim);
        System.out.println(Arrays.toString(sinifList));

    }

    public static String[] elemanEkle(String[] sinifList, String eklenecekIsim) {
        String [] yeniSinifListesi=new String[sinifList.length+1]; // [null, null]
        // eski listeden 1 eleman fazla uzunlukta yeni bir array olusturdum
        for (int i = 0; i <sinifList.length ; i++) {
            yeniSinifListesi[i]=sinifList[i];

        }
        // oncelikle eski listedeki tum elemanlari, yeni listeye tasidim
yeniSinifListesi[yeniSinifListesi.length-1]=eklenecekIsim;
        // son index'e ise eklenecek ismi atadim
        return yeniSinifListesi;
    }
}

}
 Create an ArrayList
        List<String> aL = Arrays.asList("Geeks","forGeeks","A computer Portal");

        // Print the ArrayList
        System.out.println("ArrayList: " + aL);

        // convert the ArrayList to LinkedList
        List<String> lL = convertALtoLL(aL);

        // Print the LinkedList
        System.out.println("LinkedList: " + lL);
    }
}
 */


    }}