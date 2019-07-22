package geometria;

public class Wektor{
    public final double dx;
    public final double dy;

    public Wektor(double x,double y){
        this.dx = x;
        this.dy = y;
    }

    public static Wektor zlozonyW(Punkt pkt1,Punkt pkt2){
        double x1 = pkt1.getX();
        double y1 = pkt1.getY();
        double x2 = pkt2.getX();
        double y2 = pkt2.getY();
        double odlX = Math.sqrt(Math.pow(x1-x2,2));
        double odlY = Math.sqrt(Math.pow(y1-y2,2));
        Wektor zlozony = new Wektor(odlX,odlY);
        return zlozony;
    }
}