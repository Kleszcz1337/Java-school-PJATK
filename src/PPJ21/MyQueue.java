package PPJ21;

public class MyQueue {
    private Node head = null;

    public void push(Student data){
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
