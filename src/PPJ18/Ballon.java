package PPJ18;

public class Ballon {
    double hel;

    public Ballon(){
        this.hel = Math.random()*0.004 + 0.005;
    }

    public double getLoad(){
        return ((6*hel)/0.007)/1000; //dzielimy na 1000 żeby uzyskać wage
    }                                // w kg, zamiast gramach
}
