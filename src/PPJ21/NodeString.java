package PPJ21;

public class NodeString {
    String data;
    NodeString next;

    public NodeString(String data, NodeString next) {
        this.data = data;
        this.next = next;
    }

    public NodeString(String data) {
        this(data,null);
    }

    String getData(){
        return data;
    }

    NodeString getNext(){
        return next;
    }
}
