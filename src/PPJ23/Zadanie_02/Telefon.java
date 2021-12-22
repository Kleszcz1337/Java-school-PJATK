package PPJ23.Zadanie_02;

public class Telefon {
    private String interfejsKomunikacyjny;
    private String color;

    public Telefon(String interfejsKomunikacyjny, String color){
        this.interfejsKomunikacyjny = interfejsKomunikacyjny;
        this.color = color;
    }

    public void zadzwon(String numer){
        System.out.println("Dzwonimy pod nr: " + numer);
    }

    public void wyswietlHistoriePolaczen(){
        System.out.println("brak historii");
    }
}
