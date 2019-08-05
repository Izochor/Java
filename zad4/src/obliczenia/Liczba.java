package obliczenia;

public class Liczba extends Wyrazenie{
    public final double liczba;

    public Liczba(double l){
        super();
        this.liczba = l;
        oblicz();
    }

    public double oblicz() {
        return liczba;
    }

    public String toString(){
        return String.valueOf(liczba);
    }
}
