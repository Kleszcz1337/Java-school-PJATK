package PPJ23.Zadanie_01;

public class Drzewo {
    private String name;
    private int age;

    public Drzewo(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return super.toString() + " Specyfikacja: " + name + " " + age;
    }

    public static Owoc zerwijOwoc(){
        if(Math.random()<0.33)
            return new Gruszka();
        else if(Math.random()<0.66)
            return new Jablko();
        else
            return new Pomarancza();
    }
}
