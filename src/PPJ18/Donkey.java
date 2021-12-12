package PPJ18;

public class Donkey {
    private double mass = 0.12;
    Ballon[] arr = new Ballon[1];
    //tworzymy pier tablice z jednym miejscem żeby wgl do czegoś się odwoływać

    public void addBaloon(Ballon a){
        if(arr[0] == null)  //jak stworzyliśmy tablice z jednym miejscem to jest ono puste
            arr[0] = a;     //dlatego musimy wpisać "recznie" wartość zeby dalszy kod zadzialal
        else{
            Ballon[] tmpArr = new Ballon[arr.length + 1]; //zawsze tworzymy nowa tablice o jedno pole więcej
            for (int i = 0; i < arr.length; i++)
                tmpArr[i] = arr[i]; //przypisujemy elementy do tymaczasowej tablicy
            arr = tmpArr; //a teraz nadpisujemy stara tablice nowa
            arr[arr.length-1] = a; //dodadkowo musimy dopisać nowy element na samym końcu tablicy
        }
    }

    public boolean isFlying(){
        double load = 0;
        for(int i=0; i<arr.length; i++)
            load += arr[i].getLoad();
        return load>mass; //load>mass zwraca nam true albo false, bez żadnych if'ów
    }
}
