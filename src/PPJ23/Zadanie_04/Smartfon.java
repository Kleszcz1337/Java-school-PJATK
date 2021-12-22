package PPJ23.Zadanie_04;

import PPJ23.Zadanie_03.Komorka;

public class Smartfon extends Komorka {

    private Osoba[] arrOfContact;

    public Smartfon(String interfejsKomorkowy, String color, Osoba[] arrOfContact) {
        super(interfejsKomorkowy, color);
        this.arrOfContact = arrOfContact;
    }

    public void wyswietlHistoriePolaczen() {
        System.out.println("Historia ostatnich " + ostatniePolaczenia.length + " polaczen telefonicznych");
        for(int i = 0; i < ostatniePolaczenia.length; i++) {
            if (ostatniePolaczenia[i] == null) {
                System.out.println("Brak polaczenia");
                continue; //przeskakuje nam pozostale instrukcje w tym okrążeniu petli
            }
            boolean czyWypisacSamNumer = true;
            for(int j = 0; j < arrOfContact.length; j++) {
                if (ostatniePolaczenia[i] == arrOfContact[j].numer) {
                    System.out.println("Polaczenie do: " + arrOfContact[j].imie + " " + arrOfContact[j].nazwisko + " : " + arrOfContact[j].numer);
                    czyWypisacSamNumer = false;
                }
            }
            if(czyWypisacSamNumer)
                System.out.println("Polaczenie do: " + ostatniePolaczenia[i]);
        }
    }

    public String getOsobaNumber() {  //zwraca nam numer losowej osoby
        return arrOfContact[(int)(Math.random()*arrOfContact.length)].numer;
    }
}
