package PPJ20;

public class Element {

    private Element next;
    private int data;

    public Element(int data){
        this.data = data;
        this.next = null;
    }

    public void setNext(Element next){
        this.next = next;
    }

    public int getData(){
        return data;
    }

    public Element getNext(){
        return next;
    }
}
