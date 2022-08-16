package racap1;

import java.util.Scanner;

public class Q9_Nested_If {
    public static void main(String[] args) {

        /*
    Kullanici dan yas bilgisini alarak

	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

	 */
        Scanner scan=new Scanner(System.in);

        System.out.println("Yasinizi giriniz: ");
        int age=scan.nextInt();

        if (age >= 18){
            System.out.println("oy kullanmaya uygun");
            if(50 >age && age>=18 ){
                System.out.println("bir kez oy kullanabilir");
            }
            if(70 > age && age>=50){
                System.out.println("iki kez oy kullanabilir");
                if(age >= 70){
                    System.out.println("uc kez oy kullanabilir");
                }
            }
        }
    }
}
