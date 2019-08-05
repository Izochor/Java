package obliczenia;

import java.lang.*;

public class Sinus extends Operator1Arg{
    public final Wyrazenie kat;

    public Sinus(Wyrazenie k){
        super(k);
        this.kat = k;
        oblicz();
    }

    public double oblicz(){
        return Math.sin(Double.parseDouble(kat.toString()));
    }

    public String toString(){
        return String.valueOf(this.kat);
    }
}
