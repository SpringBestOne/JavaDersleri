package day25_constructor;

public class CarRunnur {
    public static void main(String[] args) {

        Car car1=new Car();  //Görmesek de Car classında default costructor kullanıldı

        car1.fiyat=150000;  //Car clasında fiyata değer atadım
        car1.yil=2020;
        car1.marka="Toyota";

        System.out.println("Car1 bilgileri\nMarka"+car1.marka+ "\nModel: " + car1.model+"\nYil:"+car1.yil+ "\nFiyat: "+car1.fiyat);

        Car car2 =new Car();
        System.out.println("Car1 bilgileri\nMarka"+car2.marka+ "\nModel: " + car2.model+"\nYil:"+car2.yil+ "\nFiyat: "+car2.fiyat);
/*
1- Herhangi bir obje uzerinden bir variable yazdırmaya calıstığımızda ,
ilk once o obje olusturulduktan sonra bir deger atandı mı diye bakar.
2-Objenin olusturulduğu classda variablea bir değer atanmıs mı bakar
3- O zaman data türüne göre default değeri atar yani 0 atar.

 */


    }

}
