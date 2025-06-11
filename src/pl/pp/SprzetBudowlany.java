package pojazdy;

public class SprzetBudowlany extends pojazdy.Pojazd {
    int godzinyPracy;

    public SprzetBudowlany(String nr, String vin, String kolor, double cena, double spalanie, double poziomPaliwa,
                           double przebieg, pojazdy.TypPaliwa typPaliwa, int godzinyPracy) {
        super(nr, vin, kolor, cena, spalanie, poziomPaliwa, przebieg, typPaliwa);
        this.godzinyPracy = godzinyPracy;
    }
}