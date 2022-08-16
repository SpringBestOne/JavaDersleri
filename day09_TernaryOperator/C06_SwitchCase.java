package day09_TernaryOperator;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {

       String input= "Cumartesi";
       input= input.toLowerCase();
       switch (input){
           case "pazartesi":
               System.out.println("Hafta ici");
               break;
           case "sali":
               System.out.println("Hafta ici");
               break;
           case "carsamba":
               System.out.println("Hafta ici");
               break;
           case "persembe":
               System.out.println("Hafta ici");
               break;
           case "cuma":
               System.out.println("Hafta ici");
               break;
           case "cumartesi":
               System.out.println("Hafta sonu");
               break;
           case "pazar":
               System.out.println("Hafta sonu");
           default:
               System.out.println("Gecerli bir gun giriniz");

       }


        /*     switch (input){
            case "pazartesi":
            case "Sali":
            case "Carsamba":
            case "Persembe":
            case "Cuma":
                System.out.println("Hafta ici");
                break;
            case "Cumartesi":
                break;
            case "Pazar":
                System.out.println("Hafta sonu");
            default:
                System.out.println("Gecerli bir gun giriniz");*/

    }
}
