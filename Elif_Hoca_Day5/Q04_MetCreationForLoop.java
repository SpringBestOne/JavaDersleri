package Elif_Hoca_Day5;

import java.util.Scanner;

public class Q04_MetCreationForLoop {
    public static void main(String[] args) {

		/* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir string giriniz<");
        String str=scan.nextLine();

        reverseString(str);
        System.out.println("stringin tersi:" +reverseString(str));


    }

    public static String reverseString(String str) {

        String reversed="";
        for (int i = str.length()-1 ; i >=0 ; i--) {
            reversed+=str.charAt(i);
        }
        return reversed;
    }
}
/*  FARKLI COZUM
 Scanner scan=new Scanner(System.in);
          System.out.print("Please  enter a rows number : ");
          int row= scan.nextInt();
          System.out.print("Please  enter a column : ");
          int column= scan.nextInt();
          for (int i = 1; i <=row ; i++) {
              for (int j = 1; j <=column ; j++) {
                  System.out.print("*");
              }
              System.out.println();
          }
Collapse


 */
