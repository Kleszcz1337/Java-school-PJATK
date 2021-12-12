package PPJ20;

public class Phrase {
    public String[] tab;
    int wrt;

    public Phrase(){
        this.tab = new String[100];
        int wrt = 0;
    }

    void addWordAtEnd(String Word){
        tab[wrt++] = Word;
    }

    void show(){
        for (int i = 0; i < wrt; i++){
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }
}
