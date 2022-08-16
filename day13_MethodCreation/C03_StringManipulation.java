package day13_MethodCreation;

public class C03_StringManipulation {
    public static void main(String[] args) {

        String str="  Java ogrenmek123 Cok guzel@  ";
        str=str.trim(); //bas ve sondaki bosluklar gitti
        str=str.replaceAll("\\d","");  //sayilar gitti
        str=str.replace("@", ""); // @ gitti
        str=str.replace("C", "c"); // C yi kücük c yaptı
        str=str+"."; // sonuna nokta koydu

        System.out.println(str);

    }
}
