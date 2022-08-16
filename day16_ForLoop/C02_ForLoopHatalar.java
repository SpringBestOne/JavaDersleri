package day16_ForLoop;

public class C02_ForLoopHatalar {
    public static void main(String[] args) {


      // for(int i=0; i>--10; i++){//baslangıc noktasından sonra, bitiş sartına yaklasmıyorsak sonsuz loop olur.
        //    System.out.println(i); // sonsuz calistirir



            for (int i = 0; i>5; i++){ //eger ilk deger için bile bitiş sartı saglamıyorsa,
                System.out.println(i); //for loop calisir ama loop bady si hiçbir zaman devreye girmez
            }
        }
    }

