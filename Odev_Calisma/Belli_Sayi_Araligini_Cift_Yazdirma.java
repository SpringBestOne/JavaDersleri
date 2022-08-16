package Odev_Calisma;

public class Belli_Sayi_Araligini_Cift_Yazdirma {
    public static void main(String[] args) {
        //100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.
        //OUTPUT : 100 98 96 94 92 … … … … 2 0
/*
  for(int i=100; i>1; i--) {
            if (i % 8 == 0) {
                System.out.print(i + " ");
            }
        }}}

 */
        for(int i=100; i>=0; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");

            }
        }}}


