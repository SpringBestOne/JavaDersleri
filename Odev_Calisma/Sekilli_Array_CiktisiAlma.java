package Odev_Calisma;

public class Sekilli_Array_CiktisiAlma {
    public static void main(String[] args) {
        /*
        Aşağıdaki grid şeklini yazan Java Kodunu yazınız.

Beklenen Çıktı:
0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0

  Scanner scan = new Scanner(System.in);
            System.out.print("Satir sayisi giriniz :");
            int satirSayisi = scan.nextInt();
            System.out.print("Sutun sayisi giriniz :");
            int sutunSayisi = scan.nextInt();
            for (int i = 1; i <= satirSayisi; i++) {
                for (int k = 1; k <= sutunSayisi; k++) {
                    System.out.print("* ");
                }
                System.out.println(); //bu bosluk olmazsa hepsini yan yana yazar
            }
        }
    }
    Alltaki soru replit
         */
        for (int i = 1; i <= 10; i++) {
            for (int k = 1; k <= 10; k++) {
                System.out.print("* ");
            }
            System.out.println(); //bu bosluk olmazsa hepsini yan yana yazar
        }
    }
}
