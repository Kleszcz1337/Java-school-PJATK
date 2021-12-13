package PPJ20;

public class Phrase {
    String[] phraseArr;
    int counter;

    public Phrase(){
        this.phraseArr = new String[1];
        this.counter = 0;
    }

    void addWordAtEnd(String Word){
        if(counter == phraseArr.length)
           phraseArr = makeTableBigger(phraseArr); //przypisujemy powiększoną tablice o jeden element dla starej tablicy
        phraseArr[counter++] = Word;               //razem z poprzednimi wartosciami
    }

    void show(){
        for(String i : phraseArr)
            System.out.print(i + " ");
    }

    //Zwiększa naszą tablice w miarę potrzeby programu
    private String[] makeTableBigger(String[] arr){
        String[] tmpArr = new String[arr.length+1];

        for (int i = 0; i < arr.length; i++)//tutaj wlasnie przypisujemy stare wartosci do nowej tablicy
            tmpArr[i] = arr[i];                 //oczywiscie ostatni element zostaje pusty do wpisania dla użytkownika

        return tmpArr;
    }
}
