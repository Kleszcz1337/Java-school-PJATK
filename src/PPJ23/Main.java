package PPJ23;

import PPJ23.Zadanie_01.Drzewo;
import PPJ23.Zadanie_01.Owoc;

public class Main {
    public static void main(String[] args){
        Owoc[] owocoweCzwartki = new Owoc[100];
        int licznikJablek = 0, licznikGruszek = 0, licznikPomaranczy = 0;
        double masaOwocow = 0;
        int i = 0;

        while(masaOwocow < 5){
            Owoc tmpOwoc = Drzewo.zerwijOwoc();
            owocoweCzwartki[i++] = tmpOwoc;         //Wkladamy nasze owoce do czwartkow

            if(tmpOwoc.getNazwa() == "jablko")
                masaOwocow += tmpOwoc.getMasa();

            if(tmpOwoc.getNazwa() == "pomarancza")
                masaOwocow += tmpOwoc.getMasa();

            if(tmpOwoc.getNazwa() == "gruszka")
                masaOwocow += tmpOwoc.getMasa();
        }
        System.out.println(masaOwocow);
        System.out.println(i);
    }
}
