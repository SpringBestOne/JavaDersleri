package day47_maps;

import day46_maps.ReusableMethods;
import java.util.Map;
public class C01_DununTekrari {
    public static void main(String[] args) {
        Map<Integer,String> sinifListMap = ReusableMethods.mapOlustur();
        System.out.println(sinifListMap);
        // ogrenci listesini isim soyisim olarak yazdirin
        ReusableMethods.tumValueSiraliYazdir(sinifListMap);
        // kac farkli brans varsa bransIsmi = branstakiOgrencisayisi seklinde yazdirin
        ReusableMethods.bransOgrencisayisiYazdir(sinifListMap);
    }
}


        // kac farkli brans varsa bransIsmi = branstakiOgrencisayisi seklinde yazdirin
        /*
          List<String> branslar = new ArrayList<>();
        String[] eachArr;
        for (String each : ogrenciMap.values()) {
            eachArr = each.split(", ");
            branslar.add(eachArr[2].toUpperCase());
        }
        Map<String, Integer> bransMap = new HashMap<>();
        for (int i = 0; i < branslar.size(); i++) {
            if (bransMap.containsKey(branslar.get(i))) {
                bransMap.put(branslar.get(i), bransMap.get(branslar.get(i)) + 1);
            } else {
                bransMap.put(branslar.get(i), 1);
            }
        }
        System.out.println(bransMap);
    }
Collapse



:white_check_mark:
2


         */
