package Elif_Hoca_Day4;

public class Q04_ForLoop {
    public static void main(String[] args) {
            /*
        100'den 0'a kadar 13'e tam bölünebilen sayıları ekrana yazdırınız (büyükten küçüğe).
        Ekran Çıktısı asagidaki sekilde olsun; ayrica sonrasinda bu sayilarin toplamini da yazdirin
        istenen sonuc :
         91
         78
         65
         52
         39
         26
         13       */
      int bas=100;
        int bit=13;
        int toplam=0;
        int sayac=0;
          for (int i = bas; i >= bit; i--) {

            if(i%13==0) {
                System.out.println(i);

            toplam+=i;
            sayac++;
            }

    }System.out.println("sayilarin toplami = " +toplam);
        System.out.println("toplam " + sayac + " sayi vardir");
}}

     /*   int toplam = 0;
        for (int i = 100; i >= 13; i--) {
            if (i % 13 == 0) {
                System.out.println(i);
                toplam += i;

            }

        }
        System.out.println(toplam);
    }

}
 */
