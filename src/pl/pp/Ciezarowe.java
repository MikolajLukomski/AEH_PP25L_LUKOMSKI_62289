package pojazdy;

public class Ciezarowe extends pojazdy.Pojazd {
    double ladownosc;

    public Ciezarowe(String nr, String vin, String kolor, double cena, double spalanie, double poziomPaliwa,
                     double przebieg, pojazdy.TypPaliwa typPaliwa, double ladownosc) {
        super(nr, vin, kolor, cena, spalanie, poziomPaliwa, przebieg, typPaliwa);
        this.ladownosc = ladownosc;
    }
}