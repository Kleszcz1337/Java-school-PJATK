package PPJ19;

public class KulaNa {
    private double radius;

    public KulaNa(Kwadrat a){
        this.radius = (a.getSide() * Math.sqrt(3)) / 2;
    }

    public KulaNa(Walec a){
        //4 * kwadrat promienia walca + kwadrat wysokości i ze wszstykiego pierwaistek / 2
        this.radius = Math.sqrt(4*a.getRadius()+a.getHeight())/2;
    }

    public void show(){
        System.out.println("Promień to: " + radius);
    }
}
