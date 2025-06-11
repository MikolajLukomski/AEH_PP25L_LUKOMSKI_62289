public class TestWypozyczalni {
    public static void main(String[] args) {
        pojazdy.Pojazd auto = new pojazdy.Osobowe("KR12345", "1HGCM82633A004352", "Czerwony", 50000, 6.5, 40, 120000,
                new pojazdy.Benzyna(), 4);
        pojazdy.Pojazd ciezarowka = new pojazdy.Ciezarowe("KR67890", "JH4KA7650MC000000", "Biały", 120000, 15, 100, 300000,
                new pojazdy.Diesel(), 2000);

        auto.pokazInfo();
        auto.prowadz(100);
        auto.zatankuj(20);

        System.out.println("------------");

        ciezarowka.pokazInfo();
        ciezarowka.prowadz(50);
        ciezarowka.zatankuj(30);
    }
}

