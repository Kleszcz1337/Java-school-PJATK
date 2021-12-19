package PPJ22.Zadanie_01;

public class Trojkat {
    private int bok;
    private int wysokosc;

    public Trojkat(int bok, int wysokosc){
        this.bok = bok;
        this.wysokosc = wysokosc;
    }

    public void show(){
        System.out.println("Bok trojkata: " + bok + " Wysokosc: " + wysokosc);
    }

    public int getBok(){
        return bok;
    }

    public int getWysokosc(){
        return wysokosc;
    }

    public int getPole(){
        int pole = bok*wysokosc/2;
        return pole;
    }

    public void showPoleTrojkat(){
        System.out.println("Pole trojkata: " + getPole());
    }
}
