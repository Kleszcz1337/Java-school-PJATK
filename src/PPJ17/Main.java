package PPJ17;

import java.util.Scanner;

//2021-11-30 - PPJ17
public class Main{
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int[] arrExc1 = {1,5,3,2,8,1,22,3};
        swap(arrExc1,2,3);
        for(int i : arrExc1)
            System.out.print(" " + i);
        System.out.println();

        System.out.print("Podaj swoją liczbe: ");
        int userValue = scanner.nextInt();
        //wlasna funkcja howManyNum sprawdzam jak duza ma byc tablica
        int[] userValueArray = new int[howManyNum(userValue)];

        //zamiana liczby na tablice
        for(int i = 0; i<userValueArray.length; i++){
            userValueArray[i] = userValue%10;
            userValue /= 10;
            System.out.print(userValueArray[i] + " ");
        }
        System.out.println();

        int[][] solArray2D = new int[howManyPerm(userValueArray.length)][userValueArray.length];
        // permRec(userValueArray, solArray2D, 0, 0);

        //zad 5
        int[] arrBubble = {1,6,3,4,8,1,102,300,200};
        int[] wynik = bubbleSortIter(arrBubble);
        for(int i : wynik)
            System.out.print(i+ " ");
    }

    public static void printMonth(int m, int y){
        int[] arrMonth = new int[35];
    }

    public static void swap(int[] arr, int source, int destination){
        int tmpvalue = arr[source];
        arr[source] = arr[destination];
        arr[destination] = tmpvalue;
    }

    public static int howManyNum(int a){
        int licznik1 = 0;
        while(a/10 >= 1) {
            licznik1++;
            a /= 10;
        }
        return  licznik1+1; //zwracam +1 bo nie liczy mi ostatniej liczby w petli
    }                       //uwaga, nie moze być ++ bo jak dajemy ++ to 1 dodaje nam się po wykonaniu returna

    public static int howManyPerm(int a){
        if(a>1)
            return a*howManyPerm(a-1);
        else
            return 1;
    }

    //notatka
    //zadanie 4, chce zwrocic 2d tablice gdzie każda nowa kolumna będzie
    //skladala sie z jednej tabeli z kolejna permutajca
    public static int[][] permRec(int[] a,int[][] arraySol, int licznik1, int index){
        if(licznik1 == a.length-1)
            arraySol[arraySol.length-1] = a;
        else if(index != a.length-1){
            swap(a, licznik1, index++);
            return permRec(a,arraySol,licznik1+1,index);
        }
        return arraySol;
    }

    public static int[] bubbleSortIter(int[] a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length-i-1; j++){
                if(a[j]>a[j+1])
                    swap(a,j,j+1);
            }
        }
        return a;
    }

    //public static int[] bubbleSortRe(int[] a){
    //}
}
