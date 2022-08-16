package day15_Overloading_forLoop;

public class C06_StringTerseCevirme {
    public static void main(String[] args) {


        String input="Java gun gectikce guzellesiyor";
       bunuterstenYazdir(input);
    }

    public static void bunuterstenYazdir(String input) {
        String tersInput=input.substring(input.length()-1);
for (int i=input.length()-2;i>=0;i--){
    tersInput+=input.substring(i,i+1);
}
        System.out.println(tersInput);
    }
}
