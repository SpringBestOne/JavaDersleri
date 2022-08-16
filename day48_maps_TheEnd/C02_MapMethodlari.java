package day48_maps_TheEnd;

import day46_maps.ReusableMethods;

import java.util.Map;

public class C02_MapMethodlari {
    public static void main(String[] args) {

        Map<Integer,String> sinifListMap= ReusableMethods.mapOlustur();

        ReusableMethods.entryYazdir(sinifListMap);

        sinifListMap.clear();

        sinifListMap=ReusableMethods.mapOlustur();
        System.out.println("Cleardan sonra map :"+ sinifListMap);
        System.out.println(sinifListMap.getOrDefault(103, "aradiginiz key yok"));

        System.out.println(sinifListMap.isEmpty());
        sinifListMap.putIfAbsent(104,"Derya, Okyanus, Developer");
        sinifListMap.putIfAbsent(108,"Aysun, Can, Devops");
        ReusableMethods.entryYazdir(sinifListMap);

        //SinifListesiMap'a key olarak 106 yoksa ,value "Mevlut, Han, Tester"
        //   106 daha onceden varsa eski degeri degistirmek istediginizdenn eminmisiniz? yazdirin
        //106 nin olduğunu kontrol etmek icin containsKey daha mantikli ama biz yeni ogrendigimiz method ile yapalim

        // map.putIfAbsent (key, value)==> key varsa
        //ekleme yapmaz bize o key ile kayitli value yi dondurur.
        //==> key daha onceden map e eklenmemişse eklemeyyi yapar ve bize null dondurur.

        System.out.println(sinifListMap.putIfAbsent(106,"Mevlut, Han, Tester"));//Taha, Deniz, JDev

        if(  sinifListMap.putIfAbsent(106,"Mevlut, Han, Developer")==null){
            System.out.println("Kayit Basarili");
        }else{
            System.out.println("eski degeri degistirmek istediginizden emin misiniz? ");

            System.out.println(sinifListMap.putIfAbsent(109,"Mevlut, Han, Tester"));//null

        }
        ReusableMethods.entryYazdir(sinifListMap);

        sinifListMap.remove(106);//106 yi silip bana sildiginni dondurur
        sinifListMap.remove(107,"Derya, Cem, Tester");//silerse true, silmezse false dondurur

        ReusableMethods.entryYazdir(sinifListMap);
        sinifListMap.replace(105,"Erdal, Ciftci, Tester");
        sinifListMap.put(109,"Cavit, Eken, JDev");//yukaridaki ile ayni islemi yapiyor
        ReusableMethods.entryYazdir(sinifListMap);

        System.out.println(sinifListMap.size());
    }
}