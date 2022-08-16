package day36_inheritanceDataTypeKullanimi;

public class EYanHizmetliler extends BMuhasebe{
    protected int saatUcreti = 9;
    protected int gunlukMesai = 8;
    protected void maas(){
        System.out.println("YanHizmetliler : " + (30*saatUcreti*gunlukMesai)+ " maas alir");
    }
    protected void issizlikSigorta(){
        System.out.println("YanHizmetliler %30 indirimli issizlik sigorta yaptirabilir");
    }

    public static void main(String[] args) {

        /*
        overriding child classtaki bir methodun parent classtaki aynı methodu etkisiz hale getirerek,
        kendisinin spesifik ozelligini ortaya cılarmasıdır.

        Overriding i nerede dikkate alıyoruz?
        bir obje olusturulurken data turu ve constructor farkli ise,
        eger bir obje olusturulurken, data turu ve constructor farklı ise, objenin ozell,klerini belirlerken
        3 konuya dikkat cekmeliyiz
        1- Obje Constructorun olduğu classta olusur.
        2- Objenin ozelliklerini aramaya, data turunun olduğu classtan başlarız, bu classta aranan ozellik bulunamazsa parent clasa bakılır.
        Oradada bulamazsak CTE verir.

        eger aranan ozellik, variable ise, Overriding ihtimali olmadıgı için bulduğumuz ilk degeri yazdırırız

        3- Aranan ozellik method ise, degeri yazdırmadan once Override edilmiş mi kontrol etmemiz gerekiyor.
        Eger Override edilmisse en guncel degeri yazdiririz


         */

        BMuhasebe yh1=new EYanHizmetliler();

        System.out.println(yh1.gunlukMesai); // Muhasebe 8 Cunku variable
        System.out.println(yh1.saatUcreti); // Muhasebe 10 Cunku variable
        yh1.maas(); // Muhasebe de maas var bulduk CTE vermez ama, Override edilmiş mi kontrol et ve kendi clasındaki Yan Hizmetlilerdekini calıstırır
        yh1.ozelSigorta(); // Override edilmemiş ondan YH den alır
        yh1.sigorta(); // Muhasebede yok ama parent classta var ve Override edilmiş mi bak, yok Personelden alır
        System.out.println(yh1.isim); //Personelden alır
        System.out.println(yh1.soyIsim); //Personelden alır
        System.out.println(yh1.departmant);//Personelden alır
        // System.out.println(yh1.issizlikSigorta);  Aramaya Muhasebeden basladığımızdan issizlik sigortası bulamadık o zaman CTE verir.
        // Bulsaydık Override edimismi control edecektirk.

    }
}
