package day17_nestadForLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {
        //20 den 50 ye kadar (sinirlar dahil) cift sayilari yazdir
        //forLoop ile yap

        int bas=20;
        int bit=50;

        for (int i = bas; i <=bit ; i++) {
            if(i%2==0){
                System.out.print(i +" ");   //20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50
            }

        }
        System.out.println();
//While Loop ile yapalim
        int temp=bas;

        while (temp<=bit){
            if(temp%2==0){
                System.out.print(temp +" ");      //20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50
        }
            temp++;
    }
}}
