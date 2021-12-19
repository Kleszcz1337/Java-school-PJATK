package PPJ22.Zadanie_01;

public class Ostroslup extends Trojkat{
    int wysokoscOstroslupa;

    public Ostroslup(int bok, int wysokosc, int wysokoscOstroslupa){
        super(bok, wysokosc);
        this.wysokoscOstroslupa = wysokoscOstroslupa;
    }
    public void showPole(){
        System.out.println("Pole Ostroslupa: " + getPole() * 4);
    }

    public void showObj(){
        showPoleTrojkat();
        System.out.println("objetosc: " + getPole()/3*wysokoscOstroslupa);
    }

}
