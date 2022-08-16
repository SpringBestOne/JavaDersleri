package day18_WhileDoWhile;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        //Kullanicidan sayi al, çift sayi girdigi surece yazdir, tek sayi girerse islemi bitir

        Scanner scan=new Scanner(System.in);
        int sayi=0;

        //while ile yapalim
        /* Looplarda kullanacagimiz variableleri loopdan önce olusturmaliyiz
        while loop da, loopdan önce olusturdugumuz degeri iyi dusunmemiz gerekiyor
         */
        while (sayi%2==0){
            System.out.println("Lutfen bir sayi giriniz");
            sayi =scan.nextInt();
          if(sayi%2==0){
              System.out.println("Girilen sayi cift");
          }else {
              System.out.println("Girilen sayi tek");
        }

    }
        //do while loop ile yapalim
        // ilk atanan degerin bir onemi yok,kod her durumd calisir
        //dezavantaji ise, ilk calistirma kontrol yapılmadan oldugu için, loop badysinde yanlis bir islam yapilmamasina dikkar edilir
        // do while loop ile yapalim;
        // do while'loop'da onceden olusturulan variable'a hangi deger atandiginin
        // hic bir onemi yok, kodumuz her durumda calisir
        /*
          do-while'in dezavantaji :
          ilk calistirma kontrol yapilmadan oldugu icin
          loop'un body'sinde yanlis bir islem yapilmamasina dikkat etmek gerekir
         */
        do{
            System.out.println("Lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            if (sayi%2==0){
                System.out.println("Girilen sayi cift : " + sayi);
            }else{
                System.out.println("Girilen sayi tek, benden bu kadar");
            }
        }while(sayi%2==0);
    }
}


