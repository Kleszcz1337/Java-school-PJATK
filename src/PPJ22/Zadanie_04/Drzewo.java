package PPJ22.Zadanie_04;

public class Drzewo {
    private boolean wiecznieZielone;
    int wysokosc;
    String przekrojDrzewa;

    public Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa){
        this.wiecznieZielone = wiecznieZielone;
        this.wysokosc = wysokosc;
        this.przekrojDrzewa = przekrojDrzewa;
    }

    public String toString(){
        return "Adres naszego drzewa " + super.toString() + "\nOgolne informacje o Drzewie:\nCzy wiecznie zielone? " + wiecznieZielone + "\nWysokosc: " + wysokosc;
    }
}
