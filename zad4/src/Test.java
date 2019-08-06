import obliczenia.*;
import struktury.*;

import static obliczenia.Zmienna.zbiorZmiennych;

public class Test {
    public static void main(String[] args){
        Wyrazenie liczba = new Liczba(90);
        Wyrazenie sin = new Sinus(liczba);
        Para iks = new Para("x",2);
        Para igrek = new Para ("y",-3);
        zbiorZmiennych.wstaw(iks);
        zbiorZmiennych.wstaw(igrek);
        Wyrazenie x = new Zmienna("x");
        Wyrazenie y = new WartBezwzgl(new Zmienna("y"));

        System.out.println(liczba.toString());
        System.out.println(sin.toString()+" = "+sin.oblicz());
        System.out.println(x.toString());
        System.out.println(y.toString()+" = "+y.oblicz());
    }
}
