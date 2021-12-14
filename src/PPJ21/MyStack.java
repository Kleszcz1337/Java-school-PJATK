package PPJ21;

public class MyStack {
    private Node head = null;
    private int licznik1 = 0;
    private int sizeOfStack;

    public MyStack(int sizeOfStack){
        this.sizeOfStack = sizeOfStack;
    }

    public void push(Student data){
        if(licznik1++ > sizeOfStack)
            System.out.println("Nie możesz dodac wiecej elementow - MyStackArr");
        else
            head = new Node(data, head);
    }

    public Student pop(){
        Student d = head.getData();
        head = head.getNext();
        return  d;
    }

    public boolean empty(){
        return head == null;
    }
}
