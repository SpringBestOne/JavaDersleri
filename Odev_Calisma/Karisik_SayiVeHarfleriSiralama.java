package Odev_Calisma;

import java.util.Arrays;

public class Karisik_SayiVeHarfleriSiralama {
    public static void main(String[] args) {
       /* Karışık verilen sayıları ve kelimeleri sıralayan Java kodunun yazınız. not: Test datadaki değerleri kullanınız.

        Test Data:
        [1232, 1134,2345,1022]
        [Java, Python, PHP, C#, C Programming, C++]

        Beklenen Çıktı:
        [1022,1134,1232,2345]
        [C Programming, C#, C++, Java, PHP, Python]

int [] sayilar={5,7,1,6,5,4,7,9};

        //Arrays class  ini kullanarak natural sirali hale getirebiliriz

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        */
        int [] sayilar={1232, 1134,2345,1022};
        String [] str={"Java", "Python", "PHP", "C#", "C Programming", "C++"};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
    }
}
