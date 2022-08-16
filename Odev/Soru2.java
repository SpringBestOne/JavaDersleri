package Odev;

public class Soru2 {
    public static void main(String[] args) {
        int sayi1= 50;
        short sayi2= (short) sayi1;
        byte sayi3= (byte) sayi2;
        System.out.println("narrowing den sonra:" + sayi3);
    }
}
