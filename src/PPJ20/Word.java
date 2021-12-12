package PPJ20;

public class Word {
    char[] arrChar;
    int tmp;

    public Word(){
        this.arrChar = new char[100];
        this.tmp = 0;
    }

    public void addChar(char a){
        arrChar[tmp++] = a;
    }

    public void show(){
        for(int i=0; i<tmp; i++)
            System.out.println(arrChar[i]);
    }

    public int getLength(){
        return tmp;
    }
}
