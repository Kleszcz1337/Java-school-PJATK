package PPJ23;

import PPJ23.Zadanie_01.Drzewo;
import PPJ23.Zadanie_01.Owoc;
import PPJ23.Zadanie_02.Telefon;
import PPJ23.Zadanie_03.Komorka;
import PPJ23.Zadanie_04.Smartfon;
import PPJ23.Zadanie_04.Osoba;

public class Main {
    public static void main(String[] args){

        //zad1
        System.out.println("Zadanie 1: ");
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

        System.out.println();

        //zad2
        System.out.println("Zadanie 2: ");
        Telefon iphone = new Telefon("ararara",  "blue");
        iphone.zadzwon("999");

        System.out.println();

        //zad3
        System.out.println("Zadanie 3: ");
        Komorka mojaKomora = new Komorka("eluelu", "czarna");
        mojaKomora.zadzwon("555333222");
        mojaKomora.zadzwon("22221111333");
        mojaKomora.wyswietlHistoriePolaczen();

        //zad4
        System.out.println("Zadanie 4: ");
        Osoba[] kontakty ={     //Tablica naszych kontaktow, przepraszam wszystkich Panów Adamów bałdzo!
                new Osoba("Adam", "Kowalski", "993-994-995"),
                new Osoba("Sradam", "Kow4alski", "222"),
                new Osoba("Kradam", "Kowa3lski", "333"),
                new Osoba("Blagam", "Kowalsski", "555"),
                new Osoba("Pagam", "Kowals3ki", "9666"),
                new Osoba("Zdawam", "Kowal2ski", "231321"),
                new Osoba("NieZdawamxD", "Kowalski", "321321"),
                new Osoba("Banan", "Kowalski", "321321321"),
                new Osoba("Michal", "Kichal", "22222"),
                new Osoba("Seba", "Kowalsski", "666666")
        };

        Smartfon mojSmartfon = new Smartfon("DURELE", "grin", kontakty);

        mojSmartfon.zadzwon("993-994-995");
        mojSmartfon.zadzwon("222");
        mojSmartfon.zadzwon("22222");
        mojSmartfon.zadzwon("666666");
        mojSmartfon.zadzwon("993-994-995");
        System.out.println();

        mojSmartfon.wyswietlHistoriePolaczen();

        System.out.println();

        //zad6
        System.out.println("Zadanie 6:");

        Telefon[] mojeTelefony = {
                new Telefon("ara", "czarny"),
                new Telefon("ała", "bialy"),
                new Telefon("aka", "czerwony")
        };

        String[] losoweNrTelefonow = {
                "2345",
                "2222",
                "623",
                "9987",
                "1000000",
        };

        for(int y=0; y<mojeTelefony.length; y++){
            for(int j=0; j<10; j++){
                if(j%2==0){
                    //tutaj dzownimy na nr losowej osoby z kontaktow danego smartfona
                    mojeTelefony[y].zadzwon(mojSmartfon.getOsobaNumber());
                }
                else{
                    //tutaj losujemy telefon z naszej taliby losoweNrTelefonow
                    mojeTelefony[y].zadzwon(losoweNrTelefonow[ (int)(Math.random()*losoweNrTelefonow.length)]);
                }
            }
        }
        for(int x=0; x<mojeTelefony.length; x++){
            //Zostalo wypisanie tych historii telefonow ale przeciez telefony nie maja historii swoich xDD
            //Prosze o pomoc
        }
    }
}
