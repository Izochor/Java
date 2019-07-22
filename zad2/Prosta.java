package geometria;

public class Prosta{
    public final double a;
    public final double b;
    public final double c;

    public Prosta(double wspA,double wspB, double wspC){
        this.a = wspA;
        this.b = wspB;
        this.c = wspC;
    }

    public static Prosta przesun(Prosta p,Wektor v){
        double wspA = p.a + v.dx;
        double wspB = p.b + v.dy;
        double wspC = p.c;
        Prosta prosta = new Prosta(wspA,wspB,wspC);
        return prosta;
    }

    public static boolean czyRownolegle(Prosta prosta1, Prosta prosta2){
        if(prosta1.a == prosta2.a){
            return true;
        } else {
            return false;
        }
    }

    public static boolean czyProstopadle(Prosta prosta1, Prosta prosta2){
        if(prosta1.a * prosta2.a == -prosta1.b*prosta2.b){
            return true;
        } else {
            return false;
        }
    }

    public static Punkt punktPrzeciecia(Prosta prosta1, Prosta prosta2){
        double x = 0;
        double y = 0;
        if (czyRownolegle(prosta1, prosta2) == false){
            x = (prosta2.c/prosta2.b-prosta1.c/prosta1.b)/(prosta1.a/prosta1.b - prosta2.a/prosta2.b);
            y = x*(prosta1.a/prosta1.b) - prosta1.c/prosta1.b;
        } else {
            System.err.println("Proste są równoległe!");
        }
        Punkt punkt = new Punkt(x,y);
        return punkt;
    }
}