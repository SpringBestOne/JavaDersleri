package day12_StringManipulation;

public class C01_replace {
    public static void main(String[] args) {

        String str= "Bu gun ha va cok guz el ";
        System.out.println(str.replace(" ",""));

        System.out.println(str.replace("h", "J").replace(" ", ""));

        System.out.println(str.replace("guz el", "harika"));
        str=str.replace(" Bu gun", "bugun")
                .replace ("ha va", "Java")
                        .replace("guz el", "guzel");


        System.out.println(str);
    }
}
