package day35_inheritanceda_ConstructorKullanimi;

public class EMuhasebe extends DPersonel{
    EMuhasebe(){

        System.out.println("EmMuhasebe parametresiz cons.");

    }
    EMuhasebe(String isim){
        System.out.println("Muhasebe parametreli Cons.");
    }
}
