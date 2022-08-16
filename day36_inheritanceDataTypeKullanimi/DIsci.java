package day36_inheritanceDataTypeKullanimi;

import java.util.*;

public class DIsci extends BMuhasebe {
    protected int saatUcreti = 11;
    protected int gunlukMesai = 7;

    protected void maasIsci() {
        System.out.println("Isciler : " + (30 * saatUcreti * gunlukMesai) + " maas alir");
    }

    protected void ozelSigortaIsci() {
        System.out.println("Memurlar %70 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        BMuhasebe isci1=new DIsci();
       /*
       Bir obje olusturulurken data türü ve obje aynı classtan ise,
       direkt o classa gidiyorduk
       Eger data turu ve contructor farklı ise Obje constructoru nın olduğu classın objesidir.
       ancak,
       bizden istenen Isci clasındaki spesifik ozellikler değil, Bir iscinşn muhasebe clasındaki tum calısanlarla beraber sahip olduğu
       genel ozellikleri yazdirir.
       Oncelikle data turunun olduğu classa gideriz

        */
            CMemur mmr1=new CMemur();

            System.out.println(isci1.gunlukMesai); // M 8
            System.out.println(isci1.saatUcreti); // M 10
           isci1.maas(); // Muhasebeden
        isci1.ozelSigorta(); // M
        isci1.sigorta(); // Personelden
            System.out.println(isci1.isim); // Personel
            System.out.println(isci1.soyIsim); // Personel
            System.out.println(isci1.departmant);//Personel

        APersonel isci2=new DIsci();

        /*
        System.out.println(isci2.gunlukMesai); //

        System.out.println(isci2.saatUcreti); //

        isci2.maas(); //  Override edilmismi bakılır, kendi classına gide

        isci2.ozelSigorta(); //

        isci2.sigorta(); //
        System.out.println(isci2.isim); //
        System.out.println(isci2.soyIsim); //
        System.out.println(isci2.departmant);//

        Eğer aradığımız classta aradığımız ozellik yoksa, geri donemez, varsa parentine gidebilir.
        Aradığı ozelligi bulamazsa Compile time error verir

         */
        List<String > list =new LinkedList<>();
        Deque<String> list2= new LinkedList<>();
        Queue<String> list3= new LinkedList<>();

        /*
        Hepsi LinkedList olsa da,
        list1 list gibi davranır
        list2 Deque gibi davranır
        list3 Queue gibi davranır
         */
    }
}