package geometria;

public class Punkt{
    private double x;
    private double y;

    public Punkt(double wspol1,double wspol2){
        this.x = wspol1;
        this.y = wspol2;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public void setX(double dx){
        this.x = dx;
    }

    public void setY(double dy){
        this.y = dy;
    }
}