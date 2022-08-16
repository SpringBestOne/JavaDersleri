package day35_inheritanceda_ConstructorKullanimi;

public class Matemetikciler extends LOgretmen{
    Matemetikciler(){

        System.out.println("Matemetikciler parametresiz cons.");

    }
    Matemetikciler(String isim){
        this();

        System.out.println("Matemetikciler parametreli Cons.");

    }

    public static void main(String[] args) {
        Matemetikciler obj1=new Matemetikciler("Nilufer");
    }
/*
this() constructor call içinde bulunan class taki constr.lari
super() ise parent classda bulunan constructorları cagırır
this() veya super parametre yapısına uygun bir constructor bulamazsa
Java CTE verir.
constructor konusunda gorduğumuz, this.
o classtaki intance variableleri refere ediyordu.
inheritance de de super. vardır ve super. parent classtaki instanceleri refere eder.
 */
}
