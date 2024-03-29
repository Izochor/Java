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
        Wyrazenie w = new Dodaj(new Liczba(2),x);
        Wyrazenie w2 = new Odejmij(new Liczba(5),new Sinus(new Liczba(0)));

        System.out.println(liczba.toString());
        System.out.println(sin.toString()+" = "+sin.oblicz());
        System.out.println(x.toString());
        System.out.println(y.toString()+" = "+y.oblicz());
        System.out.println(w.toString()+" = "+w.oblicz());
        System.out.println(w2.toString()+" = "+w2.oblicz());
    }
}
