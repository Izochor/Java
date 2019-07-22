package geometria;

public class Odcinek{
    Punkt pkt1;
    Punkt pkt2;
    public Odcinek(Punkt x1, Punkt x2){
        if(x1.equals(x2)){
            System.err.println("x1 == x2");
        } else {
            this.pkt1 = x1;
            this.pkt2 = x2;
        }
    }

    public double dlugosc(){
        double x1 = this.pkt1.getX();
        double x2 = this.pkt2.getX();
        double odlX = Math.pow(x1-x2,2);

        double y1 = this.pkt1.getY();
        double y2 = this.pkt2.getY();
        double odlY = Math.pow(y1-y2,2);

        return Math.sqrt(odlX + odlY);
    }

    public void przesun(Wektor v){
        this.pkt1.setX(this.pkt1.getX()+v.dx);
        this.pkt1.setY(this.pkt1.getY()+v.dy);

        this.pkt2.setX(this.pkt2.getX()+v.dx);
        this.pkt2.setY(this.pkt2.getY()+v.dy);
    }

    public void odbij(Prosta p){
        double a1 = -p.b;
        double b1 = -p.a;
        double c1 = -this.pkt1.getX()*a1 - this.pkt1.getY()*b1;

        Prosta temp1 = new Prosta(a1,b1,c1);
        Punkt przeciecie1 = Prosta.punktPrzeciecia(temp1, p);
        Wektor v1 = Wektor.zlozonyW(this.pkt1, przeciecie1);
        this.pkt1.setX(this.pkt1.getX()+2*v1.dx);
        this.pkt1.setY(this.pkt1.getY()+2*v1.dy);

        double a2 = a1;
        double b2 = b1;
        double c2 = -this.pkt2.getX()*a2 - this.pkt1.getY()*b2;

        Prosta temp2 = new Prosta(a2,b2,c2);
        // if(Prosta.czyProstopadle(temp2, p)){
        //     this.pkt2.setX((temp2.c-p.c)/(p.a-temp2.a));
        //     this.pkt2.setY(this.pkt2.getX()*temp2.a+temp2.c);
        // } else {
        //     System.err.println("Prosta odbicia nie jest prostopadła 2");
        // }
        Punkt przeciecie2 = Prosta.punktPrzeciecia(temp2, p);
        Wektor v2 = Wektor.zlozonyW(this.pkt2, przeciecie2);
        this.pkt1.setX(this.pkt1.getX()+2*v2.dx);
        this.pkt1.setY(this.pkt1.getY()+2*v2.dy);
    }
}