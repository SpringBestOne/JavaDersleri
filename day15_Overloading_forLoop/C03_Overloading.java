package day15_Overloading_forLoop;

public class C03_Overloading {

    public static void main(String[] args) {


        topla(5,7);
        topla(5.2,3);
        topla(3.4,6.1);

    }


    public static void topla(int sayi1, int sayi2){
        System.out.println("Iki integer in toplami:" + (sayi1+sayi2));
    }
    public static void topla(double sayi1, int sayi2){
        System.out.println("Iki integer in toplami:" + (sayi1+sayi2));
    }
    public static void topla(double sayi1, double sayi2){
        System.out.println("Iki integer in toplami:" + (sayi1+sayi2));
    }}