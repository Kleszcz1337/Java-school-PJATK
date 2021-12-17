package PPJ22;

public class Prostokat {
    private int dlugosc;
    private int szerokosc;

    public Prostokat(int dlugosc, int szerokosc){
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public int getDlugosc(){
        return dlugosc;
    }

    public int getSzerokosc(){
        return szerokosc;
    }

    public void showPolePow(){
        int pole = dlugosc*szerokosc;
        System.out.println("Pole powierzchni: " + pole);
    }
}
