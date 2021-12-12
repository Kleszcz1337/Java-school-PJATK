package PPJ15;

//2021-11-23 - PPJ15
public class Main{
    public static void main(String[] args) {
        //zad1
        int a = 3;
        zad1(a);
        System.out.println(a);
        //zad2
        int wrt = 5;
        zad2(wrt);
        //zad3
        System.out.println(zad3(3,6,2));
        //zad4
        char[] charArray = {'A','l','a','m','a','k','o','t','a'};
        System.out.println(zad4(charArray, 'a'));
        //zad5
        int[] intArray1 = new int[(int)(Math.random()*10)+1];
        int[] intArray2 = new int[(int)(Math.random()*10)+1];
        for(int i = 0; i< intArray1.length; i++)
            intArray1[i] = (int)(Math.random()*100+1);
        for(int i = 0; i< intArray2.length; i++)
            intArray2[i] = (int)(Math.random()*100+1);

        for(int i : intArray1)
            System.out.print(" " + i);
        System.out.println();
        for(int i : intArray2)
            System.out.print(" " + i);
        System.out.println();

        int[] tempArr = zad5(intArray1, intArray2, -2);
        for(int i : tempArr)
            System.out.print(i+ " ");
        //zad 6
        int[][] intArray2D1 = new int[10][10];
        int[][] intArray2D2 = new int[10][10];
        for(int i = 0; i < intArray2D1.length; i++){
            for(int j = 0; j < intArray2D1[i].length; j++){
                intArray2D1[i][j] = (int)(Math.random()*20+1);
                intArray2D2[i][j] = (int)(Math.random()*20+1);
            }
        }
        System.out.println();
        System.out.println(zad6(intArray2D1, intArray2D2));
    }

    public static void zad1(int a) {
        System.out.println(a);
        a += 2;   //funkcja dziala na kopii naszej zmiennej czyli w mainie zostanie wciaz
    }           //wyswietlona liczba 3

    public static void zad2(int a) {
        System.out.println(a);
        a *= 5;
        System.out.println(a); //wyswietli 25 ale po metodzie znowu a bedzie rowne 5 poza petla
    }

    public static int zad3(int a, int b, int c){
        int maxi = a;
        if(b > maxi) maxi = b;
        if(c > maxi) maxi = c;

        return maxi;
    }

    public static int zad4(char[] charArray, char a){
        int licznik1 = 0;
        for(int i=0; i<charArray.length; i++){
            if(charArray[i] == a)
                licznik1++;
        }
        return licznik1;
    }

    public static int[] zad5(int[] intArray1, int[] intArray2, int a){
        int[] ktoraWieksza = intArray1.length > intArray2.length ? intArray1 : intArray2;
        int[] ktoraMniejsza = intArray1.length < intArray2.length ? intArray1 : intArray2;
        int indexCare = 0;
        int[] tempArray = new int[ktoraWieksza.length];
        if(intArray1.length == intArray2.length){
            return tempArray;
        }
        else if(a < 0){
            for(int i = 0; i<ktoraMniejsza.length; i++){
                tempArray[i] = intArray1[i] + intArray2[i];
                indexCare ++;
            }
            for(int i = indexCare; i<ktoraWieksza.length; i++){
                tempArray[i] = ktoraWieksza[i];
            }
        }
        else if(a > 0){
            for(int i = 0; i < (ktoraWieksza.length-ktoraMniejsza.length); i++) {
                tempArray[i] = ktoraWieksza[ktoraMniejsza.length + i];
            }
        }
        return tempArray;
    }

    public static boolean zad6(int[][] intArray1, int[][] intArray2){
        if(intArray1.length == intArray2.length){
            for(int i = 0; i < intArray1.length; i++){
                for(int j = 0; i< intArray1[i].length; j++){
                    if(intArray1[i][j] != intArray2[i][j])
                        return false;
                }
            }
            return true;
        }
        else
            return false;
    }
}
