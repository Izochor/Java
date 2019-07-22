import geometria.Punkt;
import geometria.Wektor;
import geometria.Odcinek;
import geometria.Prosta;

public class test{
    public static void main(String args[]){
        Punkt a = new Punkt(1,1);
        Punkt b = new Punkt(1,0);
        Punkt c = new Punkt(0,0);
        
        System.out.println("---Punkty---");
        System.out.println("Punkt A: "+a.getX()+" "+a.getY());
        System.out.println("Punkt B: "+b.getX()+" "+b.getY());
        System.out.println("Punkt C: "+c.getX()+" "+c.getY());

        Odcinek bc = new Odcinek(b, c);
        System.out.println("---Odcinek---");
        System.out.println("Punkt B: "+b.getX()+" "+b.getY());
        System.out.println("Punkt C: "+c.getX()+" "+c.getY());
        Wektor v1 = new Wektor(1, 0);
        bc.przesun(v1);
        System.out.println("Przesunięcie o wektor v(1,0)");
        System.out.println("Punkt B: "+b.getX()+" "+b.getY());
        System.out.println("Punkt C: "+c.getX()+" "+c.getY());
        Prosta p1 = new Prosta(1,1,0);
        bc.odbij(p1);
        System.out.println("Odbicie względem prostej 1x+0y+0=0");
        System.out.println("Punkt B: "+b.getX()+" "+b.getY());
        System.out.println("Punkt C: "+c.getX()+" "+c.getY());
    }
}