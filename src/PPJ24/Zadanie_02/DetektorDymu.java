package PPJ24.Zadanie_02;

public class DetektorDymu {

    public static void sprawdz(int iloscDymu) throws Alarm{
        if(iloscDymu > 50)
            throw new Alarm("Pali sie");
        else
            System.out.println("Wszystko okej");
    }

}
