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
}