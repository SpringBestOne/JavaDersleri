package day35_inheritanceda_ConstructorKullanimi;

public class FMemur extends EMuhasebe{

    /*
    Extends keyword kullanilan claslarda,
    ister default const. bulunsun ister biz yeni const. olusturalim,
     Java contructorun ilk satırına super constructor call yazdirir.

     super(); contructor call, default contr. benzer, gorunmese de orada vardir, calisir,
     ancak biz ilk satira farkli bir constructor call  yaparsak
     Java  super(); i siler
     */

    FMemur(){
        System.out.println("Memur Parametresiz cons");
    }
    FMemur(String isim){

        System.out.println("Memur Parametreli Cons.");
    }

    public static void main(String[] args) {

        FMemur mmr1=new FMemur("ali");
    }
}
