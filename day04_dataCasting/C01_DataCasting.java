package day04_dataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {
        char harf='a';
        char yeniHarf=(char) (harf+1); //kod bu durumda önce sağdaki işlemi yapar
        //char yeniHarf = 97+1   98
        //char 98 olmaz hata verir. Paranteze almasaydık.
        System.out.println(yeniHarf);

        int sayi1=(int) 7.3; // Olmaz

        int sayi2= (int) 7.3; // data türünü değiştirdik oldu
        double sayi3=10;
        System.out.println("sayi2:" +sayi2);// 10.0

        int sayi4='c';

        char harf2= 98; //Olmaz
        System.out.println("harf2:" +harf2);


    }
}
