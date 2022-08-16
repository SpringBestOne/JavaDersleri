package day10_StringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str="Java ogrenmwk cok guzel";

        System.out.println(str.indexOf("o")); //5

        System.out.println(str.indexOf('g')); //6

        System.out.println(str.indexOf("t")); // integer döndürür, öyle bir değer vermeli ki index de olmasın  -1 verir

String str5= "ÖAJDLaskfşlsdkşldklşşladkfşlkdşfldmçkjfşwğrp*EIJMÖVCÇ.";
        System.out.println(str5.indexOf("p"));
if(str5.indexOf("p")==-1){
    System.out.println("str 5 de istenen karakter kullanılmamış");

    }else{
    System.out.println("str 5 de istenen karakter kullanılmış");
}}}
