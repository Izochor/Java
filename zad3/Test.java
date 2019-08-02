import struktury.Para;
import struktury.Zbior;
import struktury.ZbiorNaTablicy;

public class Test{
    public static void main(String args[]) {
        double x = 5;
        double y = 4;
        double z = 3.14;
        String k = "kluczyk";
        String k2 = "key";
        String k3 = "Włodek";
        String k4 = "Zbyszek";
        Para p = new Para(k,x);
        Para p2 = new Para(k,y);
        Para p3 = new Para(k2,x);
        Para p4 = new Para(k3,z);
        Para p5 = new Para(k4,z);
        System.out.println(p.toString());
        System.out.println(p.equals(p2));
        System.out.println("---ZbiorNaTablicy---");
        Zbior zbiorek1 = new ZbiorNaTablicy(3);
        System.out.println("------");
        // Zbior zbiorek2 = new ZbiorNaTablicy(1);
        System.out.println("Zbiorek1 ma tyle rzeczy w sobie(0): "+zbiorek1.ile());
        try{
            zbiorek1.wstaw(p);
            System.out.println("Zbiorek1 ma tyle rzeczy w sobie(1): "+zbiorek1.ile());
            Para nowa = zbiorek1.szukaj(k);
            System.out.println("szukaj: "+nowa.toString());
            double liczba = zbiorek1.czytaj(k);
            System.out.println("czytaj: "+liczba);
            zbiorek1.czysc();
            System.out.println("Zbiorek1 ma tyle rzeczy w sobie(0): "+zbiorek1.ile());
            zbiorek1.ustaw(p2);
            liczba = zbiorek1.czytaj(k);
            System.out.println("czytaj: "+liczba);
            System.out.println("Zbiorek1 ma tyle rzeczy w sobie(1): "+zbiorek1.ile());
            zbiorek1.ustaw(p);
            System.out.println("Zbiorek1 ma tyle rzeczy w sobie(1): "+zbiorek1.ile());
            liczba = zbiorek1.czytaj(k);
            System.out.println("czytaj: "+liczba);
            zbiorek1.wstaw(p3);
            zbiorek1.wstaw(p3);
            zbiorek1.wstaw(p4);
            System.out.println("Zbiorek1 ma tyle rzeczy w sobie(3): "+zbiorek1.ile());
            zbiorek1.wstaw(p5);
        }
        catch (IllegalArgumentException e){
            System.out.println("Illegal Argument main");
        }
        catch (NullPointerException e){
            System.err.println("Null Pointer main");
        }
        System.out.println("Zbiorek1 ma tyle rzeczy w sobie(1): "+zbiorek1.ile());

     }
}