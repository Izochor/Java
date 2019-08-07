package obliczenia;

/** Klasa dzieląca dwa wyrażenia przez siebie */
public class Dziel extends Operator2Arg {
    public Dziel(Wyrazenie a1, Wyrazenie a2) {
        super(a1, a2);
        if (a2.oblicz() == 0) throw new ArithmeticException("Dziel/0");
    }

    public double oblicz() {
        return arg1.oblicz() / arg2.oblicz();
    }

    public String toString() {
        return "(" + arg1 + " / " + arg2 + ")";
    }
}
