package obliczenia;

import java.lang.*;

public class WartBezwzgl extends Operator1Arg {
    protected final Wyrazenie liczba;

    public WartBezwzgl(Wyrazenie l){
        super(l);
        this.liczba = l;
    }

    public double oblicz(){
        return Math.abs(this.liczba.oblicz());
    }

    public String toString(){
        return "|"+String.valueOf(this.liczba)+"|";
    }
}
