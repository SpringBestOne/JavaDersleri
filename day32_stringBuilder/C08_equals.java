package day32_stringBuilder;

public class C08_equals {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("Java");
        String str="Java";

        System.out.println(sb1.equals(sb2)); // false
        System.out.println(sb1.equals(str)); // true

        //StringBuilder da equals methodu ancak aynı obje aynı deger olursa true döner, Stringdeki gibi dusunmemeliyiz

        System.out.println(sb1.equals(str)); //false

        System.out.println(sb1.compareTo(sb2)); //0
        StringBuilder sb3=new StringBuilder("Jave");
        System.out.println(sb1.compareTo(sb3)); // -4

    /*
    CompareTo iki stringBuilder i bastan baslayarak harf harf karsılastırır.
    ikinciler ayni ise 3. lere gever ve ilk farklı olan harfe kadar gider Farklı olan iki harfin ascii kodlar arasındaki farkı verir

    Java-Jave     e ile a harfi arasındaki harf kadar

    eger hiç farklı harf yoksa sonuc 0 olarak dondurur
     */

    }
}
