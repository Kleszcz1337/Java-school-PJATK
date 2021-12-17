package PPJ21;

public class MyStackArr {
    private Student[] studentArr;
    private int licznik1 = 0;
    private int sizeOfStack;

    public MyStackArr(int sizeOfStack){
        this.studentArr = new Student[sizeOfStack];
        this.sizeOfStack = sizeOfStack;
    }

    public void push(Student data){
        if(licznik1 >= sizeOfStack) {
            System.out.println("Nie możesz dodac wiecej elementow");
        }
        else {
            studentArr[licznik1] = data;
            licznik1++;
        }
    }

    public Student pop(){
        Student student = studentArr[licznik1-1];
        studentArr[licznik1] = null;
        licznik1--;
        return student;
    }

    public boolean empty(){
        return studentArr[0] == null;
    }
}