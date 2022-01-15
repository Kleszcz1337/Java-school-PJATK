package PPJ24.Zadanie_02;

public class Main {
    public static void main(String[] args) throws Alarm {

        int procentDymu = 51;
        int procentDymu2 = 22;

        try{
            DetektorDymu.sprawdz(procentDymu);
        } catch (Alarm e){
            System.out.println(e);
        }

    }
}
