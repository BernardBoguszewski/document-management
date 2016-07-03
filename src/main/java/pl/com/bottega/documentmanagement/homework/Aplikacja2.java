package pl.com.bottega.documentmanagement.homework;

public class Aplikacja2 {
    public static void main(String[] params) {
        Klasa obiekt = new KlasaDziedziczaca();
        Adres adres = new Adres();
        adres.miasto = "Lublin";
        Klasa.metodaStatyczna(adres);
        System.out.print(adres.miasto);
        obiekt.metodaStatyczna(adres);
        System.out.print(adres.miasto);
    }
}