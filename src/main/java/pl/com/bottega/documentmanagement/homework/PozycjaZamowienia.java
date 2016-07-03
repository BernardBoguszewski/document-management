package pl.com.bottega.documentmanagement.homework;

/**
 * Created by bernard.boguszewski on 30.06.2016.
 */
public class PozycjaZamowienia {

    StrategiaKosztu strategiaKosztu;

    public PozycjaZamowienia(StrategiaKosztu strategiaKosztu) {
        this.strategiaKosztu = strategiaKosztu;
    }

    public Money obliczKoszt(){
        return strategiaKosztu.obliczKoszt(this);
    }
}
