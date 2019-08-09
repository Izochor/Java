package narzedzia;
import java.util.ArrayDeque;


public class Stos {
    public ArrayDeque<Double> stos;

    public Stos(){
        this.stos = new ArrayDeque();
    }

    public double pop(){
        return this.stos.pop();
    }

    public void push(Double liczba){
        this.stos.push(liczba);
    }
}
