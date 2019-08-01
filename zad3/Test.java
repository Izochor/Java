import struktury.Para;
import struktury.Zbior;
import struktury.ZbiorNaTablicy;

public class Test{
    public static void main(String args[]) {
        double x = 5;
        double y = 4;
        // double z = 3.14;
        String k = "kluczyk";
        // String k2 = "key";
        Para p = new Para(k,x);
        Para p2 = new Para(k,y);
        System.out.println(p.toString());
        System.out.println(p.equals(p2));
        System.out.println("---ZbiorNaTablicy---");
        Zbior zbiorek1 = new ZbiorNaTablicy(3);
        System.out.println("------");
        // Zbior zbiorek2 = new ZbiorNaTablicy(1);
        System.out.println("Zbiorek1 ma tyle rzeczy w sobie: "+zbiorek1.ile());
        try{
            zbiorek1.wstaw(p);
        }
        catch (IllegalArgumentException e){
            System.out.println("catch");
        }
        System.out.println("Zbiorek1 ma tyle rzeczy w sobie: "+zbiorek1.ile());
        try{
            Para nowa = zbiorek1.szukaj(k);
            System.out.println("szukaj: "+nowa.toString());
        }
        catch (NullPointerException e){
            System.err.println("catch");
        }
        try{
            double liczba = zbiorek1.czytaj(k);
            System.out.println("czytaj: "+liczba);
        }
        catch (IllegalArgumentException e){
            System.err.println("catch");
        }
        zbiorek1.czysc();
        System.out.println("Zbiorek1 ma tyle rzeczy w sobie: "+zbiorek1.ile());
        try{
            zbiorek1.ustaw(p2);
        }
        catch (IllegalArgumentException e){
            System.out.println("catch");
        }
        System.out.println("Zbiorek1 ma tyle rzeczy w sobie: "+zbiorek1.ile());

     }
}