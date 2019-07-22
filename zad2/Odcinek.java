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
}