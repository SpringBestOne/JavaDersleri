package day45_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_CollectionsDataTuru {
    public static void main(String[] args) {
        /*
        Collections <Data türünü object seçmeniz durumunda, Collectiona farklıdata türlerinden objeler koymamıza izin verir
        Bu depolama açısından, bize esneklik saglar, Ancak islem yaparken, tüm objeleri object olarak tanımladığımızdan,
         cok fazla casting yapmamız gerekeir.
         */

        List <String>liste=new ArrayList<>();

        //liste.add(5);
        //liste.add('s');
        //liste.add(true);

        List<Object>list=new ArrayList<>();
        list.add(5);
        list.add('s');
        list.add(true);
        list.add("Ali");
        System.out.println(list);

       list.set(0,(Integer)list.get(0)+5);
        list.set(3,list.get(3)+"Can");
        list.set(2,!(Boolean)list.get(2));
        System.out.println(list);

        Set<Object> set1= new HashSet<>();

        set1.add(5);
        set1.add(true);
        set1.add('5');

    }
}
