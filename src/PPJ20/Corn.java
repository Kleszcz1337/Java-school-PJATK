package PPJ20;

public class Corn {
    int cornCount;

    public Corn(int cornCount){
        this.cornCount = cornCount;
    }

    public Popcorn[] makePopcorn(){
        Popcorn[] arr = new Popcorn[cornCount];
        for(int i = 0; i<arr.length; i++){
            arr[i] = new Popcorn();
        }
        return arr;
    }
}
