package day30_Immutable;

import java.time.LocalDate;
import java.time.Month;

public class C03_Date {
    public static void main(String[] args) {

        LocalDate tarih=LocalDate.now();

        System.out.println(tarih); //2022-07-23
        System.out.println(tarih.getDayOfYear()); //204
        System.out.println(tarih.getDayOfWeek()); //saturday
        System.out.println(tarih.getMonthValue()); //7
        System.out.println(tarih.isLeapYear()); // false

        LocalDate tarih2=LocalDate.of(1982,5,17);
        System.out.println((tarih2));//1982-05-15

        LocalDate tarih3=LocalDate.of(1990, Month.JANUARY,10);
        System.out.println((tarih3)); //1990-01-10

        System.out.println(tarih.plusDays(100)); //100 gün sonra hangi tarih onu veriyor

        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12));//5 yıl 3 ay 12 gün sonra tarihi

        System.out.println(tarih.minusDays(5).minusDays(3)); //önce tarih

        System.out.println(tarih.isAfter(tarih2)); //true

        //iki farklı doğum günü girildiğinde, hangisinde doganın daha buyuk olduğunu bulun

        if (tarih2.isAfter(tarih3)){
            System.out.println(tarih3 + " tarihinde dogan daha buyuk");
        } else if(tarih2.isBefore(tarih3)){
            System.out.println(tarih2 + " tarihinde dogan daha buyuk");
        } else{
            System.out.println("iki tarih birbiri ile ayni");
        }
    }
}