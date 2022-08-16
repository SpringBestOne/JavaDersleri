package day35_inheritanceda_ConstructorKullanimi;

public class KDizelCorolla extends HCorolla{
    KDizelCorolla(){

        System.out.println("KDizelCorolla parametresiz cons.");

    }
    KDizelCorolla(String isim){

        super(isim);
        System.out.println("KDizelCorolla parametreli Cons.");
    }

    public static void main(String[] args) {
        KDizelCorolla obj1=new KDizelCorolla("Hasan");

    }
}
