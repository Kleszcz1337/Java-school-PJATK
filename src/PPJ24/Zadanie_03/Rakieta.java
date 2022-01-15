package PPJ24.Zadanie_03;

public class Rakieta {
    String nazwa;
    int wagaPaliwa;

    public Rakieta(String nazwa, int wagaPaliwa){
        this.nazwa = nazwa;
        this.wagaPaliwa = wagaPaliwa;
    }

    public void zatankuj(){
        wagaPaliwa += (int)(Math.random()*100);
    }

    public void start() throws NotEnoughFuel{
        if(wagaPaliwa < 1000)
            throw new NotEnoughFuel();
    }
}
