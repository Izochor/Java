package struktury;

public class ZbiorNaTablicy extends struktury.Zbior{

    public ZbiorNaTablicy(int rozmiar){
        super(rozmiar);
    }

    public Para szukaj(String k) throws NullPointerException{
        Para nowa = new Para(k,0);
        for (int i = 0; i < this.ile();i++){
            if(this.tablicaPar[i].equals(nowa)){
                return this.tablicaPar[i];
            }
        }
        return null;
    }

    /** metoda ma wstawiać do zbioru nową parę */
    public void wstaw (Para p) throws IllegalArgumentException{
        if (this.ile() != this.rozmiar){
            if(this.szukaj(p.klucz) != null){
                System.err.println("Jest już taki klucz!");
            } else {
                for(int i =0; i < this.rozmiar; i++){
                    if(this.tablicaPar[i] == null) {
                        this.tablicaPar[i] = new Para(p.klucz,p.getWart());
                        break;
                    }
                }
            }
        } else {
            System.err.println("Zbiór jest pełny!");
        }
    }

    /** metoda ma odszukać parę i zwrócić wartość związaną z kluczem */
    public double czytaj (String k) throws IllegalArgumentException{
        try {
            Para szukana = szukaj(k);
            return szukana.getWart();
        } 
        catch (NullPointerException e)
        {
            System.err.println("Null Pointer czytaj");
            return -1;
        }
    }

    /** metoda ma wstawić do zbioru nową albo zaktualizować parę */
    public void ustaw (Para p) throws IllegalArgumentException{      
        try{
            if (this.szukaj(p.klucz) != null){
                for(Para i : this.tablicaPar){
                    if(i.equals(p)) {
                        i.setWart(p.getWart());
                        break;
                    }
                }
            } else {
                wstaw(p);
            }

        }
        catch (IllegalArgumentException e){
            System.err.println("Illegal Argument ustaw");
        }
        catch (NullPointerException e){
            System.err.println("Null Pointer ustaw");
        } 
    }

    public void czysc(){
        ZbiorNaTablicy nowy = new ZbiorNaTablicy(this.rozmiar);
        this.tablicaPar = nowy.tablicaPar;
    }

    public int ile (){
        int nPary = 0;
        for(Para p : this.tablicaPar){
            if(p != null) nPary += 1;
        }
        return nPary;
    }
}