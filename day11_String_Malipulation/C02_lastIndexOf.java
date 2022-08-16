package day11_String_Malipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String cumle= "Java cok kolay, Java cok guzel";
        String kelime= "Java";

        int kelimeIlkIndex= cumle.indexOf(kelime);
        int kelimeSonIndex = cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex==-1){
            System.out.println("verilen kelime cumlede kullanılmamış");

        } else if (kelimeIlkIndex==kelimeSonIndex) {
            System.out.println("verilen kelime cumlede sadece 1 kere kullanılmıs");

        }else {
            System.out.println("verilen kelime cumlede birden fzla kullanılmıs");


    }
}}
