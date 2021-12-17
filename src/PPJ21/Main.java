package PPJ21;

public class Main {
    public static void main(String[] args){

        //zad1
        Student michal = new Student(24643, "Michal");
        Student piotrek = new Student(32321, "Piotr");

        MyStack stos1 = new MyStack(); //deklarujemy nasz stos z jego wielkoscia

        stos1.push(michal);
        stos1.push(piotrek);

        while(!stos1.empty()){
            stos1.pop().show(); //Wyrzucamy po kolei studentow i wypisujemy ich metode show
        }                       //Jak wyrzucimy juz studentow to nie będzie ich dalej w naszym stosie

        //zad1 cz.2
        System.out.println("zad1 cz.2 ==================");
        MyStackArr stos2 = new MyStackArr(2);
        Student seba = new Student(32131, "Sebastian");
        Student milosz = new Student(34543, "Miłosz");
        stos2.push(seba);
        stos2.push(milosz);

        while(!stos2.empty()){
            stos2.pop().show();
        }

    }
}
