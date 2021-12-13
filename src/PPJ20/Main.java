package PPJ20;

//2021-12-10 - PPJ20
public class Main {
    public static void main(String[] args) {


        //zad1
        Corn corn1 = new Corn(20);
        Popcorn[] arrTest = corn1.makePopcorn();
        System.out.println(arrTest.length);

        //zad2
        Person osobaA = new Person("Piotrek", 2001);
        Person osobaB = new Person("Michal", 2002);
        Person osobaC = new Person("Maciek", 1999);
        Person osobaD = new Person("Paweł", 2003);

        Person[] tablicaLudzi = {osobaA, osobaB, osobaC, osobaD};
        Person.sort(tablicaLudzi);
        for(Person i : tablicaLudzi)
            System.out.println( i.getName() );

        //zad3
        Word test1 = new Word();
        test1.addChar('b');
        test1.show();
        System.out.println(test1.getLength());

        //zad4
        Phrase objtest = new Phrase();
        objtest.addWordAtEnd("owaowa");
        objtest.addWordAtEnd("owa");
        objtest.addWordAtEnd("awa");

        objtest.show();
    }
}
