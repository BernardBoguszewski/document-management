package pl.com.bottega.documentmanagement.homework;

class Klasa {
    public void metoda1(int i) {
        i++;
    }

    public void metoda2(Adres adres) {
        adres.miasto = "xxx";
    }

    public static void metodaStatyczna(Adres adres) {
        adres.miasto = "yyy";
    }
}