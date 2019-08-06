package obliczenia;
import struktury.*;

public class Stala extends Wyrazenie{
    public static final ZbiorNaTablicy zbiorStalych = new ZbiorNaTablicy(10);
    protected String klucz;

    public Stala(String k){
        super();
        this.klucz = k;
    }

    public double oblicz(){
        return zbiorStalych.czytaj(klucz);
    }

    public String toString(){
        return String.valueOf(zbiorStalych.czytaj(this.klucz));
    }
}
