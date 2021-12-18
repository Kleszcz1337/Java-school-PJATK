package PPJ22;

public class PojazdKolowy extends Pojazd{
    private final int iloscOsi;

    public PojazdKolowy(String color,int iloscOsi){
        super(color);
        this.iloscOsi = iloscOsi;
    }

    public int getIloscOsi(){
        return iloscOsi;
    }
}
