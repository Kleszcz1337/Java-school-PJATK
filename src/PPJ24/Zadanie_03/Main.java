package PPJ24.Zadanie_03;

public class Main {
    public static void main(String[] args) {
        Rakieta apollo11 = new Rakieta("Apollo 11", 0);

        int i = 0;
        while(true) {
            try {
                apollo11.start();
                System.out.println("Wystartowała po " + i + " zatankowaniach");   //ta linia wykona sie dopiero jak nie wyrzuci nam wyjatku!!!
                break;                                                          //break jest potrzebny do zatrzymania petli xD
            } catch (NotEnoughFuel ex) {                                        // ewentualnie mozna zastosowac getter wagapaliwa w while, ale wtedy wyjatek traci sens
                System.out.println(ex);
                apollo11.zatankuj();
                i++;
            }
        }
    }
}
