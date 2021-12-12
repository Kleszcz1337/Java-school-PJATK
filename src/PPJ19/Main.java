package PPJ19;

//2021-12-07 - PPJ19
public class Main {
    public static void main(String[] args){

        //zad1
        Kwadrat kwadrat1 = new Kwadrat(5);
        kwadrat1.show();

        //zad2
        Walec walec1 = new Walec(3,5);
        walec1.show();

        //zad3
        KulaW kula1 = new KulaW(kwadrat1);
        kula1.show();

        //zad4
        KulaNa kula2 = new KulaNa(walec1);
        kula2.show();
    }
}
