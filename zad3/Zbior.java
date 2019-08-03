package struktury;

/**Domyślny sposob przechowywania par.*/
public abstract class Zbior{
    int rozmiar;
    public Para[] tablicaPar;

    public Zbior(int rozmiar){
        if (rozmiar < 2) throw new IllegalArgumentException("Za mały rozmiar Zbioru");
        this.rozmiar = rozmiar;
        this.tablicaPar = new Para[rozmiar];
    }

    /** metoda ma szukać pary z określonym kluczem 
     * @param k klucz który ma zostać znaleziony
     * @return znalezioną parę o kluczu k
    */
    public abstract Para szukaj (String k) throws NullPointerException;
    /** metoda ma wstawiać do zbioru nową parę 
     * @param p wstawiana para
    */
    public abstract void wstaw (Para p) throws IllegalArgumentException;
    /** metoda ma odszukać parę i zwrócić wartość związaną z kluczem 
     * @param k klucz, któego wartość chcemy znaleźć
     * @return wartość pary o kluczu k
    */
    public abstract double czytaj (String k) throws IllegalArgumentException;
    /** metoda ma wstawić do zbioru nową albo zaktualizować parę 
     * @param p wstawiana lub aktualizowana para
    */
    public abstract void ustaw (Para p) throws IllegalArgumentException;
    /** metoda ma usunąć wszystkie pary ze zbioru */
    public abstract void czysc();
    /** metoda ma podać ile par jest przechowywanych w zbiorze 
     * @return liczba par przechowywana w zbiorze
    */
    public abstract int ile();
}