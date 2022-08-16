package racap1;

import java.util.Scanner;

public class Q10_Nested_Ternary {
    public static void main(String[] args) {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */


        char finalnot='A';

        String result= (finalnot=='A')?"Gayet Basarili" : finalnot=='B' ? "Basarili": finalnot=='C'? "Ha Gayret" : "Digerleri..";
        System.out.println("result = " + result);
    }
}
