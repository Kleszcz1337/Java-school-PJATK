package PPJ24.Zadanie_02;

public class Alarm extends Exception{
    String powod;

    public Alarm(String powod){
        super(powod);
        this.powod = powod;
    }

    public String toString(){
        return powod;
    }
}
