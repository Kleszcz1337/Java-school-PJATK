package PPJ18;

public class Point2D {
    int x;
    int y;

    public void set(int[] arr){
        x = arr[0];
        y = arr[1];
    }

    public int[] get(){
        int[] arr = {x,y,1};
        return arr;
    }
}
