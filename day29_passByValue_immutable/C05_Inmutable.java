package day29_passByValue_immutable;

public class C05_Inmutable {
    public static void main(String[] args) {

        String isim= "Mine";
        isim=isim.toUpperCase();
        System.out.println(isim); // MINE
        isim="Mevlut";
        System.out.println(isim); // Mevlut
        for (int i = 0; i <100 ; i++) {
            isim += ".";
        }
        System.out.println(isim);
    }
}

