package pojazdy;

public class Osobowe extends pojazdy.Pojazd {
    int liczbaDrzwi;

    public Osobowe(String nr, String vin, String kolor, double cena, double spalanie, double poziomPaliwa,
                   double przebieg, pojazdy.TypPaliwa typPaliwa, int liczbaDrzwi) {
        super(nr, vin, kolor, cena, spalanie, poziomPaliwa, przebieg, typPaliwa);
        this.liczbaDrzwi = liczbaDrzwi;
    }
}
