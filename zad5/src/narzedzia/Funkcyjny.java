package narzedzia;

public interface Funkcyjny extends Obliczalny {
    int arnosc ();
    int brakujaceArgumenty();
    void dodajArgument() throws WyjatekONP;
}
