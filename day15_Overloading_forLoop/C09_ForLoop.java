package day15_Overloading_forLoop;

public class C09_ForLoop {
    public static void main(String[] args) {
        //input tamsayi için faktoriyel hesapla,method olustur,verilen sayi _ veya 14 den buyuk olursa h
        //girilen sayinin faktoriyeli hesaplanamaz yazdirin

        int input=25;
        faktoriyelHesapla(input);

    }

    public static void faktoriyelHesapla(int input) {

        int faktoriyel=1;
if(input<0 || input>20){
    System.out.println("Verilen sayi icin faktoriyel hesaplanamaz");
} else if (input==0) {
    System.out.println("0! =1 dir");
}else {
        for(int i=1; i<=input; i++) {
        faktoriyel*=i;
        }
    System.out.println("faktoryel degeri : " + faktoriyel);
}
    }
}
