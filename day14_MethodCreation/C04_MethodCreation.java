package day14_MethodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {
        //Verilen isim ve soy ismi, ilk harfi buyuk, geriye kalanlari * olacak sekilde degistirip
        //bu halini bize donduren bir mathod olusturun
        // NOT: programin ilerleyen kisimlarinde isim ve soy ismi bu sekilde kullanmak istiyoruz

        String isim= "Enes";
        String soyisim= "Bozkurt";

        String gizliIsim=isimGizle(isim,soyisim);
        System.out.println(isim+ " "+ soyisim);
        System.out.println(gizliIsim);
    }

    public static String isimGizle(String isim, String soyisim) {


        isim= isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");

        soyisim = soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w", "*");

        return isim+ " "+ soyisim;
    }
}
