package pl.pp;
public class Konto {
    private String RodzajKonta;
    private String numerKonta;
    private double dostepneSrodki;
    private String nazwaWlascicielaKonta;
    private String emailWlascicielaKonta;
    private String numerTelefonuWlascicielaKonta;
    private String PIN;

    public Konto(String RodzajKonta, String numerKonta, String nazwaWlascicielaKonta, String emailWlascicielaKonta, String numerTelefonuWlascicielaKonta, String PIN) {
        this.RodzajKonta = RodzajKonta;
        this.numerKonta = numerKonta;
        this.dostepneSrodki = 0.0;
        this.nazwaWlascicielaKonta = nazwaWlascicielaKonta;
        this.emailWlascicielaKonta = emailWlascicielaKonta;
        this.numerTelefonuWlascicielaKonta = numerTelefonuWlascicielaKonta;
        this.PIN = PIN;
    }

    public double sprawdzSaldo(String kod) {
        if (kod.equals(this.PIN)) {
            return this.dostepneSrodki;
        } else {
            System.out.println("Nieprawidłowy kod dostępu.");
            return -1;
        }
    }

    public void wplacSrodki(double kwota) {
        if (kwota > 0) {
            this.dostepneSrodki += kwota;
            System.out.println("Wpłacono: " + kwota + " zł. Nowe saldo: " + this.dostepneSrodki + " zł.");
        } else {
            System.out.println("Kwota wpłaty musi być większa od zera.");
        }
    }

    public void wyplacSrodki(double kwota, String kod) {
        if (kod.equals(this.PIN)) {
            if (kwota > 0) {
                if (this.dostepneSrodki >= kwota) {
                    this.dostepneSrodki -= kwota;
                    System.out.println("Wypłacono: " + kwota + " zł. Nowe saldo: " + this.dostepneSrodki + " zł.");
                } else {
                    System.out.println("Brak wystarczających środków na koncie.");
                }
            } else {
                System.out.println("Kwota wypłaty musi być większa od zera.");
            }
        } else {
            System.out.println("Nieprawidłowy kod dostępu.");
        }
    }

    // Gettery
    public String getNumerKonta() {
        return numerKonta;
    }

    public String getNazwaWlascicielaKonta() {
        return nazwaWlascicielaKonta;
    }
}