package day47_maps;

import day46_maps.ReusableMethods;

import java.util.HashMap;
import java.util.Map;

public class C03_Update {
    public static void main(String[] args) {
        /*
        map.contains(key)==> verdigimiz key in map de olup olmadığını boolean olarak döner
        map.contains(value) ==> bir butun olarak value nun map de olup olmadığını doner

        ONEMLİ NOT =   map.contains(value) valuenin içindeki bir parcayi bulmada işe yaramaz
         */


        Map<Integer,String> siniflistMap= ReusableMethods.mapOlustur();

        System.out.println(siniflistMap);

        System.out.println(siniflistMap.containsKey(104)); //true
        System.out.println(siniflistMap.containsKey(114)); //false

        System.out.println(siniflistMap.containsValue("Ali, Can, JDev")); //true
        System.out.println(siniflistMap.containsValue("JDev")); //false


    }
}
