package day07_ifStatements;

public class C03_IfStatements {
    public static void main(String[] args) {

        int sayi = 20;

        if (sayi > 0) ;{
            System.out.println("sayi pozitif");
            System.out.println("pozitif kalacaktır");
            System.out.println();
        }

        if (sayi % 2 == 0) {
            System.out.println("sayi cift");
            System.out.println("cift kalacaktir");
        }

        if (sayi % 5 == 0) ;{
            System.out.println("Sayi 5in kati");

        }

    }
}