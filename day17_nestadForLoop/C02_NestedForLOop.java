package day17_nestadForLoop;

public class C02_NestedForLOop {
    public static void main(String[] args) {

        //verilen sayiya gore carpim tablosu olusturun
        //input 3
        //123
        //246
        //369
        int input=4;
        for (int i = 1; i <=input; i++) {
            for (int j = 1; j <=input ; j++) {
                System.out.print(i*j+ " ");

            }
            System.out.println("");
        }

    }
}
