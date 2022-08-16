package day15_Overloading_forLoop;

public class C01_ReturnMethod {
    public static void main(String[] args) {
        //verilen iki sayiyyi carpıp
         //       sonucu bize döbdüren methodu olusturun

        int sayi1= 10;
        int sayi2=5;

        int sonuc=carpGetir(sayi1,sayi2);
        System.out.println(sonuc);

    }

    public static int carpGetir(int sayi1, int sayi2) {
int sonuc= sayi1*sayi2;
        return sonuc;


    }
}
