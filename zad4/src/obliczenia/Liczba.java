package obliczenia;

public class Liczba extends Wyrazenie{
    protected final double liczba;

    public Liczba(double l){
        super();
        this.liczba = l;
    }

    public double oblicz() {
        return liczba;
    }

    public String toString(){
        return String.valueOf(liczba);
    }
}
