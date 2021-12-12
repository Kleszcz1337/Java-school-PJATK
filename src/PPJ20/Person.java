package PPJ20;

public class Person {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person(String name){
        this.name = name;
        this.birthYear = 1990;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return 2021-birthYear;
    }

    public static Person getOlder(Person a, Person b){
        if(a.getAge() > b.getAge())
            return  a;
        else
            return b;
    }

    public static Person getOldest(Person[] arrOfPeople){
        Person Najstarsza = arrOfPeople[0];
        for(int i=0; i<arrOfPeople.length; i++){
            if(Najstarsza.getAge() < arrOfPeople[i].getAge())
                Najstarsza = arrOfPeople[i];
        }
        return Najstarsza;
    }

    public static void sort(Person[] arr){
        Person temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if(arr[j-1].getAge() > arr[j].getAge()){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
