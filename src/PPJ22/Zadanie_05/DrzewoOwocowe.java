package PPJ22.Zadanie_05;

import PPJ22.Zadanie_04.Drzewo;

public class DrzewoOwocowe extends DrzewoLisciaste{
    private String nazwaOwoca;

    public DrzewoOwocowe(int wyokosc, String przekrojDrzewa,int ksztalLiscia, String nazwaOwoca){
        super(wyokosc,przekrojDrzewa,ksztalLiscia);
        this.nazwaOwoca = nazwaOwoca;
    }

    public String toString() {
        return super.toString() + "\nInformacje o Owocu: \nNazwa owoca: " + nazwaOwoca;
    }
}
