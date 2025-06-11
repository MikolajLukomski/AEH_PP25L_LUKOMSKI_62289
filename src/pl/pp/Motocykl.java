package pojazdy;

public class Motocykl extends pojazdy.Pojazd {
    boolean posiadaDostawke;

    public Motocykl(String nr, String vin, String kolor, double cena, double spalanie, double poziomPaliwa,
                    double przebieg, pojazdy.TypPaliwa typPaliwa, boolean posiadaDostawke) {
        super(nr, vin, kolor, cena, spalanie, poziomPaliwa, przebieg, typPaliwa);
        this.posiadaDostawke = posiadaDostawke;
    }
}