package day12_StringManipulation;

public class C02_replaceAll {
    public static void main(String[] args) {


        String str= "1Bu2gu3n Ja*va- cok g3uz/el";


        str=str.replace(" ", "qazwsx");
        str= str.replaceAll("\\W", "");
        str=str.replaceAll("\\d", "");
        str= str.replace("qazwsx", " ");
        System.out.println(str);
    }
}
