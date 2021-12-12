package PPJ7;

import java.util.Scanner;
import java.util.Random;

//2021-10-22 - PPJ7
public class Main {
    public static void main(String[] args) {

        boolean czyPada = false;
        boolean czySwieciSlonce = false;

        if(czyPada) {
            System.out.println("Pada");
        }
        else {
            System.out.println("Nie pada");
        }

        int zmienna = czyPada ? 5 : 8;
        System.out.println(zmienna);

        // zadanie 3
        if(czyPada && !czySwieciSlonce){
            System.out.println("Plucha");
        }
        else if(czyPada && czySwieciSlonce){
            System.out.println("Tecza");
        }
        else if(!czyPada && czySwieciSlonce){
            System.out.println("Slonecznie");
        }
        else if(!czyPada && !czySwieciSlonce){
            System.out.println("Pochmurno");
        }

        // zad 5

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dwie liczby dodatnie calkowite: ");
        System.out.print("Podaj pierwsza liczbe: ");
        int firstNum = scanner.nextInt();

        System.out.print("Podaj druga liczbe: ");
        int secondNum = scanner.nextInt();

        if(firstNum>0 && secondNum>0) {
            System.out.println(
                    secondNum % firstNum == 0 ? "Jest calkowita wiellokrotnoscia pierwszej" : "Nie jest calkowita wielokrotnoscia pierwszej"
            );
        }
        System.out.println("--------------");
        System.out.println("Podaj dwie wartosci liczbowe: ");
        System.out.print("Pierwasza: ");
        double numValue1 = scanner.nextInt();

        System.out.print("Druga: ");
        double numValue2 = scanner.nextInt();

        if(numValue1 > 0 && numValue2 > 0)
            System.out.println(numValue1 - numValue2);
        else
            System.out.println(numValue1+numValue2);

        Random r = new Random();

        double numA = Math.random();
        double numB = Math.random();
        double numC = Math.random();
        if(numA > 0.2 && numB > 0.2 && numC > 0.2)
            System.out.println("Wszystkie wartosci sa wieksze od 0.2");
        else
            System.out.println("Jakas byla mniejsza od 0.2" + numA + " " + numB + " " +numC);

        numA = Math.random();
        if(numA > 0.2 && numB > 0.2 && numC > 0.2)
            System.out.println("Wszystkie wartosci sa wieksze od 0.2");
        else
            System.out.println("Jakas byla mniejsza od 0.2" + numA + " " + numB + " " +numC);

        numB = Math.random();
        if(numA > 0.2 && numB > 0.2 && numC > 0.2)
            System.out.println("Wszystkie wartosci sa wieksze od 0.2");
        else
            System.out.println("Jakas byla mniejsza od 0.2" + numA + " " + numB + " " +numC);


        System.out.println("Podaj liczbe: ");
        int permvalue = scanner.nextInt();

        if(permvalue > -15 && permvalue <= -10 || permvalue > -5 && permvalue < 0 || permvalue > 5 && permvalue < 10)
            if(permvalue <= -13 || permvalue > -8 && permvalue <= -3)
                if(permvalue >= -4)
                    System.out.println("Brafo nalezy :) ");
                else
                    System.out.println("Nie nalezy ;/");

    }
}
