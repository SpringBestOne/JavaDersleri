package day21_Arrays;

import java.util.Arrays;

public class C06_ArrayeElemanEkleme {
    public static void main(String[] args) {
        //C05 deki methodu kullanarak arraye eleman ekle

        String [] takimList={"Suleyman", "Osman"};
        String eklenecekIsim="Talha";
       takimList= C05_VerilenArrayeElementEkleme.elemanEkle(takimList,eklenecekIsim);
        System.out.println(Arrays.toString(takimList));
    }
}
