package day10_StringManipulation;

import java.util.Locale;

public class C02_toUpperCase_toLowerCase {
    public static void main(String[] args) {

        String str= "Beni Psikopata Baglamayin";

        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));
        System.out.println(str.toUpperCase(Locale.CANADA));
    }
}
