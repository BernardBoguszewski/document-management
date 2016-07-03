package pl.com.bottega.documentmanagement.homework;

public class Aplikacja3 {
    public static void main(String[] params) {
        KlasaDziedziczaca obiekt = new KlasaDziedziczaca();
        Adres adres = new Adres();
        adres.miasto = "Lublin";
        obiekt.metoda2(adres);
        System.out.print(adres.miasto);
        obiekt.metoda3(adres);
        System.out.print(adres.miasto);
    }
}