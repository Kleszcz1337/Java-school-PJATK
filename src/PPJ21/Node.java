package PPJ21;

public class Node {
    Student data;
    Node next;

    public Node(Student data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(Student data) {
        this(data,null);
    }

    Student getData(){
        return data;
    }

    Node getNext(){
        return next;
    }
}
