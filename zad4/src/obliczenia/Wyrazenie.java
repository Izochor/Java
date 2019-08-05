package obliczenia;

public abstract class Wyrazenie implements Obliczalny{

    public Wyrazenie(){
        super();
    }
    /** metoda dodająca wyrażenia */
    public static double suma (Wyrazenie... wyr) {
        double wynik = 0;

        for(int i=0; i<wyr.length; i++) {
            wynik += Double.parseDouble(wyr[i].toString());
        }
        return wynik;
    }

    /** metoda mnożąca wyrażenia */
    public static double iloczyn (Wyrazenie... wyr) {
        double wynik = 0;

        for(int i=0; i<wyr.length; i++) {
            wynik *= Double.parseDouble(wyr[i].toString());
        }
        return wynik;
    }
}