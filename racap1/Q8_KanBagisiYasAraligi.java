package racap1;

import java.util.Scanner;

public class Q8_KanBagisiYasAraligi {
    public static void main(String[] args) {

        		/*
		Problem tanimi :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner scan=new Scanner(System.in);

        System.out.println("Yasinizi giriniz : ");
        int yas=scan.nextInt();

        System.out.println("Kilonuzu giriniz : ");
        int kg=scan.nextInt();

        if(yas>0 && yas<18){
            System.out.println("Kan bagisi yapamaz");
    } else if (yas>=18) {
            if( kg>0 && kg<50){
            System.out.println("Kan bagisi yapamaz");
        } else if (kg>50) {
                System.out.println("Kan bagisi yapar");
            }

        }

    }
    }
