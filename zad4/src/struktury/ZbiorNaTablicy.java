package struktury;

/**Implementacja Zbioru na Tablicy*/
public class ZbiorNaTablicy extends Zbior{

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
            throw new IllegalArgumentException("Tablica jest zapełniona");
        }
    }

    /** metoda ma odszukać parę i zwrócić wartość związaną z kluczem
     * @param k klucz, któego wartość chcemy znaleźć
     * @return wartość pary o kluczu k
     */
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
        this.tablicaPar = new Para[this.rozmiar];
    }

    public int ile (){
        int nPary = 0;
        for(Para p : this.tablicaPar){
            if(p != null) nPary += 1;
        }
        return nPary;
    }
}