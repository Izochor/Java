import struktury.Para;

public class Test{
    public static void main(String args[]) {
        double x = 5;
        double y = 4;
        String k = "f";
        Para p = new Para(k,x);
        Para p2 = new Para(k,y);
        System.out.println(p.toString());
        System.out.println(p.equals(p2));
     }
}