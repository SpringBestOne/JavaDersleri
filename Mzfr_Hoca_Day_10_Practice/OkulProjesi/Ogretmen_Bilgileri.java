package Mzfr_Hoca_Day_10_Practice.OkulProjesi;

public class Ogretmen_Bilgileri {

    String isim;
    String soyisim;
    int yas;
    String brans;
    String tel;

    public Ogretmen_Bilgileri() {
    }

    public Ogretmen_Bilgileri(String isim, String soyisim, int yas, String brans, String tel) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.brans = brans;
        this.tel = tel;



    }

    @Override
    public String toString() {
        return "Ogretmen_Bilgileri{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                ", brans='" + brans + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
