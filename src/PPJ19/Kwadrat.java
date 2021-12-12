package PPJ19;

public class Kwadrat {
    private int side;

    //Konstuktor
    public Kwadrat(int a){
        this.side = a;
    }

    public int getSide(){
        return side;
    }

    public void show(){
        System.out.println("Pole kwadratu: " + side*side);
        System.out.println("Pole sześcianu: " + side*side*side);
    }
}
