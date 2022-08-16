package day25_constructor;

public class Car {
    /*
    Bu class bizim kalıphanemiz. bir araba olusturmak için ihtiyacımız olan variable ve methotlari bu clasta belirleriz
    sonra farklı classlarda araba olusturmamız gerekirse bu classtan bir obje olusturup, burada belirlenen variable ve
    methotlara göre araba uretiriz.
     */

    String marka="Marka Belirtilmedi";

    String model="Marka Belirtilmedi";

    public int yil;
   public int fiyat;
    public void benzinliArac(){
        System.out.println("Bu arac benzinli motora sahiptir");
    }

    public  void maxHiz(int hiz){
        System.out.println("Bu araba max" + "km hiz yapar");

    }



}
