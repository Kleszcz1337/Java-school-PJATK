package PPJ21;

public class Student {
    int sNumber;
    String name;

    public Student(int sNumber, String name){
        this.sNumber = sNumber;
        this.name = name;
    }

    public void show(){
        System.out.println("Numer studenta: " + sNumber + "jego imie: " + name);
    }
}
