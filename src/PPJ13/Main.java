package PPJ13;

import java.util.Scanner;

//2021-11-12 - PPJ13
public class Main{

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        //zad1(); //nie dziala
        //zad2();   //nie dziala
        //zad3();   //nie dziala
        zad4();   //nie dziala
        //zad5();     //nie dziala
    }

    public static void zad1(){
        int index=0;
        int licznik1=1;
        int size = 9;
        boolean dodam = true;
        for(int i=0; i<size; i++){
            for(int j=1; j<=size; j++){
                if(licznik1<size){
                    index = (int)(size-licznik1)/2;
                    if(j>index && j<(size-index+1))
                        System.out.print(" * ");
                    else
                        System.out.print(" . ");
                    dodam=true;
                }
                else if(licznik1>size){
                    index = (int)(size-licznik1)/2;
                    if(j>index && j<(size-index+1))
                        System.out.print(" * ");
                    else
                        System.out.print(" . ");
                    dodam=false;
                }
            }
            licznik1+= (dodam ? 2 : -2);
            System.out.println();
        }
    }

    public static int intLength(int a, int dl){
        return (a > 9) ? intLength(a / 10, dl + 1) : dl;
    } //funkcja rekurencyjna ktora oblicza nam dlugosc(warunek a>9 sprawia że zatrzyma sie ona gdy np 19/10=9)

    public static boolean isNarcisstic(int x){
        int dl = intLength(x, 1);  //obliczanie dlugosci inta
        int obecna = x;
        int suma=0;
        for(int j=1; j<=dl; j++){
            suma+= Math.pow((int)(obecna/Math.pow(10,j)), dl);
            obecna = (obecna-(int)(obecna/Math.pow(10,j)))%10;
        }
        if(suma==x)
            return true;
        else
            return false;
    }

    public static void zad2(){
        //153  1^3+5^3+3^3 = 1 + 125 + 27 = 153
        int[] arr = {153, 333, 370, 515, 407, 80};
        for(int i=0; i<arr.length; i++)
            if(isNarcisstic(arr[i]))
                System.out.println("Jest narcystyczna");
            else
                System.out.println("Nie jest narcy");
    }

    public static void zad3(){
        int ArrSize = (int)(Math.random()*100);
        int[] arrInt = new int[ArrSize];
        double[] arrDouble = new double[ArrSize];

        for(int i=0; i<ArrSize; i++){
            arrInt[i]=(int)(Math.random()*100);
            arrDouble[i]=(double)(Math.random()*100);
        }

        double mini = (double)(arrInt[0]+arrDouble[0]);
        int miniIndex =0;
        double sumOfArrays =0;
        for(int i=1; i<ArrSize; i++){
            for(int j=1; j<ArrSize; j++){
                sumOfArrays = arrInt[j]+arrDouble[j];
                if(mini>sumOfArrays){
                    mini=(double)(arrInt[j]+arrDouble[j]);
                    arrInt[miniIndex] = arrInt[j];
                    arrDouble[miniIndex] = arrDouble[j];
                    miniIndex = j;
                }
            }
        }
        for(int i=0; i<ArrSize; i++){
            System.out.println(arrInt[i]+"   "+ arrDouble[i]);
        }
    }

    public static void zad4(){
        int[][] tab = {
                {1,0,0,0,0},
                {0,1,0,0},
                {0,0,1}
        };
        int[] arr1d = new int[12];
        int index=tab[0].length;
        int j=0;
        for(int i=0; i<tab.length; i++){
            int indexTab =0;
            for(j=j; j<12; j++){
                arr1d[j] = tab[i][indexTab];
                indexTab++;
                System.out.print(arr1d[j]);
            }
            System.out.println();
        }
    }

    public static void zad5(){
        int sizeArrInt1 = (int)(Math.random()*10);
        int sizeArrInt2 = (int)(Math.random()*10);
        int sizeArrInt3 = (int)(Math.random()*10);
        int[] arrInt1 = new int[sizeArrInt1];
        int[] arrInt2 = new int[sizeArrInt2];
        int[] arrInt3 = new int[sizeArrInt3];

        int maxSize = Math.max(sizeArrInt1, Math.max(sizeArrInt2, sizeArrInt3));
        int[][] arrInt2D = new int[3][maxSize];

        for(int i=0; i<sizeArrInt1; i++){
            arrInt1[i] = (int)(Math.random()*100);
            arrInt2D[0][i] = arrInt1[i];
        }
        for(int i=0; i<sizeArrInt2; i++){
            arrInt2[i] = (int)(Math.random()*100);
            arrInt2D[1][i] = arrInt2[i];
        }
        for(int i=0; i<sizeArrInt3; i++){
            arrInt3[i] = (int)(Math.random()*100);
            arrInt2D[2][i] = arrInt3[i];
        }

        for(int i=0; i<arrInt2D.length; i++){
            for( int j=0; j<arrInt2D[i].length; j++)
                System.out.print(arrInt2D[i][j]);
            System.out.println();
        }
    }
}



