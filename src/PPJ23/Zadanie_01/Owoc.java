package PPJ23.Zadanie_01;

public class Owoc {
    private String nazwa;
    private double masa;

    public Owoc(String nazwa){
        this.nazwa = nazwa;
        this.masa = (Math.random()*(150)+100) / 1000;
    }

    public double getMasa(){
        return masa;
    }

    public String getNazwa(){
        return nazwa;
    }
}
