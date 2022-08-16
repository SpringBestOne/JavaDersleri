package day35_inheritanceda_ConstructorKullanimi;

public class LOgretmen {
    LOgretmen(){

        System.out.println("LOgretmen parametresiz cons.");

    }
    LOgretmen(String isim){

        this();

        System.out.println("LOgretmen parametreli Cons.");

    }
}
