package PPJ22;

import PPJ22.Zadanie_01.Graniastoslup;
import PPJ22.Zadanie_01.Ostroslup;
import PPJ22.Zadanie_01.Prostopadloscian;
import PPJ22.Zadanie_01.Trojkat;
import PPJ22.Zadanie_02.Osoba;
import PPJ22.Zadanie_02.Spawacz;
import PPJ22.Zadanie_03.CiagnikSiodlowy;
import PPJ22.Zadanie_04.Drzewo;
import PPJ22.Zadanie_05.DrzewoIglaste;
import PPJ22.Zadanie_05.DrzewoOwocowe;

public class Main {
    public static void main(String[] args) {
        //zad1
        Prostopadloscian prostopadloscian1 = new Prostopadloscian(10, 20, 40);
        prostopadloscian1.showDane();

        Ostroslup ostroslup1 = new Ostroslup(20,30,40);
        ostroslup1.showObj();

        Trojkat trojkat1 = new Trojkat(20,20);
        Graniastoslup graniastoslup1 = new Graniastoslup(20,20,20);
        trojkat1.showPoleTrojkat();
        graniastoslup1.showArea();
        graniastoslup1.showCapacity();

        //zad2
        Osoba jakub = new Osoba("Jakub");
        Spawacz milosz = new Spawacz("Milosz", 15);
        System.out.println(jakub.wyswietl());
        System.out.println(milosz.wyswietl());

        //zad3
        CiagnikSiodlowy traktorek = new CiagnikSiodlowy("Czerwony", 2, 24);
        traktorek.rozpocznijJazde();

        //zad4
        Drzewo kasztanowiec = new Drzewo(false, 20,"Poziomy");
        System.out.println(kasztanowiec + "\n");

        //zad5
        DrzewoIglaste sosna = new DrzewoIglaste(20,"Stare drzewo", 200000, 8.16);
        System.out.println(sosna);

        System.out.println();   //po prostu enter

        DrzewoOwocowe wisnia = new DrzewoOwocowe(20,"Duze", 5, "wisnia");
        System.out.println(wisnia);
    }
}
