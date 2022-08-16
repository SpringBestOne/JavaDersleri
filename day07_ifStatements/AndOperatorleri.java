package day07_ifStatements;

public class AndOperatorleri {
    public static void main(String[] args) {

        int a=10;
        int b= 5;
        int c=20;

        System.out.println(a>0 && b<20 && c>=b); // true


        System.out.println(a<0 && b<20 && c>=b); // false

        System.out.println(a<0 & b<20 & c>=b); // false
    }
}
