package struktury;

public class ZbiorNaTablicy extends struktury.Zbior{

    public ZbiorNaTablicy(int rozmiar){
        super(rozmiar);
    }

    public Para szukaj(String k) throws NullPointerException{
        Para nowa = new Para(k,0);
        for (int i = 0; i<this.rozmiar;i++){
            if(this.tablicaPar[i].equals(nowa)){
                return this.tablicaPar[i];
            }
        }
        return null;
    }

    /** metoda ma wstawiać do zbioru nową parę */
    public void wstaw (Para p) throws IllegalArgumentException{
        for(int i =0; i<this.rozmiar; i++){
            if(this.tablicaPar[i] == null) {
                this.tablicaPar[i] = new Para(p.klucz,p.getWart());
                break;
            }
        }
    }

    public double czytaj (String k) throws IllegalArgumentException{
        try {
            Para szukana = szukaj(k);
            return szukana.getWart();
        } 
        catch (NullPointerException e)
        {
            System.err.println("catch");
            return -1;
        }
    }

    /** metoda ma wstawić do zbioru nową albo zaktualizować parę */
    public void ustaw (Para p) throws IllegalArgumentException{      
        if(szukaj(p.klucz) != null) {
            for(Para i : this.tablicaPar){
                if(i.equals(p.klucz)) i.setWart(p.getWart());
            }
        } else {
            try{
                wstaw(p);
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("catch");
            }
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

    public boolean zapelnione(){
        for(Para p : this.tablicaPar){
            if (p != null) return false;
        }
        return true;
    }
}