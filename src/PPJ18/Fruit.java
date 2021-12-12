package PPJ18;

public class Fruit {
    String name;
    double weight;

    public Fruit(String nameWpisanie){
        this.name = nameWpisanie;
        this.weight = Math.random()*0.3+0.5;
    }

    public void show(){
        System.out.println("Nazwa owocu: " + name + ". Jego waga: " + weight);
    }

}
