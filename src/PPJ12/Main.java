package PPJ12;

import java.util.Random;

//2021-11-09 - PPJ12
public class Main{
    public static Random rand = new Random();

    public static void main(String[] args){
        int[] tab = {1,2,3,4,4,3,2,1};
        //System.out.print(zad1(tab));
        //zad2();
        zad3();
    }

    public static boolean zad1(int[] tab){
        for(int i=0; i<tab.length/2; i++) {
            if (tab[i] != tab[tab.length - i - 1])
                return false;
        }
        return true;
    }

    public static void zad2(){
        boolean[] arrBoolen1 = new boolean[(int)(Math.random()*100)];
        int licznik1=0;
        for(int i=0; i<arrBoolen1.length; i++) {
            arrBoolen1[i] = (Math.random()<0.5 ? false : true);
            if(arrBoolen1[i]==true)
                licznik1++;
        }
        boolean[] arrTrue1 = new boolean[licznik1];
        boolean[] arrFalse1 = new boolean[arrBoolen1.length-licznik1];

        int iter1=0;
        int iter2=0;
        for(int i=0;i<arrBoolen1.length;i++){
            if(arrBoolen1[i]==true) {
                arrTrue1[iter1]=arrBoolen1[i];
                iter1++;
            }
            else
                arrFalse1[iter2]=arrBoolen1[i];
        }

        for(boolean i : arrTrue1)
            System.out.print(i);
        for(boolean i : arrFalse1)
            System.out.print(i);
    }

    public static boolean helpzad3(long tab[]){ //sprawdza czy jest rozncia 2
        for(int i=0; i<tab.length-1; i++) {
            if (tab[i + 1] - tab[i] == 1)
                return false;
        }
        return true;
    }

    public static void zad3(){
        long[] arrLong1 = new long[(int)(Math.random()*100)];
        arrLong1[0]=1350;
        for(int i=1; i<arrLong1.length; i++){
            arrLong1[i] = arrLong1[i-1]+1;
        }
        for(long i : arrLong1)
            System.out.println(i);

        while(!helpzad3(arrLong1)) {
            int index1 = rand.nextInt(arrLong1.length-0+1)+0-1;
            int index2 = rand.nextInt(arrLong1.length-0+1)+0-1;

            long temp = arrLong1[index1];
            arrLong1[index1] = arrLong1[index2];
            arrLong1[index2] = temp;
        }
        for (int i = 0; i < arrLong1.length; i++)
            System.out.print(arrLong1[i]);
    }
}
