package PPJ22;

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

    }
}
