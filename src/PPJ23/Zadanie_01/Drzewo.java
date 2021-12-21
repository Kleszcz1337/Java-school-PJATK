package PPJ23.Zadanie_01;

public class Drzewo {

    public static Owoc zerwijOwoc(){
        if(Math.random()<0.33)
            return new Gruszka();
        else if(Math.random()<0.66)
            return new Jablko();
        else
            return new Pomarancza();
    }
}
