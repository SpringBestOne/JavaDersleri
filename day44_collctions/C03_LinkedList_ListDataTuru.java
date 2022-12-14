package day44_collctions;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class C03_LinkedList_ListDataTuru {
    public static void main(String[] args) {
        LinkedList<String> ll1=new LinkedList();
        List<String> ll2=new LinkedList();
        Queue<String> ll3=new LinkedList();
        Deque<String> ll4=new LinkedList();
        ll2.add("Berk");
        ll2.add("Done");
        ll2.add("Enes");
        ll2.add("Ayse");
        System.out.println(ll2); // [Berk, Done, Enes, Ayse]
        System.out.println(ll2.remove(3)); // Ayse
        // eger Listemiz Integer elementlerden olusuyorsa
        // direk sayi yazarsak index olarak kabul eder
        // bir variable'a atama yapar ve remove'da o variabe'in ismini yazarsak obje olarak kabul eder
        System.out.println(ll2.remove("Kemal")); // false
        System.out.println(ll2.isEmpty()); // false
        ll2.set(1,"Serap");
        System.out.println(ll2); // [Berk, Serap, Enes]
        ll1.add("Berk");
        ll1.add("Ismail");
        System.out.println(ll1); //[Berk, Ismail]
        ll2.retainAll(ll1); // ll2 deki tum elementleri ll1 ile karsilastirir
        // ll1'de olmayanlari siler
        System.out.println(ll2); // [Berk]
        System.out.println(ll2.hashCode()); // 2066939
        ll2.add("Fatih");
        System.out.println(ll2.hashCode()); // 131726141
    }
}


    /*
    set(kume)--> benzersiz kumeler gibi uniq
 Queue--> yemekhane kuyrugu gibi dusunulebilir
 linked (Hlalay)-->  birbirine bagli
 Tree (Agac gibi)--> dogal sirali ozel  sorltlanmis gibi, veya isim sirali halay
 hash(hizli) --> ozel raf adi sayesinde hizli erisim


 LinkedList
    Halaya benzer, birbirine bagli. Ekleme ve cikarmada rahat, arama yaparken yavas.
    Ilk eleman her zaman head'dir. Head'te data yoktur, sadece adress vardir.
    Son eleman(tail) null'i point eder.
    Her elemanin icinde data ve adress kismi olmak uzere iki kisim vardir.
    Tum elemanlar pointer'lar/adress'ler kullanilarak birbirine baglanir.
    Her eleman node olarak adlandirilir.
     */
