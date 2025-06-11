package pojazdy;

public abstract class Pojazd {
    String nrRejestracyjny;
    String numerVin;
    String kolor;
    double cena;
    double spalanie;
    double poziomPaliwa;
    double przebieg;

    TypPaliwa typPaliwa;

    public Pojazd(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie,
                  double poziomPaliwa, double przebieg, TypPaliwa typPaliwa) {
        this.nrRejestracyjny = nrRejestracyjny;
        this.numerVin = numerVin;
        this.kolor = kolor;
        this.cena = cena;
        this.spalanie = spalanie;
        this.poziomPaliwa = poziomPaliwa;
        this.przebieg = przebieg;
        this.typPaliwa = typPaliwa;
    }

    public void prowadz(double km) {
        System.out.println("Prowadzisz pojazd przez " + km + " kilometrów");
        przebieg += km;
        poziomPaliwa -= (km * spalanie / 100);
    }

    public void zatankuj(double litry) {
        poziomPaliwa += litry;
        System.out.println("Zatankowano " + litry + " litrów.");
    }

    public void pokazInfo() {
        System.out.println("Rejestracja: " + nrRejestracyjny + ", VIN: " + numerVin + ", Typ paliwa: " + typPaliwa.getTypPaliwa());
    }
}
