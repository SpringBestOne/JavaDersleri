package day11_String_Malipulation;

public class C01_İndexOf {
    public static void main(String[] args) {


        String str="Java ogrenmek cok guzel";


        System.out.println(str.indexOf('g')); //6
        System.out.println(str.indexOf("r")); //7
        System.out.println(str.indexOf("j")); //-1
        System.out.println(str.indexOf("mek")); // blok dusunur ilk harf indeksini verir

        System.out.println(str.indexOf("g", (6+1))); // 6. indexden itibaren demektir.

        //yukarıdaki str de 2. ve 3. e nin indexlerini bulun derse, 2. yi bulmak için 11. e nin indexini bulacagız

        int ilke= str.indexOf("e");
        int ikincie = str.indexOf("e",ilke+1);
        if (ikincie == -1) {
            System.out.println("verilen str da 2. e yok");
        }else {
            int ucuncue=str.indexOf("e",ikincie+1);
            if(ucuncue==-1) {
                System.out.println("verilen str da 3. e yok");
            }else {
                System.out.println("verilen str de 3. e nin indexi :"+ ucuncue);
            }
        }


    }
}
