package Odev;
import java.util.Scanner;
public class Replit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String isim = scan.nextLine();
        String soyisim = scan.nextLine();
        String kartNo = scan.nextLine();

        isim= isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");

        soyisim = soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w", "*");

        System.out.println("Name : " + isim+soyisim);

        kartNo= kartNo.substring(1,13).replaceAll("\\d", "*") + kartNo.substring(kartNo.length()-4);

        System.out.println("CCN : " + kartNo);

    }
}
