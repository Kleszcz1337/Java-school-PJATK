package PPJ22;

public class Prostopadloscian extends Prostokat {
    private int wysokosc;

    public Prostopadloscian(int a, int b, int wysokosc){
        super(a,b);                                         // super.dlugosc = a  i   super.szerokosc = b
        this.wysokosc = wysokosc;
    }

    public void showDane(){
        System.out.println("Wyokosc: " + wysokosc + " dlugosc podstawy: " + getDlugosc() + " szerokosc podstawy: " + getSzerokosc());
    }
}
