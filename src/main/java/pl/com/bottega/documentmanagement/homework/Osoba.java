package pl.com.bottega.documentmanagement.homework;

public class Osoba {
    public static final byte MAX_ILOSC_ZEBOW = 32;

    enum Gender{
        K, M;
    }

    private Gender płeć;
    private Byte wiek;
    private byte ilośćZębów;

    public boolean możeUbiegaćSięOZabieg() {
        return (wiek != null
                && płeć.equals(Gender.K)
                && wiek >= 18 && wiek <= 65)
                || ilośćZębów < MAX_ILOSC_ZEBOW / 2;
    }
}
