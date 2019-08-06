package obliczenia;
import struktury.*;

public class Zmienna extends Wyrazenie {
    public static final ZbiorNaTablicy zbiorZmiennych = new ZbiorNaTablicy(10);
    protected String klucz;

    public Zmienna(String k){
        super();
        this.klucz = k;
    }

    public double oblicz(){
        return zbiorZmiennych.czytaj(klucz);
    }

    public String toString(){
        return klucz+" = "+String.valueOf(zbiorZmiennych.czytaj(this.klucz));
    }
}
