package PPJ19;

public class Walec {
    private double radius;
    private double height;

    public Walec(double a, double b){
        this.radius = a;
        this.height = b;
    }

    public double getHeight(){
        return  height;
    }

    public double getRadius(){
        return radius;
    }

    public void show(){
        double areaOfBase = Math.PI*(radius*radius);
        double capacityOfWalec = areaOfBase*height;

        System.out.println("Pole podstawy to: " + areaOfBase);
        System.out.println("Objętosc to: " + capacityOfWalec);
    }
}
