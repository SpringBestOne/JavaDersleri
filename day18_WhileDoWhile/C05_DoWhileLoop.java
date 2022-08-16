package day18_WhileDoWhile;

public class C05_DoWhileLoop {
    public static void main(String[] args) {
        //9 dan 190 a kadar 7 nin katı olan tüm sayiları ekrana yazdır

        int bas = 9;
        int bit = 190;
        int temp = bas;

        //while loop ile

        while (temp < bit) {
            if (temp % 7 == 0) {
                System.out.print(temp + " ");
            }
            temp++;

        }

// do while loop ile yapalim
        System.out.println(" ");
        temp = bas;

        do {
            if (temp % 7 == 0) {
                System.out.print(temp + " ");
            }
            temp++;
        }while (temp<bit);
    }}