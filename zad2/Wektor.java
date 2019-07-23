package geometria;

public class Wektor{
    public final double dx;
    public final double dy;

    public Wektor(double x,double y){
        this.dx = x;
        this.dy = y;
    }

    public static Wektor zlozonyW(Punkt pkt1,Punkt pkt2){
        double odlX = pkt2.getX() - pkt1.getX();
        double odlY = pkt2.getY() - pkt1.getY();
        Wektor zlozony = new Wektor(odlX,odlY);
        return zlozony;
    }
}