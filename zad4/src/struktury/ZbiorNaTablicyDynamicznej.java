package struktury;

/**Implementacja Zbioru na tablicy o zmiennej wielkości. Zapełnienie tablicy powoduje jej dwuktotne powiększenie.*/
public class ZbiorNaTablicyDynamicznej extends ZbiorNaTablicy{
    public ZbiorNaTablicyDynamicznej(){
        super(2);
    }

    @Override
    /** metoda ma wstawiać do zbioru nową parę, jeśli tablicaPar jest za mała jest powiększana dwuktotnie
     * @param p wstawiana para
    */
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
            this.rozmiar = 2*this.ile();
            Para[] temp = new Para[rozmiar];
            for(int i = 0; i< this.ile(); i++) {
                temp[i] = this.tablicaPar[i];
            }
            this.tablicaPar = temp;

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
        }
    }
}