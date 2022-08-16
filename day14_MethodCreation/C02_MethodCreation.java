package day14_MethodCreation;

import day13_MethodCreation.C04_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {

        //Verilen 3 basamakli bir sayinin rakamlari toplamini yazdiran method olusturalim

        int input= 423;

        rakamlariTopla(input);
C01_MethodCreation.terstenYazdir("Nuri");
        C04_MethodCreation.topla(1,6);

    }

    public static void rakamlariTopla(int input) {

        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int temp= 423;
        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        System.out.println("Girdiginiz" +input + "sayisinin rakamlarToplami :" + rakamlarToplami);
    }
}
