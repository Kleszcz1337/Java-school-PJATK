package PPJ22.Zadanie_02;

public class Spawacz extends Osoba{
    private int stazpracy;

    public Spawacz(String imie, int stazpracy){
        super(imie);
        this.stazpracy = stazpracy;
    }

    public String wyswietl(){
        return super.wyswietl() + " " + stazpracy;
    }
}
