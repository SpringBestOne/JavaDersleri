package Practice_ElifHoca;

import java.util.Locale;
import java.util.Scanner;

public class Q09_Scanner02 {
    // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
    // ve yasadiklari yeri seviyorlarsa
    // bu bilgiyi yazdirin

    // next() only can read the first word
    // nextLine() can read the whole line

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("İsim : ");
        String isim = Scan.nextLine();

        System.out.println("memleketiniz : ");
        String memleket = Scan.nextLine();

        System.out.println("konum ; ");
        String konum = Scan.nextLine();

        System.out.println("yas :");
        int yas = Scan.nextInt();

        System.out.println("boy");
        double boy = Scan.nextDouble();


        System.out.println("su anki " + konum + " u seviyormusunuz? true/ false");
        boolean seviyorMu=Scan.nextBoolean();


        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("konum = " + konum);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);

    }
        }



