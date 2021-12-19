package PPJ22.Zadanie_05;

import PPJ22.Zadanie_04.Drzewo;

public class DrzewoIglaste extends Drzewo {
    int iloscIgiel;
    double dlugoscSzyszki;

    public DrzewoIglaste(int wysokosc, String przekojDrzewa, int iloscIgiel, double dlugoscSzyszki){
        super(true, wysokosc, przekojDrzewa);
        this.iloscIgiel = iloscIgiel;
        this.dlugoscSzyszki = dlugoscSzyszki;
    }

    public String toString(){
        return super.toString() + "\nIglaste Info: \n" + "Ilosc igiel: " + iloscIgiel + "\nDlugosc szyszki: " + dlugoscSzyszki;
    }
}
