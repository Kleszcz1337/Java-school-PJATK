package PPJ22;

public class CiagnikSiodlowy extends PojazdKolowy{
    int masa;

    public CiagnikSiodlowy(String color, int iloscOsi, int masa){
        super(color,iloscOsi);
        this.masa = masa;
    }

    public void rozpocznijJazde(){
        if(masa/getIloscOsi() > 11)
            System.out.println("Jazda niebezpieczna, odmowa uruchomienia silnika");
        else
            System.out.println("Lecim");
    }
}
