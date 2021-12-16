package PPJDodatkowe03;

import jdk.swing.interop.SwingInterOpUtils;

import javax.management.monitor.MonitorSettingException;

public class Main {
    public static void main(String[] args){

        //zad1 pominiete

        //zad2
        Monster milosz = new Monster();
        Monster seba = new Monster("Seba", 50, 100);

        //System.out.println(seba.name);
        //System.out.println(milosz.strength);

        //zad3
        milosz.show();
        milosz.takeDamage(50);
        System.out.println("życie potwora po damagu " + milosz.getHealth());

        //zad4
        int health1 = (int)(Math.random()*100)+1; //losujemy od 0-100;
        int health2 = (int)(Math.random()*100)+1; //losujemy od 0-100;
        int sila1 = (int)(Math.random()*100)+1; //losujemy od 0-100;
        int sila2 = (int)(Math.random()*100)+1; //losujemy od 0-100;

        Monster piotrek = new Monster("Piotrek", health1, sila1);
        Monster jakub = new Monster("Jakub", health2, sila2);

        System.out.print("Wygral: ");
        Monster.arena(piotrek, jakub).show();
        System.out.println();

        //zad5
        Monster[] arrOfMoster = new Monster[6];
        String[] names = {"Karen", "Baren", "Sraken", "Krater", "Pierdaken", "Kurczaken"};

        int los = 0;
        for(int i = 0; i<arrOfMoster.length;){
            los = (int)(Math.random()*6);
            if(names[los] != null) {        //losujemy imiona dla potworow
                arrOfMoster[i++] = new Monster(names[los]);
                names[los] = null;
            }
        }
        for(Monster i : arrOfMoster) //wypisanie wszystkich potworow
            i.show();
        System.out.println();

        //Proces walki naszych graczu w 2 forach
        Monster tmp;
        for(int i = 0; i<arrOfMoster.length; i++){
            for(int j=0; j<arrOfMoster.length; j++){
                if(i != j) {
                    if (Monster.arena(arrOfMoster[i], arrOfMoster[j]).getName() == arrOfMoster[i].getName())
                        arrOfMoster[i].addPoints();
                    else
                        arrOfMoster[j].addPoints();
                }
            }
        }
        //Sortowanie babelkowe po punktach naszych graczy xD
        for(int i = 0; i<arrOfMoster.length; i++){
            for(int j=1; j < (arrOfMoster.length - i); j++){
                if(arrOfMoster[j-1].getPoints() < arrOfMoster[j].getPoints()){
                    tmp = arrOfMoster[j-1];
                    arrOfMoster[j-1] = arrOfMoster[j];
                    arrOfMoster[j] = tmp;
                }
            }
        }
        //wypisanie wszystkich potworow
        for(Monster i : arrOfMoster)
            i.show();


        //zad6

    }
}
