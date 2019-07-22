// działa pomiędzy - 999 999 a 999 999

class Liczby{

    public static String jednosci[] = {"zero","jeden","dwa","trzy","cztery","pięć","sześć","siedem","osiem","dziewięć"};
    public static String nastki[] = {"dziesięć","jedenaście","dwanaście","trzynaście","czternaście","piętnaście","szesnaście","siedemnaście","osiemnaście","dziewiętaście"};
    public static String dziesiadki[] = {"","dziesięć","dwadzieścia","trzydziści","czterdzieści","pięćdziesiąt","sześćdziesiąt","siedemdziesiąt","osiemdziesiąt","dziewiędziesiąt"};
    public static String setki[] = {"","sto","dwieście","trzysta","czterysta","pięćset","sześćset","siedemset","osiemset","dziewięćset"};
    
    public static void fun(int x){
        if(x >= 0 && x < 10){
            System.out.printf(Liczby.jednosci[x]);
        } else if(x > 9 && x < 20) {
            System.out.printf(Liczby.nastki[x-10]);
        } else if(x > 19 && x < 100) {
            int nDziesiadki = x/10;
            if(x%10 == 0){
                System.out.printf(Liczby.dziesiadki[nDziesiadki]);
            } else {
                System.out.printf(Liczby.dziesiadki[nDziesiadki]+" "+Liczby.jednosci[x-(10*nDziesiadki)]);
            }
        } else if(x > 99 && x < 1000){
            int nSetki = x/100;
            int nDziesiadki = x/10;
            if(x%10 == 0){
                System.out.printf(Liczby.setki[nSetki]+" "+Liczby.dziesiadki[nDziesiadki-10*nSetki]);
            } else if(x%100 > 0 && x%100 <10){
                System.out.printf(Liczby.setki[nSetki]+" "+Liczby.jednosci[x-(10*nDziesiadki)]);
            } else if(x%100 > 9 && x%100 < 20){
                System.out.printf(Liczby.setki[nSetki]+" "+Liczby.nastki[(x-100*nSetki)-10]);
            } else {
                System.out.printf(Liczby.setki[nSetki]+" "+Liczby.dziesiadki[(x-(100*nSetki))/10]+" "+Liczby.jednosci[x-(10*nDziesiadki)]);
            }
        }
    }

    public static void main(String[] args){

        for(String liczba:args){
            try{
                int x = Integer.parseInt(liczba);
                System.out.println(x);
                if(x<0){
                    System.out.printf("minus ");
                    x = Math.abs(x);
                }
                if (x < 1000){
                    fun(x);
                    System.out.printf("%n");
                } else if(x > 999 && x < 10000000) {
                    int nTysiace = x/1000;
                    if (nTysiace == 1){
                        System.out.printf("tysiąc");
                    } else{
                        fun(nTysiace);
                        if (nTysiace > 1 && nTysiace < 5){
                            System.out.printf(" tysiące");
                        } else if (nTysiace > 4 && nTysiace < 20){
                            System.out.printf(" tysięcy");
                        } else if (nTysiace > 20 && nTysiace < 100){
                            if (nTysiace%10 > 1 && nTysiace%10 < 5){
                                System.out.printf(" tysiące");
                            } else {
                                System.out.printf(" tysięcy");
                            }
                        } else {
                            if (nTysiace%100 > 1 && nTysiace%100 < 5){
                                System.out.printf(" tysiące");
                            } else {
                                System.out.printf(" tysięcy");
                            }
                        }
                    }
                    System.out.printf(" ");
                    fun(x-nTysiace*1000);
                    System.out.printf("%n");
                }
                else if (x > 999999){
                    System.out.println("Za duża liczba");
                }
            }
            catch(NumberFormatException e){
                System.err.println("Number Format Exception");
            }
            System.out.println("-------------------------------");
        }
    }
}