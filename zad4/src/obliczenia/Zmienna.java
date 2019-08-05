package obliczenia;
import struktury.*;

public class Zmienna extends Wyrazenie {
    public static final ZbiorNaTablicy zbiorZmiennych = new ZbiorNaTablicy(10);
    public String klucz;

    public Zmienna(String k){
        super();
        this.klucz = k;
        oblicz();
    }

    public double oblicz(){
        return zbiorZmiennych.czytaj(klucz);
    }

    public String toString(){
        return String.valueOf(zbiorZmiennych.czytaj(this.klucz));
    }
}
