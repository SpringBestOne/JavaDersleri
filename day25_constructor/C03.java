package day25_constructor;

public class C03 {

    C03(){

    }
    /*Olusturduğumuz parametresiz bu constructor Default constructor ile birebir aynidir.
    Ama biz olusturduğumuz için default constructor demeyiz, parametresiz constructor deriz.
     */

    String isim ="Etka";

    public  void  method01(){
        System.out.println("C03 methot calisti");
        /*
      Constructor,  Class ın içinde methodların dışında olusturulur.

    proje olustururken bazi classlar run etmek icin degil varible ve metod olusturup bunlari baska
    claslarda kullanmak icin olusturulur.

    default consructor parametresizdir. göremezsek bile ihtiyacoldugunda calisir.

    Class icerisinde parametreli veya parametresiz herhangi bir constructor olusturursak java default
    constructor ı siler.
     */

    }
}
