package PPJ18;

//2021-12-03 - PPJ18
public class Main {
    public static void main(String[] args){
        Person Adam = new Person();
        Adam.name = "Adam";
        Adam.surname = "Kowalski";
        Adam.birthyear = 2002;

        Fruit Mango = new Fruit("Mango");
        Mango.show();

        Ballon balon1 = new Ballon();
        Donkey Osiol = new Donkey();

        Osiol.addBaloon(balon1);
        //isflying oczywiście da nam false, bo jeden balon nie wystarczy
        System.out.println(Osiol.isFlying());

        //pętlujemy tak długo aż isflying da nam true
        //czyli kiedy masa osla bedzie mniejsza od balonow
        while(!Osiol.isFlying()){
            Ballon balonPetla = new Ballon();
            Osiol.addBaloon(balonPetla);
        }   //potem po prostu wypisujemy, bo jak petla sie udala
            System.out.println("Ja latam! ");

        //zad5
        Point2D punktNr1 = new Point2D();
        int[] pointsArray = {3,2};
        punktNr1.set(pointsArray);
        System.out.println(punktNr1.get());
    }
}
