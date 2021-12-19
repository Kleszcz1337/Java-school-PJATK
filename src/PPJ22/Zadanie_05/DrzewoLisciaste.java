package PPJ22.Zadanie_05;

import PPJ22.Zadanie_04.Drzewo;

public class DrzewoLisciaste extends Drzewo {
    int ksztaltLiscia;

    public DrzewoLisciaste(int wysokosc, String przekojDrzewa, int ksztalLiscia){
        super(false, wysokosc, przekojDrzewa);
        this.ksztaltLiscia = ksztalLiscia;
    }

    public String toString(){
        return super.toString() + "\nSzczegolowe informacje o drzewie lisciastym:\nKsztalt liscia: " + ksztaltLiscia;
    }
}
