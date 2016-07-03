package pl.com.bottega.documentmanagement.homework;

public class KlasaDziedziczaca extends Klasa {
    public static void metodaStatyczna(Adres adres) {
        adres.miasto = "zzz";
    }

    @Override
    public void metoda2(Adres adres) {
        adres.miasto = "ooo";
    }

    public void metoda3(Adres adres) {
        super.metoda2(adres);
    }
}