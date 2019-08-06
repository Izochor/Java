package obliczenia;

import java.lang.*;

public class Sinus extends Operator1Arg{
    protected final Wyrazenie kat;

    public Sinus(Wyrazenie k){
        super(k);
        this.kat = k;
    }

    public double oblicz(){
        return Math.sin(Math.toRadians(kat.oblicz()));
    }

    public String toString(){
        return "sin("+String.valueOf(this.kat)+")";
    }
}
