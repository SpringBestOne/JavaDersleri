package Odev_Calisma;

import java.util.Scanner;

public class Replit_ForWhile3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        char harf = scan.next().charAt(0);
        int sayac = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==harf) {
                sayac++;
            }
        }
            System.out.println(sayac);}}