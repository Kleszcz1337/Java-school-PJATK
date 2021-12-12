package PPJ11;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

//2021-11-05 - PPJ11
public class Main{

    public static Scanner scanner = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args){

        //zad1();
        //zad2();
        //zad3();
        //zad4();
        zad5();

        scanner.close();
    }

    public static void zad1(){
        double[] arr1 = new double[10];

        for(int i=0; i<arr1.length; i++) {
            arr1[i] = Math.random()*10;
            System.out.println(arr1[i]);
        }

        for(int i=0; i<arr1.length; i+=2){
            System.out.print(arr1[i] + " ");
        }

        int[] arr2 = new int[10];
        for(int i=0; i<arr1.length; i++) {
            arr2[i] = (int)(arr1[i]);
            if(arr2[i]%2 != 0)
                System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }

    public static void zad2(){
        char[] arrChar1 = {'a', 'b', 'd'};
        char maks = arrChar1[0];
        for(int i=1; i<arrChar1.length; i++){
            if(arrChar1[i] < maks)
                maks=arrChar1[i];
        }
        System.out.println(maks);
    }

    public static void zad3(){
        char[] arrChar2 = new char[5];
        for(int i=0; i < arrChar2.length; i++) {
            arrChar2[i] = (char)(((int)(Math.random() * 26)) + (int) 'A');
            System.out.println(arrChar2[i]);
        }
        while(arrChar2[0] != '0' || arrChar2[1] !='0' || arrChar2[2] !='0' || arrChar2[3] !='0' || arrChar2[4] !='0') {
            int Licznik1=0;
            System.out.println("Podaj znak ktory zgadujesz: ");
            char temp = scanner.next().charAt(0);

            for(int i=0; i<arrChar2.length; i++) {
                if (temp == arrChar2[i]) {
                    arrChar2[i] = '0';
                    Licznik1++;
                }
            }
            System.out.println("Trafiles: "+ Licznik1+ " razy.");
        }
    }

    public static void zad4(){
        int przedzial = rand.nextInt(15 - 10 + 1) + 10;
        int[] arrInt1 = new int[przedzial]; //losuje rozmiar talbicy miedzy 10-15
        for(int i=0; i<arrInt1.length; i++)
            arrInt1[i]=rand.nextInt(6 - 0)+0;

        int los1,los2,temp;
        for(int i=0;i<arrInt1.length; i++){
            los1 = (int)((Math.random() * (przedzial - 0)) + 0);
            los2 = (int)((Math.random() * (przedzial - 0)) + 0);
            temp = arrInt1[los1];
            arrInt1[los1] = arrInt1[los2];
            arrInt1[los2] = temp;
            System.out.print(arrInt1[i]);
        }
        System.out.println();
        //wyznaczamy max liczbe w talibcy
        int maxi = arrInt1[0];
        for(int i=1; i<arrInt1.length; i++){
            if(arrInt1[i]>maxi)
                maxi=arrInt1[i];
        }
        System.out.println("Max wartosc tablicy to: "+ maxi);

        for(int i=0; i<arrInt1.length; i++)
            System.out.print(" " + arrInt1[i] + " ");

        for(int i=0; i<maxi+1; i++){
            System.out.println();
            for(int j=0; j<arrInt1.length; j++){
                System.out.print( arrInt1[j] == i ? " * " : " . " );
            }
        }
        System.out.println();
    }

    public static void zad5(){
        int[] arrInt1 = new int[5];
        int[] arrInt2 = new int[5];
        for(int i=0; i<5; i++){
            arrInt1[i]=(int)(Math.random()*10);
            arrInt2[i]=(int)(Math.random()*10);
        }

        int[] arr3 = new int[(int)(arrInt1.length+arrInt2.length)];
        int i=0;
        for(; i<arrInt1.length; i++)
            arr3[i]=arrInt1[i];
        for(i=arrInt1.length;i<arrInt2.length; i++)
            arr3[i]=arrInt2[i];

        System.out.println();
        for(int j=0; j<arrInt1.length; j++){
            System.out.print(arrInt1[j]);
        }
        System.out.println();
        for(int j=0; j<arrInt2.length; j++){
            System.out.print(arrInt2[j]);
        }
        System.out.println();
        for(int j=0; j<arr3.length; j++){
            System.out.print(arr3[j]);
        }
        System.out.println();

        List<Integer> listNumbers = new ArrayList<Integer>();
        for(int iter=0 ;iter<arrInt1.length; iter++){
            for(int j=0; j<arrInt2.length; j++)
                if(arrInt1[iter]==arrInt2[j]){
                    listNumbers.add(arrInt1[iter]);
                }
        }


        for(int x : listNumbers)
            System.out.println(i);
    }
}

