package geometria;

import java.util.Arrays; 

public class Trojkat{
    Punkt pkt1;
    Punkt pkt2;
    Punkt pkt3;

    public Trojkat(Punkt x1,Punkt x2, Punkt x3){
        Odcinek bok12 = new Odcinek(x1,x2);
        Odcinek bok13 = new Odcinek(x1,x3);
        Odcinek bok23 = new Odcinek(x2,x3);
        double[] dlugosci = {bok12.dlugosc(),bok13.dlugosc(),bok23.dlugosc()};
        Arrays.sort(dlugosci); 
        if(dlugosci[2] < dlugosci[1] + dlugosci[0]){
            this.pkt1 = x1;
            this.pkt2 = x2;
            this.pkt3 = x3;
        } else {
            System.err.println("To nie trójkąt!");
        }
    }

    public void przesun(Wektor v){
        this.pkt1.setX(this.pkt1.getX()+v.dx);
        this.pkt1.setY(this.pkt1.getY()+v.dy);

        this.pkt2.setX(this.pkt2.getX()+v.dx);
        this.pkt2.setY(this.pkt2.getY()+v.dy);

        this.pkt3.setX(this.pkt3.getX()+v.dx);
        this.pkt3.setY(this.pkt3.getY()+v.dy);
    }

    public void odbij(Prosta p){
        double a1 = -p.b;
        double b1 = p.a;
        double c1 = -this.pkt1.getX()*a1 - this.pkt1.getY()*b1;

        Prosta temp1 = new Prosta(a1,b1,c1);
        if(Prosta.czyProstopadle(temp1, p) == true){
            Punkt przeciecie1 = Prosta.punktPrzeciecia(temp1, p);
            Wektor v1 = Wektor.zlozonyW(this.pkt1, przeciecie1);
            this.pkt1.setX(przeciecie1.getX()+v1.dx);
            this.pkt1.setY(przeciecie1.getY()+v1.dy);
        } else {
            System.err.println("Prosta odbicia nie jest prostopadła 1");
        }


        double a2 = a1;
        double b2 = b1;
        double c2 = -this.pkt2.getX()*a2 - this.pkt2.getY()*b2;

        Prosta temp2 = new Prosta(a2,b2,c2);
        if(Prosta.czyProstopadle(temp2, p) == true){
            Punkt przeciecie2 = Prosta.punktPrzeciecia(temp2, p);
            Wektor v2 = Wektor.zlozonyW(this.pkt2, przeciecie2);
            this.pkt2.setX(przeciecie2.getX()+v2.dx);
            this.pkt2.setY(przeciecie2.getY()+v2.dy);
        } else {
            System.err.println("Prosta odbicia nie jest prostopadła 2");
        }

        double a3 = a1;
        double b3 = b1;
        double c3 = -this.pkt3.getX()*a3 - this.pkt3.getY()*b3;

        Prosta temp3 = new Prosta(a3,b3,c3);
        if(Prosta.czyProstopadle(temp3, p) == true){
            Punkt przeciecie3 = Prosta.punktPrzeciecia(temp3, p);
            Wektor v3 = Wektor.zlozonyW(this.pkt3, przeciecie3);
            this.pkt3.setX(przeciecie3.getX()+v3.dx);
            this.pkt3.setY(przeciecie3.getY()+v3.dy);
        } else {
            System.err.println("Prosta odbicia nie jest prostopadła 3");
        }
    }
}