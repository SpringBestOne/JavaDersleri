package day21_Arrays;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {
        // Verilen bir array’in kullanıcan alınan bir elemani icerip icermedigini kontrol edip,
        // bize true veya false sonucu donen bir method olusturun.

        String[] isimler={"Basak", "Fatih", "Nurullah", "Adem", "Enes"};
        Scanner scan=new Scanner(System.in);
        System.out.println("Aradiğiniz ismi yaziniz");
        String ararnanIsim=scan.nextLine();

        boolean sonuc=contains(isimler, ararnanIsim);
        if(sonuc){
            System.out.println("Girilen isim listede var");
        }else {
            System.out.println("Girilen isim listede var");
        }
    }

    public static boolean contains(String[] isimler, String ararnanIsim) {
        boolean sonucMethod=false;


        for (int i = 0; i <isimler.length ; i++) {
            if (isimler[i].equalsIgnoreCase(ararnanIsim)) {
                sonucMethod = true;
            }
        }
        return sonucMethod;
    }
}
