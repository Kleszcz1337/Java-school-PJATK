package PPJ23.Zadanie_03;
import PPJ23.Zadanie_02.Telefon;

public class Komorka extends Telefon {
    protected String[] ostatniePolaczenia = new String[10];
    private int licznik1 = 0; //licznik do indeksowania numerow

    public Komorka(String interfejsKomunikacyjny, String color){
        super(interfejsKomunikacyjny, color);
    }

    public void zadzwon(String number){
        System.out.println("Dzwonimy pod nr: " + number);
        if(licznik1 == ostatniePolaczenia.length)
            licznik1 = 0;
        else {
            ostatniePolaczenia[licznik1] = number;
            licznik1++;
        }
    }

    public void wyswietlHistoriePolaczen(){
        System.out.println("Historia ostatnich " + ostatniePolaczenia.length + " polaczen telefonicznych");
        for(String i : ostatniePolaczenia)
            System.out.println("Polaczenie do: " + (i==null ? "Brak polaczenia" : i));
        System.out.println();
    }
}
