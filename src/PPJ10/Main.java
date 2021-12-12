package PPJ10;

import java.util.Scanner;
import java.util.Random;

//2021-11-02 - PPJ10
public class Main{

    public static Scanner scanner = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args){


        //zad1();
        //zad2((byte)(14));
        // int n = scanner.nextInt();
        //zad3(n);
        zad4();
        //zad5();

        scanner.close();
    }

    public static void zad1(){
        for(int i=75; i<=150; i++){
            System.out.println((char)i + " - " + i);
        }
    }

    /*public static char convertTo(int base)
    {
        char result='';
        int system = 16;
        while (n>0)
        {
            result = pattern.charAt(system % base) + result;
            system /= base;
        }

        return result;
    }*/

    public static void zad2(byte x){
        char[] arr = {'0','1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C','D', 'E', 'F'};
        byte y = x;
        for(int i=0; i<arr.length; i++){
            if(y==i)
                System.out.println(arr[i]);
        }
    }

    public static void zad3(int n){
        for(int i=1; i<=n; i++){
            System.out.println(i*i+" "+i*i*i+" "+i*i*i*i);
        }
    }

    public static void zad4(){
        for(int j=1;j<=5;j++){
            System.out.print(j + " ");
            if(j%2 != 0){
                for(int i=0; i<=4; i++){
                    System.out.print("* ");
                }
                System.out.print("\n");
            }
            else{
                for(int i=0; i <= 3; i++){
                    System.out.print(" *");
                }
                System.out.print("\n");
            }
        }
    }

    public static void zad5(){
        int i=0;
        while(i<10){
            System.out.println("wybierz opcje(papier,kamien,nozyce ('STOP' żeby wylaczyc)");
            String option = scanner.nextLine();
            int a = rand.nextInt(3)+1;//1-papier , 2-kamien, 3 nozyce
            switch(option){
                case "papier":{
                    if(a==3)
                        System.out.println("Przegrales");
                    else
                        System.out.println("Wygrales");
                    break;
                }
                case "kamien":{
                    if(a==1)
                        System.out.println("Przegrales");
                    else
                        System.out.println("Wygrales");
                    break;
                }
                case "nozyce":{
                    if(a==2)
                        System.out.println("Przegrales");
                    else
                        System.out.println("Wygrales");
                    break;
                }
            }
            i++;
        }
    }

}
