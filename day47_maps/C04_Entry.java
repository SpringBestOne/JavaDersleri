package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_Entry {
    public static void main(String[] args) {

        Map<Integer,String > siniflistMap= ReusableMethods.mapOlustur();

        //map in her bir elemanı alt alta yazdırın

       Set<Map.Entry<Integer,String>> sinifEntrySet= siniflistMap.entrySet();

        for (Map.Entry<Integer,String >each :sinifEntrySet
             ) {
            System.out.println(each);

        }
        //Map içerisindeki tüm elemanlarında varsa Tester kurs ismini QA olarak değistirelim
        String eachValue;

        for (Map.Entry<Integer,String> each:sinifEntrySet  ) {
            eachValue=each.getValue();
            eachValue=eachValue.replace("Tester","QA");
            each.setValue(eachValue);
        }
        System.out.println(siniflistMap);
    }

}
