package PPJ23.Zadanie_02;

public class Telefon {
    private String interfejsKomunikacyjny;
    private String color;

    public Telefon(){
        this.interfejsKomunikacyjny = "Łende lende";
        this.color = "black";
    }

    public void zadzwon(String numer){
        System.out.println("Dzwonimy pod nr: " + numer);
    }
}
