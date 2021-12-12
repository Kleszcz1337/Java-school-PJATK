package PPJ19;

public class KulaW {
    private double promienKuli;

    //kula mieści sie w walcu jak promien to wysokość/2
    public KulaW(Kwadrat kwadratA){
        this.promienKuli = kwadratA.getSide()/2;
    }

    public KulaW(Walec walecA){
        this.promienKuli = walecA.getHeight()/2;
    }

    public void show(){
        System.out.println("Promien kuli to: " + promienKuli);
    }
}
