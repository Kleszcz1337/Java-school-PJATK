package PPJ6;

import java.util.Scanner;

//2021-10-19 - PPJ6
public class Main
{
    public static void main(String[] args)
    {

        double wynik = Math.sqrt(2)*Math.sqrt(2) - 2;
        System.out.println(wynik);

        int x = 5;
        System.out.println((x=4)*x); //w trakcie dzialania mozemy zmienić wartośc zmiennej;

        int a = 10, b = 5, c = 1, res;
        res = a - ++c - ++b;
        System.out.println(res);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj rok :): ");
        x = scanner.nextInt();

        /*
        if((x%4==0 && x%100 != 0 || x%400 == 0) == true);
        {
           boolean y = true;
        }
        */

        System.out.println(
                (x%4 == 0 && x%100 != 0 || x%400 == 0) ? "Rok "+ x +" jest przestępny!" : "Rok "+ x +" nie jest przestępny"
        );

        System.out.println("Podaj ile masz stopni w Fahrenheita: ");
        int y = scanner.nextInt();

        //(°F - 32) x 5/9 =°C
        System.out.println((y-32)*5/9);

        scanner.close();

    }
}
