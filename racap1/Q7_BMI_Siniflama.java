package racap1;

import java.util.Scanner;

public class Q7_BMI_Siniflama {
    public static void main(String[] args) {
		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		*
		 */

        Scanner scan=new Scanner(System.in);

        System.out.println("Boyunuzu  CM olarak giriniz: ");
        double boy=scan.nextDouble()/100; //boyu metreye ilk etapta çevirdik

        System.out.println("kilonuzu kg alarak giriniz: ");
        double kg=scan.nextDouble();

        double bmi= kg/ (boy*boy);
if (bmi<=20){
    System.out.println("bmi indexiniz " + bmi + "Oldukca zayifsiniz");
} else if (bmi<=25) {
    System.out.println("bmi indexiniz " + bmi + "normal sinirlardasiniz");
} else if (bmi<=30) {
    System.out.println("bmi indexiniz " + bmi + "sisman kategorisindesiniz");
}else if (bmi>=30){
    System.out.println("bmi indexiniz " + bmi + "obezsiniz");

}

    }
    }

