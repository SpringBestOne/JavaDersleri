package Odev_Calisma;

public class A_Z_yeASCII_Degerini_Yazdirma {
    public static void main(String[] args) {

/*
'a' ile 'z' arasındaki karakterlerin ascii değerlerini yazdıran bir Java programı yazın.

Ascii value of a = 97 .......y = 121 Ascii value of z = 122
 */


        for (int i = 97; i <=122 ; i++) {
            char c= (char) i;
            System.out.println("Ascii value of " + c + " = "+i);
        }


        }

    }

/*
System.out.println("for ile ");
     //  for (int i = 0; i <= 255; i++) {
     //      char c= (char) i;// casting yaptik , integeri char a esitlediğimiz için boyle yaptık
     //      System.out.println(i + "-> " +c );
 */


