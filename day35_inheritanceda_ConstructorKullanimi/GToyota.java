package day35_inheritanceda_ConstructorKullanimi;

public class GToyota {
    GToyota(){

        System.out.println("GToyota parametresiz cons.");

    }
    GToyota(String isim){
        // super(isim); extends olmadığı için super costructor call ı Java kabul etmez
        System.out.println("GToyota parametreli Cons.");
    }
}
