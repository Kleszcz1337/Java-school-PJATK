package PPJ8;

import java.util.Scanner;

//2021-10-26
public class Main{
    public static void main(String[] args) {
        //zad 2
        Scanner scanner = new Scanner(System.in);

        int dni = 0;
        System.out.print("Podaj nr miesiaca: ");
        int nrMiesiaca = scanner.nextInt();
        System.out.print("Podaj nr roku: ");
        int nrRoku = scanner.nextInt();

        switch (nrMiesiaca) {
            case 1, 3, 5, 7, 8, 10, 12 -> dni = 31; //sposob na robienie kilku casow jednoczesnie jak maja dawac taka sama wartosc
            case 4, 6, 9, 11 -> dni = 30; //nie potrzebyn brake
            case 2 -> { //jak juz robisz na strzalkach to caly switch na strzalakch
                if (nrRoku % 4 == 0 && nrRoku % 100 != 0 || nrRoku % 400 == 0)
                    dni = 29;
                else
                    dni = 28;
            }
            default -> dni = 0;
        }
        System.out.println("Miesiac ma " + dni + " dni, w roku " + nrRoku);

        //zad 3
        System.out.print("Podaj pojedynczy znak ");
        char ch = scanner.next().charAt(0); //charAt(0) wyławia nam pierwszy znak wprowadzego stringa index 0

        switch (ch) {
            case 'a', 'e', 'y', 'i', 'o', 'ą', 'ę', 'u', 'ó' -> System.out.println("Jest to samogloska");
            case 'b', 'c', 'ć', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'r', 's', 't', 'w', 'z', 'ż', 'ź' -> System.out.println("Jest to spolgloska");

            default -> System.out.println("Nie jest to litera ");
        }

        //zad 4
        System.out.println("Podaj dwie liczby doubleowskie");
        System.out.print("Pierwsza: ");
        double a = scanner.nextDouble();
        System.out.print("Druga: ");
        double b = scanner.nextDouble();

        if ((Math.round(a * 100) / 100) == (Math.round(b * 100) / 100))
            System.out.println("Są one równe do dwoch miejsc po przecinku");

        //zad 5
        System.out.println("Podaj 3 konty hipotetyczne trojkata");
        System.out.print("Pierwszy: ");
        int katA = scanner.nextInt();
        System.out.print("Drugi: ");
        int katB = scanner.nextInt();
        System.out.print("Trzeci: ");
        int katC = scanner.nextInt();

        if (katA > 0 && katB > 0 && katC > 0 && (katA + katB + katC) <= 180) {
            System.out.println("Może istnieć");
            if(katA < 90 && katB < 90 && katC < 90)
                System.out.println("Jest on ostrokątny");
            else
                System.out.println("Nie jest ostrokątny");
        }
        else
            System.out.println("Nie istnieje taki trojkat!!!");

        //zad 6
        System.out.println("Podaj parametry rownania kwadratowego");
        System.out.print("Podaj a: ");
        double A = scanner.nextDouble();
        System.out.print("Podaj b: ");
        double B = scanner.nextDouble();
        System.out.print("Podaj c: ");
        double C = scanner.nextDouble();

        double delta = B*B-4*A*C;
        if(delta == 0)
            System.out.println("X1 = " +(-B - Math.sqrt(delta)) / (2*A));
        else if(delta > 0){
            System.out.println("X1 = " +(-B - Math.sqrt(delta)) / (2*A));
            System.out.println("X2 = " +(-B + Math.sqrt(delta)) / (2*A));
        }
        else
            System.out.println("Nie ma miejsc zerowych");

        //zad 7

        System.out.println("Podaj swoje punkty i granice punktowa");
        System.out.print("Podaj ilość swoich punktów: ");
        float iloscPunktow = scanner.nextFloat();
        System.out.print("Podaj ilość MAX punktów: ");
        float maxPunktow = scanner.nextFloat();

        double twojProcent = iloscPunktow/maxPunktow;
        if(twojProcent > 50)
            System.out.println("zdajesz");

        scanner.close();
    }
}
