package day36_inheritanceDataTypeKullanimi;

public class APersonel {
    String  isim="Isim belirtilmedi";
    String soyIsim="Soyisim belirtilmedi";
    String departmant="Departman beliritlmedi";

    protected  void maas(){
        System.out.println("Tum personelimiz maas alir");

    }
    protected void sigorta(){
        System.out.println("Tum personelimize sigorta yapilir");
    }
}
