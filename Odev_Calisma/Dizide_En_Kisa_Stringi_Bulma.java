package Odev_Calisma;

public class Dizide_En_Kisa_Stringi_Bulma {
    public static void main(String[] args) {
         /*
Bir String array de uzunlugu en kucuk olan elemani bulun
Ornek = {"Kemal","Jonathan","Mark", "Argie","Veli"}
Cıktı : Mark, Veli
 */
        String[] isimler = {"Kemal", "Jonathan", "Mark", "Argie", "Veli","Ayla","Cem","Ali"};
        int kisaKarakterUzunlugu = isimler[0].length(); // en kısa dizi elemanı olarak 0. indexteki eleman KABUL ediliyor.
        String kisaKelimeler="";

        for (int i = 1; i < isimler.length; i++) {    // Bu döngüde dizideki tüm elemanlar kontrol ediliyor ve
            if (isimler[i].length() < kisaKarakterUzunlugu) {   // tüm dizideki elemanlardan en kısa olanının karakter uzunluğu bulunuyor.
                kisaKarakterUzunlugu = isimler[i].length();  // 3
            }
        }

        for (int j = 0; j < isimler.length; j++) {   // en kısa karaktere eşit olan dizi elemanları
            if (isimler[j].length() == kisaKarakterUzunlugu) {  // sıarsı ile kisaKelimeler adlı stringe ekleniyor
                kisaKelimeler+=isimler[j]+ ", ";
            }
        }
        System.out.print("Dizideki En Kısa Metin veya Metinler : " + kisaKelimeler);
    }
}
