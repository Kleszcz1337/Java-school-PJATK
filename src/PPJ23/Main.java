package PPJ23;

import PPJ23.Zadanie_01.Drzewo;
import PPJ23.Zadanie_01.Owoc;
import PPJ23.Zadanie_02.Telefon;

public class Main {
    public static void main(String[] args){

        //zad1
        Owoc[] owocoweCzwartki = new Owoc[100];
        int licznikJablek = 0, licznikGruszek = 0, licznikPomaranczy = 0;
        double masaOwocow = 0;
        int i = 0;

        while(masaOwocow < 5){
            Owoc tmpOwoc = Drzewo.zerwijOwoc();
            owocoweCzwartki[i++] = tmpOwoc;         //Wkladamy nasze owoce do czwartkow

            if(tmpOwoc.getNazwa() == "jablko")
                licznikJablek++;

            if(tmpOwoc.getNazwa() == "pomarancza")
                licznikPomaranczy++;

            if(tmpOwoc.getNazwa() == "gruszka")
                licznikGruszek++;

            masaOwocow += tmpOwoc.getMasa();
        }
        System.out.println(masaOwocow);
        System.out.println(i);
        System.out.println("Gruszek: " + licznikGruszek + " Jablka: " + licznikJablek + "Pomaranczy: " + licznikPomaranczy);

        //zad2
        Telefon iphone = new Telefon();
        iphone.zadzwon("999");

    }
}
