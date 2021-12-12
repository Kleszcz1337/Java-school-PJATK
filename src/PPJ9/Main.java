package PPJ9;

import java.util.Scanner;

//2021-10-29 - PPJ9
public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //zad1
        for(int i = 1; i<=10; i++)
            System.out.println(i);
        //zad2
        int wrt = 3;
        for(int i=1;i<=10; i*=wrt)
            System.out.println(i);
        //zad3
        int i=0;
        do{
            System.out.println("do while");
        }while(i>1);

        while(i>1){
            System.out.println("While");
        }
        //zad4
        int suma = 0, eska, licznik = 0;
        System.out.print("Podaj swoja  po jednej cyfrze: ");
        do{
            eska = scanner.nextInt();
            suma += eska;
            licznik++;
        }while(eska != 0);
        System.out.println("suma: "+ suma+"  licznik: "+ licznik);

        //zad5
        suma = 0;
        eska = scanner.nextInt();
        for(i=1; i<=eska ; i++)
            suma += i;
        System.out.println(suma);

        //zad6
        for(i=0;i<10;i++)
            System.out.println((double)(1/2^i));

        //zad7
        suma = 0;
        int dzien=25, miesiac=5;
        for(i=1;i<miesiac-2;i++) {
            if (i % 2 == 0)
                suma += 30;
            else
                suma += 31;
        }
        suma += dzien + 28;
        System.out.println("uplynelo dni: "+suma);

        //zad 8
        double[] zlotowki = {5.0, 2.0, 1.0, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
        System.out.print("Podaj kwote: ");
        double pln=0;
        pln = scanner.nextDouble(); //pobieram dane od użytkownika

        String wynik = "Reszta: \n";

        for(int j = 0 ; ((j<zlotowki.length) && (pln > 0.00)) ; j++){
            if(pln >= zlotowki[j]){
                int licznik1 = (int)Math.floor(pln/zlotowki[j]);
                wynik += "Potrzebujesz: " + licznik1 + " monet o nominale: " + zlotowki[j] + "\n"; //dodaje do stringa kolejne linie
                pln = (double)Math.round(100*(pln-(licznik1*zlotowki[j])))/100;
            }
        }
        System.out.println(wynik);

        scanner.close();
    }
}
