package PPJ22;

public class Graniastoslup extends Trojkat{
    private int wyokoscGraniastoslupa;

    public Graniastoslup(int bok, int wysokosc, int wyokoscGraniastoslupa){
        super(bok,wysokosc);
        this.wyokoscGraniastoslupa = wyokoscGraniastoslupa;
    }

    public void showArea(){
        int area = 2*getBok() + getBok()*getWysokosc()*3;
        System.out.println("Pole Graniastoslupa to: " + area);
    }

    public void showCapacity(){
        int capacity = getPole()*getWysokosc();
        System.out.println("Objetosc graniastoslupa to: " + capacity);
    }
}
