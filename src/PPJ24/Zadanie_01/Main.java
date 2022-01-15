package PPJ24.Zadanie_01;

import PPJ23.Zadanie_01.Drzewo;

public class Main {
    public static void main(String[] args){
        Drzewo sosna = new Drzewo("Sosna", 23);
        Drzewo modrzew = new Drzewo("modrzew", 3);
        Drzewo dab = new Drzewo("dab", 232);

        Drzewo[] drzewa = {sosna,modrzew,dab};
        for(Drzewo i : drzewa)
            System.out.println(i.toString());
    }
}
