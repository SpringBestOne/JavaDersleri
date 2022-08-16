package Odev_Calisma;

public class Arrayde_Eleman_Bulma {
    public static void main(String[] args) {
        // Tamsayilardan olusan bir array de  en kucuk pozitif elemanı ve
        // en buyuk negatif elemanı bulun
// Ornek: {-12,18,-5,23,-2} ==> En kucuk pozitif sayi= 18 , En buyuk negatif sayi=-2

        int[] arr = {-12, 18, -5, 23, -2,-1};

        int enBuyukNTS = 0;
        int arananEnKS = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                enBuyukNTS = arr[i];

            }

        }
        System.out.println(enBuyukNTS);
        System.out.println(arananEnKS);
    }
}
