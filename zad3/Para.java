package struktury;

public class Para{
    public final String klucz;
    private double wartość;

    public Para(String klucz,double wartosc){
        if( klucz.equals("") || klucz.equals(null)){
            // System.err.println("Pusty klucz!");
            this.klucz = "default";
            this.wartość = wartosc;
        } else {
            this.klucz = klucz;
            this.wartość = wartosc;
        }
    }

    public double getWart(){
        return this.wartość;
    }

    public void setWart(double nowaWart){
        this.wartość = nowaWart;
    }

    public boolean equals(Para para){
        if (this.klucz.equals(para.klucz)){
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        double wart = this.getWart();
        return Double.toString(wart);
    }

}