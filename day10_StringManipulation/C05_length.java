package day10_StringManipulation;

public class C05_length {
    public static void main(String[] args) {

        String str= "Java ogren, isi kap";
        System.out.println(str.length()); // str nin karakter sayısı 19

        System.out.println("str.charAt(str.length()-1) = " + str.charAt(str.length()-1));

        System.out.println(str.charAt(str.length()-3));


String str2= ""; //str2 ye bir değer atanmış ama bu deger "hiçlik"

        String str3=null; // str3 e değer atanmamıştır. null bunu gösterir.

        System.out.println(str2.length()); // deger 0

        System.out.println(str3.length()); // bir değer atanmamış ki uzunluğu olsun

        // null bir eşitliğin karsınında olsa bile bu bir atama değildir.

    }
}
