import pl.pp.Konto;

import java.util.Scanner;

public class KontoZadanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tworzenie przykładowego konta
        Konto mojeKonto = new Konto(
                "Konto Oszczędnościowe",
                "9876543210",
                "Ireneusz Filip",
                "IreneuszF10@example.com",
                "987-654-321",
                "1234"
        );

        System.out.println("Witaj, " + mojeKonto.getNazwaWlascicielaKonta() + "!");
        System.out.println("Numer Twojego konta: " + mojeKonto.getNumerKonta());

        while (true) {
            System.out.println("Wybierz operację:");
            System.out.println("1. Sprawdź saldo");
            System.out.println("2. Wpłać środki");
            System.out.println("3. Wypłać środki");
            System.out.println("4. Zakończ");
            System.out.print("Twój wybór: ");

            int wybor = scanner.nextInt();
            scanner.nextLine();

            switch (wybor) {
                case 1:
                    System.out.print("Podaj pin: ");
                    String kodSprawdzenie = scanner.nextLine();
                    double saldo = mojeKonto.sprawdzSaldo(kodSprawdzenie);
                    if (saldo != -1) {
                        System.out.println("Twoje saldo wynosi: " + saldo + " zł.");
                    }
                    break;
                case 2:
                    System.out.print("Podaj kwotę do wpłaty: ");
                    double kwotaWplaty = scanner.nextDouble();
                    scanner.nextLine();
                    mojeKonto.wplacSrodki(kwotaWplaty);
                    break;
                case 3:
                    System.out.print("Podaj kwotę do wypłaty: ");
                    double kwotaWyplaty = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Podaj pin: ");
                    String kodWyplata = scanner.nextLine();
                    mojeKonto.wyplacSrodki(kwotaWyplaty, kodWyplata);
                    break;
                case 4:
                    System.out.println("Dziękujemy za skorzystanie z usług naszego banku oraz życzymy miłego dnia!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
            }
        }
    }
}