package struktury;

public abstract class Zbior{
    int rozmiar;
    public Para[] tablicaPar;

    public Zbior(int rozmiar){
        if (rozmiar < 2) throw new IllegalArgumentException("Za mały rozmiar Zbioru");
        this.rozmiar = rozmiar;
        this.tablicaPar = new Para[rozmiar];
    }

    /** metoda ma szukać pary z określonym kluczem */
    public abstract Para szukaj (String k) throws NullPointerException;
    /** metoda ma wstawiać do zbioru nową parę */
    public abstract void wstaw (Para p) throws IllegalArgumentException;
    /** metoda ma odszukać parę i zwrócić wartość związaną z kluczem */
    public abstract double czytaj (String k) throws IllegalArgumentException;
    /** metoda ma wstawić do zbioru nową albo zaktualizować parę */
    public abstract void ustaw (Para p) throws IllegalArgumentException;
    /** metoda ma usunąć wszystkie pary ze zbioru */
    public abstract void czysc();
    /** metoda ma podać ile par jest przechowywanych w zbiorze */
    public abstract int ile();
}