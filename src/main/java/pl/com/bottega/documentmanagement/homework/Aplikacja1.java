package pl.com.bottega.documentmanagement.homework;

public class Aplikacja1 {
    public static void main(String[] params) {
        Klasa obiekt = new Klasa();
        int x = 2;
        obiekt.metoda1(x);
        System.out.print(x);
        Adres adres = new Adres();
        adres.miasto = "Lublin";
        obiekt.metoda2(adres);
        System.out.print(adres.miasto);
    }
}