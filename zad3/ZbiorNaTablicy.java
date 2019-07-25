package struktury;

public class ZbiorNaTablicy extends struktury.Zbior{
    int rozmiar;

    public ZbiorNaTablicy(int rozmiar){
        super(rozmiar);
    }

    public Para szukaj(String k) throws Exception{
        for (int i = 0; i<this.rozmiar;i++){
            if(this.tablicaPar[i].equals(k)){
                return this.tablicaPar[i];
            }
        }
        throw new IllegalArgumentException();
    }

    /** metoda ma wstawiać do zbioru nową parę */
    public void wstaw (Para p) throws Exception{
        if(szukaj(p.klucz) != null) throw new IllegalArgumentException("Już jest taki klucz");
        for(Para i : this.tablicaPar){
            if(i.klucz == null) i = p;
        }
    }

    public double czytaj (String k) throws Exception{
        Para szukana = szukaj(k);
        if (szukana == null) throw new IllegalArgumentException();
        return szukana.getWart();
    }

    /** metoda ma wstawić do zbioru nową albo zaktualizować parę */
    public void ustaw (Para p) throws Exception{      
        if(szukaj(p.klucz) != null) {
            for(Para i : this.tablicaPar){
                if(i.klucz == p.klucz) i.setWart(p.getWart());
            }
        } else {
            for(Para i : this.tablicaPar){
                if(i == null) i = p;
            }
        } 
        if(this.zapelnione()) throw new IllegalArgumentException();
    }

    public void czysc(){
        ZbiorNaTablicy nowy = new ZbiorNaTablicy(this.rozmiar);
        this.tablicaPar = nowy.tablicaPar;
    }

    public int ile (){
        int nPary = 0;
        for(Para p : this.tablicaPar){
            if(p.klucz != null) nPary += 1;
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