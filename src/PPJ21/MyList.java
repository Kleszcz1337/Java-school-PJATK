package PPJ21;

public class MyList {
    private Node head;

    public MyList() {
        head = null;
    }

    public void addFront(Student data) {
        head = new Node(data,head);
    }

    public void addBack(Student data){
        if (head == null) {
            addFront(data);
            return;
        }
        Node tmp = head;

        while(tmp.next != null)
            tmp = tmp.next;

        tmp.next = new Node(data);
    }


    public void showList() {
        System.out.print("[ ");
    }
}