package Odev_Calisma;

public class Array_Sayilarin_Ortalamasi {
    public static void main(String[] args) {
        /* Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

Array = [20, 30, 25, 35, -16, 60, -100 ]

Beklenen Çıktı:
Array Sayılarının ortalaması: 7.0
         */
        int [] arr={20, 30, 25, 35, -16, 60, -100 };

        int toplam=0;
        int sayac=0;

        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];
            sayac++;
        }
        System.out.println(toplam/sayac);
    }
}
